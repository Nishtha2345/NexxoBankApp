<h1 align="center">My Bank App</h1>
<h2> Project Description </h2>
This is a normal sbt based Bank App Project .you can compile code with <b>sbt clean compile</b> and run it with <b>sbt run</b>, sbt console will start a Scala 3 REPL.This aplication runs on two servers and connect with the sql database.
<h2> Framework </h2><br>
1. Frontend - apache tomcat server 9.0.53<br>
2. Backend - Java PlayFramework <br>
3. Database -My Sql Workbench - 8.0 <br>
<h2>Installation</h2><br>
1.<a href=https:"//www.oracle.com/java/technologies/downloads/">JDK 1.8</a> - Download and Install JDK 1.8 and then set path of bin folder of JRE and paste in Environment Variables .<br>
2. <a href=https://www.scala-sbt.org/download.html">SBT 1.3.2</a> - Download and Install SBT 1.3.2 and then set path of bin folder and paste in Environment Variables . <br>
3.<a href=https://tomcat.apache.org/download-90.cgi">Apache Tomcat 9.0.53</a> - Download and Install Apache Tomcat and then set path of bin folder and paste in Environment Variables .Before run our project on console we need to start the apache web server .
<br>
4. <a href="https://www.jetbrains.com/idea/download/#section=windows">Intellij Idea</a> - Download and install Inteelij Idea and add plugins of Scala.<br>
5. <a href=https:"//www.dev.mysql.com/download/workbench/">My Sql Workbench</a> - Donload and Install it to work on Backend Process.<br>
<h2> IDE Support </h2>
Intellij Idea: Scala 3 comes built-in with IDE support, to try it out see IDE support for Scala 3 .<br>
<h2> How to use </h2>
1.<b>Admin DashBoard</b><br>
(i)Login as Admin can reach to Admin DashBoard.<br>
(ii)<b>Functinality</b><br>
- Registration : - Admin can Register the new user.<br>
- View List : - Admin can easily view the list of every user. which conatin customer all details with Transaction History. and can Activate and Deactivate the User.<br>
2.<b>Customer DashBoard</b><br>
(i)Login as Customer can reach to Customer DashBoard.<br>
(ii)<b>Functianlity</b><br>
- Withdraw : - Customer can withdraw the cash.<br>
- Deposit : - Customer can Deposit the cash.<br>
- Transaction History : - can view the Transaction History.<br>
<h2> How to Execute </h2><br>
1. Clone the project and save in saparate folder.<br>
2. Create database by the name "my_bank_app" and import database tables(saved in folder "my_bank_app") in workbench.<br>
3. Import the project (folder name in git project: bankappnew4) in Intellij Idea.<br>
4. Build the project using sbt. As the dependencies are added in build.sbt file, it will add external jar files in library(Like Ebean library, Json Library, ).<br>
5. Run the project using sbt.<br>
6. On the otherhand, save the other folder(folder name in git project: HTML Pages hosted on tomcat)in the webapps of Apache Tomcat.<br>
7. Run tomcat server and then HTML pages, starting from index.html page.<br>
