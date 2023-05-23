package zadorozhko.typesofreactors.reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import zadorozhko.typesofreactors.manipulation.Reactor;

public class JSONReader implements Reader {

    @Override
    public Map<String, Reactor> read(String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Reactor> map = null;
        try {
            map = objectMapper.readValue(new File(fileName), new TypeReference<>() {
            });
            for (Map.Entry<String, Reactor> entry : map.entrySet()) {
                entry.getValue().setSource(fileName);
            }
        } catch (IOException ex) {
            Logger.getLogger(XMLReader.class.getName()).log(Level.SEVERE, null, ex);
        }

        return map;
    }

}