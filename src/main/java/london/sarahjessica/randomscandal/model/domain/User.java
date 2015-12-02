package london.sarahjessica.randomscandal.model.domain;

import static london.sarahjessica.randomscandal.model.domain.Level.HACK;

public class User {
    private String name;
    private String email;
    private String password;


    private String userId;
    private Level level;
    private int highScore;

    public User(String name, Level level, String email, String password, int highScore){
        this.name = name;
        this.level = level;
        this.email = email;
        this.password = password;
        this.highScore = highScore;
    }

    public User(String password, String email, String name){
        this(name, HACK, email, password, 0);
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
