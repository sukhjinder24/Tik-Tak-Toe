package myProject.tik_tak_toe;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class GamePlay extends AppCompatActivity {
    private TextView statusTV;
    private ImageView imageView0 , imageView1 , imageView2 , imageView3 , imageView4 , imageView5 , imageView6 , imageView7 ,imageView8;
    private int activeUser;
    private Button button;
    private boolean gameActive;
    private String status;
    int[] gameState = {2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2};
    int[][] winStates = {{0,1,2} , {3,4,5} , {6,7,8},
            {0,3,6} , {1,4,7} , {2,5,8}
            , {0,4,8} , {2,4,6}};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameplay);
        statusTV = findViewById(R.id.status);
        imageView0 = findViewById(R.id.layout0);
        imageView1 = findViewById(R.id.layout1);
        imageView2 = findViewById(R.id.layout2);
        imageView3 = findViewById(R.id.layout3);
        imageView4 = findViewById(R.id.layout4);
        imageView5 = findViewById(R.id.layout5);
        imageView6 = findViewById(R.id.layout6);
        imageView7 = findViewById(R.id.layout7);
        imageView8 = findViewById(R.id.layout8);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                finish();
                recreate();
            }
        });
    }
    public void reset(View v){
        activeUser = 1;
        gameState= new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
        imageView0.setImageResource(0);
        imageView1.setImageResource(0);
        imageView2.setImageResource(0);
        imageView3.setImageResource(0);
        imageView4.setImageResource(0);
        imageView5.setImageResource(0);
        imageView6.setImageResource(0);
        imageView7.setImageResource(0);
        imageView8.setImageResource(0);
        gameActive =true;
    }

    public void tick(View view){
        if(!gameActive) {
            reset(view);
        }
        if (activeUser == 1) {
            int i = Integer.parseInt(view.getTag().toString());
            if (gameState[i] == 2) {
                ((ImageView) view).setImageResource(R.mipmap.cross_sign);
                gameState[i] = 1;
                activeUser = 0;
                status = "Player2's turn";
            }
        } else {
            int i = Integer.parseInt(view.getTag().toString());
            if (gameState[i] == 2) {
                ((ImageView) view).setImageResource(R.mipmap.number0);
                gameState[i] = 0;
                activeUser = 1;
                status = "Player1's turn";
            }
        }
        for (int[] winState : winStates) {
            if (gameState[winState[0]] == gameState[winState[1]] &&
                    gameState[winState[1]] == gameState[winState[2]] &&
                    gameState[winState[0]] != 2) {
                if (gameState[winState[0]] == 0) {
                    status = "Player2 has won";
                } else {
                    status = "Player1 has won";
                }
//                    if(Arrays.equals(winState, new int[]{0, 1, 2})){
//                        imageView0.animate().rotationYBy(500).rotationXBy(500).translationY(1000).setDuration(5000);
//                        imageView1.animate().rotationYBy(500).rotationXBy(500).translationY(1000).setDuration(5000);
//                        imageView2.animate().rotationYBy(500).rotationXBy(500).translationY(1000).setDuration(5000);
//                        
//
//                    }
                gameActive = false;
//                    reset(view);
            }
        }
        statusTV.setText(status);
    }
}
