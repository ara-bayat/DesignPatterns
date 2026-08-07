package com.learning.singleton;

import org.junit.jupiter.api.Test;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static org.assertj.core.api.Assertions.assertThat;

public class SingletonDoubleCheckedLockingTest {

    @Test
    public void testSingleton_ShouldReturnSameInstanceInMultiThreadedEnvironment() throws InterruptedException {
        // آرایه‌ای برای نگه‌داری نمونه‌های ساخته شده توسط هر نخ
        final SingletonDoubleCheckedLocking[] instances = new SingletonDoubleCheckedLocking[100];

        // ایجاد یک ThreadPool با ۱۰۰ نخ
        ExecutorService executor = Executors.newFixedThreadPool(100);

        // ارسال ۱۰۰ تسک به ThreadPool
        for (int i = 0; i < 100; i++) {
            final int index = i;
            executor.submit(() -> {
                instances[index] = SingletonDoubleCheckedLocking.getInstance();
            });
        }

        // منتظر ماندن تا همه‌ی نخ‌ها کارشون تموم بشه (حداکثر ۵ ثانیه)
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        // بررسی اینکه آیا همه‌ی نمونه‌ها دقیقاً به یک آبجکت اشاره می‌کنند
        SingletonDoubleCheckedLocking firstInstance = instances[0];
        for (int i = 1; i < 100; i++) {
            assertThat(instances[i]).isSameAs(firstInstance);
        }
    }
}
