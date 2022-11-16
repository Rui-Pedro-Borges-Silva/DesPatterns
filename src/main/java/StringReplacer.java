public class StringReplacer implements StringTransformer{
    char a;
    char x;
    public StringReplacer(char a, char x) {
        this.a = a;
        this.x = x;
    }
    @Override
    public void execute(StringDrink drink) {
        String str = drink.getText();
        String replaced = str.replace(a,x);
        drink.setText(replaced);
    }
}
