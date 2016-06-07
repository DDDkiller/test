package com.example.eyeofolddriver;
//package com.ljq.test;

import java.io.ByteArrayOutputStream;
import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final int NONE = 0;
    private static final int PHOTO_GRAPH = 1;// ����
    private static final int PHOTO_ZOOM = 2; // ����
    private static final int PHOTO_RESOULT = 3;// ���
    private static final String IMAGE_UNSPECIFIED = "image/*";
    private Button btnTakePicture = null;
    private TextView tv = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTakePicture = (Button) findViewById(R.id.btnTakePicture);
        btnTakePicture.setOnClickListener(onClickListener);
        tv = (TextView)findViewById(R.id.textview);
    }
    
    private final View.OnClickListener onClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if(v==btnTakePicture){ //�����ջ�ȡͼƬ
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(Environment
                    .getExternalStorageDirectory(),"temp.jpg")));
                startActivityForResult(intent, PHOTO_GRAPH);
            }

        }

    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == NONE)
            return;
        // ����
        if (requestCode == PHOTO_GRAPH) {
            // �����ļ�����·��
            File picture = new File(Environment.getExternalStorageDirectory()
                    + "/temp.jpg");
            /*
             * 
             * �˴����ÿ��������м���
             * 
             * */
            //startPhotoZoom(Uri.fromFile(picture));
            tv.setText("dsfsdfdsfsdfdsfs");
        }

        if (data == null)
            return;
        
        super.onActivityResult(requestCode, resultCode, data);
    }

   
}