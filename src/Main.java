import Clases.Perrito;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Perrito> listaDePerritos = new ArrayList<>();


        Perrito cefis = new Perrito();

        cefis.setNombre("Cefis");
        cefis.setEdad(2.5f);
        cefis.setEstadoSlud(false);


        Perrito bob = new Perrito();

        bob.setNombre("bob");
        bob.setEdad(8.5f);
        bob.setEstadoSlud(false);

        listaDePerritos.add(cefis); // 0
        listaDePerritos.add(cefis); // 1


        listaDePerritos.add(bob); // 2


        listaDePerritos.add(cefis);// 3

        Perrito cefi2 = new Perrito();
        cefi2.setEdad(5.6f);
        cefi2.setEstadoSlud(false);
        cefi2.setNombre("cefis2");

        listaDePerritos.add(cefi2); // 4
        listaDePerritos.add(cefi2); // 5

        int cantidadPerritos = listaDePerritos.size(); // 6

        Perrito perrito2 = listaDePerritos.get(2);


        for (int i = 0; i <listaDePerritos.size() ; i++) {
            imprimirNombre(listaDePerritos.get(i));
        }



        // https://www.delftstack.com/es/howto/java/iterate-list-java/#iterar-elementos-de-lista-usando-el-m%C3%A9todo-foreach-y-stream-en-java-8
        // foreach

        listaDePerritos
                .stream()
                .filter(obj -> obj.getNombre().equals("Cefis"))
                .filter(obj -> obj.getEstadoSlud().equals(false))
                .forEach(p -> imprimirNombre(p));
    }


    public static void imprimirNombre(Perrito perrito) {
        System.out.println("************************************************");
        System.out.println("NOMBRE ".concat(perrito.getNombre()));
        System.out.println("EDAD ".concat(String.valueOf(perrito.getEdad())));
        System.out.println("ESTADO SALUD ".concat(String.valueOf(perrito.getEstadoSlud())));
    }
}