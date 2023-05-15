package org.example;

import java.util.Objects;

public class TennisGame1 implements TennisGame {

    private int mScore1 = 0;
    private int mScore2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, this.player1Name))
            mScore1++;
        else if (Objects.equals(playerName, this.player2Name))
            mScore2++;
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore;

        if (isDeuce()) {
            return "Deuce";
        }

        if (isNotDeuce()) {
            String[] scoreText = new String[] {"Love","Fifteen","Thirty"};
            return scoreText[mScore1] +"-All";
        }

        if (isAdvantage()) {
            if (mScore1 - mScore2==1) return "Advantage " +player1Name;
            return "Advantage " + player2Name;
        }

        if (isWin()) {
            if (mScore1 - mScore2>=2) return "Win for " + player1Name;
            return "Win for " + player2Name;

        }

        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = mScore1;
                else { score.append("-"); tempScore = mScore2;}
                switch (tempScore) {
                    case 0 -> score.append("Love");
                    case 1 -> score.append("Fifteen");
                    case 2 -> score.append("Thirty");
                    case 3 -> score.append("Forty");
                }
            }
        }
        return score.toString();
    }

    private boolean isWin() {
        return (mScore1 >= 4 || mScore2 >= 4) && Math.abs(mScore1 - mScore2) >= 2;
    }

    private boolean isAdvantage() {
        return (mScore1 >= 4 || mScore2 >= 4) && Math.abs(mScore1 - mScore2) == 1;
    }

    private boolean isNotDeuce() {
        return mScore1 == mScore2 && mScore1 <= 2;
    }

    private boolean isDeuce() {
        return mScore1 == mScore2 && mScore1 > 2;
    }
}