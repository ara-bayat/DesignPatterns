package com.learning.prototype;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class PrototypeTest {

    @Test
    public void testClone_ShouldBeIndependentFromOriginal() {
        // وقتی
        Monster original = new Monster("Goblin", 30, List.of("Knife"));
        Monster cloned = original.clone();
        cloned.setName("Goblin King");
        cloned.getWeapons().add("Sword");

        // آنگاه
        assertThat(original.getName()).isNotEqualTo(cloned.getName());
        assertThat(original.getWeapons()).doesNotContain("Sword");
        assertThat(cloned.getWeapons()).contains("Sword");
    }

    @Test
    public void testClone_ShouldCreateDistinctObjects() {
        // وقتی
        Monster original = MonsterPrototypes.ORC;
        Monster clone1 = original.clone();
        Monster clone2 = original.clone();

        // آنگاه
        assertThat(clone1).isNotSameAs(clone2);
        assertThat(clone1).isNotSameAs(original);
    }
}
