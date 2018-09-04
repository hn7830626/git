package com.itheima.controller;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConvert implements Converter<String,Date> {
    @Override
    public Date convert(String s) {

        try {
            if (StringUtils.isEmpty(s)){
                return  null;
            }
            return new SimpleDateFormat("yyyy-MM-dd").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            return  null;
        }
    }
}
