build.gradle
implementation 'com.github.pagehelper:pagehelper-spring-boot-starter:2.1.0'

pom.xml
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper-spring-boot-starter</artifactId>
    <version>2.1.0</version>
</dependency>


application.properties
# PageHelper 설정
pagehelper.helperDialect=mysql
pagehelper.reasonable=true
pagehelper.supportMethodsArguments=true
pagehelper.params=count=countSql