# ACS_Email_Java_Implementation_Windows
## Implementation of Email with ACS in Java

### Java JDK installation process

1. Go to the <a href = "https://adoptium.net/temurin/releases/?version=8"> Adoptium JDK website </a> and download JDK 8 msi installer for Windows.

![image](https://user-images.githubusercontent.com/116783776/200309166-0c12a701-5eec-419a-92f3-015593aaf9e0.png)

2. Install the JDK with the configuration shown in the below image.

![image](https://user-images.githubusercontent.com/116783776/200309503-f4040ded-c34a-4125-ba78-fc615a908695.png)

3. Now open a new window of Command Prompt and run the command "java -version" and followed by "javac -version". If there are no errors in the output, and the version number is being shown in the output, then Java installation is successful. 

![image](https://user-images.githubusercontent.com/116783776/200311132-950ff90d-7fdd-41d7-ac65-02b8e54bd5ad.png)


### Maven Installation Process

1. Go to the <a href = "https://maven.apache.org/download.cgi"> Apache Maven website </a> and download the Binary Zip Archive of Apache Maven.

![image](https://user-images.githubusercontent.com/116783776/200312520-646b5738-e7c7-4927-872c-5d6be4f82c0a.png)

2. Extract the compressed folder and copy the path upto the "bin" folder.

![image](https://user-images.githubusercontent.com/116783776/200313291-d4248c1e-6b69-4387-aed0-374f74c2a2ca.png)

3. Now go to "Start" and search for "Edit the environment variables" and click on "Environment Variables".

![image](https://user-images.githubusercontent.com/116783776/200313806-98cccf24-68ba-42bf-979a-338e79d3bf82.png)

4. Now, under "System variables", click on "Path" followed by "Edit". Now, click "New", and paste the path that was copied. Click "Ok" and close.

![image](https://user-images.githubusercontent.com/116783776/200314478-67e7b1b7-1c48-471b-953e-f7b712c879ee.png)

5. Now open a new window of Command Prompt and run the command "mvn --version". If there are no errors in the output, and the version number is being shown in the output, then Maven installation is successful. 

![image](https://user-images.githubusercontent.com/116783776/200314876-275a7acc-e102-4699-a18c-6063b281cc98.png)

### Creating Azure Communication Service Resource.

1. Go to <a href = "https://portal.azure.com/"> Azure Portal </a> and search for "Communication Services" and select it.

![image](https://user-images.githubusercontent.com/116783776/200759178-d0a78bca-f02d-412f-8d13-268facb31642.png)

2. Click on "Create", select the "Subscription", "Resource Group", "Resource Name" and the "Data Location", then click "Review + Create".

![image](https://user-images.githubusercontent.com/116783776/200759708-da1c9099-9552-414a-bc15-ebe16bd30db0.png)

3. After creating, go to the resource and then go to "Keys" under "Settings" and keep note of the "Endpoint", "Connection string", and "Key".

![image](https://user-images.githubusercontent.com/116783776/200760257-7493e9ac-fc27-481f-a4ec-0992137ceead.png)

![image](https://user-images.githubusercontent.com/116783776/200760360-a2f91a4f-e574-4cb2-9502-c3c346fdaf7c.png)


### Creating Email Communication Services

1. Go to <a href = "https://portal.azure.com/"> Azure Portal </a> and search for "Email Communication Services" and select it.

![image](https://user-images.githubusercontent.com/116783776/200763427-b0beb384-43b2-473e-ab42-ac89229196d5.png)

2. Click on "Create", select the "Subscription", "Resource Group", "Resource Name", "Region" and the "Data Location", then click "Review + Create".

![image](https://user-images.githubusercontent.com/116783776/200763988-e4d2aa16-8427-4331-be01-c54e1533eb96.png)

3. After creating, go to the resource and then go to "Provision Domains" under "Settings".

![image](https://user-images.githubusercontent.com/116783776/200765147-34e0a481-39d3-446c-8fd6-7acf225fd93e.png)

4. Click on "Add domain" and choose the domain setup according to preference.

![image](https://user-images.githubusercontent.com/116783776/200765339-2f2c4907-6ba8-46cc-a4df-0721af996c94.png)

5. Now go back to the Communication Service that was created. Under "Email", click on "Domains".

![image](https://user-images.githubusercontent.com/116783776/200765667-4d4e86f8-1585-4430-a2ed-503953a53e59.png)

6. Now click on "Connect Domain", and select the domain which was set on the Email Communication Service.

![image](https://user-images.githubusercontent.com/116783776/200766247-3eef358d-8b54-41a8-a809-309f47d06c7a.png)



