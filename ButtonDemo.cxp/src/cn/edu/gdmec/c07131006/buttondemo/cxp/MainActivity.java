package cn.edu.gdmec.c07131006.buttondemo.cxp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button myBtn;
	TextView myTextView;
	ImageButton myImagetn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		myTextView = (TextView) findViewById(R.id.textView1);
		myTextView.setText("hello");
		myBtn = (Button) findViewById(R.id.button1);
		myBtn.setOnClickListener(buttonListener);
		myImagetn = (ImageButton) findViewById(R.id.imageButton1);
		myImagetn.setImageResource(R.drawable.ccxx);
		
	}
	Button.OnClickListener buttonListener = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			myTextView.setText("you have clicked the button");
		}
		
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
