package com.lizz.dubbo.consumer;

import com.lizz.dubbo.api.HelloService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@DubboComponentScan(basePackages = "com.lizz.dubbo.api")
public class DubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerApplication.class, args);

		ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<HelloService>();
		referenceConfig.setApplication(new ApplicationConfig("first-dubbo-consumer"));
		referenceConfig.setRegistry(new RegistryConfig("multicast://239.255.255.255:1234?unicast=false"));
		referenceConfig.setInterface(HelloService.class);
		HelloService helloService = referenceConfig.get();
		System.out.println(helloService.getHello("world"));

	}

}
