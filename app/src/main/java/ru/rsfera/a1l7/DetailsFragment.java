package ru.rsfera.a1l7;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsFragment extends Fragment {

	private int workoutID;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.details_fragment, container, false);
		Context context = getActivity();
		return rootView;
	}

	@Override
	public void onStart() {
		super.onStart();
		View view = getView();
		if (view != null) {
			TextView title = (TextView) view.findViewById(R.id.textTitle);
			TextView description = (TextView) view.findViewById(R.id.textDescription);
			ImageView imageView = (ImageView) view.findViewById(R.id.imageWorkout);
			Workout workout = Workout.workouts[workoutID];
			title.setText(workout.getName());
			description.setText(workout.getDescription());
			imageView.setImageResource(workout.getImageResourceId());
		}
	}

	public void setWorkoutID(int id){
		workoutID = id;
	}

}
