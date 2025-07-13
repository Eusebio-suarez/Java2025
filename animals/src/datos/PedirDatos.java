package datos;

import animals.Ave;
import animals.Perro;
import animals.Pez;

import javax.swing.*;

public class PedirDatos {
    public static Ave pedirAve(){
        Ave ave = new Ave();
        ave.setEspecie(JOptionPane.showInputDialog("ingrese la especie"));
        ave.setColor(JOptionPane.showInputDialog("ingrese el color"));
        ave.setGenero(JOptionPane.showInputDialog("ingrese el genero"));
        ave.setHabitat(JOptionPane.showInputDialog("ingrese el habitat"));
        ave.setEdad(JOptionPane.showInputDialog("ingrese la edad"));
        ave.setNombre(JOptionPane.showInputDialog("ingrese el nombre"));
        ave.setAlimento(JOptionPane.showInputDialog("ingrese el alimeto"));
        ave.setRaza(JOptionPane.showInputDialog("ingrese la raza"));
        return ave;
    }

    public static Perro pedirPerro(){
        Perro perro = new Perro();
        perro.setEspecie(JOptionPane.showInputDialog("ingrese la especie "));
        perro.setColor(JOptionPane.showInputDialog("ingrese el color"));
        perro.setGenero(JOptionPane.showInputDialog("ingrese el genero"));
        perro.setHabitat(JOptionPane.showInputDialog("ingrese el habitat"));
        perro.setEdad(JOptionPane.showInputDialog("ingrese la edad"));
        perro.setNombre(JOptionPane.showInputDialog("ingrese el nombre"));
        perro.setAlimento(JOptionPane.showInputDialog("ingrese el alimeto"));
        perro.setRaza(JOptionPane.showInputDialog("ingrese la raza"));
        perro.setOsico(JOptionPane.showInputDialog("Ingrese el tipo de osisco del perro"));
        return perro;
    }

    public static Pez pedirPez(){
        Pez pez = new Pez();
        pez.setEspecie(JOptionPane.showInputDialog("ingrese la especie "));
        pez.setColor(JOptionPane.showInputDialog("ingrese el color"));
        pez.setGenero(JOptionPane.showInputDialog("ingrese el genero"));
        pez.setHabitat(JOptionPane.showInputDialog("ingrese el habitat"));
        pez.setEdad(JOptionPane.showInputDialog("ingrese la edad"));
        pez.setNombre(JOptionPane.showInputDialog("ingrese el nombre"));
        pez.setAlimento(JOptionPane.showInputDialog("ingrese el alimeto"));
        pez.setTipo(JOptionPane.showInputDialog("ingrese el tipo de pez"));
        return pez;
    }

}
