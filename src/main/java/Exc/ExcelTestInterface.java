package Exc;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.List;

public interface ExcelTestInterface {
    public List<String> ReadExcelFile() throws IOException, CsvValidationException;
}

