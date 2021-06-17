# 自动测试框架

## 测试环境构建

### 代码仓库：git



### 构建和部署工具：jenkins



### 数据库：mysql



## 基本框架

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





## 测试内容

### 功能测试



### 接口测试



* 一级iop实时查询接口
* 省级IOP实时查询接口
* IOP直通实时查询接口
* 一级iop批量实时查询接口
* 省IOP批量实时查询接口
* 商城套餐SKU推荐实时查询接口
* IOP直通批量推荐实时查询接口
* 事件营销触发实时查询接口
* 消息单发实时接口
* 消息群发实时接口
* 任务取消实时接口
* 短信单发实时接口
* 短信群发实时接口



## 运行测试

### junit



在项目目录下

E:\zjh\work\eclipse-ws-oxigen\euopauto>

运行所有用例

直接指向main类App

```shell
java -cp .;.\config;.\target\euopauto-1.0.jar com.stt.euopauto.App
```





指定测试用例

比如，指定执行 com.stt.euopauto.ActivityFeedbackServiceTest 里面的测试用例

```shell
java -cp .;.\config;.\target\euopauto-1.0.jar org.junit.runner.JUnitCore com.stt.euopauto.ActivityFeedbackServiceTest
```



### testng

在E:\zjh\work\eclipse-ws-oxigen\euopauto\config\testsuite_user.xml

```xml
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="User managerment">
	<test name = "User Test">
		<classes>
			<class name = "com.stt.euopauto.EuopTestng" />
		</classes>	
	</test>
</suite>
```



C:\Users\Administrator\.m2\repository\org\testng\testng\7.3.0\testng-7.3.0.jar

在项目目录下执行E:\zjh\work\eclipse-ws-oxigen\euopauto>

```shell
java -cp ".:.\config:C:\Users\Administrator\.m2\repository\org\testng\testng\7.3.0\testng-7.3.0.jar"  org.testng.TestNg .\config\testsuite_user.xml
```



eclipse下

右键入口文件App.java  run as java application



构建程序后，打包出一个jar文件, 需要在testng.xml所在目录执行

java -jar filename.jar
