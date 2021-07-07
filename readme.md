# 自动测试框架
一个基于maven的java工程，
所有的测试代码都作为项目主代码，放到 src/main/java下
src/test/java这个下面暂时不放任何代码，以后可以用来作为测试框架的简单验证，比如环境依赖库的检验，selenium，java jdk，

## 测试环境构建

### 操作系统：windows

本测试主要用于端到端验证，用户验收，所以不需要在linux环境上执行



### 代码仓库：git

本地仓库：

远端仓库：



### 构建和部署工具：jenkins

使用本地安装jenkins的方式，在windows环境下执行



### 网页服务器：apache

主要用来展示testng执行时的输出结果

后续也可以做定制报告的展示页面

还有就是项目帮助文档的展示



### 数据库：mysql

主要用来做测试数据存储和测试日志的收集



## 基本框架

基于maven的Java工程，pom.xml

使用Junit 4==》 取消了，全部改为testng

### testng

```xml
 <!-- testng -->
    <dependency>
    	<groupId>org.testng</groupId>
    	<artifactId>testng</artifactId>
    	<version>7.3.0</version>
    </dependency>
```

测试驱动，所有的测试用例通过testng.xml来管理，执行

### selenium



```xml
    <dependency>
    	<groupId>org.seleniumhq.selenium</groupId>
    	<artifactId>selenium-java</artifactId>
    	<version>3.12.0</version>
    </dependency>
```

浏览器驱动，模拟用户点击，进行ui测试

### log4j

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

日志记录





## 测试内容

### 功能测试

#### 用户管理

登录

查询

#### 模板管理

查询

#### 栏目管理

查询

#### 物料管理

查询

#### 发布管理

查询

#### 统计分析

查询

#### 触点管理

查询



### 接口测试

#### 管理类接口



#### 服务类接口

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



### 性能测试



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





## 常见问题及回答

1、测试代码与被测代码放在哪里合适？

单元测试代码可以考虑与被测代码分开放置，最主要的原因就是单元测试代码通常不需要交付和部署，对于软件管理要求高的可以考虑放在一起，这样有利于贯彻执行测试驱动开发理念，也可以督促开发人员同步编写单元测试，对于软件管理能力差的，建议分开放置，分别维护，甚至不维护单元测试代码。

集成测试代码和验收测试代码建议与被测代码一起，同时部署和交付到用户环境。单元测试没有时间写也就算了，这个再不写那交付的产品质量是啥样就很难说了。



