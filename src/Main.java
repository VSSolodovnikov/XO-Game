public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Game game = new Game();
        game.eraseField();
        field.showField();
        Game.setCellValue(2,2,'X');
        field.showField();
        Game.setCellValue(1,2,'O');
        field.showField();
        game.eraseField();
        field.showField();
    }
}
