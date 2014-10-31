package com.raionstudio.tukarscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by hanas on 31/10/2014.
 */
public class SecondScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activityYangManggil=getIntent();

        String previousActivity=activityYangManggil.getExtras().getString("panggilActivity");

        TextView callingActivityMessage=(TextView) findViewById(R.id.calling_activity_info_text_view);

        callingActivityMessage.append(" "+previousActivity);
    }

    public void onSendUsername(View view) {
        EditText userNameET=(EditText) findViewById(R.id.users_name_edit_text);
        String usersName=String.valueOf(userNameET.getText());

        Intent goingBack=new Intent();
        goingBack.putExtra("usersName",usersName);
        setResult(RESULT_OK,goingBack);
        finish();

    }
}
