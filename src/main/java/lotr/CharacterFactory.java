package lotr;

import org.reflections.Reflections;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        try {
            Reflections reflections = new Reflections("lotr");
            Set<Class<? extends Character>> classes = reflections.getSubTypesOf(Character.class);
            List<Class<? extends Character>> classList = new ArrayList<>(classes);
            classList.remove(Noble.class);

            int randomIndex = new Random().nextInt(classList.size());
            Class<? extends Character> randomClass = classList.get(randomIndex);

            return (Character) randomClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
