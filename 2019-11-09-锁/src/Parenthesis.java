import java.util.Stack;

public class Parenthesis {
    public static boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        if(A == null || A.length() != n){
            return false;
        }
        for(int i = 0;i < n;i++){
            if(A.charAt(i) == '('){
                stack.push(A.charAt(i));
            }else if(A.charAt(i) == ')'){
                if(stack.isEmpty()){
                   return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        boolean a = chkParenthesis("(()",3);
        System.out.println(a);
    }
}
