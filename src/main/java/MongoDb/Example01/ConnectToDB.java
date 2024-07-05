package MongoDb.Example01;

import org.slf4j.LoggerFactory;
import com.mongodb.MongoClient;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

public class ConnectToDB {

	public static void main(String args[]) {

		LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
		Logger rootLogger = loggerContext.getLogger("org.mongodb.driver");
		rootLogger.setLevel(Level.OFF);
		// Creating a Mongo client
		MongoClient mongo = new MongoClient("localhost", 27017);
		System.out.println("Connected to Mongo Instance");

		// Creating or selecting a Database
		mongo.getDatabase("myblogs8");
		System.out.println("Connected to the Myblogs database successfully");
		
		//Closing the Mongo Connection
		mongo.close();
	}
}