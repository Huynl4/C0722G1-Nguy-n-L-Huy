package ss8_clean_code.exercise;

public class TenisGame {

    public static final String SUBTRATION = "-";

    public static String getScore(String player1Name, String player2Name, int mscore1, int mscore2) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (mscore1 == mscore2) {
            switch (mscore1) {
                case 0:
                    score = new StringBuilder("LoveAll");
                    break;
                case 1:
                    score = new StringBuilder("FifteenAll");
                    break;
                case 2:
                    score = new StringBuilder("ThirtyAll");
                    break;
                case 3:
                    score = new StringBuilder("FortyAll");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else if (mscore1 >= 4 || mscore2 >= 4) {
            int minusResult = mscore1 - mscore2;
            if (minusResult == 1) score = new StringBuilder("Advantage player1");
            else if (minusResult == -1) score = new StringBuilder("Advantage player2");
            else if (minusResult >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = mscore1;
                else {
                    score.append(SUBTRATION);
                    tempScore = mscore2;
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
