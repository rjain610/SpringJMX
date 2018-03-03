# SpringJMX
Basic code sample of Spring JMX 

JMX is Java Management Extension used to monitor and invoke operation at runtime without need to restart the server or application.
JMX exposes beans that can be monitored via JConcsole, VisualVM etc.

This is getting started demo of Spring JMX using 2 approaches :
1.Basic Approach - (com.rahul.springjmx.services.SimpleAttributeBasedMBean)
2.MethodBasedInfoAssembler (com.rahul.springjmx.services.SimpleAttributeBasedMBean)

The beans are defined in XML file, but can also be defined in Java based configuration.

Steps to run : 
1.Build the project and run the application in Tomcat 7+
2.Open Jconsole({yourJDKfolder}/bin/jconsole) , and choose the process which corresponds to the applcation.
3.Click on "Connect" and then "Insecure application".
4.The JConsole dashboard show's the JVM info , click on the MBeans tabs (at the last).
5.At the left side you can see all the processes which are exposed to Mbeans, click on the process "com.rahul.springjmx".
6.You ccan see all the attributes and operations on the right side. 
7.Try changing the value of any attribute and check.
Note : for (com.rahul.springjmx.services.SimpleAttributeBasedMBean) you could see only one method (Operation) as it is defined explcitly in spring-config file.

For More Info on Spring JMX
https://docs.spring.io/autorepo/docs/spring/3.2.x/spring-framework-reference/html/jmx.html

Video:
https://www.youtube.com/watch?v=XBYsHEW_Bk8&list=PL0InTsaSKz2nmbIMAGEfM9JRjaEjaSeMT&index=1

For Info on JMX
https://www.youtube.com/watch?v=aKGYa6Y9r60
