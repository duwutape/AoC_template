package day03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day03 {
    public static void main(String[] args) {
        new Day03();
    }

    public Day03() {
        try {
            solve();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void solve() throws FileNotFoundException {
        File input = new File("src/day03/input.txt");
        Scanner scanner = new Scanner(input);
    }
}
