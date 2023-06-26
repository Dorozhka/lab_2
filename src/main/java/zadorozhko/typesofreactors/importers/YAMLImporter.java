package zadorozhko.typesofreactors.importers;

import java.io.IOException;
import java.util.Map;
import org.springframework.stereotype.Component;
import zadorozhko.typesofreactors.manipulation.Reactor;
import zadorozhko.typesofreactors.reader.YAMLReader;

@Component("YAMLImporter")
public class YAMLImporter extends Importer {

    public YAMLImporter() {
        setReader(new YAMLReader());
    }

    @Override
    public Map<String, Reactor> readFile(String path) throws IOException {
        if (path.endsWith(".yaml")) {
            return this.getReader().read(path);
        } else {
            throw new RuntimeException("Вы выбрали неверный формат файла");
        }

    }
}
