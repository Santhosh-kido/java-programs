
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
    
        list.add(1);
        list.add(42);
        list.add(12);
        list.add(30);
        list.add(10);
        
        System.out.println(list);
        

        List<Integer> list3 = list.stream().map(l -> l%2!=0?l:l-l).collect(Collectors.toList());
        System.out.println(list3);

    }
}
