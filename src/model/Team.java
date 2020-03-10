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

    private String nameTeam;
    private double probabilityAttac;
    private double probabilityDefense;

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
}
