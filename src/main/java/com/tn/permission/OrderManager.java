package com.tn.permission;

/**
 * @author tn
 * @date 2022/09/26 22:24
 */
public class OrderManager {
    public void startHandle() {
        Thread thread = new Thread(() -> {mainHandle();}
        );
    }

    public void mainHandle() {
        while (true) {
            System.out.println("222");
        }

    }
}
