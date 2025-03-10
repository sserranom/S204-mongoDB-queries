

import org.bson.Document;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantDAO restaurantDAO = new RestaurantDAO();
        List<Document> restaurants = restaurantDAO.getAllRestaurants();

        System.out.println("1. Escribe una consulta para mostrar todos los documentos en la colección Restaurantes.");
        for (Document restaurant : restaurants) {
            System.out.println(restaurant.toJson());
        }

        System.out.println("\n 2. Escribe una consulta para mostrar restaurante_id, name, borough y cuisine para todos los documentos en la colección Restaurantes\n");

        restaurants = restaurantDAO.getIdNameBoroughCuisine();
        for (Document restaurant : restaurants){
            System.out.println(restaurant.toJson());
        }

        System.out.println("\n3. Escribe una consulta para mostrar restaurante_id, name, borough y cuisine, pero excluye el campo _id para todos los documentos en la colección Restaurantes.\n");
        restaurants = restaurantDAO.getNameBoroughCuisine();
        for(Document restaurant :  restaurants){
            System.out.println(restaurant.toJson());
        }

        System.out.println("\n4. Escribe una consulta para mostrar restaurant_id, name, borough y zip code, pero excluye el campo _id para todos los documentos en la colección Restaurantes.\n");
        restaurants = restaurantDAO.getAllRestaurantsWithZipCode();
        for(Document restaurant :  restaurants){
            System.out.println(restaurant.toJson());
        }
    }
}
