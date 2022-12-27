package HW_2_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();
    
    private Comandor comandor;
    
    public Team(Comandor comandor) {
        this.comandor = comandor;
    }

    public Comandor getComandor() {
        return comandor;
    }

    public void addWarior(T newwarior){
        warriors.add(newwarior);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }
}
