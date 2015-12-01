package london.sarahjessica.randomscandal.model.domain;


import java.lang.*;
import java.lang.String;
import java.util.List;

public class Headline {

    private List<Text> headline;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for( Text text : headline){
            if(text instanceof london.sarahjessica.randomscandal.model.domain.String) {
                sb.append(text);
            } else {
                sb.append("_____");
            }
            sb.append(" ");
        }
        return sb.substring(0, sb.length()-1);
    }

    public Headline(List<Text> headline){
        this.headline = headline;
    }
}
