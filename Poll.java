import java.util.ArrayList;
import java.util.Scanner;

class Question {
    int number;
    String text;
    Answer[] answers;

    protected Question(int number, String text, Answer[] answers) {
        this.number = number;
        this.text = text;
        this.answers = answers;
    }

    protected void Print() {
        System.out.println(text);
        for (Answer answer : answers) {
            System.out.println(answer.text);
        }
    }

}

class Answer {
    int number;
    String text;
    boolean isCorrect;

    protected Answer(int number, String text, boolean isCorrect) {
        this.number = number;
        this.text = text;
        this.isCorrect = isCorrect;
    }

}

public class Poll {
    public static void main(String[] args) {
        ArrayList<Question> questionsList = CreateQuestionsList();
        StartTest(questionsList);

    }

    private static ArrayList<Question> CreateQuestionsList() {
        ArrayList<Question> list = new ArrayList<>();

        Answer[] answers = new Answer[]{new Answer(1, "Первый ответ", true), new Answer(2, "Второй ответ", false), new Answer(3, "Третий ответ", false)};

        Answer[] answers1 = new Answer[]{new Answer(1, "Первый ответ", false), new Answer(2, "Второй ответ", true), new Answer(3, "Третий ответ", false), new Answer(4, "Четвертый ответ", false)};
        Answer[] answers2 = new Answer[]{new Answer(1, "Первый ответ", false), new Answer(2, "Второй ответ", false), new Answer(3, "Третий ответ", true), new Answer(4, "Четвертый ответ", false), new Answer(5, "Пятый ответ", false)};
        list.add(new Question(1, "Первый вопрос", answers));
        list.add(new Question(2, "Второй вопрос", answers1));
        list.add(new Question(3, "Третий вопрос", answers2));

        return list;
    }

    public static void StartTest(ArrayList<Question> questionsList) {
        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;
        int wrongCount = 0;
        int number;
        boolean isInputCorrect;
        for (Question question : questionsList) {
            question.Print();

            System.out.println("Введите ваш вариант ответа?");
            number = scanner.nextInt();


            isInputCorrect = EqualsCorrectValue(number, question.answers);

            if (isInputCorrect) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }


    public static boolean EqualsCorrectValue(int number, Answer[] answers) {
        for (Answer answer : answers) {
            if (number == answer.number) {
                return answer.isCorrect;
            }
        }
        return false;
    }

}


