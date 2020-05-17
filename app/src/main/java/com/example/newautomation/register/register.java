package com.example.newautomation.register;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.yashhomeautomation.MainActivity;
import com.example.yashhomeautomation.R;
import com.example.yashhomeautomation.ui.home.home;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class register extends AppCompatActivity {
    EditText mFullName, mEmail, mPassword, mPhone;
    Button mRegisterBtn;
    TextView mLoginBtn;

    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    ProgressBar ProgressBar;

    String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mFullName = findViewById(R.id.FullName);
        mEmail = findViewById(R.id.Email);
        mPassword = findViewById(R.id.Password);
        mPhone =findViewById(R.id.Phone);
        mRegisterBtn = findViewById(R.id.LoginBtn);
        mLoginBtn = findViewById(R.id.Login);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        ProgressBar = findViewById(R.id.ProgressBar);

        if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), home.class));
            finish();
        }
        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                final String fullName = mFullName.getText().toString().trim();
                final String Phone = mPhone.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email is Required.");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    mPassword.setError("Password is Required.");
                    return;
                }
                if(password.length() < 6){
                    mPassword.setError("Password must be greater then 6 characters");
                    return;
                }

                ProgressBar.setVisibility(View.VISIBLE);
                //register the user in firebase

                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(  new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            // send verification link

                            FirebaseUser fuser= fAuth.getCurrentUser();
                                fuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Toast.makeText(register.this, "Verification Email Has Been sent.", Toast.LENGTH_SHORT).show();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.d("TAG","ON Failure: Email Not Set" + e.getMessage());
                                }
                            });



                            Toast.makeText(register.this, "User Created.", Toast.LENGTH_SHORT).show();

                            // to upload the data to firebase cloud
                            userId = fAuth.getCurrentUser().getUid();
                            DocumentReference documentReference =  fStore.collection("Users").document(userId);
                            Map<String, Object> user = new HashMap<>();
                            user.put("FullName",fullName);
                            user.put("email",email);
                            user.put("Phone",Phone);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.d("Tag","On success: user profile created for"+ userId );
                                }
                            });

                            startActivity(new Intent(getApplicationContext(), home.class));
                        } else {
                            Toast.makeText(register.this, "Error !! "+ task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            ProgressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });
        mLoginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}
