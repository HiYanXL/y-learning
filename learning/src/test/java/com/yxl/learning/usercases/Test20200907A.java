package com.yxl.learning.usercases;

import com.yxl.learning.LearningApplicationTests;
import com.yxl.learning.tasks.Task20200907A;
import org.junit.jupiter.api.Test;

public class Test20200907A extends LearningApplicationTests {
    @Test
    public void test() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        System.out.println(
                Task20200907A.execute(input, target)
        );
    }
}
