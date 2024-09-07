package POO.DungeonsAndDragons;

import java.util.Scanner;

public class HeroeMain {
    public static void main(String[] args) {
        /**
         * Vamos a crear un menu para crear a los personajes
         */

        Scanner sc = new Scanner(System.in);
        int opcion;
        // Creamos una clase vacia para darle luego la forma dependiendo de la opcion
        // que seleccionemos
        Heroe heroeSeleccionado = null;
        Heroe heroe1 = null;
        Heroe heroe2 = null;

        do {
            System.out.println("Bienvenido a la mazmorra del mal!! Intenta salir ileso, si puedes MUAHAHA");
            System.out.println("---MENÚ PRINPIPAL ---");
            System.out.println("1- Elegir Guerrero");
            System.out.println("2- Elegir Mago");
            System.out.println("3- Elegir Arquero");
            System.out.println("4- Tengo miedo, mejor me voy");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    heroeSeleccionado = new Guerrero("Alistair");
                    break;
                case 2:
                    heroeSeleccionado = new Mago("Gate");
                    break;
                case 3:
                    heroeSeleccionado = new Arquero("Oak");
                    break;
                default:
                    String mensaje = "Error, opción no válida!";
                    imprimirTextoSuave(mensaje, 50);

            }
            // Confirmacion de clase
            if (opcion == 1) {
                String mensaje = "Has elegido al guerrero, esta clase usa su furia para aplastar a sus enemigos con su maza a dos manos!";
                imprimirTextoSuave(mensaje, 50);
                String mensaje2 = "Baruk Khazad! Khazad ai-menu!";
                imprimirTextoSuave(mensaje2, 50);
                System.out.println(heroeSeleccionado);
                System.out.println("---");
                String mensaje3 = "Estás seguro que quieres elegir esta clase? (s/n): ";
                imprimirTextoSuave(mensaje3, 50);
                char confirmacion = sc.next().toLowerCase().charAt(0);
                if (confirmacion == 's') {
                    heroe1 = new Mago("Gate");
                    heroe2 = new Arquero("Oak");
                    mostrarMenuClase(heroeSeleccionado, heroe1, heroe2, sc);
                } else {
                    System.out.println("Bueeno...volvamos a pensarlo mejor no?");
                    heroeSeleccionado = null;
                    heroe1 = null;
                    heroe2 = null;
                }
            } else if (opcion == 2) {
                System.out.println(
                        "Has elegido al mago, usa el poder el infinito y del fuego del infierno, para abrasar a tus enemigos");
                System.out.println(
                        "Soy siervo del fuego secreto! Administrador de la llama de Anor! Tu fuego es en vano!!");
                System.out.println(heroeSeleccionado);
                System.out.println("---");
                String mensaje3 = "Estás seguro que quieres elegir esta clase? (s/n): ";
                imprimirTextoSuave(mensaje3, 50);
                char confirmacion = sc.next().toLowerCase().charAt(0);
                if (confirmacion == 's') {
                    heroe1 = new Guerrero("Alistair");
                    heroe2 = new Arquero("Oak");
                    mostrarMenuClase(heroeSeleccionado, heroe1, heroe2, sc);
                } else {
                    System.out.println("Bueeno...volvamos a pensarlo mejor no?");
                    heroeSeleccionado = null;
                    heroe1 = null;
                    heroe2 = null;
                }
            } else {
                System.out.println(
                        "Has elegido al arquero, se mueve con rapidez y acaba contigo sin ser visto o desde lejos de un flechazo!");
                System.out.println("Legolas, que ven tus ojos de elfo!");
                System.out.println(heroeSeleccionado);
                System.out.println("---");
                String mensaje3 = "Estás seguro que quieres elegir esta clase? (s/n): ";
                imprimirTextoSuave(mensaje3, 50);
                char confirmacion = sc.next().toLowerCase().charAt(0);
                if (confirmacion == 's') {
                    heroe1 = new Mago("Gate");
                    heroe2 = new Guerrero("Alistair");
                    mostrarMenuClase(heroeSeleccionado, heroe1, heroe2, sc);
                } else {
                    System.out.println("Bueeno...volvamos a pensarlo mejor no?");
                    heroeSeleccionado = null;
                    heroe1 = null;
                    heroe2 = null;
                }
            }

        } while (opcion != 4);

    }

    public static void mostrarMenuClase(Heroe heroe, Heroe heroe1, Heroe heroe2, Scanner sc) {
        int opcionClase;
        do {
            System.out.println("---- MENU DE " + heroe.nombre);
            System.out.println("1- Ver tus datos");
            System.out.println("2- Usar tu habilidad especial");
            System.out.println("3- Atacar al enemigo 1");
            System.out.println("4- Atacar al enemigo 2");
            System.out.println("5- Buscar tesoros");
            System.out.println("6- Salir y terminar el viaje, si puedes");
            System.out.println("Que quieres hacer campeon?: ");
            opcionClase = sc.nextInt();

            try {
                switch (opcionClase) {
                    case 1:
                        String mensaje = "Vamos a ver como estamos...";
                        imprimirTextoSuave(mensaje, 60);
                        imprimirTextoSuave(heroe.toString(), 60);
                        break;

                    case 2:
                        String mensaje2 = "Vamos al lio, usando habilidad especial!";
                        imprimirTextoSuave(mensaje2, 50);

                        if (heroe instanceof Guerrero) {
                            ((Guerrero) heroe).furia();
                        } else if (heroe instanceof Mago) {
                            ((Mago) heroe).curarse();
                        } else if (heroe instanceof Arquero) {
                            ((Arquero) heroe).rapidez();
                        }
                        break;

                    case 3:
                        if (!heroe1.muerto) {
                            String mensaje3 = "Vamos a pelear!";
                            imprimirTextoSuave(mensaje3, 50);
                            heroe.atacar(heroe1);
                            imprimirTextoSuave(heroe1.toString(), 50);

                        } else {
                            imprimirTextoSuave("El enemigo esta muerto y tu bailas sobre el", 50);
                        }
                        break;
                    case 4:
                        if (!heroe2.muerto) {
                            String mensaje4 = "Pelea!";
                            imprimirTextoSuave(mensaje4, 50);
                            heroe.atacar(heroe2);
                            imprimirTextoSuave(heroe2.toString(), 50);

                        } else {
                            imprimirTextoSuave("El enemigo esta pidiendo clemencia, se muere a tus manos MUAHAJA", 50);
                        }
                        break;

                    case 5:
                        String mensaje5 = "Vamos a mirar que hay por aqui...esto es nuevo";
                        imprimirTextoSuave(mensaje5, 50);
                        int numAle = (int) Math.random() * 6 - 1;
                        if (numAle > 3) {
                            imprimirTextoSuave("Oh un caramelo...", 50);
                        } else {
                            imprimirTextoSuave("No hay nada y encima me he clavado una astilla...", 50);
                            imprimirTextoSuave("La astilla te ha quitado 1 punto de vida", 50);
                            heroe.vida--;
                        }
                    case 6:
                        imprimirTextoSuave("Entonces...hemos salido!", 50);
                    default:
                        imprimirTextoSuave("Oye esa opción no esta, espabila y mira bien", 50);
                }
                // Retraso de 1 segundo (1000 milisegundos) antes de mostrar el menú nuevamente
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                imprimirTextoSuave("Se ha producido un error fatal", 50);
            }

        } while (opcionClase != 6);
    }

    // ----------------------------------------------------------------
    // Añade un retraso al system.out.print para que parezca un teletipo
    // NO TOCAR!
    public static void imprimirTextoSuave(String texto, int retraso) {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(retraso); // Retraso entre caracteres
            } catch (InterruptedException e) {
                System.out.println("Se ha producido una interrupción.");
            }
        }
        System.out.println(); // Nueva línea después de imprimir el texto
    }
}
