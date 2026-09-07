class Solution {
    public boolean isValid(String s) {
        Stack<Character> record = new Stack<>();
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put(')', '(');
        for(char c: s.toCharArray()){
            if((brackets.containsKey(c)) && (!record.isEmpty())){
                if(record.peek() != brackets.get(c)) {return false;}
                else{
                    record.pop();
                }
            }
            else{
                record.push(c);
            }
        }
        if(record.isEmpty()) return true;
        else return false;
    }
}
