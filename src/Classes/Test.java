package Classes;

public class Test {
    private String dni;
    private Double temperature;

    public Test(String dni, Double temperature) {
        this.dni = dni;
        this.temperature = temperature;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
