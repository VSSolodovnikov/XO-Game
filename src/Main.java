public class Main {
    public static void main(String[] args) {

        GameModel gameModel = new GameModel(12);

        FieldView field = new FieldView(gameModel);

        field.showField();

    }
}
