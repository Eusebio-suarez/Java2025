package animals;

public class Ave extends Animal {
    private String nombre;
    private String alimento;
    private String raza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nombre='" + nombre + '\'' +
                ", alimento='" + alimento + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
