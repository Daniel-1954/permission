package com.tn.permission;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.locks.LockSupport;

@SpringBootApplication
@MapperScan("com.tn.permission.dao")
public class PermissionApplication {
	private static CarrierManager carrierManager;
	private static TrafficManager trafficManager;
	private static OrderManager orderManager;

	public static void main(String[] args) {
		SpringApplication.run(PermissionApplication.class, args);

		Thread thread = new Thread(() -> {mainHandle();}
		);
		thread.start();
		LockSupport.park();


/*
		carrierManager.startHandle();
		trafficManager.startHandle();
		orderManager.startHandle();

 */
	}

	public static void mainHandle() {
		while (true) {
			System.out.println("111");
			//111
			//222
		}

	}


}
