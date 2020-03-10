package view;

import model.Team;

public class ViewServices {

    Team newTeam = new Team();

    public String registrarEquipo(int idTeam, String nameTeam) {

        boolean controllerResult = false;
        String message = "";
        System.out.println("Ingrese el nùmero y nombre del equipo");

        this.newTeam.setIdTeam(idTeam);
        this.newTeam.setNameTeam(nameTeam);
        return message;
    }

}
