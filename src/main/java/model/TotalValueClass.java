package model;

/**
 * @author 梁昊
 * @date 2019/8/24
 * @function
 * @editLog
 */
public final class TotalValueClass {
    private Object value;
    private byte site;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public short getSite() {
        return site;
    }

    public void setSite(byte site) {
        this.site = site;
    }
}
