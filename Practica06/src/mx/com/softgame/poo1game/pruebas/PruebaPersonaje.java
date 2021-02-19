//Ana Karen Rodriguez Silva
//Hora de inicio: 8:10 am
package mx.com.softgame.poo1game.pruebas;
import mx.com.softgame.poo1game.personajes.Personaje;
public class PruebaPersonaje{
	public static void main(String[] args) {
		Personaje per01 = new Personaje("Aline");
		per01.setEdad(200);
		Personaje per02 = new Personaje("Erick");
		per01.setEdad(10);
		Personaje per03 = new Personaje("Alan");
		per01.setEdad(1);
		Personaje per04 = new Personaje("Lesly");
		per01.setEdad(-10);
		Personaje per05 = new Personaje("Brian");
		per01.setEdad(500);

		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());

		Personaje per06 = per05;
		Personaje per07 = per04;
		Personaje per08 = per03;
		Personaje per09 = per02;
		Personaje per10 = per01;

		per06.setNombre("Jorge Eduardo");
		per08.setNombre("Yosselin");
		per10.setNombre("Ana");
		per07.setEdad((int)(Math.random()*1000));
		per09.setEdad((int)(Math.random()*1000));

		System.out.println("-------------------------------------");
		System.out.println(per01.getDetalle());
		System.out.println(per02.getDetalle());
		System.out.println(per03.getDetalle());
		System.out.println(per04.getDetalle());
		System.out.println(per05.getDetalle());
	}
}
//hora de finalización: 9:54
//cambios: al imprimir, la segunda parte cambia los nombres de Aline y Alan por
//los nombres de Ana y Yosselin. 