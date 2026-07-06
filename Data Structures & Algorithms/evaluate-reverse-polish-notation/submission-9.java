class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> results = new Stack<>();

        for(String token : tokens){

            if(Pattern.matches("-?\\d+",token)){
                results.push(token);
            }
            else{
                int e1 = Integer.parseInt(results.pop());
                int e2 = Integer.parseInt(results.pop());
                int result = 0;

                switch(token){
                    case "+" :
                        result = e1+e2;
                        break;
                    case "-" :
                        result = e2-e1;
                        break;
                    case "/" :
                        result = e2/e1;
                        break;
                    case "*" :
                        result = e1*e2;
                        break;
                }

                results.push(Integer.toString(result));
            }

        }

        return Integer.parseInt(results.pop());
    }

}
