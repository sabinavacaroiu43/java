package chapter5.item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

// Wildcard type for parameter that serves as an T producer (page 141)
public class Chooser<T>
{
    private final List<T> choiceList;
    private final Random rnd = new Random();

    public Chooser(Collection<? extends T> choices)
    {
        choiceList = new ArrayList<>(choices);
    }

    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        Chooser<Number> chooser = new Chooser<>(intList);
        for(int i = 0; i < 10; i++)
        {
            Number choice = chooser.choose();
            System.out.println(choice);
        }
    }

    public T choose()
    {
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
