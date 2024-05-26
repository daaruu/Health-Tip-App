package com.example.greetings;

import android.os.Bundle;
import android.os.Handler;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView et;

    Button bt;
    TextView tv;
    private final String[] tips = new String[]{
            "Drink water regularly throughout the day to stay hydrated.",
            "Eat a variety of colorful fruits and vegetables for better nutrition.",
            "Take short breaks to stretch and move around if you sit for long periods.",
            "Practice deep breathing exercises to reduce stress and improve relaxation.",
            "Get up and move around for a few minutes every hour to improve circulation.",
            "Avoid sugary drinks and opt for water or herbal tea instead.",
            "Use sunscreen with SPF 30 or higher when going outdoors to protect your skin.",
            "Practice good hand hygiene by washing your hands regularly with soap and water.",
            "Practice mindfulness by focusing on the present moment to reduce stress.",
            "Take stairs instead of the elevator for a quick cardio workout.",
            "Eat slowly and savor your food to prevent overeating.",
            "Keep healthy snacks like fruits, nuts, or yogurt on hand for when hunger strikes.",
            "Limit screen time before bed to improve sleep quality.",
            "Practice gratitude by keeping a gratitude journal and writing down things you're thankful for.",
            "Practice mindfulness meditation to improve focus and reduce stress.",
            "Practice yoga poses for relaxation and flexibility.",
            "Use a pedometer or fitness tracker to monitor your daily steps and stay active.",
            "Set a regular sleep schedule and stick to it for better sleep hygiene.",
            "Engage in activities that bring you joy and reduce stress.",
        "Brush teeth twice daily for 2 minutes.",
                "Floss daily to remove plaque buildup.",
                "Replace toothbrush every 3-4 months.",
                "Use fluoride toothpaste for cavity protection.",
                "Limit sugary and acidic foods/drinks.",
                "Drink plenty of water for saliva flow.",
                "Avoid smoking and tobacco products completely.",
                "Visit dentist regularly for professional cleanings.",
                "Consider dental sealants for molar protection.",
                "Wear a mouth guard during sports activities.",
                "Use an antibacterial mouthwash for gum health.",
                "Eat crunchy fruits and veggies for teeth.",
                "Chew sugar-free gum with xylitol after meals.",
                "Use a soft-bristled toothbrush for gentle cleaning.",
                "Brush gently to avoid gum irritation/damage.",
                "Rinse with water after eating or drinking.",
                "Avoid frequent snacking on sugary/sticky foods.",
                "Don't share utensils or drinks with others.",
                "Clean dentures or retainers daily if used.",
                "Replace toothbrush after recovering from an illness.",
                "Massage gums gently with a toothbrush regularly.",
                "Avoid excessive teeth grinding or clenching habits.",
                "Use a fluoride mouth rinse for remineralization.",
                "Eat dairy products for calcium intake regularly.",
                "Limit acidic drinks like soda or juices.",
                "Drink tea to prevent plaque buildup naturally.",
                "Quit smoking for improved oral and health.",
                "Use a tongue scraper for fresh breath.",
                "Avoid chewing on hard objects like ice.",
                "Stay hydrated to prevent dry mouth issues.",
                "Eat vitamin C-rich foods for gum health.",
                "Consider orthodontic treatment if needed for alignment.",
                "Avoid frequent snacking on sticky or chewy.",
                "Use a soft-pick for hard-to-reach areas.",
                "Rinse with salt water for gum irritation.",
                "Eat vitamin D-rich foods for strong teeth.",
            "Practice good oral hygiene by brushing and flossing daily.",
            "Practice portion control by using smaller plates and bowls.",
            "Keep a food diary to track your eating habits and identify areas for improvement.",
            "Use relaxation techniques like progressive muscle relaxation to reduce tension.",
            "Practice positive self-talk to improve self-esteem and mental health.",
            "Stay hydrated by drinking plenty of water throughout the day.",
            "Eat a balanced diet rich in fruits, vegetables, whole grains, and lean proteins.",
            "Get regular exercise, aiming for at least 30 minutes most days of the week.",
            "Practice good hygiene, including regular handwashing."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        et = findViewById(R.id.et1);
        bt = findViewById(R.id.button);
        tv = findViewById(R.id.tv);

        et.setVisibility(View.INVISIBLE);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int count = random.nextInt(tips.length); // Generate a random number between 1 and 50
                et.setVisibility(View.VISIBLE);
                // Set the tip in the EditText
                et.setText(tips[count - 1]);
            }
        });
    }

}