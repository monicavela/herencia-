/*
 * Monica Jaqueline Vela Galvan
 */
package herencia;

import java.util.Scanner;

public class Herencia {

    public static void main(String[] args) {
        Dog2[] dogs = insertDog();
        printDogsOnConsole(dogs);
        feed(dogs);
        System.out.println("After eating------------");
        printDogsOnConsole(dogs);
    }

    private static void feed(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            double weightBeforefeeding = dogs[i].getWeight();
            dogs[i].setWeight(weightBeforefeeding + 0.5);
        }
    }

    private static void printDogsOnConsole(Dog[] dogs) {
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].printToConsole();
        }
    }

    private static Dog2[] insertDog() {
        Dog2[] dogs = new Dog2[4];

        String [] names = new String[4];
        String [] colours = new String[4];
        Double [] weight = new Double[4];
        Double [] portion = new Double[4];

        Scanner teclado=new Scanner(System.in);

        ///Asigna los nombres 
        for(int i=0; i < dogs.length ; i++){
            System.out.println("ingresa el nombre del perro " + (i+1));
            String nombre = teclado.nextLine();
            names[i]=nombre;
        }
        //Asigna el Color
        for(int i=0; i < dogs.length ; i++){
            System.out.println("ingresa el color del perro " + (i+1));
            String color= teclado.nextLine();
            colours[i]=color;
        }
        //Asinga el peso
        for(int i=0; i < dogs.length ; i++){
            System.out.println("ingresa el peso del perro " + (i+1));
            Double peso= teclado.nextDouble();
            weight[i]=peso;
        }
        //Asignar la porción
        for(int i=0; i < dogs.length ; i++){
            System.out.println("ingresa la proporcion del perro " + (i+1));
            Double porcion= teclado.nextDouble();
            portion[i]=porcion;
        }

        /*String[] names = {"Coco", "Sultan", "Boby", "Drak"};
        String[] colours = {"brown", "black", "white", "blue"};
        double[] weight = {1.5, 75, 3.5, 45.1};
        double[] portion = {0.2, 1, 0.2, 0.8};*/

        for (int i = 0; i < dogs.length; i++) {
            Dog2 dog = new Dog2();
            dog.setName(names[i]);
            dog.setColour(colours[i]);
            dog.setWeight(weight[i]);
            dog.setPortion(portion[i]);
            dogs[i] = dog;
        }
        return dogs;
    }

    private static void printDogsOnConsole(Dog2[] dogs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void feed(Dog2[] dogs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



