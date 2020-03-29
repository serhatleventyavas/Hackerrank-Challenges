package com.serhatleventyavas;

public class CavitMap {

    public String[] cavityMap(String[] grid) {

        String[] result = new String[grid.length];
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            if (i == 0 || (i + 1) == grid.length) {
                result[index++] = grid[i];
                continue;
            }

            String columnResult = generateTemp(grid[i].length());
            int[] depthOfAboveColumns = convertToIntArray(grid[i - 1].toCharArray());
            int[] depthOfBelowColumns = convertToIntArray(grid[i + 1].toCharArray());
            int[] depthOfCurrentColumns = convertToIntArray(grid[i].toCharArray());
            for (int j = 0; j < depthOfCurrentColumns.length; j++) {
                if (j == 0 || (j +  1) == depthOfCurrentColumns.length) {
                    continue;
                }

                int depthOfAboveAdjacent = depthOfAboveColumns[j];
                int depthOfBelowAdjacent = depthOfBelowColumns[j];
                int depthOfRightAdjacent = depthOfCurrentColumns[j + 1];
                int depthOfLeftAdjacent = depthOfCurrentColumns[j - 1];
                int depthOfCurrentCell = depthOfCurrentColumns[j];

                boolean isBiggerThanLeftAdjacent = depthOfCurrentCell > depthOfLeftAdjacent;
                boolean isBiggerThanAboveAdjacent = depthOfCurrentCell > depthOfAboveAdjacent;
                boolean isBiggerThanRightAdjacent = depthOfCurrentCell > depthOfRightAdjacent;
                boolean isBiggerThanBelowAdjacent = depthOfCurrentCell > depthOfBelowAdjacent;

                if (isBiggerThanLeftAdjacent && isBiggerThanAboveAdjacent
                        && isBiggerThanRightAdjacent && isBiggerThanBelowAdjacent) {
                    StringBuilder builder = new StringBuilder(columnResult);
                    builder.setCharAt(j, 'X');
                    columnResult = builder.toString();
                }
            }

            columnResult = completeResult(depthOfCurrentColumns, columnResult);
            result[index++] = columnResult;
        }
        return result;
    }

    private String completeResult(int[] columns, String columnResult) {
        char[] characters = columnResult.toCharArray();
        StringBuilder builder = new StringBuilder(columnResult);
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '-') {
                builder.setCharAt(i, String.valueOf(columns[i]).toCharArray()[0]);
            }
        }
        return builder.toString();
    }

    private String generateTemp(int length) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            result.append("-");
        }
        return result.toString();
    }

    private int[] convertToIntArray(char[] columns) {
        int[] depthArray = new int[columns.length];
        int index = 0;
        for (char character: columns) {
            depthArray[index++] = Integer.parseInt(String.valueOf(character));
        }
        return depthArray;
    }
}