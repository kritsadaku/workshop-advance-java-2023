package org.example;

public class DefaultRule implements TennisRule {
    ScoreText scoreText = new ScoreText();
    public DefaultRule(){

    }
    @Override
    public boolean check(int mScore1, int mScore2) {
        return true;
    }

    @Override
    public String announce(int mScore1, int mScore2) {
        return scoreText.text[mScore1] + "-" + scoreText.text[mScore2];
    }
}
