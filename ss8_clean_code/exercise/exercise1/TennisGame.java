package ss8_clean_code.exercise.exercise1;

public class TennisGame {

    public static String getScore(String firstPlayer, String secondPlayer, int firstPlayerScore, int secondPlayerScore) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (firstPlayerScore == secondPlayerScore) {
            switch (firstPlayerScore) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            int minusResult = firstPlayerScore - secondPlayerScore;
            switch (minusResult) {
                case -1:
                    score = new StringBuilder("Advantage player2");
                    break;
                case 1:
                    score = new StringBuilder("Advantage player1");
                    break;
                default:
                    if (minusResult >= 2) {
                        score = new StringBuilder("Win for player1");
                    } else {
                        score = new StringBuilder("Win for player2");
                    }
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstPlayerScore;
                else {
                    score.append("-");
                    tempScore = secondPlayerScore;
                }
                switch (tempScore) {
                    case 0:
                        score.append("Love");
                        break;
                    case 1:
                        score.append("Fifteen");
                        break;
                    case 2:
                        score.append("Thirty");
                        break;
                    case 3:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}
