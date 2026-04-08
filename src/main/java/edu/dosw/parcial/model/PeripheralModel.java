package edu.dosw.parcial.model;

/**
 * Modelo de dominio que representa un periférico.
 */
public class PeripheralModel {

    private Long id;
    private String type;
    private String name;
    private Boolean wireless;
    private Long computerId;
    private Long registeredById;

    public PeripheralModel() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Boolean getWireless() { return wireless; }
    public void setWireless(Boolean wireless) { this.wireless = wireless; }

    public Long getComputerId() { return computerId; }
    public void setComputerId(Long computerId) { this.computerId = computerId; }

    public Long getRegisteredById() { return registeredById; }
    public void setRegisteredById(Long registeredById) { this.registeredById = registeredById; }
}