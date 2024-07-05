package MongoDb.Example01;

import org.slf4j.LoggerFactory;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

public class CreatingCollection {

	public static void main(String[] args) {

		LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
		Logger rootLogger = loggerContext.getLogger("org.mongodb.driver");
		rootLogger.setLevel(Level.OFF);
		
		MongoClient mongo = new MongoClient("localhost", 27017);
		MongoDatabase database = mongo.getDatabase("myblogs8");
		System.out.println("Myblogs database Selected");

		// Creating a Collection
		database.createCollection("sampleCollection10");
		System.out.println("Collection sampleCollection01 created successfully");

		// Listing all the Collections in selected Database
		for (String name : database.listCollectionNames()) {
			System.out.println(name);
		}
		
		//closing mongo client connection
		mongo.close();

	}

}
