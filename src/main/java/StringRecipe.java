import java.util.List;

public class StringRecipe implements StringTransformer{
    List<StringTransformer> transformers1;
    public StringRecipe(List<StringTransformer> transformers) {
    transformers1 = transformers;
    }
    @Override
    public void execute(StringDrink drink) {
    }
    public void mix(StringDrink drink) {
        for (StringTransformer stringTransformer : transformers1){
            stringTransformer.execute(drink);
        }
    }
}
