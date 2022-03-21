package xjbRun;

public class MaxInteger {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b); // Integer 在常量池中的存储范围为[-128,127]
        a = 127;
        b = 127;
        System.out.println(a == b); // Integer 在常量池中的存储范围为[-128,127]
    }
}
