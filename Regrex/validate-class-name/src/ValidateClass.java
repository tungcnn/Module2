import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {
        final String CLASS_PATTERN = "^[CAP][0-9]{4}[GHIKLM]$";
        String[] names= {"P0323A", "M0318G", "C0318G", "c1456G", "C12313213H", "C213dH"};
        Pattern pattern = Pattern.compile(CLASS_PATTERN);
        Matcher matcher;

        for (String str:names) {
            matcher = pattern.matcher(str);
            System.out.println(matcher.find());
        }
    }
}
