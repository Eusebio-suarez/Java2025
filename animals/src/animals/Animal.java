package animals;

public class Animal {

    private String especie;
    private String color;
    private String genero;
    private String habitat;
    private String edad;

    public Animal(){

    }

    //contructor
    public Animal(String especie,String color,String genero,String habitat,String edad){
        this.especie = especie;
        this.color = color;
        this.genero = genero;
        this.habitat = habitat;
        this.edad = edad;
    }

    public String getEspecie(){
        return this.especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getEdad() {return edad;}

    public void setEdad(String edad) {this.edad = edad;}

    public void hacerSonido(){
        System.out.println("el animal esta haciendo un sonido");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", color='" + color + '\'' +
                ", genero='" + genero + '\'' +
                ", habitat='" + habitat + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
