package org.example;

import java.util.Objects;

public class Referee {
    private final String player1Name;
    private final String player2Name;
    private TennisRule[] rules;

    public Referee(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }
    private void initRules(){
        rules = new TennisRule[] {
                new WinnerRule(player1Name,player2Name),
                new AdvantageRule(player1Name,player2Name),
                new isNotDeuceRule(),
                new isDeuceRule(),
                new DefaultRule()
        };
    }
    public String getScore(int mScore1, int mScore2) {

        for (TennisRule rule : rules){
            if(rule.check(mScore1,mScore2)){
                return rule.announce(mScore1,mScore2);
            }
        }
        throw new RuntimeException("Invalid rule !!");

    }
    public void wonPoint(String playerName, int mScore1, int mScore2) {
        if (Objects.equals(playerName, this.player1Name))
            mScore1++;
        else if (Objects.equals(playerName, this.player2Name))
            mScore2++;
    }

}
