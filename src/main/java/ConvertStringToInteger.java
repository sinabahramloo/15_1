
public class ConvertStringToInteger {
    public static Integer convertor(String string) {
        if (string == null) {
            throw new NumberFormatException();
        }
        try {
            Integer integer = Integer.parseInt(string);
            return integer;
        }
        catch (NumberFormatException numberFormatException){
            throw new NumberFormatException();
        }

    }
}
