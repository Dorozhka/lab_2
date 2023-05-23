package zadorozhko.typesofreactors.importers;

import java.util.Map;
import zadorozhko.typesofreactors.manipulation.Reactor;
import zadorozhko.typesofreactors.reader.YAMLReader;

public class YAMLImporter extends Importer {

    public YAMLImporter() {
        setReader(new YAMLReader());
    }

    @Override
    public Map<String, Reactor> readFile(String path) {
        if (path.endsWith(".yaml")) {
            return this.getReader().read(path);
        } else {
            throw new RuntimeException("Вы выбрали неверный формат файла");
        }

    }
}
