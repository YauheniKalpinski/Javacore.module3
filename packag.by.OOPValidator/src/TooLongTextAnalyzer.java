//3) TooLongTextAnalyzer    -  должен конструироваться от int'а с максимальной
//допустимой длиной комментария. Объект этого класса должен сохранять
//в своем состоянии это число в приватном поле maxLength.

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public Label processText(String text) {// проверяем текст на разрешенную длину
        if (text == null || text.isEmpty()) {
            System.out.println("Значение текста null или пустая строка");
            return Label.OK;
        }
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
