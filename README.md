# Firebase-based-Home-Automation-application-Android-Studio-
Through this home automation application we can access our appliances with one click where internet or Wi-Fi feasibility available.

for regisreation with use of firebase:-
cheak out  my last reposetory 

    https://github.com/yashsm01/google-cloud-Firebase---user-registration-.git
    
creat firebase id:- 

     android studio > Tools > Firebase > Authentication > create your project.

1.Add menifest for Internet

    <uses-permission android:name="android.permission.INTERNET" />

2.create new empty activity 

XML:-

          <?xml version="1.0" encoding="utf-8"?>
      <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:app="http://schemas.android.com/apk/res-auto"
          xmlns:tools="http://schemas.android.com/tools"
          android:id="@+id/layout"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          android:background="@drawable/background"
          android:layout_centerVertical="true"
          android:visibility="visible"
          tools:context=".ui.home.home">

          <ScrollView
              android:id="@+id/scrollView2"
              android:layout_width="0dp"
              android:layout_height="722dp"
              android:layout_alignParentStart="true"
              android:layout_alignParentTop="true"
              android:layout_alignParentEnd="true"
              android:layout_alignParentBottom="true"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toTopOf="parent">

              <LinearLayout
                  android:layout_width="match_parent"
                  android:layout_height="wrap_content"
                  android:orientation="vertical">

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="714dp">

                      <Button
                          android:id="@+id/button3"
                          android:layout_width="157dp"
                          android:layout_height="147dp"
                          android:layout_marginStart="28dp"
                          android:layout_marginTop="90dp"
                          android:background="@drawable/room1"
                          android:onClick="room1"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="0.06" />

                      <Button
                          android:id="@+id/button8"
                          android:layout_width="157dp"
                          android:layout_height="147dp"
                          android:layout_marginTop="30dp"
                          android:layout_marginEnd="30dp"
                          android:background="@drawable/color11"
                          android:onClick="colorLed"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintTop_toBottomOf="@+id/button6" />

                      <Button
                          android:id="@+id/button4"
                          android:layout_width="157dp"
                          android:layout_height="147dp"
                          android:layout_marginStart="30dp"
                          android:layout_marginTop="120dp"
                          android:layout_marginEnd="30dp"
                          android:background="@drawable/room2"
                          android:onClick="room2"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="1.0"
                          app:layout_constraintStart_toEndOf="@+id/button3"
                          app:layout_constraintTop_toTopOf="parent" />

                      <Button
                          android:id="@+id/button5"
                          android:layout_width="157dp"
                          android:layout_height="147dp"
                          android:layout_marginStart="30dp"
                          android:layout_marginTop="30dp"
                          android:background="@drawable/room3"
                          android:onClick="room3"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toBottomOf="@+id/button3" />

                      <Button
                          android:id="@+id/button6"
                          android:layout_width="157dp"
                          android:layout_height="147dp"
                          android:layout_marginTop="30dp"
                          android:layout_marginEnd="30dp"
                          android:background="@drawable/room4"
                          android:onClick="room4"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="1.0"
                          app:layout_constraintStart_toEndOf="@+id/button5"
                          app:layout_constraintTop_toBottomOf="@+id/button4" />

                      <Button
                          android:id="@+id/button7"
                          android:layout_width="157dp"
                          android:layout_height="147dp"
                          android:layout_marginStart="30dp"
                          android:layout_marginTop="30dp"
                          android:background="@drawable/room5"
                          android:onClick="room5"
                          app:layout_constraintEnd_toStartOf="@+id/button8"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toBottomOf="@+id/button5" />

                      <TextView
                          android:id="@+id/UserName"
                          android:layout_width="0dp"
                          android:layout_height="25dp"
                          android:layout_marginStart="16dp"
                          android:layout_marginTop="16dp"
                          android:layout_marginEnd="16dp"
                          android:textColor="#FFFFFF"
                          android:textColorHighlight="#FAF2F2"
                          android:textColorHint="#F8F5F5"
                          android:textColorLink="#FFFFFF"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="1.0"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent" />

                      <TextView
                          android:id="@+id/UserNumber"
                          android:layout_width="0dp"
                          android:layout_height="20dp"
                          android:layout_marginStart="16dp"
                          android:layout_marginEnd="16dp"
                          android:textColor="#FFFFFF"
                          android:textColorHighlight="#FFFCFC"
                          android:textColorHint="#FFFFFF"
                          android:textColorLink="#F6E9E9"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toBottomOf="@+id/UserName" />

                      <TextView
                          android:id="@+id/UserEmail"
                          android:layout_width="0dp"
                          android:layout_height="20dp"
                          android:layout_marginStart="16dp"
                          android:layout_marginTop="8dp"
                          android:layout_marginEnd="16dp"
                          android:textColor="#FFFFFF"
                          android:textColorHighlight="#FFFFFF"
                          android:textColorHint="#FFFFFF"
                          android:textColorLink="#FAFAFA"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toBottomOf="@+id/UserNumber" />

                      <Button
                          android:id="@+id/logoutBtn"
                          android:layout_width="0dp"
                          android:layout_height="wrap_content"
                          android:layout_marginStart="16dp"
                          android:layout_marginTop="16dp"
                          android:layout_marginEnd="16dp"
                          android:background="@drawable/logout1"
                          android:onClick="logoutBtn"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toBottomOf="@+id/button8" />
                  </androidx.constraintlayout.widget.ConstraintLayout>

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="190dp">

                      <TextView
                          android:id="@+id/veriedMsg"
                          android:layout_width="wrap_content"
                          android:layout_height="wrap_content"
                          android:text="check out your Email"
                          android:textColor="@android:color/holo_red_dark"
                          android:visibility="invisible"
                          app:layout_constraintBottom_toTopOf="@+id/resendcode"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent" />

                      <Button
                          android:id="@+id/resendcode"
                          android:layout_width="wrap_content"
                          android:layout_height="wrap_content"
                          android:layout_marginBottom="96dp"
                          android:background="@drawable/verify"
                          android:visibility="invisible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.502"
                          app:layout_constraintStart_toStartOf="parent" />
                  </androidx.constraintlayout.widget.ConstraintLayout>
              </LinearLayout>
          </ScrollView>

      </androidx.constraintlayout.widget.ConstraintLayout>

