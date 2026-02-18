package com.punarnava.rehabapp; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.*; 
Fig 3.5                         
Chapter 4 
Fig 3.6 
import androidx.appcompat.app.AppCompatActivity; 
Project title: Tele Rehabilitation 
System                                                                                            
 
public class MainActivity extends AppCompatActivity { 
 
    TextView heartRateText, progressText, voucherText; 
    EditText journalInput; 
    Button saveJournalBtn, uploadVideoBtn, chatbotBtn; 
 
    int heartRate = 76; 
    int completedDays = 5; 
 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_main); 
 
        heartRateText = findViewById(R.id.heartRate); 
        progressText = findViewById(R.id.progress); voucherText =          
findViewById(R.id.voucher); 
        journalInput = findViewById(R.id.journalInput); 
        saveJournalBtn = findViewById(R.id.saveJournal); 
        uploadVideoBtn = findViewById(R.id.uploadVideo); 
        chatbotBtn = findViewById(R.id.chatbotBtn); 
 
        updateUI(); 
Project title: Tele Rehabilitation 
System                                                                                            
 
        saveJournalBtn.setOnClickListener(v -> { 
            Toast.makeText(this, "Journal Saved. Healing logged.", 
Toast.LENGTH_SHORT).show(); 
        }); 
 
        uploadVideoBtn.setOnClickListener(v -> { 
            Toast.makeText(this, "Rehab video uploaded for review.", 
Toast.LENGTH_SHORT).show(); 
}); 
 } 
 
    private void updateUI() { 
        heartRateText.setText("Heart Rate: " + heartRate + " bpm"); 
        progressText.setText("Exercise Streak: " + completedDays + " 
days"); 
 
        if (completedDays >= 7) { 
            voucherText.setText("Voucher Unlocked 🎉"); 
        } else { 
            voucherText.setText("Voucher in " + (7 - completedDays) + " 
days"); 
        } 
}} 
                                                                                     