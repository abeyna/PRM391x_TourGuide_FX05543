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

import java.util.ArrayList;

public class HospitalFragment extends Fragment {
    private RecyclerView mRecyclerViewHospital;
    private ArrayList<GuidePlace> hospitalList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.hospital_title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        View layout = inflater.inflate(R.layout.fragment_place, container, false);
        mRecyclerViewHospital = layout.findViewById(R.id.fragment_place_rv);

        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_01), getResources().getString(R.string.hospital_01_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_02), getResources().getString(R.string.hospital_02_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_03), getResources().getString(R.string.hospital_03_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_04), getResources().getString(R.string.hospital_04_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_05), getResources().getString(R.string.hospital_05_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_06), getResources().getString(R.string.hospital_06_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_07), getResources().getString(R.string.hospital_07_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_08), getResources().getString(R.string.hospital_08_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_09), getResources().getString(R.string.hospital_09_address)));
        hospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_10), getResources().getString(R.string.hospital_10_address)));

        LinearLayoutManager layoutManager = new LinearLayoutManager(layout.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewHospital.setLayoutManager(layoutManager);
        mRecyclerViewHospital.setHasFixedSize(true);
        mRecyclerViewHospital.setAdapter(new RecyclerDataAdapter(layout.getContext(), hospitalList));
        return layout;
    }
}