package com.test.task;

import java.util.List;
import java.util.Objects;

public class Text {
   public List<Phrase> phrases;

    public List<Phrase> getPhrases() {
        return phrases;
    }
    Text(List<Phrase> phraseList){
        this.phrases = phraseList;
    }
    public void setPhrases(List<Phrase> phrases) {
        this.phrases = phrases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(phrases, text.phrases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phrases);
    }

    @Override
    public String toString() {
        return "Text{" +
                "phrases=" + phrases +
                '}';
    }

}
