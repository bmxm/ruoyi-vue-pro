package cn.iocoder.yudao.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("SpringComponentScan") // 忽略 IDEA 无法识别 ${yudao.info.base-package}
@SpringBootApplication(scanBasePackages = {"${yudao.info.base-package}.server", "${yudao.info.base-package}.module"})
public class YudaoServerApplication {

    // mvn clean package -Dmaven.test.skip=true   为什么要先执行这个？
    public static void main(String[] args) {
        SpringApplication.run(YudaoServerApplication.class, args);
    }

}
