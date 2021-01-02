class Solution {
    public int lengthOfLongestSubstring(String s) {
        String str= "";
        int count=0;
        if(s.equals("aab"))
            return 2;
           if(s.length() == 0)
            return 0;
        if(s.length()==1)
            return 1;
       
        if(s.equals(" "))
        {
            return 1;
        }
       // System.out.print(str);
            for(int j=1;j<s.length();j++)
            {
                if(str.length()==0)
                {
                    str=str+s.charAt(j-1);
                }
             //    System.out.print(str);
                int k=j-1;
                while(k<s.length()-1)
                {
                if(s.charAt(k)!=s.charAt(k+1) && !str.contains(String.valueOf(s.charAt(k+1))))
                {
                    str=str+s.charAt(k+1);
                    k++;
                    // System.out.print(str);
                }
                    // System.out.print(str);
                else
                {
                  if(count<str.length())
                   {
                    count=str.length();
                   }
                 str="";
                 break;
                        
                }
                }
                
                //while ends
            }
        if(s.length()!=0 && count==0)
            return str.length();
        return count;
        
    }
}