java program:-

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

3.Create one or more new activity for your appliances 
XML Code:-

      <?xml version="1.0" encoding="utf-8"?>
      <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
          xmlns:app="http://schemas.android.com/apk/res-auto"
          xmlns:tools="http://schemas.android.com/tools"
          android:layout_width="match_parent"
          android:layout_height="match_parent"
          android:background="@android:color/background_light"
          tools:context=".ui.room1.room1">


          <ScrollView
              android:layout_width="match_parent"
              android:layout_height="match_parent"
              android:layout_below="@+id/textView2"
              android:layout_marginTop="-1dp"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintHorizontal_bias="1.0"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toBottomOf="parent"
              app:layout_constraintVertical_bias="0.0">


              <LinearLayout
                  android:layout_width="match_parent"
                  android:layout_height="910dp"
                  android:orientation="vertical">

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="130dp">

                      <Button
                          android:id="@+id/bulbBtnoff21"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/black"
                          android:text="@string/OFF"
                          android:textColor="#03A9F4"
                          android:textSize="36sp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView10"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0" />

                      <Button
                          android:id="@+id/bulbBtnon21"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/holo_blue_light"
                          android:text="@string/ON"
                          android:textSize="36sp"
                          android:visibility="visible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView10"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="0.368" />

                      <ImageView
                          android:id="@+id/imageView10"
                          android:layout_width="125dp"
                          android:layout_height="128dp"
                          android:visibility="invisible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:srcCompat="@drawable/bulbon" />

                      <ImageView
                          android:id="@+id/imageView9"
                          android:layout_width="120dp"
                          android:layout_height="109dp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0"
                          app:srcCompat="@drawable/builoff" />
                  </androidx.constraintlayout.widget.ConstraintLayout>

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="130dp">

                      <Button
                          android:id="@+id/bulbBtnoff22"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/black"
                          android:text="@string/OFF"
                          android:textColor="#03A9F4"
                          android:textSize="36sp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView11"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0" />

                      <Button
                          android:id="@+id/bulbBtnon22"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/holo_blue_light"
                          android:text="@string/ON"
                          android:textSize="36sp"
                          android:visibility="visible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView11"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="0.368" />

                      <ImageView
                          android:id="@+id/imageView11"
                          android:layout_width="125dp"
                          android:layout_height="128dp"
                          android:visibility="invisible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:srcCompat="@drawable/bulbon" />

                      <ImageView
                          android:id="@+id/imageView12"
                          android:layout_width="120dp"
                          android:layout_height="109dp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0"
                          app:srcCompat="@drawable/builoff" />
                  </androidx.constraintlayout.widget.ConstraintLayout>

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="130dp">


                      <ImageView
                          android:id="@+id/imageView15"
                          android:layout_width="125dp"
                          android:layout_height="128dp"
                          android:visibility="invisible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:srcCompat="@drawable/bulbon" />

                      <ImageView
                          android:id="@+id/imageView16"
                          android:layout_width="120dp"
                          android:layout_height="109dp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0"
                          app:srcCompat="@drawable/builoff" />

                      <Button
                          android:id="@+id/bulbBtnoff23"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/black"
                          android:text="@string/OFF"
                          android:textColor="#03A9F4"
                          android:textSize="36sp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView16"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0" />

                      <Button
                          android:id="@+id/bulbBtnon23"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/holo_blue_light"
                          android:text="@string/ON"
                          android:textSize="36sp"
                          android:visibility="visible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView16"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="0.368" />
                  </androidx.constraintlayout.widget.ConstraintLayout>

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="130dp">

                      <Button
                          android:id="@+id/fanBtnoff21"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/black"
                          android:text="@string/OFF"
                          android:textColor="#03A9F4"
                          android:textSize="36sp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0" />

                      <Button
                          android:id="@+id/fanBtnon21"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/holo_blue_light"
                          android:text="@string/ON"
                          android:textSize="36sp"
                          android:visibility="visible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="0.368" />

                      <ImageView
                          android:id="@+id/imageView"
                          android:layout_width="120dp"
                          android:layout_height="0dp"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:srcCompat="@drawable/onfan" />
                  </androidx.constraintlayout.widget.ConstraintLayout>

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="130dp">

                      <ImageView
                          android:id="@+id/imageView2"
                          android:layout_width="120dp"
                          android:layout_height="0dp"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:srcCompat="@drawable/onfan" />

                      <Button
                          android:id="@+id/fanBtnoff22"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/black"
                          android:text="@string/OFF"
                          android:textColor="#03A9F4"
                          android:textSize="36sp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView2"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0" />

                      <Button
                          android:id="@+id/fanBtnon22"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/holo_blue_light"
                          android:text="@string/ON"
                          android:textSize="36sp"
                          android:visibility="visible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView2"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="0.368" />

                  </androidx.constraintlayout.widget.ConstraintLayout>

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="130dp">

                      <ImageView
                          android:id="@+id/imageView21"
                          android:layout_width="125dp"
                          android:layout_height="128dp"
                          android:visibility="invisible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:srcCompat="@drawable/bulbon" />

                      <ImageView
                          android:id="@+id/imageView22"
                          android:layout_width="120dp"
                          android:layout_height="109dp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0"
                          app:srcCompat="@drawable/builoff" />

                      <Button
                          android:id="@+id/acBtnoff21"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/black"
                          android:text="@string/OFF"
                          android:textColor="#03A9F4"
                          android:textSize="36sp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView22"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0" />

                      <Button
                          android:id="@+id/actnon21"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/holo_blue_light"
                          android:text="@string/ON"
                          android:textSize="36sp"
                          android:visibility="visible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView22"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="0.368" />

                  </androidx.constraintlayout.widget.ConstraintLayout>

                  <androidx.constraintlayout.widget.ConstraintLayout
                      android:layout_width="match_parent"
                      android:layout_height="130dp">

                      <ImageView
                          android:id="@+id/imageView23"
                          android:layout_width="125dp"
                          android:layout_height="128dp"
                          android:visibility="invisible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:srcCompat="@drawable/bulbon" />

                      <ImageView
                          android:id="@+id/imageView24"
                          android:layout_width="120dp"
                          android:layout_height="109dp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintStart_toStartOf="parent"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0"
                          app:srcCompat="@drawable/builoff" />

                      <Button
                          android:id="@+id/acBtnoff22"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/black"
                          android:text="@string/OFF"
                          android:textColor="#03A9F4"
                          android:textSize="36sp"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView24"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="1.0" />

                      <Button
                          android:id="@+id/acBtnon22"
                          android:layout_width="0dp"
                          android:layout_height="0dp"
                          android:layout_marginStart="32dp"
                          android:layout_marginTop="32dp"
                          android:layout_marginEnd="32dp"
                          android:layout_marginBottom="32dp"
                          android:background="@android:color/holo_blue_light"
                          android:text="@string/ON"
                          android:textSize="36sp"
                          android:visibility="visible"
                          app:layout_constraintBottom_toBottomOf="parent"
                          app:layout_constraintEnd_toEndOf="parent"
                          app:layout_constraintHorizontal_bias="0.0"
                          app:layout_constraintStart_toEndOf="@+id/imageView24"
                          app:layout_constraintTop_toTopOf="parent"
                          app:layout_constraintVertical_bias="0.368" />

                  </androidx.constraintlayout.widget.ConstraintLayout>
              </LinearLayout>
          </ScrollView>


      </RelativeLayout>
