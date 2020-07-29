package com.itsz.data.structure.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class JumpingOnCloudsTest {

    @Test
    void testjumpingOnCloud(){
         int[] arr = {0, 0, 1, 0, 0, 1, 0};
        Assertions.assertEquals(4,JumpingOnClouds.jumpingOnClouds(arr));
    }

}