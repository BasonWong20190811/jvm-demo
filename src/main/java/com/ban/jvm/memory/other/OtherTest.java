package com.ban.jvm.memory.other;

import com.ban.jvm.memory.AFListUtils;

import java.util.ArrayList;
import java.util.List;

public class OtherTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(i+"");
        }
        List<List<String>> lists = AFListUtils.averageAssign(list, 48);
        System.out.println(lists);
    }
}
