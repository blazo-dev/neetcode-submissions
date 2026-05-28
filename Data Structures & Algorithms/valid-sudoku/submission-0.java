class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] seenCol = new HashSet[9];
        HashSet<Character>[] seenBox = new HashSet[9];

        for (int i = 0; i < board.length; i++) {
            char[] row = board[i];
            HashSet<Character> seenRow = new HashSet<>();
            int rBox = i / 3;

            for (int j = 0; j < row.length; j++) {
                char item = row[j];
                int cBox = j / 3;
                int itemBox = rBox * 3 + cBox;

                if (item == '.')
                    continue;

                if (seenCol[j] == null)
                    seenCol[j] = new HashSet<>();

                if (seenBox[itemBox] == null)
                    seenBox[itemBox] = new HashSet<>();

                if (seenRow.contains(item) || seenCol[j].contains(item)
                    || seenBox[itemBox].contains(item))
                    return false;

                seenCol[j].add(item);
                seenBox[itemBox].add(item);
                seenRow.add(item);
            }
        }

        return true;
    }
}
