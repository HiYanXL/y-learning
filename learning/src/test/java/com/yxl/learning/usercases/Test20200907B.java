package com.yxl.learning.usercases;

import com.yxl.learning.LearningApplicationTests;
import com.yxl.learning.tasks.Task20200907B;
import org.junit.jupiter.api.Test;

public class Test20200907B extends LearningApplicationTests {
    @Test
    public void test() {
        Task20200907B.ListNode input1 = new Task20200907B.ListNode(1);
        Task20200907B.ListNode input2 = new Task20200907B.ListNode(9);
        input2.next = new Task20200907B.ListNode(9);
        Task20200907B.ListNode output = Task20200907B.execute(input1, input2);
        while (output != null) {
            System.out.println(output.val + ",");
            output = output.next;
        }

    }
}
