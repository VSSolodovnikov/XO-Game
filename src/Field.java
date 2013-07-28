public class Field {

    public void showField() {
        System.out.println();
        for (int i = 0; i < Game.FIELD_SIZE; i++) {
            showLine(i);
            System.out.println();
        }
    }

    private void showLine(int lineNumber) {
        for (int i = 0; i < Game.FIELD_SIZE; i++) {
            showCell(lineNumber, i);
        }
    }

    private void showCell(int x, int y) {
        System.out.print("[" + Game.getCellValue(x, y) + "]");
    }

}
