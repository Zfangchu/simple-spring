package cn.fangchu.springframework.beans.factory.config;

/****
 *
 *
 * @author Fangchu
 * @date 2021/10/14
 **/
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
