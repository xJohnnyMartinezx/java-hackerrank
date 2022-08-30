package hacker_rank_practice.data;

import java.util.Stack;

public class BalancedBrackets {


    // Write your code here. DO NOT use an access modifier in your class declaration.

        static String isBalanced(String s)
        {
            // Using a Stack because Docs state that I can push and pop elements in and out of it.
            Stack<Character> bracketStack = new Stack<>();

            for (int i=0; i < s.length(); i++){

                // I'm looking for opening braces if one is found in String s, then it will be pushed into my Stack.
                if (s.charAt(i) == '{' || s.charAt(i) == '(') {
                    bracketStack.push(s.charAt(i));
                } else {
                    if (bracketStack.isEmpty()){
                        return "false";
                    } else {
                        // Removing elem from top of stack and returing it as a the value. then checking if it completes a balanced string.
                        char popVal = bracketStack.pop();
                        if (s.charAt(i) == '}' && popVal != '{') {
                            return "false";
                        } else if (s.charAt(i) == ')' && popVal != '(') {
                            return "false";
                        }
                    }
                }

            }
            // Doing final check on Stack. Popping off values from the stack if closing bracket if found so my Stack is that is telling me that everthing is balanced.
            if (bracketStack.isEmpty()){
                return "true";
            } else {
                return "false";
            }

        }
    }

