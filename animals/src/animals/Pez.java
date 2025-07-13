package animals;

public class Pez  extends Animal {
    String nombre;
    String alimento;
    String tipo;

    //Constructores
    public Pez(){

    }

    public Pez(String especie, String color,String genero, String habitat, String edad){
        super(especie,color,genero,habitat,edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getAlimento(){
        return this.alimento;
    }

    public void setAlimento(String alimento){
        this.alimento = alimento;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void hacerSonido(){
        System.out.println("el pex"+this.nombre+"esta haciendo gluglugluglu");
    }

    @Override
    public String toString() {
        return super.toString()+
                "nombre:"+nombre + '\''+
                "alimento:"+alimento + '\''+
                "tipo:" + tipo + '\'';

    }
}
