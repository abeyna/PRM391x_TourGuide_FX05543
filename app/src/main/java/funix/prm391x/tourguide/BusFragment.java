package funix.prm391x.tourguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * @author Luan N Nguyen
 * @since April 20th 2021
 *                     Bus Fragment for bus's metro displaying.
 */
public class BusFragment extends Fragment {
    /*** RecyclerView for bus stations list.*/
    private RecyclerView mRecyclerViewBus;

    /** ArrayList stores data of bus stations.*/
    private ArrayList<GuidePlace> mBusList = new ArrayList<>();

    /**
     * Called to have the fragment instantiate its user interface view.
     * @param inflater
     *                     The LayoutInflater object that can be used to inflate any views in the fragment.
     * @param container
     *                     The parent view that the fragment's UI should be attached to.
     * @param savedInstanceState
     *                     This fragment is being re-constructed from a previous saved state as given here.
     * @return the View for the fragment's UI.
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // Set title on ActionBar of fragment.
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.bus_title);

        // View for bus's stations list.
        View mBusView = inflater.inflate(R.layout.fragment_place, container, false);
        mRecyclerViewBus = mBusView.findViewById(R.id.fragment_place_rv);

        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_01), getResources().getString(R.string.bus_01_destination), getResources().getString(R.string.bus_01_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_02), getResources().getString(R.string.bus_02_destination), getResources().getString(R.string.bus_02_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_03), getResources().getString(R.string.bus_03_destination), getResources().getString(R.string.bus_03_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_04), getResources().getString(R.string.bus_04_destination), getResources().getString(R.string.bus_04_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_05), getResources().getString(R.string.bus_05_destination), getResources().getString(R.string.bus_05_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_06), getResources().getString(R.string.bus_06_destination), getResources().getString(R.string.bus_06_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_07), getResources().getString(R.string.bus_07_destination), getResources().getString(R.string.bus_07_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_08), getResources().getString(R.string.bus_08_destination), getResources().getString(R.string.bus_08_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_09), getResources().getString(R.string.bus_09_destination), getResources().getString(R.string.bus_09_url)));
        mBusList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_10), getResources().getString(R.string.bus_10_destination), getResources().getString(R.string.bus_10_url)));

        LinearLayoutManager layoutManager = new LinearLayoutManager(mBusView.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewBus.setLayoutManager(layoutManager);
        mRecyclerViewBus.setHasFixedSize(true);
        mRecyclerViewBus.setAdapter(new RecyclerDataAdapter(mBusView.getContext(), mBusList));
        return mBusView;
    }
}