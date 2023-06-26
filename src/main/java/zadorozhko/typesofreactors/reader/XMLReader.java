package zadorozhko.typesofreactors.reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.springframework.stereotype.Component;
import zadorozhko.typesofreactors.manipulation.Reactor;

@Component("XMLReader")
public class XMLReader implements Reader {
    @Override
    public Map<String, Reactor> read(String fileName) throws IOException {
        Map<String, Reactor> map;
        XmlMapper mapper = new XmlMapper();
        map = mapper.readValue(new File(fileName), new TypeReference<>() {
        });
        return map;
    }
}