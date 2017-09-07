package com.cm.xingyu.networkprogramminglearn.FileSaveAndRead;

import android.content.Context;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/23.
 */
public class fileHelper  {
    public Context mContext;
    public fileHelper(Context context) {
      super();
        mContext=context;
    }
    public void writeData(String fileName,String fileContent) throws FileNotFoundException {
        FileOutputStream fileOutputStream = mContext.openFileOutput(fileName,Context.MODE_PRIVATE);
        try {
            fileOutputStream.write(fileContent.getBytes());
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String readData(String fileName) throws IOException {
        FileInputStream fileInputStream = mContext.openFileInput(fileName);
        byte[] temp = new byte[1024];
        StringBuilder sb = new StringBuilder("");
        int len =0;
        while ((len=fileInputStream.read(temp))>0){
            sb.append(new String(temp,0,len));
        }
        fileInputStream.close();
        return sb.toString();

    }
}
