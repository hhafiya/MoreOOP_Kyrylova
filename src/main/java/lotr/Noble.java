package lotr;

import java.util.Random;
// уникнення дублювання коду
public class Noble extends Character{
    public Noble(int min, int max){
        super(new Random().nextInt(min, max), new Random().nextInt(min, max));
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower()));
    }
}
