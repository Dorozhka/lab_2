package zadorozhko.typesofreactors.reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.springframework.stereotype.Component;
import zadorozhko.typesofreactors.manipulation.Reactor;

@Component("YAMLReader")
public class YAMLReader implements Reader {
    @Override
    public Map<String, Reactor> read(String fileName) throws IOException {

        Map<String, Reactor> map;
        YAMLMapper mapper = new YAMLMapper();
        map = mapper.readValue(new File(fileName), new TypeReference<>() {
        });
        return map;
    }
}