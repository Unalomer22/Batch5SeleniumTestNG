package com.eurotech.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

        private ConfigurationReader(){

        }

        private static Properties properties;

        static {

            try {
                // What file to read
                String path = "configuration.properties";
                // read the file into java, finds the file using the string path
                FileInputStream input = new FileInputStream("configuration.properties");
                // propeties --> class that store properties in key/ value format
                properties = new Properties();
                // the values from the file input is load / fed in to the properties object
                properties.load(input);

                input.close();
            } catch (Exception e) {
                e.printStackTrace();
               // System.out.println("Could not read config file");
            }
        }

        public static String get(String keyName) {

            return properties.getProperty(keyName);
        }

    }


