package net.attwoodthomas.crystalball.app;

import java.util.Random;

/**
 * Created by charliethomas on 24/06/2014.
 */
public class CrystalBall {

    // Declare our mAnswers array
    final public String[] mAnswers = {
            "It is certain",
            "It is decidedly so",
            "All the signs say YES",
            "The stars are not aligned",
            "My reply is no",
            "It is doubtful",
            "Better not tell you now",
            "Concentrate and ask again",
            "Unable to answer now"
    };

    public String getAnAnswer() {


        // Init answer to blank string
        String answer = "";

        // Create random number
        Random random = new Random();
        int randomNumber = random.nextInt(mAnswers.length);

        // Assign answer to item in mAnswers using random number
        answer = mAnswers[randomNumber];

        return answer;

    }
}
