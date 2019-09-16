package com.example.truecitizenquiz;

public class Question {
    private int answerResId;
    private boolean answerTue;

    public Question(int answerResId, boolean answerTue) {
        this.answerResId = answerResId;
        this.answerTue = answerTue;
    }

    public int getAnswerResId() {
        return answerResId;
    }

    public void setAnswerResId(int answerResId) {
        this.answerResId = answerResId;
    }

    public boolean isAnswerTue() {
        return answerTue;
    }

    public void setAnswerTue(boolean answerTue) {
        this.answerTue = answerTue;
    }
}
