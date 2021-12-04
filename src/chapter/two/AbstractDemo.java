package chapter.two;

import java.util.ArrayList;
import java.util.List;

public class AbstractDemo {
    public static void main(String[] args) {
        Question[] questions = new Question[2];
        questions[0] = new TrueFalseQuestion("Are you ready?");
        questions[1] = new MultiChoiceQuestion("What is the capital of German?", "Paris", "Berlin", "Tokyo");

        for (Question q: questions) {
            q.show();
        }
    }
}

abstract class Question {
    abstract void show();
}

class TrueFalseQuestion extends Question {
    private String question;

    public TrueFalseQuestion(String ques) {
        this.question = ques;
    }

    @Override
    void show() {
        System.out.println(this.question);
        System.out.println("\t\u25a1 True");
        System.out.println("\t\u25a1 False");
    }
}

class MultiChoiceQuestion extends Question {
    private String question;
    private List<String> choices = new ArrayList<>();

    public MultiChoiceQuestion(String ques) {
        this.question = ques;
    }

    public MultiChoiceQuestion(String ques, String... choices) {
        this.question = ques;
        setChoices(choices);
    }

    public void setChoices(String... choices) {
        for(String ch: choices) {
            this.choices.add(ch);
        }
    }

    public void addChoice(String ch) {
        this.choices.add(ch);
    }

    @Override
    void show() {
        System.out.println(this.question);
        for (String ch: this.choices) {
            System.out.printf("\t\u25a1 %s\n", ch);
        }
    }
}
