package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        // 1.准备牌。
        // 定义一个存储54张牌的Arraylist集合，泛型使用String。
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个数组存储牌的花色，一个数组存储牌的序号。
        String[] colors = {"♠️", "♥️", "♣️", "♦️"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        // 先把大王、小王存储到poker集合。
        poker.add("大");
        poker.add("小");
        // 循环遍历两个数组，组装52张牌。
        for (String number : numbers) {
            for (String color : colors) {
                // 把组装好的52张牌存储到poker集合。
                poker.add(color + number);
            }
        }
        // 2.洗牌。
        // 使用Collections.shuffle()方法，随机打乱数组。
        Collections.shuffle(poker);
        // 3.发牌。
        // 定义4个集合，存储玩家的牌和底牌。
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        /*
        （1）遍历poker，获取到每一张牌。
        （2）使用poker的集合索引%3给3个玩家轮流发牌。
        （3）剩余三张牌给底牌。
        注意：
            先判断i>51时，给底牌先发完。
         */
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i > 50) {
                diPai.add(p);
            } else if (i % 3 == 0) {
                player1.add(p);
            } else if (i % 3 == 1) {
                player2.add(p);
            } else if (i % 3 == 2) {
                player3.add(p);
            }
        }
        //4.看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(diPai);
    }
}
