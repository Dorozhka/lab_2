package zadorozhko.typesofreactors.importers;

import zadorozhko.typesofreactors.reader.JSONReader;
import java.util.Map;
import zadorozhko.typesofreactors.manipulation.Reactor;
import zadorozhko.typesofreactors.reader.XMLReader;

public class XMLImporter extends Importer {

    public XMLImporter() {
        setReader(new XMLReader());
    }

    @Override
    public Map<String, Reactor> readFile(String path) {
        if (path.endsWith(".xml")) {
            return this.getReader().read(path);
        }
        return this.getNeighbour().readFile(path);
    }
}