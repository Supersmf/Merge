import java.util.ArrayList;

/**
 * Created by SMF on 22.06.2016.
 */
public class MergeArrayList {


    public static void start(ArrayList a, ArrayList b){

        if(a.size()%2!=0){
            a.add(null);
            b.add(null);
        }

        a.ensureCapacity(a.size()*2);

        int size = a.size();
        int it = 0;
        int mid = size/2;
        int index = size - 1;
        int value = size/2-1;

        for (int i = 0; i < size; i++) {

            if(it < size) {

                a.add(a.get(mid));
                a.add(b.get(mid));
                mid++;
                it+=2;
            }else if(it < size*2){
                a.set(index-1,a.get(value));
                a.set(index, b.get(value));
                index-=2;
                value--;
                it++;
            }

        }
        if(a.get(a.size()-1) == null){
            a.remove(a.size()-1);
            a.remove(a.size()-1);
            a.trimToSize();
        }
    }
}
