package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void getAllSets(List<List<Integer>> res, List<Integer> set, int[] numbs, int index) {

        if (index == numbs.length) {

            res.add(new ArrayList<>(set));

            return;

        }

        set.add(numbs[index]);

        getAllSets(res, set, numbs, index + 1);

        set.remove(set.size()-1);

        getAllSets(res, set, numbs, index + 1);

    }

    public static void main(String[] args) {

        System.err.println("Hello world..");

        List<List<Integer>> res = new ArrayList<>();

        List<Integer> set = new ArrayList<>();

        int[] numbs = new int[]{1, 2, 3};

        getAllSets(res, set, numbs, 0);

        System.err.println(res);

    }

}
