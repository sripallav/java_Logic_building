import java.util.Stack;


import java.util.Scanner;

public class matchparamain {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String str = sc.nextLine();

        matchpara mp = new matchpara();
        mp.check(str);
    }
}

class matchpara {

    public void check(String str) {

        Stack<Character> stack = new Stack<>();

        boolean valid = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {

                stack.push(ch);
            }

            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {

                    valid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            valid = false;
        }

        if (valid) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}