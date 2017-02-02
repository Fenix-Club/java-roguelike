package logic.persistance;

import com.google.gson.Gson;
import logic.map.GameLevel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

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
    public GameLevel LoadMap(){
        File inputfile = new File("map.json");
        Scanner scan = null;
        try {
            scan = new Scanner(inputfile);

        }catch (FileNotFoundException e){}
        String map = scan.nextLine();
        Gson gson = new Gson();
        return gson.fromJson(map,GameLevel.class);
    }
}
