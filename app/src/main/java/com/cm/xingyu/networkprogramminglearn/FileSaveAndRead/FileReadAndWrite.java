package com.cm.xingyu.networkprogramminglearn.FileSaveAndRead;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cm.xingyu.networkprogramminglearn.R;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;

public class FileReadAndWrite extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    private EditText fileName, fileContent;
    private Button save, read;
    public Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_read_and_write);
        mContext = this.getApplicationContext();
        initView();


    }

    private void initView() {
        fileName = (EditText) findViewById(R.id.filename);
        fileContent = (EditText) findViewById(R.id.filecontent);
        save = (Button) findViewById(R.id.save);
        read = (Button) findViewById(R.id.read);
        save.setOnClickListener(this);
        read.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:
                fileHelper fileHelper = new fileHelper(mContext);
                String filename = fileName.getText().toString();
                String filecontent = fileContent.getText().toString();
                try {
                    fileHelper.writeData(filename, filecontent);
                    Toast.makeText(getApplicationContext(), "数据写入成功", Toast.LENGTH_SHORT).show();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "数据写入失败", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.read:
                fileHelper fileHelper2 = new fileHelper(mContext);
                String filename2 = fileName.getText().toString();
                String deatil = "";
                try {
                    fileHelper2.readData(filename2);
                    deatil = fileHelper2.readData(filename2);

                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(mContext, deatil, Toast.LENGTH_LONG).show();
                break;
            default: {
                break;
            }

        }

    }
}
