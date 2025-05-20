// File: PasTri.java

import java.util.*;

public class PasTri {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            val = val * (rowIndex - i + 1) / i;
            row.add((int) val);
        }

        return row;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        List<Integer> result = getRow(rowIndex);
        System.out.println("Pascal's Triangle Row " + rowIndex + ": " + result);
    }
}
