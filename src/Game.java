public class Game {

    public static final int FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE = ' ';

    private static char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public static char getCellValue(int x, int y) {
        return field[x][y];
    }

    public static void setCellValue(int x, int y, char value) {
        field[x][y] = value;
    }

    public void eraseField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = DEFAULT_CELL_VALUE;
            }
        }
    }
}
