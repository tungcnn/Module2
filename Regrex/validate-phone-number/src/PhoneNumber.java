import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        final String PHONE_PATTERN = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
        String[] phones= {"(84)-(0978489648)", "(84)-(09784222289648)", "(a8)-(22222222)", "(484)-(22222222)"};
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher;

        for (String str:phones) {
            matcher = pattern.matcher(str);
            System.out.println(matcher.find());
        }
    }
}
