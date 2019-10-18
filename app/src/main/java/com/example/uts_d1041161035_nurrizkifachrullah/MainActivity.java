package com.example.uts_d1041161035_nurrizkifachrullah;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahstart(View View) {
        Intent Intent = new Intent (MainActivity.this, Activity_Services.class);
        startActivity(Intent);
    }
}
