# SSM_Base_MyBatis_With_Spring(Project_T5)
在spring的框架中使用MyBatis:

单独使用：使用mybatis重要的bean有：
SqlSession
SqlSessionFactory
SqlSessionFactoryBuilder()
重要的文件有：
mybatis-config.xml == 用于编写数据库连接信息（信息外在化）、映射文件路径信息
mapper.xml == 用于编写sql语句、映射查询结果（ORM）

在spring框架中使用：

完成Dao方式的开发整合，并且实验成功：
数据库连接信息==>由spring来搞定
获取SqlSessionFactory==>由spring来搞定并注入到SqlSessionDaoSuuport的子类Dao中：
调用getSession()方法获取SqlSession对象

完成基于MapperFactoryBean的整合，并且实验成功：
数据库连接信息==>由spring来搞定
获取SqlSessionFactory==>由spring来搞定，并将它注入到org.mybatis.spring.mapper.MapperFactoryBean中
MapperFactory是SqlSessionDaoSupport的子类
使用的注意点：
获取接口对应的DAO类，
可以使用byType的方法，即getBean(接口.class)；
也可以使用byName的方法，即getBean(Bean Name)；
MapperFactoryBean的出现为了代替手工使用SqlSessionDaoSupport或SqlSessionTemplate编写数据访问对象(DAO)的代码,使用动态代理实现。


完成基于MapperScannerConfigurer的整合，实验成功
数据库连接信息==>由spring来搞定
使用的注意点：
获取接口对应的DAO类，需要使用byType的方法，即getBean(接口.class)；
而不能使用byName的方法，即getBean(Bean Name)；
MapperScannerConfigurer这个类，它将会查找类路径下的映射器并自动将它们创建成MapperFactoryBean。