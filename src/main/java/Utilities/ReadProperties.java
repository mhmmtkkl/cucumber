package Utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    public static String getData(String whichData){

        String path ="GlobalVariables.properteis";

        String result = null;

        try{
            InputStream input = new FileInputStream(path);

            Properties prop = new Properties();

            prop.load(input);

            result = prop.getProperty(whichData);

        }catch(Exception e ){

        }

        return result;
    }

}
