package m.fourg.ify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {

            try {
                Intent i = new Intent("android.intent.action.MAIN");
                i.setClassName("com.android.phone", "com.android.phone.settings.RadioInfo");
                startActivity(i);
                finish();
            } catch (Exception e) {
                android.widget.Toast.makeText(MainActivity.this, "Device not supported", Toast.LENGTH_SHORT).show();
            }
        }else{
            try{
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.setClassName("com.android.settings", "com.android.phone.settings.RadioInfo");
                startActivity(intent);
                finish();
            } catch(Exception e){
                Toast.makeText(getApplicationContext(), " Device not supported" , Toast.LENGTH_LONG).show();
            }
        }

    }
}