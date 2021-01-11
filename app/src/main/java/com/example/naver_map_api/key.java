package com.example.naver_map_api;

public class key
{
    public static String name;
    public static int month;
    public static int day;

    public key() {}

    public key(String name, int month, int day) {
        this.name = name;
        this.month = month;
        this.day = day;
    }

    // 이렇게 해야 key 를 뽑아낼 수 있음
// 필수적임 안쓰면 value 가 전부 null
    public boolean equals (final Object O) {
        if (!(O instanceof key)) return false;
        if (((key) O).name != name) return false;
        if (((key) O).month != month) return false;
        if (((key) O).day != day) return false;
        return true;
    }
    // 이렇게 해야 key 를 뽑아낼 수 있음
    // 필수적임 안쓰면 value 가 전부 null
    public int hashCode() {
        return (month << 16) + day;
    }

    public String toString()
    {
        return "[" + this.name + ", " + this.month + ","+ this.day + "]";
    }

}
