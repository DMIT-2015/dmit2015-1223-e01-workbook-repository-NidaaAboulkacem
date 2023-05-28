package ca.nait.dmit.domain;

public class ChineseZodiac {

    private static String[] animals = {
            "Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Goat","Monkey","Rooster","Dog","Pig"
    };

    public ChineseZodiac(){

    }

    public static String animal(int yearOfBirth){
        int chineseYear = (yearOfBirth - 1900 ) %  12;

        return animals[chineseYear];
    }
}
