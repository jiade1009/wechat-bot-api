package io.github.biezhi.wechat;

import io.github.biezhi.wechat.model.Environment;
import io.github.biezhi.wechat.robot.MoliRobot;
import io.github.biezhi.wechat.ui.StartUI;

/**
 * wechat启动程序
 */
public class Application {

    public static void main(String[] args) throws Exception {
        Environment environment = Environment.of("classpath:config.properties");
        StartUI     startUI     = new StartUI(environment);
//        startUI.setMsgHandle(new TulingRobot(environment));
        startUI.setMsgHandle(new MoliRobot(environment));
        startUI.start();
    }

}