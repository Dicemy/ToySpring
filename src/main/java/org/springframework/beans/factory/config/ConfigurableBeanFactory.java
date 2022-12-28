package org.springframework.beans.factory.config;

import org.springframework.beans.factory.BeanFactory;

public interface ConfigurableBeanFactory extends BeanFactory, SingletonBeanRegistry {

	void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}
