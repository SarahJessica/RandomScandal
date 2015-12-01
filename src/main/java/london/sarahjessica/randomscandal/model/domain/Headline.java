package london.sarahjessica.randomscandal.model.domain;


public class Headline {
    private String text1, text2, text3;
    private int noOfBlanks;

    Headline(int noOfBlanks, String text1, String text2, String text3){
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.noOfBlanks = noOfBlanks;
    }


}
