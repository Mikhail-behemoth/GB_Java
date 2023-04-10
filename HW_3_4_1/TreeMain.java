package HW_3_4_1;

import java.util.ArrayList;
import java.util.List;

public class TreeMain {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(7);
        tree.add(3);
        tree.add(10);
        tree.add(2);
        tree.add(1);
        tree.add(5);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        
        List<Integer> dfsOrderItems = new ArrayList<>();
        tree.dfs(dfsOrderItems::add);
//        tree.dfs(integer -> dfsOrderItems.add(integer));
        System.out.println(dfsOrderItems);

        List<Integer> bfsOrderItems = new ArrayList<>();
        tree.bfs(bfsOrderItems::add);
        System.out.println(bfsOrderItems);

        System.out.println(tree.size());

        System.out.println(tree.findMax());


    }
}
