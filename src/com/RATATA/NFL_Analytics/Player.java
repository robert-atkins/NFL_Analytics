package com.RATATA.NFL_Analytics;
public  class Player extends TeamMember {

    // Offense, defense, or special teams
    static final int OFFENSE = 1;
    static final int DEFENSE = 2;
    static final int SPECIAL_TEAMS = 3;

    // Offensive positions
    static final int QUARTERBACK = 1;
    static final int FULLBACK = 2;
    static final int HALFBACK = 3;
    static final int CENTER = 4;
    static final int GUARD = 5;
    static final int TACKLE_O = 6;
    static final int TIGHT_END = 7;
    static final int WIDE_RECEIVER = 8;

    // Defensive positions
    static final int MIDDLE_LB = 1 + 8;
    static final int OUT_LB = 2 + 8;
    static final int CORNERBACK = 3 + 8;
    static final int END = 4 + 8;
    static final int TACKLE_D = 5 + 8;
    static final int SAFETY = 6 + 8;

    // Special teams positions
    static final int KICKER = 1 + 14;
    static final int PUNTER = 2 + 14;
    static final int HOLDER = 3 + 14;

    private int position;
    private int jerseyNumber;
    public Player(){}

    public Player(String fName, String lName, int pos, int jNum) {
        tmFirst = fName;
        tmLast = lName;
        position = pos;
        jerseyNumber = jNum;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    String printPosition() {
        if(position == QUARTERBACK) { return "Quarterback";}
        else if(position == FULLBACK) {return "Fullback";}
        else if(position == HALFBACK) {return "Halfback";}
        else if(position == CENTER) {return "Center";}
        else if(position == GUARD) {return "Guard";}
        else if(position == TACKLE_O) {return "Offensive Tackle";}
        else if(position == TIGHT_END) {return "Tight End";}
        else if(position == WIDE_RECEIVER) {return "Wide Receiver";}
        else if(position == MIDDLE_LB) {return "Middle Linebacker";}
        else if(position == OUT_LB) {return "Outside Linebacker";}
        else if(position == CORNERBACK) {return "Cornerback";}
        else if(position == END) {return "End";}
        else if(position == TACKLE_D) {return "Defensive Tackle";}
        else if(position == SAFETY) {return "Safety";}
        else if(position == KICKER) {return "Kicker";}
        else if(position == PUNTER) {return "Punter";}
        else if(position == HOLDER) {return "Holder";}
        else return "POSITION NOT FOUND, CHECK YOUR CODE!";
    }
}