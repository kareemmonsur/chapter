package ChapterZero;

import java.util.Scanner;

public class MyersBriggs {
    private String questionPrompt;
   private String [] answers = new String[20];

    public  MyersBriggs (String questionPrompt) {
        this.questionPrompt = questionPrompt;
    }
    public static void main(String[] args) {
        String q1 = "Which option best describe you?\n" + "1.(A) expend energy, enjoy groups\n  (B) conserve energy, enjoy one-on-one";
        String q2 = "2. (A) interpret literally\n  (B) look for meaning and possibilities";
        String q3 = "3. (A) logical, thinking, questioning\n  (B) empathetic, feeling, accommodating";
        String q4 = "4. (A) organized, orderly\n  (B) flexible, adaptable";
        String q5 = "5. (A) more outgoing, think out loud\n  (B) more reserved, think to yourself";
        String q6 = "6. (A) practical, realistic, experimental\n  (B) imaginative, innovative, experimental";
        String q7 = "7. (A) candid, straightforward, frank\n  (B) tactful, kind, encouraging";
        String q8 = "8. (A) plan, schedule\n  (B) unplanned, spontaneous";
        String q9 = "9. (A) seek many tasks, public activities, interact with others\n  (B) seek private, solitary activities with quiet to concentrate";
        String q10 = "10. (A) standard, usual, conventional\n  (B) different, novel, unique";
        String q11 = "11. (A) firm, tend to criticize, hold the line\n  (B) gentle, tend to appreciate, conciliate";
        String q12 = "12. (A) regulated, structured\n  (B) easygoing, 'live' and 'let live'";
        String q13 = "13. (A) external, communicative, express yourself \n  (B) internal, reticent, keep to yourself";
        String q14 = "14. (A) focus on here-and-how\n  (B) look to the future, global perspective, 'big picture'";
        String q15 = "15. (A) tough-minded, just\n  (B) tender-hearted, merciful";
        String q16 = "16. (A) preparation, plan ahead\n  (B) go with the flow, adapt as you go";
        String q17 = "17. (A) active, initiate\n  (B) reflective, deliberative";
        String q18 = "18. (A) fact, things, 'what is'\n  (B) ideas, dream, 'what could be'";
        String q19 = "19. (A) matter of fact, issue-oriented\n  (B) sensitive, people-oriented, compassionate";
        String q20 = "20. (A) control, govern\n  (B) latitude, freedom";

        Question[] questions = {
                new Question(q1),
                new Question(q2),
                new Question(q3),
                new Question(q4),
                new Question(q5),
                new Question(q6),
                new Question(q7),
                new Question(q8),
                new Question(q9),
                new Question(q10),
                new Question(q11),
                new Question(q12),
                new Question(q13),
                new Question(q14),
                new Question(q15),
                new Question(q16),
                new Question(q17),
                new Question(q18),
                new Question(q19),
                new Question(q20),
        };
        //takeTest(questions);
    }
    public void takeTest(Question[] questions) {
       //int answerA = 0;
        // int answerB = 0;
        Scanner input = new Scanner(System.in);
        String answer = new String();
        for (int i = 0; i < 3; i++) {
            System.out.println(questions[i].questionPrompt);
            System.out.print("Enter option A or B: ");
            answer = input.nextLine();
             answers[i] = answer;

        }
        System.out.println(answer);
    }

}