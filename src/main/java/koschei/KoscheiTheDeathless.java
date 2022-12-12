package koschei;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    @Autowired
    private Island2 island;
    private Wood3 wood;
    private Rabbit4 rabbit;
    private Duck5 duck;
    private Egg6 egg;
    private Needle7 needle;

    @Autowired
    public KoscheiTheDeathless(Wood3 wood, Rabbit4 rabbit, Duck5 duck, Egg6 egg, Needle7 needle) {
        this.wood = wood;
        this.rabbit = rabbit;
        this.duck = duck;
        this.egg = egg;
        this.needle = needle;
    }

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString() +
                island.toString() + wood.toString() + rabbit.toString() +
                duck.toString() + egg.toString() + needle.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
