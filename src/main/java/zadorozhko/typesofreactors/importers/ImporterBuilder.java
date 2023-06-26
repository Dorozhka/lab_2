package zadorozhko.typesofreactors.importers;

import java.io.IOException;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import zadorozhko.typesofreactors.manipulation.Reactor;

@Component
public class ImporterBuilder {
    private final Importer xml;
    private final Importer yaml;
    private final Importer json;

    @Autowired
    public ImporterBuilder(@Qualifier("XMLImporter") Importer xml, @Qualifier("YAMLImporter") Importer yaml, @Qualifier("JSONImporter") Importer json) {
        this.xml = xml;
        this.yaml = yaml;
        this.json = json;
        this.json.setNeighbour(xml);
        this.xml.setNeighbour(yaml);
        this.yaml.setNeighbour(null);
    }

    public Map<String, Reactor> getData(String path) throws IOException {
        return json.readFile(path);
    }
}


