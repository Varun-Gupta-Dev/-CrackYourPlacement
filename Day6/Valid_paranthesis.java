class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1 || s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']') return false;
        
        char ch;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else if(st.isEmpty()){
                
                return false;
            }
            else if(ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{' ||
                ch == ']' && st.peek() == '[' ) {
                    st.pop();
            }else{
                return false;
            }
        }
        
        if(st.isEmpty()) return true;
        else return false;
    }
}