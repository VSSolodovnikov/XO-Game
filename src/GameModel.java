public class GameModel {

    private static final char DEFAULT_CELL_VALUE = ' ';
    public static final int DEFAULT_FIELD_SIZE = 3;

    public final int FIELD_SIZE;

    private final char[][] field;

    public GameModel() {
        this(DEFAULT_FIELD_SIZE);
    }

    public GameModel(int size) {
        FIELD_SIZE = size;
        field = new char[FIELD_SIZE][FIELD_SIZE];
        eraseField();
    }

    public char getCellValue(int x, int y) {
        return field[x][y];
    }

    public void setCellValue(int x, int y, char value) {
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
