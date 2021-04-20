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

/**
 * @author Luan N Nguyen
 * @since April 20th 2021
 *                     Hospital Fragment for hospitals displaying.
 */
public class HospitalFragment extends Fragment {
    /*** RecyclerView for hospitals list.*/
    private RecyclerView mRecyclerViewHospital;

    /** ArrayList stores data of hospitals.*/
    private ArrayList<GuidePlace> mHospitalList = new ArrayList<>();

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
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.hospital_title);

        // View for hospitals list.
        View mHospitalView = inflater.inflate(R.layout.fragment_place, container, false);
        mRecyclerViewHospital = mHospitalView.findViewById(R.id.fragment_place_rv);

        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_01), getResources().getString(R.string.hospital_01_address), getResources().getString(R.string.hospital_01_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_02), getResources().getString(R.string.hospital_02_address), getResources().getString(R.string.hospital_02_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_03), getResources().getString(R.string.hospital_03_address), getResources().getString(R.string.hospital_03_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_04), getResources().getString(R.string.hospital_04_address), getResources().getString(R.string.hospital_04_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_05), getResources().getString(R.string.hospital_05_address), getResources().getString(R.string.hospital_05_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_06), getResources().getString(R.string.hospital_06_address), getResources().getString(R.string.hospital_06_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_07), getResources().getString(R.string.hospital_07_address), getResources().getString(R.string.hospital_07_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_08), getResources().getString(R.string.hospital_08_address), getResources().getString(R.string.hospital_08_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_09), getResources().getString(R.string.hospital_09_address), getResources().getString(R.string.hospital_09_url)));
        mHospitalList.add(new GuidePlace(R.drawable.hospital, getResources().getString(R.string.hospital_10), getResources().getString(R.string.hospital_10_address), getResources().getString(R.string.hospital_10_url)));

        LinearLayoutManager layoutManager = new LinearLayoutManager(mHospitalView.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewHospital.setLayoutManager(layoutManager);
        mRecyclerViewHospital.setHasFixedSize(true);
        mRecyclerViewHospital.setAdapter(new RecyclerDataAdapter(mHospitalView.getContext(), mHospitalList));
        return mHospitalView;
    }
}