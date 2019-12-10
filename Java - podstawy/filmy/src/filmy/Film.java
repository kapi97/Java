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
public class Film {
private String tytul,wytwornia;
private Integer rok;
/*    //Spis.java
private static int ilosc=0;
public static void ileFilmow() {
	System.out.println("Wszystkich filmow jest: "+ilosc);
}*/

	//kostruktor bezparametrowy
	public Film() {
		this.tytul="";
		this.wytwornia="";
		this.rok=0;
	}
        //konstruktor parametrowy
	public Film(String tytul, String wytwornia, Integer rok) {
		this.tytul=tytul;
		this.wytwornia=wytwornia;
		this.rok=rok;
        }
        
        //pobieranie prywatnych pól - danych tytul, kraj i wytwornia
	public String getTytul() {
		return tytul;
	}
        //modyfikowanie prywatnych pól klasy
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public String getWytwornia() {
		return wytwornia;
	}
	public void setWytwornia(String wytwornia) {
		this.wytwornia = wytwornia;
	}
	public Integer getRok() {
		return rok;
	}
	public void setRok(Integer rok) {
		this.rok = rok;
	}
        
        /*
        //Spis.java
	public void dodajFilm(Film film) {
		ilosc+=1;
	}
	
	public void usunFilm(Film film) {
		ilosc-=1;
	
	} */
        
	@Override
	public String toString() {
		return "Tytuł: "+tytul+", Wytwórnia: "+wytwornia+", Rok: "+rok;
	}
}
