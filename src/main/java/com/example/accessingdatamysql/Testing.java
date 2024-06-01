package com.example.accessingdatamysql;

import java.util.HashMap;

public class Testing {
    Testing operation;
    public void function(){
        Testing A = new Testing();
        Testing B = new Testing();

        A.operation = B.operation;
        B.operation = A.operation;
    }
    public static void main(String[] arg) {
        System.out.println("bbbbb");
        Testing bbb = new Testing();
        bbb.function();
        System.out.println("cccccc");

        HashMap<String,String> abc = new HashMap<>();
        abc.put("bbb","cccc");
        abc.put("dddd","tttt");
        for (String key:
             abc.keySet()) {
            abc.remove(key);
        }
    }
}
