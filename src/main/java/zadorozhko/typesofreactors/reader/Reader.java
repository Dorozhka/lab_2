
package zadorozhko.typesofreactors.reader;

import java.util.Map;
import zadorozhko.typesofreactors.manipulation.Reactor;

public interface Reader {
    public Map<String, Reactor> read(String fileName);
}
