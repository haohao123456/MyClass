package szxy.com.myclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button bt_01;
    private Button bt_02;
    private Button bt_03;
    private Button bt_04;
    private Button bt_05;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt_01 = (Button) findViewById(R.id.bt_01);
        bt_02 = (Button) findViewById(R.id.bt_02);
        bt_03 = (Button) findViewById(R.id.bt_03);
        bt_04 = (Button) findViewById(R.id.bt_04);
        bt_05 = (Button) findViewById(R.id.bt_05);

//        Button[] bt={bt_01,bt_02,bt_03,bt_04,bt_05};
//        for (int i = 0; i < bt.length; i++) {
//            bt[i].setVisibility(View.INVISIBLE);
//        }
//
//        for (int j = 0; j < bt.length; j++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            bt[j].setText("J"+j);
//            bt[j].setVisibility(View.VISIBLE);
//        }


    }
}
