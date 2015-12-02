package london.sarahjessica.randomscandal.model.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.UUID;


public class User {
    private String name;
    private String email;
    private String password;
    private String userId;
    private Level level;
    private int highScore;
    private boolean userLoggedIn
    private Timestamp lastLoginTimestamp;
    private boolean inGame;
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh:mm");

    public User(String name, Level level, String email, String password, int highScore, boolean userLoggedIn, boolean inGame, Timestamp lastLoginTimestamp, String userId){
        this.name = name;
        this.level = level;
        this.email = email;
        this.password = password;
        this.highScore = highScore;
        this.userLoggedIn = userLoggedIn;
        this.lastLoginTimestamp = lastLoginTimestamp;
        this.inGame = inGame;
    }

    public User(String password, String email, String name){
        this(name, Level.HACK, email, password, 0, true, false, Timestamp.from(Instant.now()), UUID.randomUUID().toString());
    }

    public boolean getUserLoggedIn() {
        return userLoggedIn;
    }
    public void setUserLoggedIn(boolean userLoggedIn) {
        this.userLoggedIn = userLoggedIn;
    }
    public Timestamp getLastLoginTimestamp() {
        return lastLoginTimestamp;
    }
    public void setLastLoginTimestamp(Timestamp lastLoginTimestamp) {
        this.lastLoginTimestamp = lastLoginTimestamp;
    }
    public boolean isInGame() {
        return inGame;
    }
    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }


}
