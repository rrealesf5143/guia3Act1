
// Clase Dupla, el nombre de la clase debe ir en mayúsculas
class Dupla {

    // Datos miembro de la clase "dupla"
    private int a, b;

    // Funciones miembro de la clase "dupla. Deben de comenzas con minúscula
    // En Java no existe el paso por referencia para variables primitivas
    // La funcion Lee se divide en dos por lo mismo
    int leeA() {
        return a;
    }

    int leeB() {
        return b;
    }

    void guarda(int a2, int b2) {
        // Se almacenan los parámetros en los miembros del objeto
        a = a2;
        b = b2;
    }
}

// La clase se debe llamar al igual que el archivo *.java 
class Guia2_act1 {

// Metodo Main    
    public static void main(String[] args) {

        // La parte a la izquierda de "=" declara el objeto
        // La parte a la derecha de "=" instancia el objeto
        Dupla primerPar = new Dupla();
        int x, y;

        // Guardar 2 enteros
        primerPar.guarda(12, 32);
        // Se leen los valores y se asignan a "x" y "y"
        x = primerPar.leeA();
        y = primerPar.leeB();

        // Salida en pantalla
        System.out.println("Valor del primerPar.a:" + x);
        System.out.println("Valor del primerPar.b:" + y);

        // No es necesario el return 0, la clase main de java no regresa valores
        //return 0;
    }
}
