package proyectodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CConexion {

    public MongoClient crearConexion() {
        MongoClient mongo = null;
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";

        try {
            MongoClientURI uri = new MongoClientURI(connectionString);
            mongo = new MongoClient(uri);

            MongoDatabase testDB = mongo.getDatabase("test");
            List<String> nombresColecciones = new ArrayList<>();
            for (String name : testDB.listCollectionNames()) {
                nombresColecciones.add(name);
            }

            System.out.println("Colecciones en la base de datos Test: " + nombresColecciones.toString());
        } catch (MongoException e) {
            System.out.println("Error, no se pudo conectar a MongoDB");
        }

        return mongo;
    }
}
