class RegularExpression {
	 public static boolean isMatch(String s, String p) {
			if(s.length() > p.length()) {
				return false;
			}
	    	String ans = word(s,p);
	        if(s.equals(ans)){
	            return true ;
	        }
	        else {
	            return false;
	        }
	    }
	    public static String word(String s, String p){
	        String org = "";
	        char a ='*';
	        char b='.';
	        for(int i=0,j=0;i<p.length();i++,j++){
	        	 
	                if(p.charAt(i) == a ){
	                	if(s.charAt(j) ==p.charAt(i-1)) {
	                    org += p.charAt(i);
	                    }
	                	if( p.charAt(i-1) == b) {
	                    org += b;
	                	}
	                	else {
	                		i++;
	                		j = j-1;
	                	}
	                }
	                else {
	                	org +=p.charAt(i);
	                }
	        	   

	    }
        	   
	        return org;
    }
	    public static String realword(String s, String p){
	    	String org = word(s,p);
	    	char b= '.';
	    	String ans= "";
	    	for(int i=0;i<org.length();i++) {
	    		if(org.charAt(i)==b) {
	    			ans += s.charAt(i);
	    		}
	    		else {
	    			ans += org.charAt(i);
	    		}
	    	}
	    	return ans;
	    }
    
    
    public static void main (String [] args) {
    	System.out.println(isMatch("aaa","ab*ac*a"));
    }
    
    
    
    }