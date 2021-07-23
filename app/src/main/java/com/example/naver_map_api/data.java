package com.example.naver_map_api;
//빅데이터 파일을 읽어와 파싱하기 위한 객체에 대한 클래스
public class data {
    public static String name;
    public static int month;
    public static int day;
    public static double height;
    public static String result;

    public data() {}

    public data(String name, int month, int day, double height, String result) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.height = height;
        this.result = result;
    }

    public String toString()
    {
        return "[" + this.name + ", " + this.month + ","+ this.day + ","+ this.height+ ","+ this.result + "]";
    }
}
