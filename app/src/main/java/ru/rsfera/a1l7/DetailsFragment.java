package ru.rsfera.a1l7;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsFragment extends Fragment {


    private int workoutID = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_fragment, container, false);
        TextView textView= (TextView) rootView.findViewById(R.id.textTitle);
        textView.setText("qwertyuilkjhg");
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        TextView title = (TextView) view.findViewById(R.id.textTitle);
        TextView description = (TextView) view.findViewById(R.id.textDescription);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageWorkout);
        Workout workout = Workout.workouts[workoutID];
        title.setText(workout.getName());
        description.setText(workout.getDescription());
        imageView.setImageResource(workout.getImageResourceId());


    }
}
