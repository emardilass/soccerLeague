package controller;


import co.com.league.model.DataBase;
import co.com.league.model.Team;

public class Controller{
	public static void main (String[]args){	
		
	}
	
	private DataBase storage = new DataBase();
	
	public boolean saveTeam(Team x) {
		storage.getTeams().add(x);
		return true;
	}
	
	public String showTeams() {
		String res = null;
		for(Team aux:storage.getTeams()) {
			res=res+aux.getNameTeam()+";";
		}
		return res;
	}
	
	
	
}