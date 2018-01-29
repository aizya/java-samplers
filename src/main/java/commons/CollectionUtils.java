package commons;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author hongzhi xiong
 * @create 2018-01-28 10:08 PM
 **/
public class CollectionUtils {

    //获取List中的某个元素
    public <T> T getValueByIndex(final List<T> targetList, final int index) {
        Objects.requireNonNull(targetList);
        Objects.requireNonNull(index);
        return targetList.stream().limit(index + 1).collect(Collectors.toCollection(LinkedList::new)).getLast();
    }

    /**
     * Find the number of elements of a list
     */
    public static <T> int getLengthOfList(final List<T> targerList) {
        return targerList.size();
    }

    public static <T> int getLengthOfListStream(final List<T> targetList) {
        long count = targetList.stream().count();
        return Math.toIntExact(count);
    }


    /**
     * 将所有项都转换成1, 然后求和/ 相当于直接得到size
     *
     * @param targetList
     * @param <T>
     * @return
     */
    public static <T> int getLengthOfListStream02(final List<T> targetList) {
        int sum = targetList.stream().mapToInt(item -> 1).sum();
        return sum;
    }

    public static <T> int getLengthRecursive(List<T> targetList){
        return getLengthRecursive(targetList,0);
    }

    private static <T> int getLengthRecursive(List<T> targetList, int index) {
        return index;
    }

    // 用于判断集合是否为空或者里面是否存值, 是否不为空
    public static <T> boolean isEmpty(Collection<T> targetColl) {
        if (targetColl == null || targetColl.isEmpty()) {
            return true;
        }
        return false;
    }

    // 判断集合中不为空
    public static <T> boolean isNotEmpty(Collection<T> targetColl) {
        return !isEmpty(targetColl);
    }


}
