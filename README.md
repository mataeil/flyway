# flyway

**flyway** 를 활용하여 java 프로젝트에서 DB 마이그래이션을 수행 하고 이력을 관리할 수 있다.



## <a name='목차'> 목차 </a>

1. [참고 사이트](#참고사이트)
2. [환경 설정](#환경설정)
3. [spring boot 설정](#springboot설정)



## [[↑]](#목차) <a name='참고사이트'> 참고 사이트 </a>

- [flyway 공식 사이트](https://flywaydb.org/)



## [[↑]](#목차) <a name='환경설정'> 환경 설정 </a>

- docker를 활용하여 DB 구동

1. DB 설치 (MYSQL)

> macOS High Sierra (10.13.6), [docker설치](https://docs.docker.com/docker-for-mac/install/)

```bash
$ docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=1 -e MYSQL_DATABASE=springboot -e MYSQL_USER=taeil -e MYSQL_PASSWORD=pass --name mysql_boot -d mysql
```

2. DB 확인

```bash
$ docker exec -i -t mysql_boot bash
$ mysql -utaeil -p
//db접속
mysql> show databases;
```



## [[↑]](#목차) <a name='springboot설정'> spring boot 설정 </a>

1. application.properties

```properties
#datasource 설정
spring.datasource.url=jdbc:mysql://localhost:3306/springboot?useSSL=false
spring.datasource.username=taeil
spring.datasource.password=pass
#spring.datasource.driver-class-name=com.mysql.jdbc.Driver

spring.jpa.hibernate.ddl-auto=validate 
spring.jpa.show-sql=true
spring.jpa.generate-ddl=false
```

2. Classpath:/db/migration

Migration 파일을 위치시킨다. [파일 네이밍 룰](#http://macnews.tistory.com/1439) 을 지켜야한다.

3. Dependency 

```xml
<dependency>
   <groupId>org.flywaydb</groupId>
   <artifactId>flyway-core</artifactId>
</dependency>
```

## TESTTEST

