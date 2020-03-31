package model;

import java.time.LocalDate;
import java.util.*;

public class DataBase {
    //Arreglo para almacenar jugadores
    List<Player> jugadores;
    //Arreglo para almacenar Equipos
    List<Team> equipos;

    public void init(){
        this.jugadores = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }


    public void save(Storable e){
        if(e instanceof Player){
            this.jugadores.add((Player)e);
        }else if(e instanceof Team){
            this.equipos.add((Team)e);
        }
    }

    public void saveAll(List<Storable> e){
        for(Storable current : e){
            save((Storable) current);
        }
    }


    public static void main(String... args){
        DataBase db = new DataBase();
        db.init();

        db.save(new Player("Pepe", 10, "GK"));
        db.save(new Team(1, "Los Cósmicos"));


        db.saveAll(Arrays.asList(new Player("Pepe", 10, "GK")));

    }

}
