implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3'
testImplementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter-test:3.0.3'



# application.properties

# 데이터 소스 - MySQL
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/aloha?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false&autoReconnection=true&autoReconnection=true
spring.datasource.username=aloha
spring.datasource.password=123456

# mybatis 설정 방법 1,2
# 방법 1 - 파일 따로 지정
# Mybatis 설정
# Mybatis 설정 경로      : ~/resources/mybatis-config.xml
# mybatis.config-location=classpath:mybatis-config.xml

# 방법 2 - 내부에서 지정 
# 컬럼명을 변수명으로 자동매핑 :  board_no ➡ boardNo
mybatis.configuration.map-underscore-to-camel-case=true
# resultType 속성에서 dto 객체 (패키지.클래스명) ➡ (클래스명)
mybatis.type-aliases-package=com.aloha.~~.dto

# Mybatis 매퍼 파일 경로 : ~/메인패키지/mapper/**Mapper.xml
mybatis.mapper-locations=classpath:mybatis/mapper/**/**.xml




# mapper.xml

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
"http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!-- namespace="매퍼 인터페이스 경로" --> 
<mapper namespace="com.aloha.rest.mapper.PostMapper">



</mapper>