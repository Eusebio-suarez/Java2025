package animals;

public class Perro extends Animal {
    private String nombre;
    private String alimento;
    private String raza;
    private String osico;

    public Perro(){

    }

    public Perro(String especie, String color, String genero, String habitat,String edad, String nombre, String alimento,String raxa, String osico) {
        super(especie, color, genero, habitat,edad);
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raxa;
        this.osico = osico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento(){
        return this.alimento;
    }

    public void setAlimento(String alimento){
        this.alimento = alimento;
    }

    public String getRaza(){
        return this.raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getOsico(){
        return this.osico;
    }

    public void setOsico(String osico){
        this.osico = osico;
    }

    @Override
    public void hacerSonido(){
        System.out.println("el perro esta haciendo wau wau");
    }

    @Override
    public String toString() {
        return super.toString()+
                "Perro{" +
                "nombre='" + nombre + '\'' +
                ", alimento='" + alimento + '\'' +
                ", raza='" + raza + '\'' +
                ", osico='" + osico + '\'' +
                '}';
    }
}
