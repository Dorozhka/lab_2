package zadorozhko.typesofreactors.importers;

import zadorozhko.typesofreactors.reader.JSONReader;
import java.util.Map;
import zadorozhko.typesofreactors.manipulation.Reactor;

public class JSONImporter extends Importer {

    public JSONImporter() {
        setReader(new JSONReader());
    }

    @Override
    public Map<String, Reactor> readFile(String path) {
        if (path.endsWith(".json")) {
            return this.getReader().read(path);
        }
        return this.getNeighbour().readFile(path);
    }
}