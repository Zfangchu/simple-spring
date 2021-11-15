package cn.fangchu.springframework.beans;

/****
 *
 *
 * @author Fangchu
 * @date 2021/10/19
 **/
public class PropertyValue {

    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
