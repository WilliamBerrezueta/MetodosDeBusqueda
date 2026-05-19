//import models.Product;
import models.Persona;

public class BusquedaBinaria {

    // public void sortByName(Product[] products){
    //     for(int j = 0; j < products.length -1; j++){
    //         boolean ordenado = false;
    //         for(int i = 0; i < products.length -1 -j; i++){
    //             if(products[i].getNombre().compareTo(products[i+1].getNombre()) > 0){
    //                 Product temp = products[i];
    //                 products[i] = products[i+1];
    //                 products[i+1] = temp;
    //                 ordenado = true;
    //             }
    //         }
    //         if(!ordenado){
    //             break;
    //         }
    //     }
    // }

    // public int findByName(Product[] products, String nombre){
    //     //definamos bajo y alto
    //     int bajo = 0;
    //     int alto = products.length - 1;
        
    //     while(bajo <= alto){
    //         // definamos el punto medio
    //         int central = (bajo + alto)/2;
    //         // comparemos con la clave
    //         if(products[central].getNombre().equals(nombre)){
    //             return central;

    //         }
    //         // si voy a la derecha o izquierda
    //         int comparacion = products[central].getNombre().compareTo(nombre);
    //         if(comparacion > 0){
    //             alto = central - 1;

    //         }else{
    //             bajo = central + 1;

    //         }

    //         // si es igual, retornamos el punto medio
    //         // si es mayor, actualizamos el index correspondiente
    //         // si es menor, actualizamos el index correspondiente


    //     }
    //     return -1;

    // }
    // ORDENAR POR EDAD
    public void ordenar(Persona[] personas) {

        for (int j = 0; j < personas.length - 1; j++) {

            for (int i = 0; i < personas.length - 1 - j; i++) {

                if (personas[i].getEdad() > personas[i + 1].getEdad()) {

                    Persona aux = personas[i];
                    personas[i] = personas[i + 1];
                    personas[i + 1] = aux;
                }
            }
        }
    }

    // MOSTRAR EDADES
    public void mostrar(Persona[] personas, int bajo, int alto) {

        for (int i = bajo; i <= alto; i++) {
            System.out.print(personas[i].getEdad() + " | ");
        }

        System.out.println();
    }

    // BUSQUEDA BINARIA
    public Persona buscar(Persona[] personas, int edadBuscar) {

        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {

            mostrar(personas, bajo, alto);

            int centro = (bajo + alto) / 2;

            int valorCentro = personas[centro].getEdad();

            System.out.print(
                    "bajo=" + bajo +
                    " alto=" + alto +
                    " centro=" + centro +
                    " valorCentro=" + valorCentro
            );

            if (valorCentro == edadBuscar) {

                System.out.println(" --> ENCONTRADO");

                return personas[centro];

            } else if (edadBuscar > valorCentro) {

                System.out.println(" --> DERECHA");

                bajo = centro + 1;

            } else {

                System.out.println(" --> IZQUIERDA");

                alto = centro - 1;
            }
        }

        return null;
    }
}
 

