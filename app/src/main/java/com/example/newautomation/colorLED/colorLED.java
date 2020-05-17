package com.example.newautomation.colorLED;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.yashhomeautomation.R;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.builder.ColorPickerClickListener;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class colorLED extends AppCompatActivity {
    private TextView txtColor;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String  userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_l_e_d);
        txtColor = (TextView) findViewById(R.id.txtColor);
        userId = fAuth.getInstance().getCurrentUser().getUid();
        color();


    }

    public void colorPicker(View view){
        color();

    }

    public void color(){
        ColorPickerDialogBuilder
                .with(this)
                .setTitle("Choose color")
                .wheelType(ColorPickerView.WHEEL_TYPE.CIRCLE)
                .density(3)
                .setOnColorSelectedListener(new OnColorSelectedListener() {
                    @Override
                    public void onColorSelected(int selectedColor) {
                        Log.d("DEBUG",String.valueOf(selectedColor));
                        Toast.makeText(colorLED.this, "onColourSelected: Ox" + Integer.toHexString(selectedColor), Toast.LENGTH_SHORT).show();
                        txtColor.setBackgroundColor(selectedColor);

                        //firebase realtime database
                        FirebaseDatabase database = FirebaseDatabase.getInstance();
                        DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                        myRef.child("LED_COLOR").setValue(Integer.toHexString(selectedColor));
                    }
                })
                .setPositiveButton("ok", new ColorPickerClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int selectedColor, Integer[] allColors) {
                        Log.d("DEBUG",String.valueOf(selectedColor));
                        Toast.makeText(colorLED.this, "onColourSelected: Ox" + Integer.toHexString(selectedColor), Toast.LENGTH_SHORT).show();
                        txtColor.setBackgroundColor(selectedColor);
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .build()
                .show();
    }
}
