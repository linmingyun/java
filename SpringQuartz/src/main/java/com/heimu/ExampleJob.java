package com.heimu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleJob{

    public void execute(){
        System.out.println("现在是"+new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date()));
        System.out.println("HelloWorld!");
    }

}