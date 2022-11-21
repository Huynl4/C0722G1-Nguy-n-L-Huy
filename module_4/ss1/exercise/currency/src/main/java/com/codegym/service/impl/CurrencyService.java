package com.codegym.service.impl;

import org.springframework.stereotype.Service;
import com.codegym.service.ICurrencyService;

@Service
public class CurrencyService implements ICurrencyService {

    @Override
    public int total(int usd) {
        int vnd = usd*23000;
        return vnd;
    }

//    @Override
//    public int convertVnd(int vnd) {
//        int usd= vnd/23000;
//        return usd;
//    }
}
