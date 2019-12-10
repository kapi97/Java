/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmy;

/**
 *
 * @author PC
 */
//public class Spis extends Funkcja {
//lub
//public class FunkcjaImpl extends Funkcja {
public class Spis {

/*
  //Z prezentacji
  //Ustawia id obiektu i podnosi pole statyczne o jeden
private int id;
private void setId(){
    this.id= Spis.ilosc++;
}
   //Zwraca wartość pola statycznego
public static int getId(){
    return ilosc;
}  */
    
    	private static int ilosc=0;        
	public static void ileFilmow() {
		System.out.println("Wszystkich filmow jest: "+ilosc);
	}

        
	public void dodajFilm(Film film) {
		ilosc+=1;
	}
	
	public void usunFilm(Film film) {
		ilosc-=1;
	}
	
        
        @Override
	public String toString() {
		
		return "";
	}	
}
