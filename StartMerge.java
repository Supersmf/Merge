import java.util.ArrayList;

/**
 * Created by SMF on 12.07.2016.
 */
public class StartMerge {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        ArrayList b = new ArrayList();

        int x = 0;
        int y = 1;
        for (int i = 0; i < 11; i++){
            a.add(x);
            b.add(y);
            x+= 2;
            y+= 2;

        }


        MergeArrayList.start(a, b);

        System.out.println(a);

    }
}
