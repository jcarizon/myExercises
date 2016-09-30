package objects;

/**
 * Created by nxtlvl on 9/29/2016.
 */
public class Animal {

    public void setName(String name) {
        this.name = name;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setExtinctOrNot(boolean extinctOrNot) {
        this.extinctOrNot = extinctOrNot;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isExtinctOrNot() {
        return extinctOrNot;
    }

    private String name;
    private int legs;
    private boolean extinctOrNot;

}
