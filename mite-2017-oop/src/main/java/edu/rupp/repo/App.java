package edu.rupp.repo;

import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String letter[] = {
                            "A", "B", "C", "D", "E",
                            "F", "G", "H", "I", "J",
                            "K", "L", "M", "N", "O",
                            "P", "Q", "R", "S", "T",
                            "U", "V", "W", "X", "Y","Z"
                          };

        Map<String, Set<String>> groupCountriesByLetter = CountriesList.groupCountriesByLetter();

        int maxValue = 0;
        String letterWithMaxValue = "";
        int minValue = 0;
        String letterWithMinValue = "";

        for(int i = 0; i < letter.length -1 ; i++){
            if(groupCountriesByLetter.get(letter[i].toUpperCase()) != null) {
                int countValueOfLetter = groupCountriesByLetter.get(letter[i].toUpperCase()).size();

                if (countValueOfLetter > maxValue) {
                    maxValue = countValueOfLetter;
                    letterWithMaxValue = letter[i].toUpperCase();
                }else{
                    if(countValueOfLetter > minValue){
                        minValue = countValueOfLetter;
                        letterWithMinValue = letter[i].toUpperCase();
                    }else{
                        minValue = minValue;
                        letterWithMinValue = letterWithMinValue;
                    }
                }
            }

        }
        System.out.println("Letter '" + letterWithMaxValue + "' Has Max Value = " + maxValue);
        System.out.println("Letter '" + letterWithMinValue + "' Has Min Value = " + minValue);

    }
}
