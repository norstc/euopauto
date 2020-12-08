# EUOP 自动测试

# 基本框架

基于maven的Java工程，pom.xml

使用Junit 4

```xml
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.1</version>

    </dependency>
```



testng

```xml
<dependency>
    	<groupId>org.testng</groupId>
    	<artifactId>testng</artifactId>
    	<version>6.14.3</version>
    </dependency>
```



log4j

```xml
<dependency>
    	<groupId>org.apache.logging.log4j</groupId>
    	<artifactId>log4j-api</artifactId>
    	<version>2.14.0</version>
    </dependency>
    <dependency>
    	<groupId>org.apache.logging.log4j</groupId>
    	<artifactId>log4j-core</artifactId>
    	<version>2.14.0</version>
    </dependency>
```



## 运行测试

指定测试用例

比如，指定执行 com.stt.euopauto.ActivityFeedbackServiceTest 里面的测试用例

```shell
java -cp .;.\config;.\euopauto-1.0.jar org.junit.runner.JUnitCore com.stt.euopauto.ActivityFeedbackServiceTest
```

