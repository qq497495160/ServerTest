# ServerTest
First test java server: Spring Boot

1.如何通过localhost/直接访问？
==》通过设置80端口；通过设置ResponseBody标签访问

2.除了main函数，其他的Controller为何运行不到？
==》方案有两种，可以参考网址http://blog.csdn.net/goodelephant/article/details/52160974

3.如何访问网页？
==》ResponseBody，然后设置html.html

4.如何返回Json?
==>@RestController注解

5.如何通过get？如何通过post？
==>访问
postman访问：http://192.168.35.35:9090/userinfo/postUserInfoById?id=1
 http://localhost:9090/userinfo/getUserInfoById?id=2

6.如何通过jdbc进行基本的数据库连接？
==>设置
        <!-- 添加Mysql和JDBC,最基础的数据库连接访问方式 同时，spring-boot-starter-jdbc包含在spring-boot-starter-data-jpa -->
        <!-- <dependency> <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-jdbc</artifactId> 
            </dependency> <dependency> <groupId>mysql</groupId> <artifactId>mysql-connector-java</artifactId> 
            </dependency> -->


7.如何通过JPA进行数据库连接？
==》Resource注解生效，Bean文件生效，依赖如下
        <!-- 添加Mysql和JPA,JPA连接方式 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>


8.如何进行swagger生成api接口？


9.MyBatis如何集成？




