package com.learning.composite;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CompositeTest {

    @Test
    public void testFolder_ShouldCalculateTotalSizeCorrectly() {
        // Arrange
        FileSystemNode file1 = new File("a.txt", 10);
        FileSystemNode file2 = new File("b.txt", 20);
        Folder folder = new Folder("Documents");
        folder.addNode(file1);
        folder.addNode(file2);

        // Act & Assert
        assertThat(folder.getSize()).isEqualTo(30);
    }

    @Test
    public void testFolder_ShouldWorkRecursively() {
        // Arrange
        FileSystemNode file1 = new File("file1.txt", 10);
        FileSystemNode file2 = new File("file2.txt", 20);
        Folder subFolder = new Folder("SubFolder");
        subFolder.addNode(file2);

        Folder root = new Folder("Root");
        root.addNode(file1);
        root.addNode(subFolder);

        // Act & Assert
        assertThat(root.getSize()).isEqualTo(30);
    }

    @Test
    public void testAddAndRemove_ShouldUpdateSize() {
        // Arrange
        FileSystemNode file = new File("temp.txt", 100);
        Folder folder = new Folder("Test");
        folder.addNode(file);

        // Act
        assertThat(folder.getSize()).isEqualTo(100);

        folder.removeNode(file);
        assertThat(folder.getSize()).isZero();
    }
}
