//в случае негативного текста мы заранее знаем набор грустных смайликов)
//и в случае нахождения одного из ключевых слов возвращают Label (SPAM и NEGATIVE_TEXT соответственно),

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keyWords = {":(","=(",":|"};


    @Override
    public String[] getKeywords() {
        return keyWords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
