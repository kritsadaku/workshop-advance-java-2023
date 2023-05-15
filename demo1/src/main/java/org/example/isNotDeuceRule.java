package org.example;

public class isNotDeuceRule implements TennisRule {
    public isNotDeuceRule(){

    }
    String[] scoreText = new String[] {"Love","Fifteen","Thirty","Forty"};
    @Override
    public boolean check(int mScore1, int mScore2) {
        return mScore1 == mScore2 && mScore1 <= 2;
    }

    @Override
    public String announce(int mScore1, int mScore2) {
        return scoreText[mScore1] +"-All";
    }
}
