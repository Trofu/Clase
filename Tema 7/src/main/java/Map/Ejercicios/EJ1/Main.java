package Map.Ejercicios.EJ1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Map<Trabajador,Pais> empresa1 = new HashMap<>();
        empresa1.put(new Trabajador("123456789","Pepe","Floreta", LocalDate.of(1990,1,10)),new Pais("España",1000000));
        empresa1.put(new Trabajador("987654321","Marta","Castillos", LocalDate.of(1995,1,10)),new Pais("España",1000000));
        empresa1.put(new Trabajador("147258369","Samuel","Rios", LocalDate.of(1996,1,10)),new Pais("España",1000000));
        empresa1.put(new Trabajador("963852741","Aray","Brito", LocalDate.of(1992,1,10)),new Pais("España",1000000));
        empresa1.put(new Trabajador("789456123","Jesus","Tarin", LocalDate.of(2000,1,10)),new Pais("España",1000000));







    }



}
