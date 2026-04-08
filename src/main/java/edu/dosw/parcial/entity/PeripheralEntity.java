package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "peripherals")
public class PeripheralEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "peripheral_id")
    private Long peripheralId;

    @NotBlank
    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @NotBlank
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @NotNull
    @Column(name = "wireless", nullable = false)
    private Boolean wireless;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "computer_id", nullable = false)
    private ComputerEntity computer;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registered_by", nullable = false)
    private CollaboratorEntity registeredBy;

    public PeripheralEntity() {}

    public PeripheralEntity(String type, String name, Boolean wireless,
                            ComputerEntity computer, CollaboratorEntity registeredBy) {
        this.type = type;
        this.name = name;
        this.wireless = wireless;
        this.computer = computer;
        this.registeredBy = registeredBy;
    }

    public Long getPeripheralId() { return peripheralId; }
    public void setPeripheralId(Long peripheralId) { this.peripheralId = peripheralId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Boolean getWireless() { return wireless; }
    public void setWireless(Boolean wireless) { this.wireless = wireless; }

    public ComputerEntity getComputer() { return computer; }
    public void setComputer(ComputerEntity computer) { this.computer = computer; }

    public CollaboratorEntity getRegisteredBy() { return registeredBy; }
    public void setRegisteredBy(CollaboratorEntity registeredBy) { this.registeredBy = registeredBy; }
}
