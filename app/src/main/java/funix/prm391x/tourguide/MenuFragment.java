package funix.prm391x.tourguide;

import android.app.ActionBar;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuFragment extends Fragment {
    private ImageButton mImBHotel, mImBAtm, mImBHospital, mImBBus;

    public MenuFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuFragment newInstance(String param1, String param2) {
        MenuFragment fragment = new MenuFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.app_name);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_menu, container, false);
        mImBHotel = layout.findViewById(R.id.main_activity_imb_hotel);
        mImBAtm = layout.findViewById(R.id.main_activity_imb_atm);
        mImBHospital = layout.findViewById(R.id.main_activity_imb_hospital);
        mImBBus = layout.findViewById(R.id.main_activity_imb_bus);

        mImBHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment hotelFragment = new HotelFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, hotelFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        mImBAtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment atmFragment = new AtmFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, atmFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        mImBHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment hospitalFragment = new HospitalFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, hospitalFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        mImBBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment busFragment = new BusFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_layout, busFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return layout;
    }
}