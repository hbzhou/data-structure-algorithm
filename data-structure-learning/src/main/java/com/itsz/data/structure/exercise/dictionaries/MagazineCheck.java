package com.itsz.data.structure.exercise.dictionaries;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MagazineCheck {

    /**
     * 解题反思： 当某个元素匹配后使用remove方法将其排除，避免重复利用
     * @param magazines
     * @param notes
     */
    public static void checkMagazine(String[] magazines, String[] notes) {
        List<String> magazinesList = Stream.of(magazines).collect(Collectors.toList());
        if (Stream.of(notes).anyMatch(note -> !magazinesList.remove(note))) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }


}
