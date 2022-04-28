import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        int correctCount = 0;
        int wrongCount = 0;

        String[] questions = new String[3];
        questions[0] = "Первый вопрос?";
        questions[1] = "Второй вопрос?";
        questions[2] = "Третий вопрос?";

        String[][] answers = new String[3][5];
        answers[0][0] = "Первый ответ";
        answers[0][1] = "Второй ответ";
        answers[0][2] = "Третий ответ";
        answers[1][0] = "Первый ответ";
        answers[1][1] = "Второй ответ";
        answers[1][2] = "Третий ответ";
        answers[2][0] = "Первый ответ";
        answers[2][1] = "Второй ответ";
        answers[2][2] = "Третий ответ";
        answers[2][3] = "Четвертый ответ";
        answers[2][4] = "Пятый ответ";

        int[] correct = new int[3];
        correct[0] = 1;
        correct[1] = 2;
        correct[2] = 3;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String s : answers[i]) {
                if (s != null) {
                    System.out.println(s);
                }
            }
            System.out.println("Ваш ответ?");
            int number = scanner.nextInt();

            if (number == correct[i]) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}