package com.nidal.rest.restexample.Utils;

import org.springframework.util.Assert;

import java.util.Map;

public class Utils {

    public static <K extends Number, V> V nullSafePutValueFromMap(Map<K, V> map, K key, V defaultValue) {
        Assert.notNull(map, "Map cannot null.");
        V value = map.get(key) != null ? map.get(key) : defaultValue;
        return value != null ? value : defaultValue;
    }
}
