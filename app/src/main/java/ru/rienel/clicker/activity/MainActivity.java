package ru.rienel.clicker.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import ru.rienel.clicker.R;

public class MainActivity extends AppCompatActivity {
	private Button startGame;
	private Button statistics;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_game);

		startGame = findViewById(R.id.btnStart);
		statistics = findViewById(R.id.btnStatistic);

		startGame.setOnClickListener(buildChageActivityOnClickListener(this, GameActivity.class));
		statistics.setOnClickListener(buildChageActivityOnClickListener(this, StatisticsActivity.class));
	}

	private View.OnClickListener buildChageActivityOnClickListener(final Context context,
	                                                               final Class<?> activityClass) {
		return new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(context, activityClass);
				startActivity(intent);
			}
		};
	}

}
