package myProject.tik_tak_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
//    private int activeUser = 1;
    private Button btn;
//    private String status;
//    private TextView statusTV;
//    private Boolean gameActive = true;
//
//
//    private ImageView imageView0 ,imageView1 ,imageView2 ,imageView3 ,imageView4 ,imageView5 , imageView6 , imageView7 , imageView8;


    //1-->X
    //0-->0

//    int[] gameState = {2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2};
//    int[][] winStates = {{0,1,2} , {3,4,5} , {6,7,8},
//                        {0,3,6} , {1,4,7} , {2,5,8}
//                        , {0,4,8} , {2,4,6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.buttonMian);
        TextView textView = findViewById(R.id.textViewPress);
//        textView.animate().setStartDelay(10000).rotationYBy(500).setStartDelay(10000).rotationXBy(-500).setStartDelay(10000).rotationXBy(500).setStartDelay(10000).rotationYBy(-500).setDuration(30*1000).setStartDelay(1000);
//        textView.setVisibility(View.INVISIBLE);
//        statusTV = findViewById(R.id.status);
//        imageView0 = findViewById(R.id.layout0);
//        imageView1 = findViewById(R.id.layout1);
//        imageView2 = findViewById(R.id.layout2);
//        imageView3 = findViewById(R.id.layout3);
//        imageView4 = findViewById(R.id.layout4);
//        imageView5 = findViewById(R.id.layout5);
//        imageView6 = findViewById(R.id.layout6);
//        imageView7 = findViewById(R.id.layout7);
//        imageView8 = findViewById(R.id.layout8);
//        status = "Player1's turn";
//        statusTV.setText(status);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , GamePlay.class);
                startActivity(intent);
//                reset(v);
            }
        });
    }
//    public void reset(View v){
//        activeUser = 1;
//        gameState= new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2};
//        imageView0.setImageResource(0);
//        imageView1.setImageResource(0);
//        imageView2.setImageResource(0);
//        imageView3.setImageResource(0);
//        imageView4.setImageResource(0);
//        imageView5.setImageResource(0);
//        imageView6.setImageResource(0);
//        imageView7.setImageResource(0);
//        imageView8.setImageResource(0);
//        gameActive =true;
//    }
//    public void tick(View view){
//        if(!gameActive) {
//            reset(view);
//        }
//            if (activeUser == 1) {
//                int i = Integer.parseInt(view.getTag().toString());
//                if (gameState[i] == 2) {
//                    ((ImageView) view).setImageResource(R.mipmap.cross_sign);
//                    gameState[i] = 1;
//                    activeUser = 0;
//                    status = "Player2's turn";
//                }
//            } else {
//                int i = Integer.parseInt(view.getTag().toString());
//                if (gameState[i] == 2) {
//                    ((ImageView) view).setImageResource(R.mipmap.number0);
//                    gameState[i] = 0;
//                    activeUser = 1;
//                    status = "Player1's turn";
//                }
//            }
//            for (int[] winState : winStates) {
//                if (gameState[winState[0]] == gameState[winState[1]] &&
//                        gameState[winState[1]] == gameState[winState[2]] &&
//                        gameState[winState[0]] != 2) {
//                    if (gameState[winState[0]] == 0) {
//                        status = "Player2 has won";
//                    } else {
//                        status = "Player1 has won";
//                    }
////                    if(Arrays.equals(winState, new int[]{0, 1, 2})){
////                        imageView0.animate().translationY(-1500).rotationXBy(500).setDuration(10000);
////                        imageView1.animate().translationY(-1500).rotationXBy(500).setDuration(10000);
////                        imageView2.animate().translationY(-1500).rotationXBy(500).setDuration(10000);
//
////                    }
//                    gameActive = false;
////                    reset(view);
//                }
//            }
//        statusTV.setText(status);
//    }
}