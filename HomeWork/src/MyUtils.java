import java.util.*;

/**
 * Created by uyutthy on 12/23/2016.
 */
public class MyUtils {

    public static void checkDuplicate(Set<String> s, String[] arrCountry) {

        Set<String> duplicatedCountryName = s;

        for(int i =0; i < arrCountry.length; i++){
            duplicatedCountryName.add(arrCountry[i]);
        }
        System.out.printf("Set type = %s %s \n", s.getClass().getName(), duplicatedCountryName);
    }

    public static void getCountriesBeginWithKey(Collection c){
        Map<String, ArrayList> map = new TreeMap<>();
        Set<String> beginChar = new TreeSet<>();

        /*** Get Begin Char of Country ***/
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str = it.next().toUpperCase();
            beginChar.add(str.substring(0,1));
        }

        /*** Add Key and Collection of Key ***/
        Iterator<String> iterator = beginChar.iterator();
        while(iterator.hasNext()){
            String strChar = iterator.next();
            Iterator<String> i = c.iterator();
            ArrayList li = new ArrayList<>();
            while(i.hasNext()){

                String strCountries = i.next();
                if(strCountries.toUpperCase().startsWith(strChar)){
                    li.add(strCountries);
                }
            }
            map.put(strChar, li);
        }

        Set set = map.entrySet();
        Iterator its =  set.iterator();
        while (its.hasNext()){
            Map.Entry mentry = (Map.Entry)its.next();
            System.out.printf("Key %s found %s \n", mentry.getKey(), mentry.getValue());
        }
    }

}
