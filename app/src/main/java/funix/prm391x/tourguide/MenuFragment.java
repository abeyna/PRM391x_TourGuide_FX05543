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
 * @author Luan N Nguyen
 * @since April 20th 2021
 * MenuFragment for main display.
 */
public class MenuFragment extends Fragment {
    /** Variables for ImageButtons include Hotel, ATM, Hospital and Bus Station*/
    private ImageButton mImBHotel, mImBAtm, mImBHospital, mImBBus;

    public MenuFragment() {
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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Display project's title on ActionBar.
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(R.string.app_name);

        // Inflate the layout for Menu Fragment.
        View mMenuView = inflater.inflate(R.layout.fragment_menu, container, false);
        mImBHotel = mMenuView.findViewById(R.id.main_activity_imb_hotel);
        mImBAtm = mMenuView.findViewById(R.id.main_activity_imb_atm);
        mImBHospital = mMenuView.findViewById(R.id.main_activity_imb_hospital);
        mImBBus = mMenuView.findViewById(R.id.main_activity_imb_bus);

        // Set click event for Hotel ImageButton.
        mImBHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment hotelFragment = new HotelFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.activity_main_frame_layout, hotelFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        // Set click event for ATM ImageButton.
        mImBAtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment atmFragment = new AtmFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.activity_main_frame_layout, atmFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        // Set click event for Hospital ImageButton.
        mImBHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment hospitalFragment = new HospitalFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.activity_main_frame_layout, hospitalFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        // Set click event for Bus ImageButton.
        mImBBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment busFragment = new BusFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.activity_main_frame_layout, busFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return mMenuView;
    }
}