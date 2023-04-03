import java.lang.reflect.Field;

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {

        HiddenField hiddenField = new HiddenField();
        Field f = hiddenField.getClass().getDeclaredField("field");
        Boolean flagValue = (Boolean) f.get(hiddenField);
        System.out.println(flagValue);

    }
}

