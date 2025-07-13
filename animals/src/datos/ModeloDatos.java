package datos;

import animals.Ave;
import animals.Perro;
import animals.Pez;

import java.util.ArrayList;

public class ModeloDatos {
    //lista de perros
    ArrayList<Perro> perros = new ArrayList<>();
    //lista de aves
    ArrayList<Ave> aves = new ArrayList<>();
    //lista de pezes
    ArrayList<Pez> pezs = new ArrayList<>();

    public  void mostrarDatos(){
        System.out.println(perros);
        System.out.println(aves);
        System.out.println(pezs);
    }

    public void añadirPerro(Perro perro){
        perros.add(perro);
        System.out.println("se añadio el perro "+perro.getNombre());
    }

    public void añadirAve(Ave ave){
        aves.add(ave);
        System.out.println("se añadio el ave "+ave.getNombre());
    }

    public void añadirPez(Pez pez){
        pezs.add(pez);
        System.out.println("se agrego el pez "+pez.getNombre());
    }
}
