
package zadorozhko.typesofreactors.manipulation;

import java.util.Map;

public class DataManipulation {
    private String source;
    private Map<String, Reactor> map;

    public DataManipulation(String source) {
        this.source = source;
    }
    
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Map<String, Reactor> getMap() {
        return map;
    }

    public void setMap(Map<String, Reactor> map) {
        this.map = map;
    }

}
