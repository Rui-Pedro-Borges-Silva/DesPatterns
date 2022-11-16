import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
        String changed = "";

        for(int i = 0 ; i < str.length() ; i++){
            if(isLowerCase(str.charAt(i))){
                changed += toUpperCase(str.charAt(i));
            }else{
                changed += toLowerCase(str.charAt(i));
            }
        }
        drink.setText(changed);
    }
}
