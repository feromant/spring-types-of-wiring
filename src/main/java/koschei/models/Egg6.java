package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Needle7 niddle;

    @Autowired
    public Egg6(Needle7 niddle) {
        this.niddle = niddle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + niddle.toString();
    }
}
