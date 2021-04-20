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

/**
 * @author Luan N Nguyen
 * @since April 20th 2021
 *                     ATM Fragment for ATM boxes displaying.
 */
public class AtmFragment extends Fragment {
    /*** RecyclerView for ATMs list.*/
    private RecyclerView mRecyclerViewAtm;

    /** ArrayList stores data of ATMs.*/
    private ArrayList<GuidePlace> mAtmList = new ArrayList<>();

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
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.atm_title);

        // View for ATMs list.
        View mAtmView = inflater.inflate(R.layout.fragment_place, container, false);
        mRecyclerViewAtm = mAtmView.findViewById(R.id.fragment_place_rv);

        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_01), getResources().getString(R.string.atm_01_address), getResources().getString(R.string.atm_01_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_02), getResources().getString(R.string.atm_02_address), getResources().getString(R.string.atm_02_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_03), getResources().getString(R.string.atm_03_address), getResources().getString(R.string.atm_03_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_04), getResources().getString(R.string.atm_04_address), getResources().getString(R.string.atm_04_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_05), getResources().getString(R.string.atm_05_address), getResources().getString(R.string.atm_05_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_06), getResources().getString(R.string.atm_06_address),getResources().getString(R.string.atm_06_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_07), getResources().getString(R.string.atm_07_address), getResources().getString(R.string.atm_07_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_08), getResources().getString(R.string.atm_08_address), getResources().getString(R.string.atm_08_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_09), getResources().getString(R.string.atm_09_address), getResources().getString(R.string.atm_09_url)));
        mAtmList.add(new GuidePlace(R.drawable.atm_machine, getResources().getString(R.string.atm_10), getResources().getString(R.string.atm_10_address), getResources().getString(R.string.atm_10_url)));

        LinearLayoutManager layoutManager = new LinearLayoutManager(mAtmView.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewAtm.setLayoutManager(layoutManager);
        mRecyclerViewAtm.setHasFixedSize(true);
        mRecyclerViewAtm.setAdapter(new RecyclerDataAdapter(mAtmView.getContext(), mAtmList));
        return mAtmView;
    }
}