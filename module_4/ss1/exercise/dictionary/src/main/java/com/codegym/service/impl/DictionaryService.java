package com.codegym.service.impl;

import com.codegym.service.IDictionaryService;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService {
    private static Map<String, String> stringMap = new LinkedHashMap<>();

    static {
        stringMap.put("Hello", "xin chào");
        stringMap.put("Car", "xe hơi");
        stringMap.put("Home", "ngôi nhà");
    }

    @Override
    public Map<String, String> search() {
        return stringMap;
    }
}
