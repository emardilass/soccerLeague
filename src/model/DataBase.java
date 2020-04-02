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

    public void remove(Storable e){
        if (e instanceof Player){
            this.jugadores.remove((Player)e);
        }else if(e instanceof Team){
            this.equipos.remove((Team)e);
        }
    }

    public void removeAll(List<Storable> e){
        for(Storable current : e){
            save((Storable) current);
        }
    }

    public void update(Storable e){

        //TODO: [11] - Implementar esto DESPUÉS de implementar findById

        if (e instanceof Player){
            this.jugadores.set(1, (Player)e);
        }else if(e instanceof Team){
            this.equipos.set(1, (Team)e);
        }
    }


    /**
     *
     * @param e
     * @return null en caso de no encontrar el elemento.
     */
    public Storable find (Storable e){

        Storable result = null;
        int index = -1;

        if (e instanceof Player){
            Player p = (Player)e;
            index = this.jugadores.indexOf(p);
            if(index >= 0){
                result = this.jugadores.get(index);
            }
        }else if(e instanceof Team){
            Team t = (Team)e;
            index = this.equipos.indexOf(t);
            if(index >= 0){
                result = this.equipos.get(index);
            }
        }

        return result;
    }

    public Storable findById(Storable e){
        throw new UnsupportedOperationException("Not implemented yet"); //TODO: [10] - Borrar esta línea cuando vayan a empezar a codificar tu implementación.
    }

}