package com.example.savetheninja;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;



import java.util.Random;

public class Spike {
    Bitmap spike[] = new Bitmap[3];   // to hold all the falling object
    int spikeFrame =0;
    int spikeX, spikeY, spikeVelocity;
    Random random;
    
    
    public Spike(Context context){
        spike[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.spike0);
        spike[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.spike1);
        spike[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.spike2);
        random =new Random();
        resetPosition();
    }
    
    public Bitmap getSpike(int spikeFrame){
        return spike[spikeFrame];
    }
    
    public int getSpikeWidth(){
        return spike[0].getWidth();
    }
    
    public int getSpikeHeight(){
        return spike[0].getHeight();
    }

    public void resetPosition() {
        spikeX = random.nextInt(GameView.dWidth - getSpikeWidth()); // Random X position within the screen width
        spikeY = -random.nextInt(1000); // Random Y position above the screen
        spikeVelocity = 35 + random.nextInt(16); // Random velocity
    }



}
