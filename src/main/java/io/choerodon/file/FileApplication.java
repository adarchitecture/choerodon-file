package io.choerodon.file;

import org.hzero.autoconfigure.file.EnableHZeroFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHZeroFile
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("io.choerodon")
public class FileApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(FileApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
