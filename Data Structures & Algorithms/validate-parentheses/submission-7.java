class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> brackets = new ArrayDeque<>();

        for (char c: s.toCharArray()) {

            if (c == '(' || c == '{' || c == '['){
                brackets.push(c);
                System.out.println("push");
            } else {
                if(brackets.isEmpty()) return false;
                char brac = brackets.poll();
                System.out.println("pop");
                // if (brac == null) return false;
                switch (brac) {
                    case '(':
                        if (c != ')') return false;
                        break;
                    case '[':
                        if (c != ']') return false;
                        break;
                    case '{':
                        if (c != '}') return false;
                        break;       
                }
            }
        }
        if(!brackets.isEmpty()) return false;
        return true;
    }
}
