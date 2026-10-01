package com.java.learning.oop.lecture.two.polymorphism;

public class Main {
    static void main(String[] args) {
        Circle shape = new Circle();
        System.out.println(shape.name);
    }
}


























APPLICATION FAILED TO START
***************************

Description:

Field consumerBasicProfileReadRepository in com.nayapay.common.utils.UserStateUtils required a bean of type 'com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository' that could not be found.

The injection point has the following annotations:
        - @org.springframework.beans.factory.annotation.Autowired(required=true)


Action:

Consider defining a bean of type 'com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository' in your configuration.

30-Sep-2026 17:26:01.498 SEVERE [main] org.apache.catalina.startup.HostConfig.deployWAR Error deploying web application archive [/opt/tomcat/apache-tomcat-9.0.104/webapps/nayapay-middleware-0.0.1.war]
java.lang.IllegalStateException: Error starting child
at org.apache.catalina.core.ContainerBase.addChildInternal(ContainerBase.java:602)
at org.apache.catalina.core.ContainerBase.addChild(ContainerBase.java:571)
at org.apache.catalina.core.StandardHost.addChild(StandardHost.java:603)
at org.apache.catalina.startup.HostConfig.deployWAR(HostConfig.java:1012)
at org.apache.catalina.startup.HostConfig$DeployWar.run(HostConfig.java:1860)
at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:76)
at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:123)
at org.apache.catalina.startup.HostConfig.deployWARs(HostConfig.java:817)
at org.apache.catalina.startup.HostConfig.deployApps(HostConfig.java:468)
at org.apache.catalina.startup.HostConfig.start(HostConfig.java:1578)
at org.apache.catalina.startup.HostConfig.lifecycleEvent(HostConfig.java:312)
at org.apache.catalina.util.LifecycleBase.fireLifecycleEvent(LifecycleBase.java:109)
at org.apache.catalina.util.LifecycleBase.setStateInternal(LifecycleBase.java:389)
at org.apache.catalina.util.LifecycleBase.setState(LifecycleBase.java:336)
at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:776)
at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:721)
at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164)
at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1203)
at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1193)
at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:76)
at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:145)
at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:749)
at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:211)
at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164)
at org.apache.catalina.core.StandardService.startInternal(StandardService.java:412)
at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164)
at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:874)
at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164)
at org.apache.catalina.startup.Catalina.start(Catalina.java:739)
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
at java.base/java.lang.reflect.Method.invoke(Method.java:580)
at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:345)
at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:476)
Caused by: org.apache.catalina.LifecycleException: Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[/nayapay-middleware-0.0.1]]
at org.apache.catalina.util.LifecycleBase.handleSubClassException(LifecycleBase.java:406)
at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:179)
at org.apache.catalina.core.ContainerBase.addChildInternal(ContainerBase.java:599)
                ... 35 more
Caused by: org.springframework.context.ApplicationContextException: Unable to start web server; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'concurrentDuplicateDetectionFilter': Unsatisfied dependency expressed through field 'utilityService'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'utilityService': Unsatisfied dependency expressed through field 'notificationManager'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'notificationManager': Unsatisfied dependency expressed through field 'userStateUtils'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userStateUtils': Unsatisfied dependency expressed through field 'consumerBasicProfileReadRepository'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:165)
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:577)
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147)
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:731)
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408)
at org.springframework.boot.SpringApplication.run(SpringApplication.java:307)
at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.run(SpringBootServletInitializer.java:175)
at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.createRootApplicationContext(SpringBootServletInitializer.java:155)
at org.springframework.boot.web.servlet.support.SpringBootServletInitializer.onStartup(SpringBootServletInitializer.java:97)
at org.springframework.web.SpringServletContainerInitializer.onStartup(SpringServletContainerInitializer.java:174)
at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:4491)
at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:164)
                ... 36 more
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'concurrentDuplicateDetectionFilter': Unsatisfied dependency expressed through field 'utilityService'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'utilityService': Unsatisfied dependency expressed through field 'notificationManager'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'notificationManager': Unsatisfied dependency expressed through field 'userStateUtils'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userStateUtils': Unsatisfied dependency expressed through field 'consumerBasicProfileReadRepository'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:660)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640)
at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:213)
at org.springframework.boot.web.servlet.ServletContextInitializerBeans.getOrderedBeansOfType(ServletContextInitializerBeans.java:213)
at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:176)
at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAsRegistrationBean(ServletContextInitializerBeans.java:171)
at org.springframework.boot.web.servlet.ServletContextInitializerBeans.addAdaptableBeans(ServletContextInitializerBeans.java:156)
at org.springframework.boot.web.servlet.ServletContextInitializerBeans.<init>(ServletContextInitializerBeans.java:87)
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.getServletContextInitializerBeans(ServletWebServerApplicationContext.java:262)
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.selfInitialize(ServletWebServerApplicationContext.java:236)
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.createWebServer(ServletWebServerApplicationContext.java:193)
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.onRefresh(ServletWebServerApplicationContext.java:162)
                ... 47 more
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'utilityService': Unsatisfied dependency expressed through field 'notificationManager'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'notificationManager': Unsatisfied dependency expressed through field 'userStateUtils'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userStateUtils': Unsatisfied dependency expressed through field 'consumerBasicProfileReadRepository'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:660)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640)
at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657)
                ... 66 more
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'notificationManager': Unsatisfied dependency expressed through field 'userStateUtils'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userStateUtils': Unsatisfied dependency expressed through field 'consumerBasicProfileReadRepository'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:660)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640)
at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657)
                ... 80 more
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userStateUtils': Unsatisfied dependency expressed through field 'consumerBasicProfileReadRepository'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:660)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:640)
at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:119)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessProperties(AutowiredAnnotationBeanPostProcessor.java:399)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1431)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:619)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542)
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335)
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234)
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333)
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208)
at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657)
                ... 94 more
Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.nayapay.readonly.repository.ConsumerBasicProfileReadRepository' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoMatchingBeanFound(DefaultListableBeanFactory.java:1801)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1357)
at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311)
at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.resolveFieldValue(AutowiredAnnotationBeanPostProcessor.java:657)
                ... 108 more
