package sagar;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class CommonList {
    public static void main(String[] args) {
        List<Integer> firstList=List.of(1,3,4,5,7,0,3,2,7,2);
        List<Integer> secondList=List.of(9,2,3,4,8);
        Set<Integer> uniqueCommonDigit =getUniqueDigits(firstList,secondList);
        System.out.println(uniqueCommonDigit);
    }

    private static Set<Integer> getUniqueDigits(List<Integer> firstList, List<Integer> secondList) {

        Set result=  firstList.stream()
                .filter(secondList::contains)
                .collect(Collectors
                        .toSet());
        return  result;
    }
}