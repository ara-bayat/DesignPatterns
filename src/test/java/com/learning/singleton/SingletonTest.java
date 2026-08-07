package com.learning.singleton;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    public void testSingletonEnum_ShouldReturnSameInstance() {
        // وقتی
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;

        // آنگاه
        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    public void testSingletonLazy_ShouldReturnSameInstance() {
        // وقتی
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();

        // آنگاه
        assertThat(instance1).isSameAs(instance2);
    }

    @Test
    public void testSingleton_ShouldMaintainState() {
        // وقتی
        SingletonLazy instance = SingletonLazy.getInstance();
        instance.setName("Redis");
        SingletonLazy anotherInstance = SingletonLazy.getInstance();

        // آنگاه
        assertThat(anotherInstance.getName()).isEqualTo("Redis");
    }
}