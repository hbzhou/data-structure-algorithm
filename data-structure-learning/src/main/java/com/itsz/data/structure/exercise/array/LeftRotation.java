package com.itsz.data.structure.exercise.array;

/**
 * A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .
 * <p>
 * Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
 * <p>
 * Function Description
 * <p>
 * Complete the function rotLeft in the editor below. It should return the resulting array of integers.
 * <p>
 * rotLeft has the following parameter(s):
 * <p>
 * An array of integers .
 * An integer , the number of rotations.
 * Input Format
 * <p>
 * The first line contains two space-separated integers  and , the size of  and the number of left rotations you must perform.
 * The second line contains  space-separated integers .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.
 * <p>
 * Sample Input
 * <p>
 * 5 4
 * 1 2 3 4 5
 * Sample Output
 * <p>
 * 5 1 2 3 4
 * Explanation
 * <p>
 * When we perform  left rotations, the array undergoes the following sequence of changes:
 */
public class LeftRotation {

    public int[] leftRoation(int[] a, int d) {
        int length = a.length;
        int[] newArr = new int[length];
        for (int i = 0; i < length; i++) {
            newArr[i] = a[(i + d) % length];
        }
        return newArr;
    }
}
