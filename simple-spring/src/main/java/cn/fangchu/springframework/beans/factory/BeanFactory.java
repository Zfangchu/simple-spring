package cn.fangchu.springframework.beans.factory;

import cn.fangchu.springframework.beans.BeansException;

/****
 *
 *
 * @author Fangchu
 * @date 2021/9/28
 **/
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name,Object ... args) throws BeansException;

}
