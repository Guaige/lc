package array;

import java.util.Stack;
/*
https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/solution/mian-shi-ti-31-zhan-de-ya-ru-dan-chu-xu-lie-mo-n-2/
面试题31. 栈的压入、弹出序列（模拟，清晰图解）
 */
public class validataStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int i=0;
        for (int n : pushed){ //遍历入栈序列
            s.push(n);         //模拟入栈
            while (!s.isEmpty() && s.peek()==popped[i]){    //栈顶
                s.pop();i++;    //出栈 出栈序列更新
            }
        }
        return s.isEmpty();
    }
}
