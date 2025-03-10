

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Projections;
import org.bson.Document;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class RestaurantDAO {

    private static final MongoDatabase database = MongoDB_Connection.getDatabase();
    private static final MongoCollection<Document> collection = database.getCollection("restaurant");

    public List<Document> getAllRestaurants() {
        List<Document> restaurant = new ArrayList<>();
        FindIterable<Document> iterable = collection.find();
        iterable.into(restaurant);
        return restaurant;
    }

    public List<Document> getIdNameBoroughCuisine(){
        List<Document> restaurant = new ArrayList<>();

        FindIterable<Document> iterable = collection.find()
                .projection(Projections.fields(
                        Projections.include("restaurant_id", "name", "borough", "cuisine")
                ));

        iterable.into(restaurant);
        return restaurant;
    }

    public List<Document> getNameBoroughCuisine(){
        List<Document> restaurant = new ArrayList<>();

        FindIterable<Document> iterable = collection.find()
                .projection(Projections.fields(
                        Projections.include("restaurant_id", "name", "borough", "cuisine"),
                        Projections.excludeId()
                ));

        iterable.into(restaurant);
        return restaurant;
    }

    public List<Document> getAllRestaurantsWithZipCode() {
        List<Document> restaurant = new ArrayList<>();

        FindIterable<Document> iterable = collection.find()
                .projection(Projections.fields(
                        Projections.include("restaurant_id", "name", "borough", "address.zipcode"),
                        Projections.excludeId()
                ));

        iterable.into(restaurant);
        return restaurant;
    }


}

