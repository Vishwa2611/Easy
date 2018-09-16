package one.com.secondapplication.utils;

import android.app.usage.ExternalStorageStats;
import android.os.Environment;

import java.io.File;
import java.util.Arrays;

public class FileUtils {

    final String directoryName = "pro";

    public static boolean checkConfFile(){
        return true;
    }

    public static boolean createConfFile(){
        File dir = new File(Environment.getRootDirectory().getAbsolutePath() + "/");

        File[] f = dir.listFiles();

        System.out.println(Arrays.toString(f));


        for(File file:f)
        {
            if(file.getName().equals("sdacard0"))
            {
                if(file.isDirectory())
                {
                    f = file.listFiles();
                }
            }
        }

        return true;
    }


}
