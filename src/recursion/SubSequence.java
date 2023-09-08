package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SubSequence {

    public static void getAllSubSequence(List<String> ans, StringBuilder str, int index, StringBuilder sub) {

        if (index == str.length()) {

            ans.add(sub.toString());

            System.err.println(sub);

            return;

        }

        sub.append(str.charAt(index));

        getAllSubSequence(ans, str, index + 1, sub);

        sub.deleteCharAt(sub.length() - 1);

        getAllSubSequence(ans, str, index + 1, sub);

    }

    public static void main(String[] args) {

        List<String> ans = new ArrayList<>();

        int [] nums = new int[]{1,2,4};
        List<Integer> list = Arrays.stream(nums).boxed().toList();

        getAllSubSequence(ans,new StringBuilder("abc"),0,new StringBuilder());

        System.err.println(ans);

    }


}
