package Day 15;

class Reverse_Words_in_a_String
{
    public String reverseWords(String s) {
        StringBuilder nm=new StringBuilder();
        s=s.trim();
        StringBuilder p=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                if(p.length()>=1)
                {
                    nm.append(p);
                    nm.append(" ");
                    p.setLength(0);
                }
            }
            else
            {
                p.insert(0,s.charAt(i));
            }
        }
        nm.append(p);
        return nm.toString();
    }
}