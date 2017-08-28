package com.yjg.demo1;

import java.lang.reflect.Field;

/**
 * Created by qin on 17-8-27.
 */
public class Test {
    public static void main(String[] args) {
        User user=new User();
        Table table=user.getClass().getAnnotation(Table.class);
        System.out.println(table.tableName());


        Field[] fields=user.getClass().getDeclaredFields();
        user.getClass().getFields();
        for (Field field:fields){
            Column column=field.getAnnotation(Column.class);
            System.out.println(column.columnName());
            field.getAnnotations();
        }
    }
}
