package com.cjf.剑指Offer;

/**
 * @Descpription
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 * @Author CJF
 * @Date 2019/2/20 15:21
 **/
public class A08_跳台阶 {

    static public int JumpFloor(int target) {
        if(target<=0)return 0;
        if(target==1) return 1;
        if(target==2) return 2;
       else return JumpFloor(target-1)+JumpFloor(target-2);
    }

    public static void main(String[] args) {
        System.out.println(JumpFloor(10));
    }
}
