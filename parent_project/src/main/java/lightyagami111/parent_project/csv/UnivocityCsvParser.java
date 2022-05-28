package lightyagami111.parent_project.csv;

import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import lightyagami111.parent_project.io.FileResourcesUtils;

import java.util.ArrayList;
import java.util.List;

public class UnivocityCsvParser<T> {

    public List<T> read(String fileName) {
        List<T> resultCollection = new ArrayList<>();

        CsvParserSettings settings = new CsvParserSettings();
        settings.getFormat().setLineSeparator("\n");
        settings.setHeaderExtractionEnabled(false);
        CsvParser parser = new CsvParser(settings);

        List<Record> allRecords = parser.parseAllRecords(FileResourcesUtils.getFileFromResource(fileName));

        for (Record r : allRecords) {
            //parse r to T and add into resultCollection
        }

        return resultCollection;

    }

}
