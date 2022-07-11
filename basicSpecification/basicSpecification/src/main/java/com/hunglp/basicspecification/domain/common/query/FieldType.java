package com.hunglp.basicspecification.domain.common.query;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public enum FieldType {
    INTEGER {
        public Object parse(String strValue) {
            return Integer.valueOf(strValue);
        }
    },
    STRING {
        public Object parse(String strValue) {
            return String.valueOf(strValue);
        }
    },
    DATE {
        public Object parse(String strValue) {
            Object date = null;
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
                date = LocalDateTime.parse(strValue, formatter);
            } catch (Exception e) {

            }
            return date;
        }
    };

    public abstract Object parse(String value);
}
