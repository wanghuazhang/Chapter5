package com.camp.bit.todolist.db;

import android.provider.BaseColumns;

import java.security.PublicKey;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量


    /*创建表语句 语句对大小写不敏感 create table 表名(字段名 类型，字段名 类型，…)*/
    public static final String CREATE = "CREATE TABLE " + Todo.TABLE_NAME+ " (" +
            Todo._ID + " INTEGER PRIMARY KEY," +
            Todo.VALUE_DATE+ " INTEGER," +
            Todo.VALUE_STATE + " INTEGER," +
            Todo.VALUE_CONTENT + " TEXT)";

    public static final String DELETE = "DROP TABLE IF EXISTS" + Todo.TABLE_NAME;

    public static class Todo implements BaseColumns{
        /*表名*/
        public static final String TABLE_NAME = "todo_list";
        /*id字段*/
        public static  final String VALUE_DATE = "date";
        public static  final String VALUE_STATE = "state";
        public static  final String VALUE_CONTENT = "content";
    }

    public TodoContract() {

    }


}
