package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("It always seems impossible until it's done.", decorate -> decorate.toUpperCase());
        poemBeautifier.beautify("It always seems impossible until it's done.", decorate -> "ABC "+ decorate);
        poemBeautifier.beautify("It always seems impossible until it's done.", decorate -> decorate + " ABC");
        poemBeautifier.beautify("It always seems impossible until it's done.", decorate -> decorate.replace('d', 'n'));
        poemBeautifier.beautify("It always seems impossible until it's done.", decorate -> decorate.repeat(2));
    }

}


