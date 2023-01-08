package EjerciciosTema8;

public class Main {

    public static void main(String[] args) {
        Persona persona=new Persona();

        persona.setEdad(37);
        persona.setNombre("Edisson");
        persona.setTelefono("3024980435");

        int edad=persona.getEdad();
        String nombre= persona.getNombre();
        String telefono= persona.getTelefono();

        System.out.println("Mi nombre es: "+persona.getNombre()+" Mi edad es: "+persona.getEdad()+" y telefono es: "+persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public void setEdad(int nEdad){
        this.edad=nEdad;
    }
    public void setNombre(String nNombre){
        this.nombre=nNombre;
    }
    public void setTelefono(String nTelefono){
        this.telefono=nTelefono;
    }


    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
//crear clase persona=>listo
//Crear variables privadas edad,nombre y telefono de clase persona=>listo
//crear gets y sets de cada propiedad=>listo
//crear un objeto persona en el main=>listo
//utilizaa gets y sets para darle valores a las propiedades edad,nombre y telefono=>listo
//por ultimo muestralas por consola=>listo