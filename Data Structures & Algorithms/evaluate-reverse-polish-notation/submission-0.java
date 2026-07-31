class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
   int a, b, result = 0;
   	
   for(String token: tokens){
	if( token.equals("+")){
	   b = stack.pop();
	   a = stack.pop();
	   result = a + b;
	   stack.push(result);
	} else if (token.equals("-")){
	   b = stack.pop();
	   a = stack.pop();
	   result = a - b;
	   stack.push(result);
	} else if (token.equals("*")){
	   b = stack.pop();
	   a = stack.pop();
	   result = a * b;
	   stack.push(result);
	} else if (token.equals("/")){
	   b = stack.pop();
	   a = stack.pop();
	   result = a / b;
	   stack.push(result);
   	} else {
	   stack.push(Integer.parseInt(token));
	}
   }

   return stack.peek();
    }
}
