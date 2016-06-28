Android-Data-Scraper
=======================
This project grabs all details from android device like user detalis, sms, call logs, contacts and location. This information can be stored in 
application database and at the same time send to server also. When we uninstall this application from device (or) cleared data from 
application database data remain in server for our future usage.

Author & Contributors List
------------------------------
PurnaChandra.Tanikonda

Balakrishna.Karusala

This project is developed under the guidance of Vikash sir.

All rights of this project belongs to "Perfios Software Solutions Pvt. Ltd." 

##Prerequisities
--------------------------------
For Running this project in your local machine, you need to install these softwares

1.Android Studio

2.JRE and JVM with configuration atleast 1.8

3.MySQL Server

4.Apache Tomcat Server 8.0

5.Add these bulid paths to your System Environment Variables.

    * CATALINA_HOME C:\Program Files\Apache Software Foundation\Tomcat 8.0
    
    * CLASS_PATH C:\Program Files\Apache Software Foundation\Tomcat 8.0\lib\servlet-api.jar
    
    * JAVA_HOME C:\Program Files\Java\jdk1.8.0_91.
    
    * path C:\Program Files\Java\jdk1.8.0_91\bin.
    

##Directions
-----------------------------

**How to Run Android Project?**

In "./src/Android" directory you have all your android application code. For running this application code in your system, 
you need to install Android Studio tool. After Opening Android Studio tool in your system, open this application in your Android studio 
then you can run this application code and can do modifications also.

**How to create MySQL schema?**

In "./src/Sever/MySQL" directory you have all your MySQL code. For using MySQL, you need to install MySQL server in your system.
After installing you can use create database and tables by using given MySQL schema.

**How to use tomcat Server?**

In "./src/Sever/Tomcat" directory you have information about tomcat usage.

**How to connect MySQL database with http?**

In "./src/Sever/Java" directory you have all your servlet code. By using servlets, you can connect MySQL with http.

**How to send data to http?**

The android code it-self is having the code to send data to http. Referring that directory is sufficient.


