package com.sambev.mtglife;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Create our players
		final Player Player1 = new Player("Player1");
		final Player Player2 = new Player("Player2");
		
		// Get our life views
		final TextView player1Life = (TextView) findViewById(R.id.player1Life);
		final TextView player2Life = (TextView) findViewById(R.id.player2Life);
		
		// Get the history views
		final TextView p1History = (TextView) findViewById(R.id.p1History);
	
		// Get our buttons
		Button add1P1 = (Button) findViewById(R.id.add1Player1);
		Button add1P2 = (Button) findViewById(R.id.add1Player2);
		Button sub1P1 = (Button) findViewById(R.id.sub1Player1);
		Button sub1P2 = (Button) findViewById(R.id.sub1Player2);
		Button resetbtn = (Button) findViewById(R.id.resetButton);
		
		// on click for add1p1 button
		add1P1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// add 1 to Player1's life total
				Player1.setLife(1);
				player1Life.setText(Integer.toString(Player1.getLife()));
				p1History.setText(Integer.toString(1));
			}
		});
		
		// on click for sub1p1 button
		sub1P1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// subtract 1 to Player1's life total
				Player1.setLife(-1);
				player1Life.setText(Integer.toString(Player1.getLife()));
				
			}
		});
		
		// on click for add1p2 button
		add1P2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// add 1 to Players2's life total
				Player2.setLife(1);
				player2Life.setText(Integer.toString(Player2.getLife()));
			}
		});
		
		// on click for sub1P2
		sub1P2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// subtract 1 to Player2's life total
				Player2.setLife(-1);
				player2Life.setText(Integer.toString(Player2.getLife()));
				
			}
		});
		
		// reset the game
		resetbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// reset the game yo.  Bring life totals back to 20
				Player1.reset();
				Player2.reset();
				player1Life.setText(Integer.toString(Player1.getLife()));
				player2Life.setText(Integer.toString(Player2.getLife()));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
