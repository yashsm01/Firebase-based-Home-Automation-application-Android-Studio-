package com.example.newautomation.room3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.newautomation.R;
import com.example.yashhomeautomation.R;
import com.example.yashhomeautomation.ui.room1.Flower;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class room3 extends AppCompatActivity {
    //Room2B1
    Button bulbBtnon21;
    Button bulbBtnoff21;
    ImageView BR1on;
    ImageView BR1off;
    //Room2B2
    Button bulbBtnon22;
    Button bulbBtnoff22;
    ImageView BR2on;
    ImageView BR2off;
    //Room2B3
    Button bulbBtnon23;
    Button bulbBtnoff23;
    ImageView BR3on;
    ImageView BR3off;
    //Room2F1
    Button fanBtnon21;
    Button fanBtnoff21;
    //Room1F2
    Button fanBtnon22;
    Button fanBtnoff22;

    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String  userId;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room1);
        userId = fAuth.getInstance().getCurrentUser().getUid();

        // create classes for equipments
        Bulb1();
        Bulb2();
        Bulb3();
        Fan1();
        Fan2();

    }








    public void Bulb1(){

        bulbBtnon21 = findViewById(R.id.bulbBtnon21);
        bulbBtnoff21 = findViewById(R.id.bulbBtnoff21);
        BR1on = findViewById(R.id.imageView10);
        BR1off = findViewById(R.id.imageView9);

        bulbBtnon21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();

                Flower newFlower = new Flower("ok","",10);
                bulbBtnoff21.setVisibility(View.VISIBLE);
                bulbBtnon21.setVisibility(View.INVISIBLE);
                BR1on.setVisibility(View.VISIBLE);
                BR1off.setVisibility(View.INVISIBLE);
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_BULB_1").setValue(1);;
            }
        });

        bulbBtnoff21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bulbBtnoff21.setVisibility(View.INVISIBLE);
                bulbBtnon21.setVisibility(View.VISIBLE);
                BR1on.setVisibility(View.INVISIBLE);
                BR1off.setVisibility(View.VISIBLE);
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_BULB_1").setValue(0);
            }
        });
    }

    public void Bulb2(){
        bulbBtnon22 = findViewById(R.id.bulbBtnon22);
        bulbBtnoff22 = findViewById(R.id.bulbBtnoff22);
        BR2on = findViewById(R.id.imageView11);
        BR2off = findViewById(R.id.imageView12);

        bulbBtnon22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bulbBtnoff22.setVisibility(View.VISIBLE);
                bulbBtnon22.setVisibility(View.INVISIBLE);
                BR2on.setVisibility(View.VISIBLE);
                BR2off.setVisibility(View.INVISIBLE);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_BULB_2").setValue(1);

            }
        });

        bulbBtnoff22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bulbBtnoff22.setVisibility(View.INVISIBLE);
                bulbBtnon22.setVisibility(View.VISIBLE);
                BR2on.setVisibility(View.INVISIBLE);
                BR2off.setVisibility(View.VISIBLE);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("ROOM1_BULB_2");//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_BULB_2").setValue(0);

            }
        });
    }

    public void Bulb3(){
        bulbBtnon23 = findViewById(R.id.bulbBtnon23);
        bulbBtnoff23 = findViewById(R.id.bulbBtnoff23);
        BR3on = findViewById(R.id.imageView15);
        BR3off = findViewById(R.id.imageView16);

        bulbBtnon23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bulbBtnoff23.setVisibility(View.VISIBLE);
                bulbBtnon23.setVisibility(View.INVISIBLE);
                BR3on.setVisibility(View.VISIBLE);
                BR3off.setVisibility(View.INVISIBLE);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_BULB_3").setValue(1);
            }
        });

        bulbBtnoff23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bulbBtnoff23.setVisibility(View.INVISIBLE);
                bulbBtnon23.setVisibility(View.VISIBLE);
                BR3on.setVisibility(View.INVISIBLE);
                BR3off.setVisibility(View.VISIBLE);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_BULB_3").setValue(0);
            }
        });
    }

    public void Fan1() {
        fanBtnon21 = findViewById(R.id.fanBtnoff21);
        fanBtnoff21 = findViewById(R.id.fanBtnon21);


        fanBtnon21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fanBtnoff21.setVisibility(View.VISIBLE);
                fanBtnon21.setVisibility(View.INVISIBLE);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_FAN_1").setValue(0);

            }
        });

        fanBtnoff21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fanBtnoff21.setVisibility(View.INVISIBLE);
                fanBtnon21.setVisibility(View.VISIBLE);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_FAN_1").setValue(1);

            }
        });
    }

    public void Fan2() {
        fanBtnon22 = findViewById(R.id.fanBtnoff22);
        fanBtnoff22 = findViewById(R.id.fanBtnon22);


        fanBtnon22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fanBtnoff22.setVisibility(View.VISIBLE);
                fanBtnon22.setVisibility(View.INVISIBLE);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_FAN_2").setValue(0);

            }
        });

        fanBtnoff22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fanBtnoff22.setVisibility(View.INVISIBLE);
                fanBtnon22.setVisibility(View.VISIBLE);
                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference(userId);//LED_STATUS is Firebase database LED_STATUS
                myRef.child("ROOM3_FAN_2").setValue(1);

            }
        });
    }
}

