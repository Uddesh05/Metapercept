package com.Meta;

import java.security.DomainCombiner;
import java.util.Iterator;

class HelloWorld {
    public static void main(String[] args) {
        
        String str = "dummy text of the printing and typesetting industry.";
        String[] arrOfStr = str.split(" ");
        String res="";
        int maxx=0;
        for(String s: arrOfStr){
            if(s.length()>maxx){
                maxx=s.length();
                res=s;
            }
            //System.out.println(res);
        }
        System.out.println(res);
    }
}