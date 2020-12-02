package TransferQuestion;

import Exc.ExcelTestInterface;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.List;

public class TrQuestion {
    private ExcelTestInterface ETI;
    public TrQuestion(ExcelTestInterface ETI) {
        this.ETI = ETI;
    }
    public List<String> getTrQuestion() throws IOException, CsvValidationException {
       return ETI.ReadExcelFile();
    }
    public void setQuestion(ExcelTestInterface ETI) {
        this.ETI = ETI;
    }
}
