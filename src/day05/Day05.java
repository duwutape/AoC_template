package day05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day05 {
    public static void main(String[] args) {
        new Day05();
    }

    public Day05() {
        try {
            solve();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void solve() throws FileNotFoundException {
        File input = new File("src/day05/input.txt");
        Scanner scanner = new Scanner(input);
    }
}
