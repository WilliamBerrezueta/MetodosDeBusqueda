import java.util.Scanner;
import models.Persona;

//import models.Product;

public class App {
//     public static void main(String[] args) throws Exception {
//         Product[] products = {
//             new Product("Laptop", 20),
//             new Product("Smartphone", 25),
//             new Product("Tablet", 10),
//             new Product("Monitor", 5),
//             new Product("Keyboard", 15)
//         };
//     BusquedaBinaria bBinaria = new BusquedaBinaria();
//     bBinaria.sortByName(products);
//     for(Product p : products){
//         System.out.println(p);
//     }
//     int res = bBinaria.findByName(products, "Laptop");
//     if(res >= 0){
//         System.out.println("entre en pos = " + res);
//     }else{
//         System.out.println("no se encontro");
//      }

//    }

public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese cantidad de personas: ");
            int n = sc.nextInt();
            sc.nextLine();

            Persona[] personas = new Persona[n];

            for (int i = 0; i < personas.length; i++) {

                System.out.println("Ingrese Persona:");

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                int edad;

                do {
                    System.out.print("Edad: ");
                    edad = sc.nextInt();

                    if (edad < 0) {
                        System.out.println("La edad no puede ser negativa");
                    }

                } while (edad < 0);

                sc.nextLine();

                personas[i] = new Persona(nombre, edad);
            }

            BusquedaBinaria bb = new BusquedaBinaria();

            bb.ordenar(personas);

            System.out.print("Valor de la edad a buscar: ");
            int edadBuscar = sc.nextInt();

            Persona encontrada = bb.buscar(personas, edadBuscar);

            if (encontrada != null) {

                System.out.println(
                        "La persona con la edad "
                        + edadBuscar +
                        " es "
                        + encontrada.getNombre()
                );

            } else {

                System.out.println("Persona no encontrada");
            }
        }
    }
}

