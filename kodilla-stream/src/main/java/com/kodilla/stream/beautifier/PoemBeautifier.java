package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String text, PoemDecorator poemDecorator){
        String dec = poemDecorator.decorate(text);
        System.out.println("Beautified text: "+ dec);
    }
}
