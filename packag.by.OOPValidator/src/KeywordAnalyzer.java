//Давайте эту логику абстрагируем в абстрактный класс KeywordAnalyzer следующим образом:
//
//Выделим два абстрактных метода getKeywords и getLabel,
//Реализуем processText
//Сделаем SpamAnalyzer и NegativeTextAnalyzer наследниками KeywordAnalyzer и реализуем абстрактные методы.

public abstract class KeywordAnalyzer implements TextAnalyzer {

    public abstract String[] getKeywords();
    public abstract Label getLabel();

    public Label processText(String text) {
        String[] keywords = getKeywords();//здесь ключевые слова для спама
        if (text == null || text.isEmpty()) {
            System.out.println("Текст не введен");
            return Label.OK;
        } else {
            for (int i = 0; i < keywords.length; i++) { //проходимся сколько слов спамеров
                if (text.contains(keywords[i])) {
                    return getLabel();//если текст сожержит спам возвращаем GetLabel окторый переопределен для
                    //SpamAnalyzer и NegativeTextAnalyzer по разному.
                }
            }
        }
        return Label.OK;
    }
}
