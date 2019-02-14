package android.benedetto.com.workout;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {

    // interface for the communication between WorkoutListFragment and any activity
    static interface Listener {
        void itemClicked(long id);
    }

    private Listener listener;

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
        if (listener != null) {
            listener.itemClicked(id);   // call the itemClicked() method in the activity passing
                                        // the id of the workout selected by the user
        }
    }

    // here context is the context the fragment is attached to - the activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] names = new String[Workout.workouts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Workout.workouts[i].getName();
        }

        // create the array adapter
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        inflater.getContext(),
                        android.R.layout.simple_list_item_1,
                        names);

        // bind the array adapter to the list view
        setListAdapter(adapter);


        // this gives the default layout for the ListFragment
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}

