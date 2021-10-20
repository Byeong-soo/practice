import java.util.List;

public class Practice2 {

    public static void main(String[] args) {

        List<Character> mother = null;
        for (char alphabet='a'; alphabet<'z'; alphabet++){
            mother.add(alphabet);
            System.out.println(mother);
        }
    }
}
