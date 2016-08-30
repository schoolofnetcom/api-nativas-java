package com.schoolofnet;

import com.schoolofnet.default_code.Default;
import com.schoolofnet.private_code.Private;
import com.schoolofnet.proctected_code.Protected;
import com.schoolofnet.public_code.Public;

import java.io.*;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Leonan");
        map.put(1, "Luiz");
        map.put(2, "Wesley");

        System.out.println(map.toString());
        System.out.println(map.values());

        map.

//        List<String> list = new ArrayList<String>();
//
//        list.add("Leonan");
//        list.add("Luiz");
//        list.add(2, "Wesley");

//        File file;
//        FileOutputStream fop = null;
//        FileInputStream fis = null;
//        BufferedReader br = null;
//        BufferedInputStream bis = null;
//
//        try {
//             file = new File("test.txt");
//
//            if (file.createNewFile()){
//                System.out.println("File is created!");
//            } else {
//                System.out.println("File already exists.");
//            }
//
//            fop = new FileOutputStream(file);
//
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//
//            String text = "Hello. My name is Leonan and I'm working at School of net";
//
//            byte[] textBytes = text.getBytes();
//
//            fop.write(textBytes);
//            fop.flush();
//            fop.close();
//
//            System.out.println("Done");
//            System.out.println("Preparing to read...");
//
//            fis = new FileInputStream(file);
//            bis = new BufferedInputStream(fis);
//            DataInputStream dis = new DataInputStream(bis);
//
//            while(dis.available() != 0) {
//                System.out.println(dis.readLine());
//            }
//
//            fis.close();
//            bis.close();
//            dis.close();
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }

//        try {
//            String currentLine;
//
//            br = new BufferedReader(new FileReader("test.txt"));
//
//            while((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//
//            if (br !=  null) {
//                br.close();
//            }
//
//        } catch(IOException ex1) {
//            ex1.printStackTrace();
//        }


//        Integer one = 0;
//        int     two = 0;
//
//        Double d1 = 0.0;
//
//        String str = d1.toString();
//
//        Class<Public> obj = Public.class;
//
//        if (obj.isAnnotationPresent(Info.class)) {
//            Annotation annotation = obj.getAnnotation(Info.class);
//            Info info = (Info) annotation;
//
//
//            System.out.println(info.createdBy());
//        }

//        Object obj = new Object();
//        Public publicCode = new Public();
//
//        System.out.println(obj.toString());
//        System.out.println(publicCode.toString());

        System.out.println( "Hello World!" );
    }
}
