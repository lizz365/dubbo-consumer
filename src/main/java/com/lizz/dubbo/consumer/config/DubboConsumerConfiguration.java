package com.lizz.dubbo.consumer.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;

/**
 * DubboConfiguration
 *
 * @author lizz365
 * @date 19/3/20
 */
//@Configuration
public class DubboConsumerConfiguration {
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-consumer");
        return applicationConfig;
    }
    @Bean
    public ConsumerConfig consumerConfig() {
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(3000);
        return consumerConfig;
    }
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://192.168.180.15:2181,192.168.180.15:2182," +
                "192.168.180.15:2183,192.168.180.15:2184");
        registryConfig.setClient("curator");
        return registryConfig;
    }
}
