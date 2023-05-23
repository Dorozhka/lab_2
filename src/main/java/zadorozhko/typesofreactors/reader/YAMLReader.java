package zadorozhko.typesofreactors.reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import zadorozhko.typesofreactors.manipulation.Reactor;

public class YAMLReader implements Reader {

    @Override
    public Map<String, Reactor> read(String fileName) {
        Map<String, Reactor> map = null;
        YAMLMapper objectMapper = new YAMLMapper();
        try {
            map = objectMapper.readValue(
                    new File(fileName), new TypeReference<>() {});
        } catch (IOException ex) {
            Logger.getLogger(XMLReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }
}
