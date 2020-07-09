package com.example.guessthecelebrity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {



    Button BT_Name_0;
    Button BT_Name_1;
    Button BT_Name_2;
    Button BT_Name_3;

    Button[] Buttons = {BT_Name_0, BT_Name_1, BT_Name_2, BT_Name_3};

    ImageView IV_Celebrity;
    HashMap<String, String> Names_Pictures = new HashMap<String, String>();

    String[] Celebrities_Names = new String[26];
    String[]Celebrities_Bitmap = new String[26];

    String Current_Picture;
    String Current_Name;

    String html_Links;


    LinkSeparator linkSeparator;



    public void gameOn() {
        ImageDownloader task = new ImageDownloader();

        Random rand = new Random();
        int value;
        for (int i = 0; i < Buttons.length; i++) {
            Log.i("Gameon",Celebrities_Names[i]);
            value = rand.nextInt(26);
            Buttons[i].setText(Celebrities_Names[i]);
        }
       value = rand.nextInt(26);
        Current_Name = Celebrities_Names[value];
        value = rand.nextInt(4);
        Buttons[value].setText(Current_Name);
        Buttons[value].setTag(Current_Name);
        Current_Picture = Names_Pictures.get(Current_Name);
        try {
            IV_Celebrity.setImageBitmap(task.execute(Current_Picture).get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void onClick(View view) {
        if (view.getTag() == Current_Name) {
            Toast.makeText(this, "Yes it,s " + view.getTag(), Toast.LENGTH_SHORT).show();
            gameOn();
        } else {
            Toast.makeText(this, "No it's " + Current_Name, Toast.LENGTH_SHORT).show();
            gameOn();
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            IV_Celebrity = findViewById(R.id.IV_Celebrity);

            Buttons[0] = findViewById(R.id.BT_Name_0);
            Buttons[1] = findViewById(R.id.BT_Name_1);
            Buttons[2] = findViewById(R.id.BT_Name_2);
            Buttons[3] = findViewById(R.id.BT_Name_3);

            linkSeparator = new LinkSeparator();

            Names_Pictures = linkSeparator.getLinks();

               Celebrities_Names =  Names_Pictures.keySet().toArray(Celebrities_Names);

               for (int i= 0 ; i< 26;i++){

                   Celebrities_Bitmap[i] = Names_Pictures.get(Celebrities_Names[i]);
               }







            //TRY CATCH
                for (int i = 0; i<Celebrities_Names.length;i++){
                    Log.i("Name"+ i,Celebrities_Names[i]);
                }
                Log.i("ARRAY",Celebrities_Names[2]);
                Log.i("Celeb Bitmap",Celebrities_Bitmap[2].toString());
                Log.i("TEMP",Names_Pictures.toString());
                Log.i("Celeb Image",String.valueOf(Celebrities_Bitmap.length));
                Log.i("Celeb Names",String.valueOf(Celebrities_Names.length));
                Log.i("Names_Picture",Names_Pictures.toString());
                Log.i("test",String.valueOf(linkSeparator.getHtml_Blocks().length));
                Log.i("html blocks content",linkSeparator.getHtml_Blocks()[0]);

            gameOn();


        }
    }


