class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<Integer>();

        int a,b;

        for (String i : tokens){
            if(i.equals("+")){

                s.add(s.pop()+s.pop());

            }else if (i.equals("/")){

                b= s.pop();
                a=s.pop();
                s.add(a/b);

            }else if(i.equals"*"){

                b=s.pop();
                a=s.pop();
                s.add(b*a);

            }else if (i.equals"-"){

                b=s.pop();
                a=s.pop();
                s.add(a-b);

            }else{

                s.add(Integer.parseInt(i));

            }
        }

        return s.pop();
        
    }
}

