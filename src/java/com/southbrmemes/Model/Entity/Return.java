/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.southbrmemes.Model.Entity;

/**
 *
 * @author joao.vrevangelista
 */
public class Return {
    
   private String answerText;
   private boolean answer;

    public Return(String answerText, boolean answer) {
        this.answerText = answerText;
        this.answer = answer;
    }

    public Return() {
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
    
   
}
