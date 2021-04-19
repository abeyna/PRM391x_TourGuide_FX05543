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

public class HotelFragment extends Fragment {
    private RecyclerView mRecyclerViewHotel;
    private ArrayList<GuidePlace> hotelList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.hotel_title);

        View layout = inflater.inflate(R.layout.fragment_place, container, false);

        mRecyclerViewHotel = layout.findViewById(R.id.fragment_place_rv);

        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_01), getResources().getString(R.string.hotel_01_address), getResources().getString(R.string.hotel_01_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_02), getResources().getString(R.string.hotel_02_address), getResources().getString(R.string.hotel_02_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_03), getResources().getString(R.string.hotel_03_address),getResources().getString(R.string.hotel_03_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_04), getResources().getString(R.string.hotel_04_address), getResources().getString(R.string.hotel_04_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_05), getResources().getString(R.string.hotel_05_address), getResources().getString(R.string.hotel_05_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_06), getResources().getString(R.string.hotel_06_address), getResources().getString(R.string.hotel_06_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_07), getResources().getString(R.string.hotel_07_address), getResources().getString(R.string.hotel_07_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_08), getResources().getString(R.string.hotel_08_address), getResources().getString(R.string.hotel_08_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_09), getResources().getString(R.string.hotel_09_address), getResources().getString(R.string.hotel_09_url)));
        hotelList.add(new GuidePlace(R.drawable.hotel, getResources().getString(R.string.hotel_10), getResources().getString(R.string.hotel_10_address), getResources().getString(R.string.hotel_10_url)));

        LinearLayoutManager layoutManager = new LinearLayoutManager(layout.getContext(), LinearLayoutManager.VERTICAL, false);
        mRecyclerViewHotel.setLayoutManager(layoutManager);
        mRecyclerViewHotel.setHasFixedSize(true);
        mRecyclerViewHotel.setAdapter(new RecyclerDataAdapter(layout.getContext(), hotelList));
        return layout;
    }
}