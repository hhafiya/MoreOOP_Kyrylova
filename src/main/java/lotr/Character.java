package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    int power;
    int hp;

    public abstract void kick(Character c);

    public boolean isAlive(){
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{hp=" + hp +", power=" + power + "}";
    }

}
