import com.svalero.domain.Class1;
import com.svalero.domain.Class2;
import com.svalero.domain.Class3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scn = new Scanner(System.in);
    List<Class1> objects1 = new ArrayList<>();
    List<Class2> objects2 = new ArrayList<>();
    List<Class3> objects3 = new ArrayList<Class3>();

    public void showMenu() {

        int choice;

        do {
            System.out.println("---------------MENU------------------");
            System.out.println("1. Crear objeto de la clase 1");
            System.out.println("2. Crear objeto de la clase 2");
            System.out.println("3. Crear objeto de la clase 3");
            System.out.println("4. Ver lista de objetos de la clase 1");
            System.out.println("5. Ver lista de objetos de la clase 2");
            System.out.println("6. Ver lista de objetos de la clase 3");
            System.out.println("7. Salir");

            System.out.println("Selecciona una opción del menú: ");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    createObject1();
                    break;
                case 2:
                    createObject2();
                    break;
                case 3:
                    creteObject3();
                    break;
                case 4:
                    objects1.forEach((System.out::println));
                    break;
                case 5:
                    objects2.forEach((System.out::println));
                    break;
                case 6:
                    objects3.forEach((System.out::println));
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Debes seleccionar una opción disponible del menú");
            }

        } while(choice != 7);


    }

    public void createObject1() {

        System.out.println("Escriba s1: ");
        String s1 = scn.next();

        System.out.println("Escriba s2: ");
        String s2 = scn.next();

        System.out.println("Escriba i1: ");
        int i1 = scn.nextInt();

        System.out.println("Escriba i2: ");
        int i2 = scn.nextInt();

        System.out.println("Escriba f: ");
        float f = scn.nextFloat();

        objects1.add(new Class1(s1, s2, i1, i2, f));
    }

    public void createObject2() {

        System.out.println("Escriba s1: ");
        String s1 = scn.next();

        System.out.println("Escriba s2: ");
        String s2 = scn.next();

        System.out.println("Escriba i1: ");
        int i1 = scn.nextInt();

        System.out.println("Escriba i2: ");
        int i2 = scn.nextInt();

        System.out.println("Escriba f: ");
        float f = scn.nextFloat();

        objects2.add(new Class2(s1, s2, i1, i2, f));
    }

    private void creteObject3() {

        System.out.println("Escriba s1: ");
        String s1 = scn.next();

        System.out.println("Escriba s2: ");
        String s2 = scn.next();

        System.out.println("Escriba i1: ");
        int i1 = scn.nextInt();

        System.out.println("Escriba i2: ");
        int i2 = scn.nextInt();

        System.out.println("Escriba f: ");
        float f = scn.nextFloat();

        objects3.add(new Class3(s1, s2, i1, i2, f));

    }

}
