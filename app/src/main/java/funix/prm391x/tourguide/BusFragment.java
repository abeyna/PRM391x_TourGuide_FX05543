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

public class BusFragment extends Fragment {
    private RecyclerView mRecyclerViewBus;
    private ArrayList<GuidePlace> busList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.bus_title);

        View layout = inflater.inflate(R.layout.fragment_place, container, false);
        mRecyclerViewBus = layout.findViewById(R.id.fragment_place_rv);

        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_01), getResources().getString(R.string.bus_01_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_02), getResources().getString(R.string.bus_02_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_03), getResources().getString(R.string.bus_03_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_04), getResources().getString(R.string.bus_04_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_05), getResources().getString(R.string.bus_05_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_06), getResources().getString(R.string.bus_06_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_07), getResources().getString(R.string.bus_07_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_08), getResources().getString(R.string.bus_08_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_09), getResources().getString(R.string.bus_09_destination)));
        busList.add(new GuidePlace(R.drawable.metro, getResources().getString(R.string.bus_10), getResources().getString(R.string.bus_10_destination)));

        LinearLayoutManager layoutManager = new LinearLayoutManager(layout.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewBus.setLayoutManager(layoutManager);
        mRecyclerViewBus.setHasFixedSize(true);
        mRecyclerViewBus.setAdapter(new RecyclerDataAdapter(layout.getContext(), busList));
        return layout;
    }
}