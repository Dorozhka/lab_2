package zadorozhko.typesofreactors.reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.springframework.stereotype.Component;
import zadorozhko.typesofreactors.manipulation.Reactor;

@Component("JSONReader")
public class JSONReader implements Reader {
    @Override
    public Map<String, Reactor> read(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Reactor> map;
        map = objectMapper.readValue(new File(fileName), new TypeReference<>() {
        });
        return map;
    }
}
