

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDB_Connection {
    private static final String DATABASE_NAME = "restaurant";
    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static MongoDatabase database;

    private static void connect() {
        MongoClient mongoClient = MongoClients.create(CONNECTION_STRING);
        database = mongoClient.getDatabase(DATABASE_NAME);
    }

    public static MongoDatabase getDatabase() {
        if (database == null) {
            connect();
        }
        return database;
    }
}
