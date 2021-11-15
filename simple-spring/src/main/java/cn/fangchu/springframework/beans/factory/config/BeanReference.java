package cn.fangchu.springframework.beans.factory.config;

/****
 *
 *
 * @author Fangchu
 * @date 2021/10/26
 **/
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
