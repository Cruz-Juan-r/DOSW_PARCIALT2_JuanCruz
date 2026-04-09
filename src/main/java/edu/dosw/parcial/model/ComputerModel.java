package edu.dosw.parcial.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de dominio que representa un computador del inventario.
 * Incluye lógica de negocio para contar periféricos (punto 7 TDD).
 */
public class ComputerModel {

    private Long id;
    private String serial;
    private String brand;
    private Integer labNumber;
    private Boolean occupied;
    private Long registeredById;
    private List<PeripheralModel> peripherals = new ArrayList<>();

    public ComputerModel() {}

    // ======================== LÓGICA DE NEGOCIO ========================

    /**
     * Calcula la cantidad de periféricos de un computador.
     * Punto 7 del parcial (TDD).
     *
     * @return cantidad de periféricos asociados al computador
     */
    public int getPeripheralCount() {
        if (peripherals == null) {
            return 0;
        }
        return peripherals.size();
    }

    // ======================== GETTERS & SETTERS ========================

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public Integer getLabNumber() { return labNumber; }
    public void setLabNumber(Integer labNumber) { this.labNumber = labNumber; }

    public Boolean getOccupied() { return occupied; }
    public void setOccupied(Boolean occupied) { this.occupied = occupied; }

    public Long getRegisteredById() { return registeredById; }
    public void setRegisteredById(Long registeredById) { this.registeredById = registeredById; }

    public List<PeripheralModel> getPeripherals() { return peripherals; }
    public void setPeripherals(List<PeripheralModel> peripherals) { this.peripherals = peripherals; }
}