import java.util.*;

/**
 * Created by uyutthy on 12/23/2016.
 */
public class HomeWork {
    private static int n = 1;

    public static void main(String[] args){
        String[] countries = {
                "Cambodia",
                "VietNam",
                "Thailand",
                "USA",
                "Cambodia",
                "France",
                "England",
                "VietNam",
                "Cambodia"
        };

        /***  1 - Find duplicate country  and display all unique countries name using HashSet  ( mehtod add , size ) ***/
        /*** Result:
         * Duplicated Countries Name are [Cambodia, VietNam]
         * There are 6 Countries : [Cambodia, VietNam, Thailand, USA, France, England]
         */
        answerOfExercise(countries, 1, 1);

        /***  2 - Find duplicate country and display all unique countries name in aphabet order
         /*** Result :
         * Duplicated Country name are : [Cambodia, VietNam]
         * There are 6 countries : [Cambodia, Englang, France, Thailand, USA, VietNam]
         */
        answerOfExercise(countries,2, 1);

        /***  3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) return as boolean this method to check countryName existed or not
         Result :
         if found country : result would be : Country name :[countryName] found in the object
         if not found country : result would be : Country name :[countryName] is not found in the object
         */
        answerOfExercise(countries, "Cambodia");
        answerOfExercise(countries, "Australia");

        /***   4 : write Own class : MyUtils with one static method as below
         */
        answerOfExercise(countries);

        /***   5 : convert array above into ArrayList, LinkedList and display total size all items using Iterator and for-loop.
         ex : result out put
         List type : ArrayList , total size : 9
         elements : ["Cambodia","VietNam","Thailand","USA","Cambodia","France","England","VietNam","Cambodia"]
         */
        answerOfExercise(countries, 1, 2);
        answerOfExercise(countries, 2, 2);

        /***   6 : Convert array above into Map (HashMap, TreepMap) by key is countryName, value is number of times that countryName found and display all elements using entrySet() method
         */
        answerOfExercise(countries, 1, 3);
        answerOfExercise(countries, 2, 3);

        /***
         * 2- we have list name of countries , convert all list into map by grouping key as first letter of country with value of list of countries with the same first letter.  For instance : Country names Australia, Afghanistan , it will be stored in map key "A" , values ["Australia","Afghanistan"
         */
        Collection<String> c = CountriesList.getAllCountries();
        answerOfExercise(c);
    }

    /**
     *
     * @param arrCountry
     * @param collectionType (type=1 [1: HashSet; 2: TreeSet]; type=2 [1: ArrayList; 2: LinkedList]; type=3 [1:HashMap; 2:TreeMap])
     * @param type (1 : Set; 2:List; 3:Map)
     */
    public static void answerOfExercise(String[] arrCountry, int collectionType, int type) {
        displayExerciseAnswer(n);

        if(type == 3){

            List<String> asList = Arrays.asList(arrCountry);
            Map<String, Integer> m = (collectionType == 1 ? new HashMap<String, Integer>() : new TreeMap<String, Integer>());
            Iterator<String> it = asList.iterator();
            while(it.hasNext()){
                String s = it.next();
                m.put(s, Collections.frequency(asList, s));

            }

            displayCountryWithFoundedTimes(m);

        }else if(type == 2) {
            List<String> list = (collectionType == 1 ? new ArrayList<>() : new LinkedList<>());
            for (int i = 0; i < arrCountry.length; i++) {
                list.add(arrCountry[i]);
            }
            displayListCountry(list);

        }else if(type == 1) {
            Set<String> uniqueCountryName = (collectionType == 1 ? new HashSet<>() : new TreeSet<>());
            Set<String> duplicatedCountryName = (collectionType == 1 ? new HashSet<>() : new TreeSet<>());

            for (int i = 0; i < arrCountry.length; i++) {
                if (!uniqueCountryName.add(arrCountry[i])) {
                    duplicatedCountryName.add(arrCountry[i]);
                }
            }
            /*** Display Out Duplicated Countries Name ***/
            displayDuplicatedCountries(duplicatedCountryName);
            /*** Display Out All Unique Country Nmae ***/
            displayUniqueCountry(uniqueCountryName);
        }
        n++;
    }

    public static void answerOfExercise(String[] arrCountry, String searchString){
        displayExerciseAnswer(n);
        displayCountryFound(arrCountry, searchString);
        n++;
    }

    public static  void answerOfExercise(String[] arrCountry){
        displayExerciseAnswer(n);
        MyUtils.checkDuplicate(new HashSet<>(), arrCountry);
        MyUtils.checkDuplicate(new TreeSet<>(), arrCountry);
        MyUtils.checkDuplicate(new LinkedHashSet<>(), arrCountry);
        n++;
    }

    public static void answerOfExercise(Collection countries){
        displayExerciseAnswer(n);
        MyUtils.getCountriesBeginWithKey(countries);
        n++;
    }

    public static void displayExerciseAnswer(int number){
        System.out.printf("/**************** Answer of Exercise %d ****************/", number);
        System.out.print("\n");
    }


    public static void displayUniqueCountry(Set<String> uniqueCountryName){
        System.out.printf("There are %d countries: %s \n ", uniqueCountryName.size(), uniqueCountryName);
        /*Iterator<String> it = uniqueCountryName.iterator();
        while(it.hasNext()){
            System.out.println("\t - " + it.next());
        }*/
    }

    public static void displayDuplicatedCountries(Set<String> duplicatedCountryName){
        System.out.printf("Duplicated Country Name Are : %s \n", duplicatedCountryName);
        /*Iterator<String> it = duplicatedCountryName.iterator();
        while(it.hasNext()){
            System.out.println("\t - " + it.next());
        }*/
    }

    public static void displayListCountry(List<String> list){
        System.out.printf("List type : %s , Total size : %d \n", list.getClass().getName(), list.size());
        System.out.printf("Elements : %s \n", list);
    }

    public static void displayCountryWithFoundedTimes(Map m){
        Set set = m.entrySet();
        Iterator iterator =  set.iterator();
        while (iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.printf("Key %s found %d, Value is %d \n", mentry.getKey(), mentry.getValue(), mentry.getValue());
        }
    }

    public static boolean isCountryExist(Set<String> set, String countryName){
        boolean isCountryExist = false;
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            if(it.next() == countryName){
                isCountryExist = true;
                break;
            }
        }
        return isCountryExist;
    }

    public static LinkedHashSet convertArrayToLinkHashSet(String[] arrCountryName){
        LinkedHashSet<String> returnLinkHashSet = new LinkedHashSet<>();
        for(int i =0; i < arrCountryName.length; i++){
            returnLinkHashSet.add(arrCountryName[i]);
        }
        return returnLinkHashSet;
    }

    public static void displayCountryFound(String[] arrCountryName, String countryName){
        if(isCountryExist(convertArrayToLinkHashSet(arrCountryName), countryName)) {
            System.out.printf("Country Name [%s] found in the object \n", countryName);
        }else{
            System.out.printf("Country Name [%s] is not found in the object \n", countryName);
        }
    }

}
