package com.example.eyeofolddriver;

import java.io.File;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;

public class Controller {
   int state = 0;  //state stand for the function
   private Controller() {}  
   
   //single exemple
   private static Controller controller = null;  
   public static Controller getInstance() {  
        if (controller == null) {    
            controller = new Controller();  
        }    
       return controller;  
   }  
   
   public void set_state(int s) {
	   state = s;
   }
   
   public String handle(String url) {
	   if (state == 1) {
	       /*����ͼƬ��ַ������һ��PhotoMessage����*/
	       /*����photoMessage���������ַ���*/
	       /*�����ַ�����������*/
	       String result = "";
	       return result;
	   }
	   return "	ѡ���ܰ�ť ";
   }
}
