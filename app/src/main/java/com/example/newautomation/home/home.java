package com.example.newautomation.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yashhomeautomation.MainActivity;
import com.example.yashhomeautomation.R;
import com.example.yashhomeautomation.ui.colorLED.colorLED;
import com.example.yashhomeautomation.ui.room1.room1;
import com.example.yashhomeautomation.ui.room2.room2;
import com.example.yashhomeautomation.ui.room3.room3;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

public class home extends AppCompatActivity {
    Button resendCode;
    TextView verifyMsg,fullName,email,phone;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fullName =findViewById(R.id.UserName);
        phone = findViewById(R.id.UserNumber);
        email = findViewById(R.id.UserEmail);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        resendCode = findViewById(R.id.resendcode);
        verifyMsg = findViewById(R.id.veriedMsg);
        userId = fAuth.getCurrentUser().getUid();

        final DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                phone.setText(documentSnapshot.getString("Phone"));
                email.setText(documentSnapshot.getString("email"));
                fullName.setText(documentSnapshot.getString("FullName"));
            }
        });
        final FirebaseUser user = fAuth.getCurrentUser();

        if(!user.isEmailVerified()){
            resendCode.setVisibility(View.VISIBLE);
            verifyMsg.setVisibility(View.VISIBLE);

            resendCode.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(final View v) {

                    user.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(v.getContext(), "Verification Email Has Been sent.", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d("TAG","ON Failure: Email Not Set" + e.getMessage());
                        }
                    });


                }
            });

        }

    }

    public void room1(View view){
        Intent intent = new Intent(this, room1.class);
        startActivity(intent);
    }

    public void room2(View view){
        Intent intent = new Intent(this, room2.class);
        startActivity(intent);
    }

    public void room3(View view){
        Intent intent = new Intent(this, room3.class);
        startActivity(intent);
    }

    public void room4(View view){
        Intent intent = new Intent(this, room3.class);
        startActivity(intent);
    }

    public void room5(View view){
        Intent intent = new Intent(this, room3.class);
        startActivity(intent);
    }

    public void colorLed(View view){
        Intent intent = new Intent(this, colorLED.class);
        startActivity(intent);
    }

    public void logoutBtn(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }



}



