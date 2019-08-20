package ru.denisch;

import com.google.common.base.CaseFormat;

public class HelloOtus {
    public static void main(String[] args) {
        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));
    }
}
