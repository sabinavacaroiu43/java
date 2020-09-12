package chapter5.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// List-based Chooser - typesafe (Page 129)
public class Chooser<T>
{
    private final List<T> choiceList;

    public Chooser(Collection<T> choices)
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

        Chooser<Integer> chooser = new Chooser<>(intList);

        for(int i = 0; i < 10; i++)
        {
            Number choice = chooser.choose();
            System.out.println(choice);
        }
    }

    public T choose()
    {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
