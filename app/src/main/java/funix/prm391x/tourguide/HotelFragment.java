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
 *                     Hotel Fragment for hotels displaying.
 */
public class HotelFragment extends Fragment {
    /*** RecyclerView for hotels list.*/
    private RecyclerView mRecyclerViewHotel;

    /** ArrayList stores data of hotels.*/
    private ArrayList<GuidePlace> mHotelList = new ArrayList<>();

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
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.hotel_title);

        // View for hotels list.
        View mHotelView = inflater.inflate(R.layout.fragment_place, container, false);

        mRecyclerViewHotel = mHotelView.findViewById(R.id.fragment_place_rv);

        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_01), getResources().getString(R.string.hotel_01_address), getResources().getString(R.string.hotel_01_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_02), getResources().getString(R.string.hotel_02_address), getResources().getString(R.string.hotel_02_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_03), getResources().getString(R.string.hotel_03_address),getResources().getString(R.string.hotel_03_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_04), getResources().getString(R.string.hotel_04_address), getResources().getString(R.string.hotel_04_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_05), getResources().getString(R.string.hotel_05_address), getResources().getString(R.string.hotel_05_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_06), getResources().getString(R.string.hotel_06_address), getResources().getString(R.string.hotel_06_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_07), getResources().getString(R.string.hotel_07_address), getResources().getString(R.string.hotel_07_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_08), getResources().getString(R.string.hotel_08_address), getResources().getString(R.string.hotel_08_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_09), getResources().getString(R.string.hotel_09_address), getResources().getString(R.string.hotel_09_url)));
        mHotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_10), getResources().getString(R.string.hotel_10_address), getResources().getString(R.string.hotel_10_url)));

        LinearLayoutManager layoutManager = new LinearLayoutManager(mHotelView.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewHotel.setLayoutManager(layoutManager);
        mRecyclerViewHotel.setHasFixedSize(true);
        mRecyclerViewHotel.setAdapter(new RecyclerDataAdapter(mHotelView.getContext(), mHotelList));
        return mHotelView;
    }
}