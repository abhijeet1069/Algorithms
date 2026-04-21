package leetcode.interview150;

import leetcode.interview150.array.RemoveDuplicates2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicates2Test {

    @Test
    void removeDuplicates1() {
        int[] nums = new int[]{1,1,1,2,2,3};
        Assertions.assertEquals(5,new RemoveDuplicates2().removeDuplicates(nums));
    }
}