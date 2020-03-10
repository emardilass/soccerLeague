/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Java11
 */
public class Team {

    private int codeTeam;
    private String nameTeam;
    private double probabilityAttac;
    private double probabilityDefense;

    public Team(int codeTeam, String nameTeam ) {
        this.codeTeam = codeTeam;
        this.nameTeam = nameTeam;       
    }
    
    public void validate (Team team ){
    
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public double getProbabilityAttac() {
        return probabilityAttac;
    }

    public void setProbabilityAttac(double probabilityAttac) {
        this.probabilityAttac = probabilityAttac;
    }

    public double getProbabilityDefense() {
        return probabilityDefense;
    }

    public void setProbabilityDefense(double probabilityDefense) {
        this.probabilityDefense = probabilityDefense;
    }

    /**
     * @return the codeTeam
     */
    public int getCodeTeam() {
        return codeTeam;
    }

    /**
     * @param codeTeam the codeTeam to set
     */
    public void setCodeTeam(int codeTeam) {
        this.codeTeam = codeTeam;
    }
}
