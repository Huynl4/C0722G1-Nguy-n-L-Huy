package com.codegym.service.impl;

import com.codegym.service.ICaculatorService;
import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public double result(double numOne, double numTrue, String choise) {
        double result = 0;
        switch (choise) {
            case "+":
                result = numOne + numTrue;
                break;
            case "-":
                result = numOne - numTrue;
                break;
            case "*":
                result = numOne * numTrue;
                break;
            case "/":
                result = numOne / numTrue;
                break;
        }
        return result;
    }
}
