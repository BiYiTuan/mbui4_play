package com.moon.android.moonplayer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.forcetech.android.ForceTV;
import com.moon.android.moonplayer.service.VodVideo;
import com.moon.android.moonplayer.util.Logger;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	public static final Logger log = Logger.getLogger();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		log.i("Into moon player main activity");
		finish();
//		new Thread(){
//			@Override
//			public void run() {
//				new ForceTV().initForceClient();//not execute this,couldn't play video,keeping on loading video state
//			}
//		}.start();
//		ComponentName componetName = new ComponentName(  
//                "com.moon.android.moonplayer","com.moon.android.moonplayer.VodPlayerActivity");  
//		Intent intent = new Intent();
//		List<VodVideo> list = new ArrayList<VodVideo>();
//		VodVideo v =new VodVideo();
//		v.setChannelId("56f0fd8100061bfe00e52f052fb769b5");
//		v.setLink("111");
//		v.setStreamip("198.255.6.106:6001");
//		v.setType("ts");
//		v.setUrl("force://198.255.6.106:6001/56f0fd8100061bfe00e52f052fb769b5");
//	//	force://vodlist.btvgod.com:9906/56e630380007ff5c04651b0c5ecd1a0b
//		list.add(v);
//		intent.putExtra("videolist", (Serializable)list);
//		intent.setComponent(componetName);  
//        startActivity(intent);  
	}

}
