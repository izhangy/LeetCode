package date.firstweek;

import java.util.Stack;

/**
 * @author When all else is lost the future still remains.
 * @date 2021/6/2 - 9:45
 **/
public class day3 {
    public static boolean isVaild(String s){
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {//toCharArray()方法将字符串转换为字符数组
            if (c=='('){
                stack.push(')');
            }else if (c=='['){
                stack.push(']');
            }else if (c=='{'){
                stack.push('}');
            }else if (stack.isEmpty() || c!=stack.pop()){//stack.pop()移除栈顶元素，并作为此函数的值返回该元素
                 return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{([[]])}";
        System.out.println(isVaild(s));
    }
}
