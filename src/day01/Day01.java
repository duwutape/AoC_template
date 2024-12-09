package day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        new Day01();
    }

    public Day01() {
        try {
            solve();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void solve() throws FileNotFoundException {
        File input = new File("src/day01/input.txt");
        Scanner scanner = new Scanner(input);
    }
}
