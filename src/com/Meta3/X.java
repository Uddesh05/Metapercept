package com.Meta3;

class HelloWorld {
    public static void main(String[] args) {
        String s="test01gmail.com";
        boolean flag1=true,flag2=true,flag3=true,flag4=false;
        char x=s.charAt(0);
        if(x<97 || x>122){
            flag2=false;
        }
        else{
            for(int i=1;i<s.length();i++){
                char c= s.charAt(i);
                if(c=='@'){
                    flag4=true;
                    String sub=s.substring(i+1);
                    if(s.contains(".com")){
                        for(int j=i+1;j<s.length();j++){
                            char ch= s.charAt(j);
                            if(ch=='.'){
                                if(flag3==true){
                                    flag3=false;
                                    continue;
                                }
                                else{
                                    flag1=false;
                                    break;
                                }
                            }
                            else if(ch<97 || ch>122){
                                flag1=false;
                                break;
                            }
                        }
                        if(flag1==false){
                            flag2=false;
                            break;
                        }
                    }
                    else{
                        flag2=false;
                    }
                    break;
                }
                else if(c<48 || (c>57 && c<97) || c>122){
                    flag2=false;
                    break;
                }
                }
            }
        if(flag4==false && flag2==false){
                System.out.println("Invalid Email Id");
            }
            else{
                System.out.println("Valid Email Id");
            }
        }
}
