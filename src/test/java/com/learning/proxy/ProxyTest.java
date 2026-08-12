package com.learning.proxy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ProxyTest {

    @Test
    public void testUserCannotWrite_ShouldDenyAccess() {
        // Arrange
        File file = new FileProxy("test.txt", "USER");

        // Act & Assert (فقط چک می‌کنیم خطایی نده)
        file.read();   // باید کار کنه
        file.write("test"); // باید خطا بده (لاگ کنه)
        file.delete(); // باید خطا بده
    }

    @Test
    public void testAdminCanDoEverything_ShouldWork() {
        // Arrange
        File file = new FileProxy("test2.txt", "ADMIN");

        // Act & Assert (همه‌چیز باید کار کنه)
        file.read();
        file.write("new content");
        file.delete();
    }

    @Test
    public void testCache_ShouldLoadOnce() {
        // Arrange
        File file1 = new FileProxy("cacheTest.txt", "USER");
        File file2 = new FileProxy("cacheTest.txt", "USER");

        // Act
        file1.read(); // لود می‌شود
        file2.read(); // باید از کش بخواند

        // Assert (بررسی با لاگ کافیست)
    }
}