package dmacc;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Computer;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ComputerRepository;

@SpringBootApplication
public class ComputersSpringExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ComputersSpringExampleApplication.class,args);

	}

	@Autowired
	ComputerRepository repo;


	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		
		Computer c = appContext.getBean("computer", Computer.class);
		repo.save(c);

		Computer c2 = new Computer(4, 2.3, 2, 256);
		repo.save(c2);

		List<Computer> allComputers = repo.findAll();
		for(Computer computer: allComputers) {
			System.out.println();
			System.out.println(computer.toString());
			System.out.println();
		}

		((AbstractApplicationContext) appContext).close();
	}
}