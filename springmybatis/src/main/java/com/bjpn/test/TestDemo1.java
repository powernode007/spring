package com.bjpn.test;

import com.bjpn.mapper.ATMMapper;
import com.bjpn.service.ATMService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//存款  取款 转账
public class TestDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("\n请输入要办的业务：\n1、存钱\n" + "2、取钱\n" + "3、转账\n");
            int input = scanner.nextInt();

            if (input == 1) {
                m1();
            }
            if (input == 2) {
                m2();
            }
            if (input == 3) {
                m3();
            }
            System.out.println("是否继续操作？1、继续        2、退出");
            num = scanner.nextInt();
            if (num == 2) {
                break;
            }
        }
        System.out.println("已安全退出");
    }

    public static void m1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入存款卡号：");
        String atmCode = scanner.next();
        System.out.println("请输入存款金额，存款金额只能是正数：");
        double saveMoney = scanner.nextDouble();
        //开始存钱
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        ATMService atmService = (ATMService) beans.getBean("ATMServiceImpl");
        boolean b = atmService.saveMoneyService(atmCode, saveMoney);
        if (b) {
            System.out.println("存钱成功");
        } else {
            System.out.println("失败");
        }
    }


    public static void m2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入存款卡号：");
        String atmCode = scanner.next();
        System.out.println("请输入取款金额，存款金额只能是正数：");
        double drawMoney = scanner.nextDouble();
        //开始取钱
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        ATMService atmService = (ATMService) beans.getBean("ATMServiceImpl");
        boolean b = atmService.drawWithMoneyService(atmCode, drawMoney);
        if (b) {
            System.out.println("取钱成功");
        } else {
            System.out.println("失败");
        }

    }


    public static void m3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入自己卡号：");
        String transferCode = scanner.next();
        System.out.println("请输入对方卡号：");
        String atmCode = scanner.next();
        System.out.println("请输入转账金额，存款金额只能是正数：");
        double transferMoney = scanner.nextDouble();
        //开始取钱
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("spring.xml");
        ATMService atmService = (ATMService) beans.getBean("ATMServiceImpl");
        boolean b = atmService.transferMoneyService(atmCode, transferCode, transferMoney);
        if (b) {
            System.out.println("转账成功");
        } else {
            System.out.println("失败");
        }


    }
}

