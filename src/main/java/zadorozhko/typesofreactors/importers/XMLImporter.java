package zadorozhko.typesofreactors.importers;

import java.io.IOException;
import java.util.Map;
import org.springframework.stereotype.Component;
import zadorozhko.typesofreactors.manipulation.Reactor;
import zadorozhko.typesofreactors.reader.XMLReader;

@Component("XMLImporter")
public class XMLImporter extends Importer {

    public XMLImporter() {
        setReader(new XMLReader());
    }

    @Override
    public Map<String, Reactor> readFile(String path) throws IOException {
        if (path.endsWith(".xml")) {
            return this.getReader().read(path);
        }
        return this.getNeighbour().readFile(path);
    }
}