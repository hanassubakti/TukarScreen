package com.raionstudio.tukarscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public void onGetNameClick(View view) {
        //Intent getNameScreenIntent=new Intent(this, SecondScreen.class);

        final  int result=1;

        //getNameScreenIntent.putExtra("panggilActivity","MainActivity");

        Human arik=new Human(6.25,186,"Arika");
        Intent sendArik=new Intent(this,SecondScreen.class);
        sendArik.putExtra("humanSend",arik);
        startActivityForResult(sendArik,result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView userNameData=(TextView) findViewById(R.id.users_name_mesage);

        String nameSentBack=data.getStringExtra("usersName");
        userNameData.append(nameSentBack);

    }
}
