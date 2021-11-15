package cn.fangchu.springframework.beans.factory.support;

import cn.fangchu.springframework.beans.factory.config.BeanDefinition;

/****
 *
 *
 * @author Fangchu
 * @date 2021/10/16
 **/
public interface BeanDefinitionRegistry  {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
