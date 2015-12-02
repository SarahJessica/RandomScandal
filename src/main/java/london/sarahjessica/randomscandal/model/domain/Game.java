package london.sarahjessica.randomscandal.model.domain;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Game {
//    private int noOfScoops;
//    private List<Scoop> scoopList;
//    private BlankSpaceFillers blankSpaceFillersList;
//    private boolean hackStatus;
//    private Headline upcomingHeadline;

    private String currentHeadline, gameId;
    private Timestamp timestamp;
    private GameStatus gameStatus;
    private List<User> usersList;

    public Game(List<User> usersList, String currentHeadline, String gameId, Timestamp timestamp, GameStatus gameStatus) {
        this.usersList = usersList;
        this.currentHeadline = currentHeadline;
        this.gameId = gameId;
        this.timestamp = timestamp;
        this.gameStatus = gameStatus;
    }

    public List<User> getUsersList() {
        return usersList;
    }
    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }
    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
    public String getCurrentHeadline() {
        return currentHeadline;
    }
    public void setCurrentHeadline(String currentHeadline) {
        this.currentHeadline = currentHeadline;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }


}
