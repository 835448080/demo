package com.yjg;

import java.util.List;

/**
 * Created by qin on 17-8-26.
 */
public class ListUtil {
    public static List<Object> dosomething(List list){
        System.out.println("finish do it");
        return list;
    }
    public static <E,C> List<C> doit(List<C> list){
        System.out.println("finish do it ");
        for (C lalala:list){
            if (lalala instanceof User){

            }
        }
        return list;
    }
}
