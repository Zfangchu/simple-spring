package cn.fangchu.springframework.beans.factory.support;

import cn.fangchu.springframework.beans.BeansException;
import cn.fangchu.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/****
 *
 *
 * @author Fangchu
 * @date 2021/10/16
 **/
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,Object[] args) throws BeansException;
}
