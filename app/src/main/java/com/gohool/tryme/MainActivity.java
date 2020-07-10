package com.gohool.tryme;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View mbg;
    private Button mbutton;
    private int arr[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arr=new int[]{255-165-0,176-48-96,50-205-50,0-100-0,106-90-205,255-20-147,Color.LTGRAY,238-232-170,Color.BLUE,Color.GRAY,Color.GREEN,Color.YELLOW,Color.MAGENTA,Color.LTGRAY,Color.DKGRAY,Color.CYAN};


        mbg=findViewById(R.id.bakcg);
        mbutton=(Button)findViewById(R.id.button);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd=new Random();

                mbg.setBackgroundColor(arr[rd.nextInt(arr.length)]);
                Log.d("test","tap");
            }
        });




    }
}