30-Sep-2026 17:26:01.509 INFO [main] org.apache.catalina.startup.HostConfig.deployWAR Deployment of web application archive [/opt/tomcat/apache-tomcat-9.0.104/webapps/nayapay-middleware-0.0.1.war] has finished in [49,940] ms
30-Sep-2026 17:26:01.511 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/opt/tomcat/apache-tomcat-9.0.104/webapps/ROOT]
        30-Sep-2026 17:26:01.542 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/opt/tomcat/apache-tomcat-9.0.104/webapps/ROOT] has finished in [30] ms
30-Sep-2026 17:26:01.544 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/opt/tomcat/apache-tomcat-9.0.104/webapps/host-manager]
        30-Sep-2026 17:26:01.596 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/opt/tomcat/apache-tomcat-9.0.104/webapps/host-manager] has finished in [52] ms
30-Sep-2026 17:26:01.597 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deploying web application directory [/opt/tomcat/apache-tomcat-9.0.104/webapps/manager]
        30-Sep-2026 17:26:01.662 INFO [main] org.apache.catalina.startup.HostConfig.deployDirectory Deployment of web application directory [/opt/tomcat/apache-tomcat-9.0.104/webapps/manager] has finished in [65] ms
30-Sep-2026 17:26:01.670 INFO [main] org.apache.coyote.AbstractProtocol.start Starting ProtocolHandler ["http-nio-80"]
javax.net.ssl|DEBUG|43|Keep-Alive-Timer|2026-09-30 17:26:01.679 PKT|SSLSocketImpl.java:577|duplex close of SSLSocket
javax.net.ssl|DEBUG|43|Keep-Alive-Timer|2026-09-30 17:26:01.682 PKT|SSLSocketImpl.java:1749|close the underlying socket
javax.net.ssl|DEBUG|43|Keep-Alive-Timer|2026-09-30 17:26:01.683 PKT|SSLSocketImpl.java:1775|close the SSL connection (initiative)
javax.net.ssl|DEBUG|43|Keep-Alive-Timer|2026-09-30 17:26:01.683 PKT|SSLSocketImpl.java:834|close inbound of SSLSocket
javax.net.ssl|WARNING|43|Keep-Alive-Timer|2026-09-30 17:26:01.685 PKT|SSLSocketImpl.java:595|SSLSocket duplex close failed. Debug info only. Exception details: (
        "throwable" : {
java.net.SocketException: Socket is closed
at java.base/java.net.Socket.shutdownInput(Socket.java:1756)
at java.base/sun.security.ssl.BaseSSLSocketImpl.shutdownInput(BaseSSLSocketImpl.java:224)
at java.base/sun.security.ssl.SSLSocketImpl.shutdownInput(SSLSocketImpl.java:850)
at java.base/sun.security.ssl.SSLSocketImpl.bruteForceCloseInput(SSLSocketImpl.java:799)
at java.base/sun.security.ssl.SSLSocketImpl.duplexCloseOutput(SSLSocketImpl.java:664)
at java.base/sun.security.ssl.SSLSocketImpl.close(SSLSocketImpl.java:584)
at java.base/sun.net.www.http.HttpClient.closeServer(HttpClient.java:1139)
at java.base/sun.net.www.protocol.https.HttpsClient.closeServer(HttpsClient.java:442)
at java.base/sun.net.www.http.KeepAliveCache.run(KeepAliveCache.java:282)
at java.base/java.lang.Thread.run(Thread.java:1583)
at java.base/jdk.internal.misc.InnocuousThread.run(InnocuousThread.java:186)}

        )
        30-Sep-2026 17:26:01.690 INFO [main] org.apache.coyote.AbstractProtocol.start Starting ProtocolHandler ["https-openssl-nio-443"]
        30-Sep-2026 17:26:01.697 INFO [main] org.apache.catalina.startup.Catalina.start Server startup in [62177] milliseconds
30-Sep-2026 17:26:02.675 WARNING [main] org.apache.catalina.core.StandardServer.await Invalid shutdown command [] received
^C
[root@np-uat-middleware-server-01 bin]# ^C
[root@np-uat-middleware-server-01 bin]#

