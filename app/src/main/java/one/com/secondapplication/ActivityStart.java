package one.com.secondapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import one.com.secondapplication.utils.FileUtils;

public class ActivityStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.demo_login);

        FileUtils.createConfFile();

        if(FileUtils.checkConfFile()){
            Log.i("File Found","Logged in Successfully");
            Intent profileIntent = new Intent(this,ProfileActivity.class);
            startActivity(profileIntent);
        }

    }
}
