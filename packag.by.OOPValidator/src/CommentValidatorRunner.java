public class CommentValidatorRunner {

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        //analyzers это TextAnaluzer(interface)>abstract class Keywordanalyzer>Spam||NegativeAnalyzer
        for (int i = 0; i < analyzers.length; i++) {
            Label result = analyzers[i].processText(text);//сюда передаем результат
            if (result != Label.OK) {
                System.out.println("Найдена не ок отметка: " + result
                        + " в классе: " + analyzers[i].getClass().getSimpleName());
                return result;
            }
        }
        return Label.OK;
    }
}
