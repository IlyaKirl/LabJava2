package TransferQuestion;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.List;

public interface TrQuestionImpl {
    public List<String> getListQuestion() throws IOException, CsvValidationException;
}
