package ru.rsfera.a1l7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity { // implements WorkoutListFragment.WorkoutListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DetailsFragment detailsFragment =
                (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
    }


//	DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);



/*	@Override
    public void onItemClicked(int id) {
		View fragmentContainer = findViewById(R.id.detailsFragment);
		if (fragmentContainer != null) {
			DetailsFragment detailsFragment = new DetailsFragment();
			detailsFragment.setWorkoutID(id);
			FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
			fragmentTransaction.replace(R.id.detailsFragment, detailsFragment);
			fragmentTransaction.commit();
		} else {
			Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
			intent.putExtra(DetailsActivity.WORKOUT_ID, id);
			startActivity(intent);
		}
	}
*/
}
