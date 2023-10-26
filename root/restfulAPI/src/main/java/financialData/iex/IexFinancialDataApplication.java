package financialData.iex;

 import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("urlBuilder")
public class IexFinancialDataApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(IexFinancialDataApplication.class, args);
		
	}

}
