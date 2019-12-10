/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmy_dz;

//public interface Funkcja {
public class Funkcja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Film film1 = new Film();//wywołanie kons. bezp.

                Film f1= new Film("Toy Story","Pixar",1995);
		Film f2= new Film("Toy Story 2","Pixar",1999);
		Film f3= new Film("Toy Story 3","Pixar",2010);

                //Film film2 = new Film();
                Spis film2 = new Spis();

                film2.dodajFilm(f1);
		film2.dodajFilm(f2);
		film2.dodajFilm(f3);
		
                System.out.println(f1);
		System.out.println(f2);
                System.out.println(f3);

                //Film.ileFilmow();
                Spis.ileFilmow();
                
                Dziedziczenie FilmyD = new Dziedziczenie();
                System.out.println(FilmyD);
    }
    
}
