package advanced_java;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Foreach 
{
    public static void main(String[] args) 
    {
        List<Integer> l = Arrays.asList(1, 2, 3);
        
        //Using for loop
        for (int i=0; i<l.size(); i++) 
        {
            System.out.println(l.get(i));
        }
        System.out.println();
        //Using for each loop
        for (int a: l) {
            System.out.println(a);
        }
        System.out.println();
        //Using ForEach Method
        l.forEach(n -> System.out.println(n));
        System.out.println();
        //Using method referencing
        l.forEach(System.out::println);
        //Consumer is the functional interface
        Consumer<Integer> c = new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
           
                System.out.println(t);
            }
            
        };
        System.out.println(); }}