package matheus.io.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationPropertiesExample_NewValue implements ApplicationListener<ContextRefreshedEvent> {

	@Value("${general.nameApplication}")
	private String name;
	
	@Value("${general.author}")
	private String author;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		System.out.println("------------------");
		System.out.println(name);
		System.out.println(author);
		System.out.println("------------------");
		
	}

}
