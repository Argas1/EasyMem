import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mem> memList = new ArrayList<>();

        memList.add(new Mem("Podkładka", "http://podkladka.jpg",true));
        memList.add(new Mem("Telefon", "http://telefon.jpg",false));
        memList.add(new Mem("Monitor", "http://monitor.jpg",true));
        memList.add(new Mem("Myszka", "http://myszka.jpg",false));

        for (Mem mem : memList){
            if (mem.isFavourite())
                System.out.println(memList);
        }

    }
}
