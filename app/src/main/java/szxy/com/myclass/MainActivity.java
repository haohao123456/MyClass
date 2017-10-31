package szxy.com.myclass;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import static szxy.com.myclass.R.layout;

public class MainActivity extends AppCompatActivity {

    private Button btn_teacher;
    private Button btn_01;
    private Button btn_02;
    private Button btn_03;
    private Button btn_04;
    private Button btn_05;
    private Button btn_06;
    private Button btn_07;
    private Button btn_08;
    private Button btn_09;
    private Button btn_10;
    private Button btn_11;
    private Button btn_12;
    private Button btn_13;
    private Button btn_14;
    private Button btn_15;
    private Button btn_16;
    private Button btn_17;
    private Button btn_18;
    private Button btn_19;
    private Button btn_20;
    private Button btn_21;
    private Button btn_22;
    private Button btn_23;
    private Button btn_24;
    private Button btn_25;
    private Button btn_26;
    private Button btn_27;
    private Button btn_28;
    private Button btn_29;
    private Button btn_30;
    private Button btn_31;
    private Button btn_32;
    private Button btn_33;
    private Button btn_34;
    private Button btn_35;
    private Button btn_36;
    private Button btn_37;
    private Button btn_38;
    private Button btn_39;
    private Button btn_40;


    //    TextView tv= new TextView(this);
//    Button btn=new Button(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        btn_teacher = (Button) findViewById(R.id.btn_teacher);
        btn_01 = (Button) findViewById(R.id.btn_01);
        btn_02 = (Button) findViewById(R.id.btn_02);
        btn_03 = (Button) findViewById(R.id.btn_03);
        btn_04 = (Button) findViewById(R.id.btn_04);
        btn_05 = (Button) findViewById(R.id.btn_05);
        btn_06 = (Button) findViewById(R.id.btn_06);
        btn_07 = (Button) findViewById(R.id.btn_07);
        btn_08 = (Button) findViewById(R.id.btn_08);
        btn_09 = (Button) findViewById(R.id.btn_09);
        btn_10 = (Button) findViewById(R.id.btn_10);
        btn_11 = (Button) findViewById(R.id.btn_11);
        btn_12 = (Button) findViewById(R.id.btn_12);
        btn_13 = (Button) findViewById(R.id.btn_13);
        btn_14 = (Button) findViewById(R.id.btn_14);
        btn_15 = (Button) findViewById(R.id.btn_15);
        btn_16 = (Button) findViewById(R.id.btn_16);
        btn_17 = (Button) findViewById(R.id.btn_17);
        btn_18 = (Button) findViewById(R.id.btn_18);
        btn_19 = (Button) findViewById(R.id.btn_19);
        btn_20 = (Button) findViewById(R.id.btn_20);
        btn_21 = (Button) findViewById(R.id.btn_21);
        btn_22 = (Button) findViewById(R.id.btn_22);
        btn_23 = (Button) findViewById(R.id.btn_23);
        btn_24 = (Button) findViewById(R.id.btn_24);
        btn_25 = (Button) findViewById(R.id.btn_25);
        btn_26 = (Button) findViewById(R.id.btn_26);
        btn_27 = (Button) findViewById(R.id.btn_27);
        btn_28 = (Button) findViewById(R.id.btn_28);
        btn_29 = (Button) findViewById(R.id.btn_29);
        btn_30 = (Button) findViewById(R.id.btn_30);
        btn_31 = (Button) findViewById(R.id.btn_31);
        btn_32 = (Button) findViewById(R.id.btn_32);
        btn_33 = (Button) findViewById(R.id.btn_33);
        btn_34 = (Button) findViewById(R.id.btn_34);
        btn_35 = (Button) findViewById(R.id.btn_35);
        btn_36 = (Button) findViewById(R.id.btn_36);
        btn_37 = (Button) findViewById(R.id.btn_37);
        btn_38 = (Button) findViewById(R.id.btn_38);
        btn_39 = (Button) findViewById(R.id.btn_39);
        btn_40 = (Button) findViewById(R.id.btn_40);
        final Button btn[]={btn_01,btn_02,btn_03,btn_04,btn_05,
                      btn_06,btn_07,btn_08,btn_09,btn_10,
                      btn_11,btn_12,btn_13,btn_14,btn_15,
                      btn_16,btn_17,btn_18,btn_19,btn_20,
                      btn_21,btn_22,btn_23,btn_24,btn_25,
                      btn_26,btn_27,btn_28,btn_29,btn_30,
                      btn_31,btn_32,btn_33,btn_34,btn_35,
                      btn_36,btn_37,btn_38,btn_39,btn_40};
        int x=5;
        int y=8;
        int z=1;
        int[] arr=ran();
        int c=0;
        boolean once=true;
//        int[][] position =new int[x][y];
        final String[]name={"秦浩","王冠","舒键","耿良均","周东旗",
                "陈飚","季昌文","杨开宇","陆贝石","宋新宝","郑钧",
                "余钢","张磊","高亚会","田华清",
                "施之唐","郭欢欢","韦阳","刘欢","赵健","梁东杰",
                "于海霞"+"\t","李悦"+"\t","王婷"+"\t","陈佳"+"\t",
                "吴晨晨"+"\t","陈振"+"\t","赵梦茹"+"\t","刘童"+"\t","魏莹"+"\t",
                "管琦"+"\t","刘影"+"\t","吴珍"+"\t","张叶"+"\t","左莉莉"+"\t","闻宇霆"+"\t",
                "李美琴"+"\t","凌倩"+"\t","刘欢欢"+"\t","张静"+"\t"};

        for (int i = 0; i < 8; i++) {
            if (once) {
               btn_teacher.setText("\t\t晓梅姐");
                btn_teacher.setTextColor(Color.WHITE);
                btn_teacher.setBackgroundColor(Color.parseColor("#FF4081"));
                once=false;
            }
            System.out.println();
            for (int j = 0; j < 5; j++) {
                z=arr[c];//生成40以内的唯一的不重复的随机数
//                z=(int) (Math.random()*40);
                final int cc=c++;
                if (name[arr[z]].contains("\t")) {
                    btn[cc].setText(name[arr[z]]+"\t");
                    btn[cc].setTextColor(Color.WHITE);
                    btn[cc].setBackgroundColor(Color.parseColor("#FF4081"));
                }
                else {
                    btn[cc].setText(name[arr[z]]+"\t");
                    btn[cc].setBackgroundColor(Color.parseColor("#4488FF"));
                }
            }
        }
    }

    public static  int[] ran(){
        int []a=new int  [40];
        m: for(int i=0;i<40;i++)
        {
            int b =(int)(Math.random()*40);//0-9
            //2= b    第四次      第五次

            // 0  1   2    i 第四个了   只存了三个数
            for(int j=0;j<i;j++)
            {
                if (b==a[j])
                {
                    i=i-1;
                    continue m;
                }
            }
            a[i]=b;

        }
        return a;

    }

}
