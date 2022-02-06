package com.example.ascension;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class Dungeon extends AppCompatActivity {
    CharSheet chSheet = new CharSheet();

    int [][] mapLayout = {
            {0,0,0,2,0,0,0},
            {0,0,0,1,0,0,0},
            {0,0,0,1,0,0,0},
            {0,0,0,1,0,0,0},
            {0,0,0,1,0,0,0},
            {2,1,1,1,1,1,2},
            {0,0,0,1,0,0,0},
            {0,0,0,1,0,0,0},
            {0,0,0,1,0,0,0},
            {0,0,0,1,0,0,0},
            {0,0,0,3,0,0,0}
    };
    int [] currentLocation = {3,10};
    //currently have a width range of 7
    //currently have a depth range of 11
    int xCoord = 0;
    int yCoord = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dungeon);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        startDungeon();
    }

    public void moveDown(View v){
        if(xCoord <= 1350){
            xCoord += 150;
            chSheet.stamina -= 1;
            setSquare();
        }
    }

    public void moveUp(View v){
        if(xCoord >= 150){
            xCoord -= 150;
            chSheet.stamina -= 1;
            setSquare();
        }
    }

    public void moveLeft(View v){
        if(yCoord>= 150 && mapLayout[currentLocation[0]][currentLocation[1]-1]!= 0){
            yCoord -= 150;
            chSheet.stamina -= 1;
            setSquare();
        }
    }

    public void moveRight(View v){
        if(yCoord<= 750 && mapLayout[currentLocation[0]][currentLocation[1]+1]!= 0){
            yCoord += 150;
            chSheet.stamina -= 1;
            setSquare();
        }
    }

    public void setSquare(){
        LinearLayout ll = findViewById(R.id.moveThis);
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams)
                ll.getLayoutParams();
        params.setMargins(yCoord,xCoord,0,0);
        ll.setLayoutParams(params);
    }

    public void returnHome(View v){
        Intent intent = new Intent(this, TownScreen.class);
        startActivity(intent);
    }

    public void startDungeon(){
        xCoord = 150*currentLocation[0];
        yCoord = 150*currentLocation[1];
    }

    public void clickCharSheet(View v){

    }
}