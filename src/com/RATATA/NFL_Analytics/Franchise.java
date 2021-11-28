package com.RATATA.NFL_Analytics;

import java.util.ArrayList;

public class Franchise {

    // Variables
    private String franchiseName;
    private Owner teamOwner;
    public String getFranchiseName() {
        return franchiseName;
    }

    public Franchise(){}
    public Franchise(String fName, Owner owner) {
        franchiseName = fName;
        teamOwner = owner;
    }
    protected ArrayList<Player> playerRoster = new ArrayList<>();

    void printRoster(){
        System.out.println(getFranchiseName());
        System.out.println("Owner: " + teamOwner.getTmFull());
        for(Player p : playerRoster){
            System.out.println(p.getTmFull() + " (" + p.getJerseyNumber() + "): " + p.printPosition());
        }
    }
}