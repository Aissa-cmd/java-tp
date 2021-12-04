package chapter.two;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDemo {
    public static void main(String[] args) {
        IQuestion[] questions = new IQuestion[2];
        questions[0] = new TrueFalse("Are you ready?");
        questions[1] = new MultiChoice("What is the capital of German?", "Paris", "Berlin", "Tokyo");

        for (IQuestion q: questions) {
            q.show();
        }
    }
}

interface IQuestion {
    void show();
}

class TrueFalse implements IQuestion {
    private String question;

    public TrueFalse(String ques) {
        this.question = ques;
    }

    @Override
    public void show() {
        System.out.println(this.question);
        System.out.println("\t\u25a1 True");
        System.out.println("\t\u25a1 False");
    }
}

class MultiChoice implements IQuestion {
    private String question;
    private List<String> choices = new ArrayList<>();

    public MultiChoice(String ques) {
        this.question = ques;
    }

    public MultiChoice(String ques, String... choices) {
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
    public void show() {
        System.out.println(this.question);
        for (String ch: this.choices) {
            System.out.printf("\t\u25a1 %s\n", ch);
        }
    }
}

