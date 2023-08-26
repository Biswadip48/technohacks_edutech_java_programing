import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "Who painted the Mona Lisa?"
        };

        String[][] choices = {
            {"A) Madrid", "B) Rome", "C) Paris", "D) Berlin"},
            {"A) Venus", "B) Mars", "C) Jupiter", "D) Saturn"},
            {"A) Leonardo da Vinci", "B) Vincent van Gogh", "C) Pablo Picasso", "D) Michelangelo"}
        };

        int[] correctAnswers = {2, 1, 0}; 

        int score = 0;

        System.out.println("Welcome to the Multiple Choice Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String choice : choices[i]) {
                System.out.println(choice);
            }

            System.out.print("Select your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            int userChoice = -1;
            switch (userAnswer) {
                case 'A':
                    userChoice = 0;
                    break;
                case 'B':
                    userChoice = 1;
                    break;
                case 'C':
                    userChoice = 2;
                    break;
                case 'D':
                    userChoice = 3;
                    break;
            }

            if (userChoice == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was: " + choices[i][correctAnswers[i]]);
                System.out.println();
            }
        }

        System.out.println("Quiz completed! Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
