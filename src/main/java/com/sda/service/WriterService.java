package com.sda.service;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class WriterService {
    public String write(String name){
        return prefix(name) + content(name) + suffix(name);

    }


    private String prefix(String name) {
        return isCapitalizedName(name)? "HELLO, ": "Hello, ";
    }

    private String content(String name) {
        if (StringUtils.isBlank(name)) {
            return "my friend";
        }
        StringBuilder builder = new StringBuilder();
        String[] names = name.split(",");
        for (int i = 0; i < names.length - 1; i++) {
            builder.append(names[i])
                    .append(getDelimiter(i, names, name));
        }
        return builder.append(names[names.length - 1]).toString();
    }

    private String getDelimiter(int index, String[] names, String name) {
        return index != names.length - 2 ? ", " : (
                isCapitalizedName(name) ? " AND " : " and ");
    }

    private String suffix(String name) {
        return isCapitalizedName(name) ? "!" : ".";
    }

    private boolean isCapitalizedName(String name){
        return StringUtils.isNotBlank(name) && name.toUpperCase().equals(name);
    }

//    private String manyNames(String name){
//        //List<String> listOfNames = new ArrayList<String>();
//        StringBuilder stringBuilder = new StringBuilder();
//        String[] names = name.split(", ");
//        if (isManyNames(name)){
//
//            for (int i = 0; i < names.length; i++) {
//                //listOfNames.add(names[i]);
//                if (i != names.length - 2 ){
//                    stringBuilder.append(names[i]).append(", ");
//                } else {
//                    stringBuilder.append(" and ");
//                }
//            }
//        }
//        return stringBuilder.toString();
//    }
//
//    private boolean isManyNames(String name){
//        boolean flag = false;
//
//        if (name.contains(" ") || name.contains(",")){
//            flag = true;
//
//        }
//
//        return flag;
//    }
//
//    public static void main(String[] args) {
//
//    }
}
