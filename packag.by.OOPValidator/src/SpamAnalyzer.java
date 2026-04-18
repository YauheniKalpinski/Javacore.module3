//SpamAnalyzer   -  должен конструироваться от массива строк с ключевыми словами.
// Объект этого класса должен сохранять в своем состоянии этот массив строк в приватном поле keywords.

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;//здесь содержатся слова которые мы будем искать как спам (spam", "bad")

    public SpamAnalyzer(String[] keywords) { //передаем в конструктор ключевые слова по типу spam ,bad
        //и ищем их в строке,есдли находим то передаем в метод public Label processText(String text) Enum Spam
        this.keywords = keywords;
    }

    @Override
    public String[] getKeywords() {
        return keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
