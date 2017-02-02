package logic.persistance;

import com.google.gson.Gson;
import logic.map.GameLevel;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static java.awt.SystemColor.text;

/**
 * Created by npotocka on 02.02.17.
 */
public class Saver {

    public void saveMap(GameLevel map){
        Gson gson = new Gson();
        String serializedMap = gson.toJson(map);
        System.out.print(serializedMap);
        try{
            PrintWriter out = new PrintWriter( "map.json" );
            out.println(serializedMap);
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}
