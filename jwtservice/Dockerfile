# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim 

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR (change 'your-application.jar' to the actual name of your JAR file)
COPY target/jwtservice-0.0.1-SNAPSHOT.jar /app/jwtservice-0.0.1-SNAPSHOT.jar

# Expose the port the app runs on
EXPOSE 8080

# Specify the command to run on container startup
CMD ["java", "-jar", "jwtservice-0.0.1-SNAPSHOT.jar"]
