public class NovenNumber {
      public static int parseNoven(String s) {
    	  
    	  int p = 0, fin = 0;
    	  char cur;
    	  boolean neg = false; //Assume incoming string is positive
    	  
    	  //check if negative
    	  if (s.charAt(0) == '-'){
    		  neg = true;
    		  p = 1;
    	  }
    	  
    	//go through character of the string and multiply it by 19 * the predecessor digit
        do {
        	
        	cur = s.charAt(p);
        	
        	if (cur >= '0' && cur <= '9')
        		fin = (cur - '0') + fin*19;
        	else if (cur == '!')
        		fin = 10 + fin*19;
        	else if (cur == '@')
        		fin = 11 + fin*19;
        	else if (cur == '#')
        		fin = 12 + fin*19;
        	else if (cur == '$')
        		fin = 13 + fin*19;
        	else if (cur == '%')
        		fin = 14 + fin*19;
        	else if (cur == '^')
        		fin = 15 + fin*19;
        	else if (cur == '&')
        		fin = 16 + fin*19;
        	else if (cur == '*')
        		fin = 17 + fin*19;
        	else if (cur == '?')
        		fin = 18 + fin*19;

        	p++;
        } while (p < s.length());
        
        if (neg == false) //if positive
        	return fin;
        else             //if negative
        	return -fin;
       }
      
      public static String toString(int a) {
    	  
    	  int r; //remainder
    	  String fin = "", end = "";
    	  char n = '0';   
    	  boolean neg = false;
    	  
    	  //check negative
    	  if (a < 0){
    		  neg = true;
    		  a = -a;
    	  }
    	  
    	//divide by 19, find the remainder, add it as the next character to a string, repeat
    	  do {
    		  r = a % 19;  //find remainder
    		  
    		  //categorize remainder
    		  if (r <= 9 )
    			  n = (char) (r + '0');
    		  else if (r == 10)
    			  n = '!';
    		  else if (r == 11)
    			  n = '@';
    		  else if (r == 12)
    			  n = '#';
    		  else if (r == 13)
    			  n = '$';
    		  else if (r == 14)
    			  n = '%';
    		  else if (r == 15)
    			  n = '^';
    		  else if (r == 16)
    			  n = '&';
    		  else if (r == 17)
    			  n = '*';
    		  else if (r == 18)
    			  n = '?';
    		  
    		  a = a / 19; //find the division and repeat
    		  fin = fin + n;
    		 
    		  
    	  } while ( a > 0);
    	  
    	  int length = fin.length()-1;
    	  
    	  //if negative
    	  if (neg ==true)
    		  end = "-";
    	  
    	  //flip the string
    	  for (int i = length; i >= 0; i--){
    		  end = end + fin.charAt(i);
    	  }
    	  return end;
       
       }
    }