package funix.prm391x.tourguide;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.Struct;
import java.util.ArrayList;

public class AtmFragment extends Fragment {
    private RecyclerView mRecyclerViewAtm;
    private ArrayList<GuidePlace> atmList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.atm_title);

        View layout = inflater.inflate(R.layout.fragment_place, container, false);
        mRecyclerViewAtm = layout.findViewById(R.id.fragment_place_rv);

        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_01), getResources().getString(R.string.atm_01_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_02), getResources().getString(R.string.atm_02_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_03), getResources().getString(R.string.atm_03_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_04), getResources().getString(R.string.atm_04_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_05), getResources().getString(R.string.atm_05_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_06), getResources().getString(R.string.atm_06_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_07), getResources().getString(R.string.atm_07_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_08), getResources().getString(R.string.atm_08_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_09), getResources().getString(R.string.atm_09_address)));
        atmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_10), getResources().getString(R.string.atm_10_address)));

        LinearLayoutManager layoutManager = new LinearLayoutManager(layout.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewAtm.setLayoutManager(layoutManager);
        mRecyclerViewAtm.setHasFixedSize(true);
        mRecyclerViewAtm.setAdapter(new RecyclerDataAdapter(layout.getContext(), atmList));
        return layout;
    }
}