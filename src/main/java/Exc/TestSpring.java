package Exc;

import TransferQuestion.TreatmentQuestion;
import com.opencsv.exceptions.CsvException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import java.io.IOException;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class TestSpring {
    public static void main(String[] args) throws IOException, CsvException {

        ApplicationContext context = SpringApplication.run(TestSpring.class, args);
        TreatmentQuestion TestRun = context.getBean(TreatmentQuestion.class);
        TestRun.run();
    }
}
