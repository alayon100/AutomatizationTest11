package com.itver.alayon.automatizationtest11.activitis;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.itver.alayon.automatizationtest11.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextMail;
    private EditText editTextPassword;
    private Button buttonLoggin;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
        buttonLoggin.setOnClickListener(this);
    }

    private void initComponents(){
        mAuth = FirebaseAuth.getInstance();
        editTextMail = (EditText)findViewById(R.id.editTextEmail);
        editTextPassword = (EditText)findViewById(R.id.editTextPassword);
        buttonLoggin = (Button)findViewById(R.id.buttonLogin);
    }


    @Override
    public void onClick(View v) {
        String email = editTextMail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        if(!email.equals("") && !password.equals("")){
            loggin(email, password);
        }else{
            Toast.makeText(LoginActivity.this, "Check the fields...", Toast.LENGTH_SHORT).show();
        }
    }


    private void loggin(String email, String password){
        //Aqui va el metodo para acceder a firebase
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            //Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            //Log.w(TAG, "signInWithEmail:failure", task.getException());
                            //Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                            //        Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }

                        // ...
                    }
                });
    }

    private void updateUI(FirebaseUser user){
        if(user != null){
            //Do somehting
            //Intent intent = new Intent(LoginActivity.this, MainActivi);
            //Mostrar edificios
            Toast.makeText(LoginActivity.this, "Welcome to the System Automatization: " + user.getEmail(), Toast.LENGTH_LONG).show();
        }else{
            //DO SOMETHING
            Toast.makeText(LoginActivity.this, "User not found!!", Toast.LENGTH_SHORT).show();
        }
    }
}
