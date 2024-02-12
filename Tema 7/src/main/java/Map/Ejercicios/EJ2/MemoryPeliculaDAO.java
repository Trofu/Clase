package Map.Ejercicios.EJ2;

import java.util.*;


public class MemoryPeliculaDAO {

    List<PeliculaTO> listaPeliculas;



    public MemoryPeliculaDAO(){
        listaPeliculas = new LinkedList<>();
    }


    public void addPelicula(PeliculaTO pelicula){
        if (!listaPeliculas.contains(pelicula))
            listaPeliculas.add(pelicula);
    }

    public void addAllPeliculas(List<PeliculaTO> peliculas){
        for (PeliculaTO peli:peliculas){
            addPelicula(peli);
        }
    }


    public List<PeliculaTO> getListapeliculas(){
        return listaPeliculas;
    }







}
