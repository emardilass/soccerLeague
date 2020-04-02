import model.DataBase;
import model.Player;
import model.Team;

import java.util.ArrayList;
import java.util.Arrays;

public class SoccerLeagueTest{

    public static void main(String... args){
        DataBase db = new DataBase();
        db.init();

        Player pepe = new Player("Pepe", 10, "GK");
        Player lucas = new Player("Lucas",11,"DF");
        Player lucas2 = new Player("Lucas",9,"DF");

        db.saveAll(Arrays.asList(pepe, lucas));
        db.save(new Team(1, "Los Cósmicos"));
        System.out.print(db.find(lucas2));

    }

}