class Solution {
    public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');

    if(s.isEmpty()) return true;

    for(Character c: s.toCharArray()){
	if(c == '(' || c == '[' || c == '{'){
	  stack.push(c);
	} else{
	  if(stack.isEmpty()) return false;
	  if(!map.get(stack.pop()).equals(c)) return false;
	}
    }

    if(!stack.isEmpty()) return false;

    return true; 
    }
}
