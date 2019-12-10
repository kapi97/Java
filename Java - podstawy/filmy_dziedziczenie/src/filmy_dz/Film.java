/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmy_dz;

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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tytul == null) ? 0 : tytul.hashCode());
		result = prime * result + ((wytwornia == null) ? 0 : wytwornia.hashCode());
		result = prime * result + ((rok == null) ? 0 : rok.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		if (tytul == null) {
			if (other.tytul != null)
				return false;
		} else if (!tytul.equals(other.tytul))
			return false;
		if (wytwornia == null) {
			if (other.wytwornia != null)
				return false;
		} else if (!wytwornia.equals(other.wytwornia))
			return false;
		if (rok == null) {
			if (other.rok != null)
				return false;
		} else if (!rok.equals(other.rok))
			return false;
		return true;
	}



	//kostruktor bezparametrowy
	public Film() {
		this.tytul="A";
		this.wytwornia="AA";
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
