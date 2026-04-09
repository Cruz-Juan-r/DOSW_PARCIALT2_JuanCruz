package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "computers")
public class ComputerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "computer_id")
    private Long computerId;

    @NotBlank
    @Column(name = "serial", nullable = false, unique = true, length = 50)
    private String serial;

    @NotBlank
    @Column(name = "brand", nullable = false, length = 50)
    private String brand;

    @NotNull
    @Column(name = "lab_number", nullable = false)
    private Integer labNumber;

    @NotNull
    @Column(name = "occupied", nullable = false)
    private Boolean occupied = false;


    @OneToMany(mappedBy = "computer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PeripheralEntity> peripherals = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registered_by", nullable = false)
    private CollaboratorEntity registeredBy;

    public ComputerEntity() {}

    public ComputerEntity(String serial, String brand, Integer labNumber,
                          Boolean occupied, CollaboratorEntity registeredBy) {
        this.serial = serial;
        this.brand = brand;
        this.labNumber = labNumber;
        this.occupied = occupied;
        this.registeredBy = registeredBy;
    }

    public Long getComputerId() { return computerId; }
    public void setComputerId(Long computerId) { this.computerId = computerId; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public Integer getLabNumber() { return labNumber; }
    public void setLabNumber(Integer labNumber) { this.labNumber = labNumber; }

    public Boolean getOccupied() { return occupied; }
    public void setOccupied(Boolean occupied) { this.occupied = occupied; }

    public List<PeripheralEntity> getPeripherals() { return peripherals; }
    public void setPeripherals(List<PeripheralEntity> peripherals) { this.peripherals = peripherals; }

    public CollaboratorEntity getRegisteredBy() { return registeredBy; }
    public void setRegisteredBy(CollaboratorEntity registeredBy) { this.registeredBy = registeredBy; }
}