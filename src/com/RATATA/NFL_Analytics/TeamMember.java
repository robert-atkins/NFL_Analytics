package com.RATATA.NFL_Analytics;

public abstract class TeamMember {
    protected String tmFirst;
    protected String tmLast;
    protected boolean playerOrCoach;

    public String getTmFirst() {
        return tmFirst;
    }

    public String getTmLast(){
        return tmLast;
    }

    public String getTmFull() {
        return (getTmFirst() + " " + getTmLast());
    }
}