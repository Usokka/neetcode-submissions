class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()){
            switch (c){
                case '(' :
                    stack.push(1);
                    break;
                case ')' :
                    if(stack.isEmpty() || stack.peek() != 1)
                        return false;
                        stack.pop();
                    break;
                case '[' :
                    stack.push(2);
                    break ;
                case ']' :
                    if(stack.isEmpty()|| stack.peek() != 2)
                        return false;
                        stack.pop();
                    break ;
                case '{' :
                    stack.push(3);
                    break ;
                case '}' :
                    if(stack.isEmpty() || stack.peek() != 3)
                        return false;
                        
                        stack.pop();
                    break ;
            }
        }
        return stack.isEmpty();
    }
}
