package EjerciciosTema9;

public class Main {

    public static void main(String[] args) {
        Persona persona=new Persona();
        Cliente cliente=new Cliente();
        Trabajador trabajador=new Trabajador();

        persona.edad=37;
        persona.nombre="Edisson";
        persona.telefono="3024980435";

        cliente.nombre="EdiDOs";
        cliente.edad=47;
        cliente.telefono="3212";
        cliente.credito="aprobado";

        trabajador.nombre="EdiTres";
        trabajador.edad=57;
        trabajador.telefono="3013412";
        trabajador.salario="100 EUR";


        //System.out.println("Mi nombre es: "+persona.nombre+" Mi edad es: "+persona.edad+" y telefono es: "+persona.telefono);
        System.out.println("Mi nombre es: "+cliente.nombre+" Mi edad es: "+cliente.edad+" telefono es: "+cliente.telefono+" y tiene credito: "+cliente.credito);
        System.out.println("Mi nombre es: "+trabajador.nombre+" Mi edad es: "+trabajador.edad+" telefono es: "+trabajador.telefono+" y tiene salario: "+trabajador.salario);
    }
}

class Persona {
    String nombre;
    int edad;
    String telefono;
}


class Cliente extends Persona{

    String credito;
}

class Trabajador extends Persona{

    String salario;
}

//crear clase Cliente que herede de persona=>listo
//Cliente tiene la variable credito=>listo
//Trabajador tiene la variable salario=>listo

//por ultimo muestralas por consola=>listo