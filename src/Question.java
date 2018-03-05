public class Question {
    private int value1;
    private int value2;
    private String operator;


    public Question(int v1, int v2, String op) {
        value1 = v1;
        value2 = v2;
        operator = op;
    }

    public void showQuestion() {
        System.out.printf("What is %d + %d?\n", value1, value2);
    }

    public boolean checkAnswer(int response) {
// TODO: check response against value1+value2...

        return false;
    }
}
