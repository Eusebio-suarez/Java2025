package sistema;

import animals.Ave;
import animals.Perro;
import animals.Pez;
import datos.ModeloDatos;
import datos.PedirDatos;

import javax.swing.*;

public class Procesos {

    static ModeloDatos datos = new ModeloDatos();

    static String menu = """
            menu del sistema
            1.Ingresar perro
            2.Ingresar pez
            3.Ingresar ave
            4.ver datos
            5.salir     
            """;

    public static void iniciar(){

        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (option){
                case 1:{
                    //pedir los datos del perroo
                    System.out.println("pidiendo datos del perro");
                    Perro perro = PedirDatos.pedirPerro();
                    datos.añadirPerro(perro);
                    break;
                }
                case 2:{
                    //pedir los datos del pez
                    System.out.println("pidiendo datos del pez");
                    Pez pez = PedirDatos.pedirPez();
                    datos.añadirPez(pez);
                    break;
                }
                case 3:{
                    //pedir los datos del ave
                    System.out.println("pidiendo datos del ave");
                    Ave ave = PedirDatos.pedirAve();
                    datos.añadirAve(ave);
                    break;
                }

                case 4:{
                    //mostrar informacion
                    System.out.println("imprimiendo informacion");
                    datos.mostrarDatos();

                }
            }
        }
        while (option >=1 && option <=4);
    }
}
