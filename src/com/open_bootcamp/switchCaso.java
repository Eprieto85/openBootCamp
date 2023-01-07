 package com.open_bootcamp;

public class switchCaso {

    public static void main(String[]args) {
        var estacion = "verano";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no nonozco esa estación");
        }
    }
}
/*  public static void main(String[]args) {     // ejemplo 2
    var dia = "lunes";

      switch (dia) {
          case "lunes":
          case "martes":
          case "miercoles":
          case "jueves":
          case "viernes":
              System.out.println("hoy es laborable");
              break;
            case "sabado":
            case "domingo":
                System.out.println("hoy no es laborable");
                break;
            default:
                System.out.println("hoy no es laborable");
        }
    }
*/