package com.test.task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TextTools {
    public Text delimiterSentence(String fulltext) {
        String arrayOfSentence[] = fulltext.split("\\.");
        List<Phrase> phrases = new ArrayList<>();
        for (int i = 0; i < arrayOfSentence.length; i++) {
            phrases.add(delimiterWord(arrayOfSentence[i]));
        }

        return new Text(phrases);
    }

    public Phrase delimiterWord(String fullPhrase){
        String arrayOfWord[]=fullPhrase.split(" ");

        List<Word> wordList = new ArrayList<>();
        for (int i=0; i< arrayOfWord.length; i++){
            wordList.add( new Word( arrayOfWord[i]));
        }
        return new Phrase(wordList);
    }

}
