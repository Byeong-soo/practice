import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Practice2Test {

    public String[] index() {

        String[] arr = new String[26];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Character.toString((char)(97+i));
        }
        return arr;
    }

    public String[] son() {

        String[] mother = index();
        List<String> motherList = Arrays.asList(mother);

        Collections.reverse(motherList);

        return motherList.toArray(mother);
    }


    public String wordChange() {
        String[] mother = index();
        String[] son = son();

        String example = "I love you~";
        String[] splitExample = example.split("");

        for(int i=0; i<splitExample.length; i++) {
            String c = splitExample[i];

            if( c.charAt(0) >= (char)65 && c.charAt(0) <= (char)90 ){
                int index = Arrays.binarySearch(mother,c.toLowerCase());
                splitExample[i] = son[index].toUpperCase();
            }

            if( c.charAt(0) >= (char)97 && c.charAt(0) <= (char)122 ){
                int index = Arrays.binarySearch(mother,c);
                splitExample[i] = son[index];
            }
        }

        return String.join("",splitExample);
    }


    @Test
    public void main() {
        String[] mother = index();
        String[] son = son();
        assertEquals((mother[0]),"a");
        assertEquals((son[0]),"z");

        assertEquals(wordChange(),"R olev blf~");;
    }
}