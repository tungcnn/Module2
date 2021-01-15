public class TennisGame {
    public static final int ZERO = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getEvenScore(int player1Score) {
        switch (player1Score) {
            case ZERO:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String getOver4Score(int player1Score, int player2Score) {
        int minusResult = player1Score - player2Score;
        boolean isPlayer1Higher = minusResult == 1;
        boolean isPlayer2Higher = minusResult == -1;
        boolean isPlayer1Win = minusResult >= 2;

        if (isPlayer1Higher) return "Advantage player1" ;
        else if (isPlayer2Higher) return "Advantage player2";
        else if (isPlayer1Win) return "Win for player1";
        else return "Win for player2";
    }

    public static String getNormalScore(int playerScore) {
        switch (playerScore) {
            case ZERO:
                return "Love";
            case FIFTEEN:
                return "Fifteen";
            case THIRTY:
                return "Thirty";
            case FORTY:
                return "Forty";
            default:
                return "";
        }
    }

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        boolean isEvenScore = player1Score == player2Score;
        boolean isOver4Point = player1Score >= 4 || player2Score >= 4;

        if (isEvenScore)
            score = getEvenScore(player1Score);
        else if (isOver4Point)
            score = getOver4Score(player1Score, player2Score);
        else {
            score += getNormalScore(player1Score);
            score += "-";
            score += getNormalScore(player2Score);
        }
        return score;
    }
}
