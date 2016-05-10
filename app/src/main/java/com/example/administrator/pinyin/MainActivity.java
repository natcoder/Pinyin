package com.example.administrator.pinyin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView text;
    private Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String string = "";
        try {
            switch (v.getId()) {
                case R.id.button1://获取全拼,全部大写
                    string = PinYin.getFirstLetterAllBig(text.getText().toString());
                    break;
                case R.id.button2://获取全拼,全部小写
                    string = PinYin.getFirstLetterAllSmall(text.getText().toString());
                    break;
                case R.id.button3://获取全拼,首字母大写
                    string = PinYin.getFirstLetterAllBigSmall(text.getText().toString());
                    break;
                case R.id.button4://只获取中文首字母(不是全拼),例如:中文=ZW,大写
                    string = PinYin.getFirstLetterBig(text.getText().toString());
                    break;
                case R.id.button5://只获取中文首字母(不是全拼),例如:中文=zw,小写
                    string = PinYin.getFirstLetterSmall(text.getText().toString());
                    break;
            }
            if (!TextUtils.isEmpty(string)) {
                Log.d("PinYin", string);
            }
        } catch (BadHanyuPinyinOutputFormatCombination badHanyuPinyinOutputFormatCombination) {
            badHanyuPinyinOutputFormatCombination.printStackTrace();
        }
    }

}
