package pl.rlnkoo;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        System.out.println("Directory files sorted descending:");
        System.out.println();

        fileManager.sortFilesInDirectory("C:/Users/Artur/Desktop");

    }
}