java program:- 

      public class room1 extends AppCompatActivity {
          //Room1B1
          Button bulbBtnon21;
          Button bulbBtnoff21;
          ImageView BR1on;
          ImageView BR1off;
          //Room1B2
          Button bulbBtnon22;
          Button bulbBtnoff22;
          ImageView BR2on;
          ImageView BR2off;
          //Room1B3
          Button bulbBtnon23;
          Button bulbBtnoff23;
          ImageView BR3on;
          ImageView BR3off;
          //Room1F1
          Button fanBtnon21;
          Button fanBtnoff21;
          //Room1F2
          Button fanBtnon22;
          Button fanBtnoff22;
          //send user data to firebase databas (RealTime)
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
                      myRef.child("ROOM1_BULB_1").setValue(1);;
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
                      myRef.child("ROOM1_BULB_1").setValue(0);
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
                      myRef.child("ROOM1_BULB_2").setValue(1);

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
                      myRef.child("ROOM1_BULB_2").setValue(0);

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
                      myRef.child("ROOM1_BULB_3").setValue(1);
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
                      myRef.child("ROOM1_BULB_3").setValue(0);
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
                      myRef.child("ROOM1_FAN_1").setValue(0);

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
                      myRef.child("ROOM1_FAN_1").setValue(1);

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
                      myRef.child("ROOM1_FAN_2").setValue(0);

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
                      myRef.child("ROOM1_FAN_2").setValue(1);

                  }
              });
          }
      }

    
