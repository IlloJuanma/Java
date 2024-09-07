package Basic;
import java.util.Scanner;

 /* Se necesita un algoritmo que calcule el coste total de baldosas cuadradas necesarias
    para cubrir el suelo de una habitación rectangular. El programa solicitará como datos las
    dimensiones   de   la   habitación   en   metros   (ancho   y   largo),   el   lado   de   cada   baldosa
    expresado en centímetros y el precio por baldosa expresado en euros.
    Con esos datos calculará el número de baldosas necesarias que hay que colocar en la
    habitación (redondeando hacia arriba si el resultado no es un numero entero) y el precio
    total a invertir.
*/   
public class calcularCosteBaldosas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double largo, ancho, baldosa, precio;
        double totalBaldosas, totalPrecio;

        System.out.print("Ingresa largo habitacion:");
            largo=sc.nextDouble();
            System.out.print("Ingresa ancho Habitacion: ");
            ancho=sc.nextDouble();
            System.out.print("Ingresa tamaño baldosa: ");
            baldosa=sc.nextDouble();
            System.out.print("Ingresa coste de cada baldosa: ");
            precio=sc.nextDouble();
            
            totalBaldosas=(largo*ancho)/baldosa;
            totalPrecio=totalBaldosas*precio;
            
            System.out.print("Numero de baldosas: " + Math.round(totalBaldosas) + " y precio total: " + Math.round(totalPrecio));
            sc.close();
    }
}