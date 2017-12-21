package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,BeanFactoryAware, ApplicationContextAware{
    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## The LifeCycleBean bean factory has been set");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean name is" + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleBean bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The LifeCycleBean has it's properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Application context has been set");
    }

    @PostConstruct
    public void postConstuct(){
        System.out.println("## the post constract annotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## the PreDestroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## Before initi- called by bean post processor");
    }

    public void afterInit(){
        System.out.println("## After initi- called by bean post processor");
    }


}
