package MongoDb.Example01;

import java.util.Iterator;

import org.bson.Document;
import org.slf4j.LoggerFactory;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;

public class InsertDocumentsToCollection {

	public static void main(String[] args) {

		LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
		Logger rootLogger = loggerContext.getLogger("org.mongodb.driver");
		rootLogger.setLevel(Level.OFF);
		
		// Creating a Mongo client
		MongoClient mongo = new MongoClient("localhost", 27017);
		MongoDatabase database = mongo.getDatabase("myblogs8");
		MongoCollection<Document> collection = database.getCollection("SampleCollection10");
		System.out.println("Collection sampleCollection01 selected successfully");

		// Inserting a Document in a collection
		/*Document document = new Document("id", 1).append("Name", "NPN Training")
				.append("description", "BigData Training Institute").append("URL", "www.some.com")
				.append("by", "sw");
		collection.insertOne(document);
		System.out.println("Document inserted successfully");*/

		// Retreving a Documents from a Collection
		System.out.println("Retreving the Documents in the Collections");
		FindIterable<Document> iterDoc = collection.find();
		Iterator it = iterDoc.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		mongo.close();
	}

}
