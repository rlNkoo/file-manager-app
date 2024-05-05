package pl.rlnkoo;

import java.io.File;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class FileManager {
    public void listOfFilesInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)
                .map(File::getName)
                .forEach(System.out::println);
    }

    public void sortFilesInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)
                .sorted((o1, o2) -> Long.compare(o2.length(), o1.length()))
                .forEach(file -> {
                    System.out.println("File name: " + file.getName());
                    System.out.println("File size: " + file.length() + "B");
                    System.out.println();
                });
    }
}
