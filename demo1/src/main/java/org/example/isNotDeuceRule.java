package org.example;

public class isNotDeuceRule implements TennisRule {
    public isNotDeuceRule(){

    }
    ScoreText scoreText = new ScoreText();
    @Override
    public boolean check(int mScore1, int mScore2) {
        return mScore1 == mScore2 && mScore1 <= 2;
    }

    @Override
    public String announce(int mScore1, int mScore2) {
        return scoreText.text[mScore1] +"-All";
    }
}
