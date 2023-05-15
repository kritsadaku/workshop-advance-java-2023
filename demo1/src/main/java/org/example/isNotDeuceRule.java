package org.example;

public class isNotDeuceRule implements TennisRule {
    @Override
    public boolean check(int mScore1, int mScore2) {
        return mScore1 == mScore2 && mScore1 <= 2;
    }

    @Override
    public String announce(int mScore1, int mScore2) {
        String[] scoreText = new String[] {"Love","Fifteen","Thirty","Forty"};
        return scoreText[mScore1] +"-All";
    }
}
