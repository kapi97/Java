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
public class Dziedziczenie extends Film {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ilosc;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dziedziczenie other = (Dziedziczenie) obj;
		if (ilosc != other.ilosc)
			return false;
		return true;
	}

	int ilosc; 
	/*
	private int ilosc;
	public void setIlosc(int ilosc) {        
	this.ilosc = ilosc; } 
	public int getIlosc() {        
	return ilosc; }
	*/
	public Dziedziczenie() {
		this.ilosc=3;
	}
	public Dziedziczenie(String tytul, String wytwornia, Integer rok, int ilosc) {
		//jawne wywołanie konstruktora nadklasy
		super(tytul,wytwornia,rok + ilosc);//działa bez "+ ilosc"
		this.ilosc=ilosc;
	}
	/*
	@Override
	public int getIlosc(){
		return super.getIlosc()+this.ilosc; //dodając "super" odwołujemy się do metody nadklasy
	}
	*/
	@Override
	public String toString() {
		return super.toString()+" Ilość: "+ilosc;
	}
	/*
	@Override
	public String toString() {
		return "Tytuł: "+super.getTytul()+", Wytwórnia: "+super.getWytwornia()+", Rok: "+super.getRok();
	}
	*/
}
