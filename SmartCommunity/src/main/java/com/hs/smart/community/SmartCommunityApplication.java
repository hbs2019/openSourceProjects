package com.hs.smart.community;

import cn.hutool.core.date.BetweenFormatter;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import xyz.erupt.core.annotation.EruptScan;

import java.awt.*;
import java.net.URI;

@Slf4j
@EntityScan
@EruptScan
@SpringBootApplication
public class SmartCommunityApplication {

    public static void main(String[] args) {
        TimeInterval timer = DateUtil.timer();
        timer.start();
        log.info("========================服务器正在启动...========================");
        SpringApplication.run(SmartCommunityApplication.class, args);
        try {
            System.setProperty("java.awt.headless", "false");
            Desktop.getDesktop().browse(new URI("http://localhost:8080"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("========================服务器启动完毕！========================");
        log.info("本次启动耗时：" + DateUtil.formatBetween(timer.intervalRestart(), BetweenFormatter.Level.SECOND));
    }

}
