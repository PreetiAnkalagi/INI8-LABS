Prerequisites
Before you begin, ensure you have the following installed:

Java Development Kit (JDK) 8 or higher
Spring Tool Suite (STS) 4 or later
Node.js 12 or higher
npm (Node Package Manager) 6 or higher
Visual Studio Code (VS Code)
Setup Instructions
1. Clone the Repository
Clone the project repository from GitHub to your local machine:

copy the link
git clone https://github.com/PreetiAnkalagi/INI8-LABS.git
download the project and extract the files.

2. Backend Setup (Spring Boot)
Import the Project into STS
Open Spring Tool Suite (STS).
Navigate to File > Import....
Select Maven > Existing Maven Projects and click Next.
Browse to the cloned repository's directory and select it. Click Finish.
Running the Spring Boot Application
Once the project is imported, open the Application.java file (located in src/main/java/com/mvc/Application.java).
Right-click on the Application.java file and select Run As > Spring Boot App.
STS will start the Spring Boot application, and you should see log output indicating that the application has started successfully. By default, the backend server will run on http://localhost:8080.

3. Frontend Setup (React.js)
Install Dependencies
Open Visual Studio Code (VS Code).
Open the frontend project folder (located in frontend or similar).
Open a terminal in VS Code and run the following command to install dependencies:
copy the command
npm install
open frontend folder in vscode 
install all the commands
npm i  
npm i axios 
npm install react-router-dom
npm install react-hook-form react-toastify bootstrap      

Running the React Application
In the VS Code terminal, navigate to the frontend project directory (if not already there).
Run the following command to start the React development server:
copy the command
npm start

The React application should open in your default web browser at http://localhost:3000.

4. Install MYSQL and Create a DATABASE with name : employeedb.

5. Integration and Testing
Ensure both the backend and frontend servers are running.
Open http://localhost:3000 in your web browser to interact with the React frontend, which should communicate with the Spring Boot backend.
Additional Configurations
Backend Configuration
You can configure various properties of the Spring Boot application by editing the application.properties or application.yml file located in the src/main/resources directory. Common configurations include database settings, server port, and logging levels.

Frontend Configuration
Environment-specific configurations for the React application can be set in the .env file in the frontend directory. For example, to set the API base URL:

copy the command
REACT_APP_API_BASE_URL=http://localhost:8080/api

Troubleshooting
Common Issues
Backend
Port Already in Use: If the default port 8080 is already in use, you can change the port by adding server.port=8081 (or any other port) to the application.properties file.
Dependency Issues: Ensure that all dependencies are correctly specified in the pom.xml file. Run mvn clean install to resolve dependencies.

Frontend
Port Already in Use: If the default port 3000 is already in use, you can change the port by adding a .env file with the following content:
makefile
Copy code
PORT=3001
Dependency Issues: Ensure that all dependencies are installed by running npm install.
Logs
Backend
Application logs can be found in the console output when running the application through STS. You can also configure file-based logging through the application.properties file.

Frontend
Logs for the React application will appear in the terminal where npm start was executed and in the browser's developer console.
