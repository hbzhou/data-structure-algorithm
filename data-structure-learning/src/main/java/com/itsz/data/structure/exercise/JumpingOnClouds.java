package com.itsz.data.structure.exercise;

/**
 * Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.
 * <p>
 * For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided. For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and . She could follow the following two paths:  or . The first path takes  jumps while the second takes .
 * <p>
 * Function Description
 * <p>
 * Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.
 * <p>
 * jumpingOnClouds has the following parameter(s):
 * <p>
 * c: an array of binary integers
 * Input Format
 * <p>
 * The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the minimum number of jumps needed to win the game.
 * <p>
 * Sample Input 0
 * <p>
 * 7
 * 0 0 1 0 0 1 0
 * Sample Output 0
 * <p>
 * 4
 * Explanation 0:
 * Emma must avoid  and . She can win the game with a minimum of  jumps:
 * <p>
 * jump(2).png
 * <p>
 * Sample Input 1
 * <p>
 * 6
 * 0 0 0 0 1 0
 * Sample Output 1
 * <p>
 * 3
 * Explanation 1:
 * The only thundercloud to avoid is . Emma can win the game in  jumps:
 * <p>
 * jump(5).png
 */
public class JumpingOnClouds {

    /**
     * 尽量去尝试一次性走两步，正常走一步。很容易陷入去考虑是1的情况，其实不用考虑 走两步的话就会跳过 1
     * @param c
     * @return
     */
    public static int jumpingOnClouds(int[] c) {
        int count = -1;
        int length = c.length;
        for (int i = 0; i < length; i++, count++){
            if (i < length - 2 && c[i + 2] == 0) i++;

        }
        return count;
    }

}
