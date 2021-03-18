package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Computer;


@Configuration
public class BeanConfiguration {

	@Bean
	public Computer computer() {
		Computer bean = new Computer();
		bean.setCPUCoreCount(4);
		bean.setGBsOfRAM(8);
		bean.setGBsOfStorage(1024);
		bean.setProcessingGhz(3.0);
		return bean;
	}
}