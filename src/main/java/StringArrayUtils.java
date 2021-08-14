import java.util.Locale;

public class StringArrayUtils {

    public String [] getCommonStrings(String [] one, String [] two){
        int lengthOne = one.length;
        int lengthTwo = two.length;

        String [] common = new String [0];

        for (int i =0 ; i < lengthOne; i++) {
            for(int j = 0; j < lengthTwo; j++ ) {
                if (one[i] == two[j]){
                    common= changeArraySize(common, one[i]);
                }
            }
        }

        return common;
    }

    public String[] changeArraySize (String [] originalArray, String add) {
        int originalLength = originalArray.length;
        String [] newArray = new String[originalLength+1] ;
        for (int i =0; i < originalLength; i++ ){
            newArray[i] = originalArray[i];
        }
        newArray[originalLength] = add;
        return newArray;

    }

    public String sorts(String [] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j= 1; j < arr.length; j++) {
                if (arr[i].charAt(0) > arr[j].charAt(0)) {
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return convertToString(arr);
    }

        public String convertToString(String[] arr){
            String result = "";
            for(int i = 0; i < arr.length; i++)
                result += arr[i];

            return result;
        }




        public boolean anagram(String str1, String str2){
            if(str1.length() != str2.length()){
                return false;
            }
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            str1 = sorts(str1.split("")) ;
            str2  = sorts(str2.split(""));
            return str1.equals(str2);
        }
}
