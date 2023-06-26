package zadorozhko.typesofreactors.importers;

import java.io.IOException;
import zadorozhko.typesofreactors.reader.JSONReader;
import java.util.Map;
import org.springframework.stereotype.Component;
import zadorozhko.typesofreactors.manipulation.Reactor;

@Component("JSONImporter")
public class JSONImporter extends Importer {

    public JSONImporter() {
        setReader(new JSONReader());
    }

    @Override
    public Map<String, Reactor> readFile(String path) throws IOException {
        if (path.endsWith(".json")) {
            return this.getReader().read(path);
        }
        return this.getNeighbour().readFile(path);
    }
}