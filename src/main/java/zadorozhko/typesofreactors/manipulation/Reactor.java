
package zadorozhko.typesofreactors.manipulation;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

public class Reactor {
    @JsonProperty("sourse") private String source;
    @JsonProperty("burnup") private double burnup;
    @JsonProperty("class") private String rClass;
    @JsonProperty("electrical_capacity") private double electrical_capacity;
    @JsonProperty("enrichment") private double enrichment;
    @JsonProperty("first_load") private double first_load;
    @JsonProperty("kpd") private double kpd;
    @JsonProperty("life_time") private double life_time;
    @JsonProperty("termal_capacity") private double termal_capacity;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getBurnup() {
        return burnup;
    }

    public void setBurnup(double burnup) {
        this.burnup = burnup;
    }

    public String getrClass() {
        return rClass;
    }

    public void setrClass(String rClass) {
        this.rClass = rClass;
    }

    public double getElectrical_capacity() {
        return electrical_capacity;
    }

    public void setElectrical_capacity(double electrical_capacity) {
        this.electrical_capacity = electrical_capacity;
    }

    public double getEnrichment() {
        return enrichment;
    }

    public void setEnrichment(double enrichment) {
        this.enrichment = enrichment;
    }

    public double getFirst_load() {
        return first_load;
    }

    public void setFirst_load(double first_load) {
        this.first_load = first_load;
    }

    public double getKpd() {
        return kpd;
    }

    public void setKpd(double kpd) {
        this.kpd = kpd;
    }

    public double getLife_time() {
        return life_time;
    }

    public void setLife_time(double life_time) {
        this.life_time = life_time;
    }

    public double getTermal_capacity() {
        return termal_capacity;
    }

    public void setTermal_capacity(double termal_capacity) {
        this.termal_capacity = termal_capacity;
    }
    
    public MutableTreeNode getNode() {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(rClass);
        node.add(new DefaultMutableTreeNode("source: " + source));
        node.add(new DefaultMutableTreeNode("class: " + rClass));
        node.add(new DefaultMutableTreeNode("burnup: " + Double.toString(burnup)));
        node.add(new DefaultMutableTreeNode("kpd: " + Double.toString(kpd)));
        node.add(new DefaultMutableTreeNode("enrichment: " + Double.toString(enrichment)));
        node.add(new DefaultMutableTreeNode("termal_capacity: " + Double.toString(termal_capacity)));
        node.add(new DefaultMutableTreeNode("electrical_capacity: " + Double.toString(electrical_capacity)));
        node.add(new DefaultMutableTreeNode("life_time: " + Double.toString(life_time)));
        node.add(new DefaultMutableTreeNode("first_load: " + Double.toString(first_load)));
        return node;
    }
}
