package cn.fangchu.springframework.beans.factory.support;

import cn.fangchu.springframework.beans.BeansException;
import cn.fangchu.springframework.beans.factory.BeanFactory;
import cn.fangchu.springframework.beans.factory.config.BeanDefinition;

/****
 * 此类使用模板设计模式
 *
 * @author Fangchu
 * @date 2021/10/14
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        return doGetBean(name,null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return doGetBean(name,args);
    }

    protected<T> T doGetBean(final String name,final Object[] args) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        Object o = createBean(name, beanDefinition, args);
        return (T) o;
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition,Object[] args) throws BeansException;

}
