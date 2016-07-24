import java.util.List;
import java.util.ListIterator;

/**
 * Created by SMF on 04.07.2016.
 */
public class MergeLinkedList {



    private static void start(List listA, List listB){

        ListIterator itA = listA.listIterator();
        ListIterator itB = listB.listIterator();

        while(itA.hasNext()){
            itA.next();
            itA.add(itB.next());
        }
    }
}
