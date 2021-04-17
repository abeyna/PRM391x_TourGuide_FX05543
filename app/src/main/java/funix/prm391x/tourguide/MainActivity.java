package funix.prm391x.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private ImageButton mImbHotel, mImbAtm, mImbHospital, mImbBus;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.frame_layout);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, new MenuFragment());
        fragmentTransaction.commit();

//        mImbHotel = (ImageButton) findViewById(R.id.main_activity_imb_hotel);
//        mImbAtm = (ImageButton) findViewById(R.id.main_activity_imb_atm);
//        mImbHospital = (ImageButton) findViewById(R.id.main_activity_imb_hospital);
//        mImbBus = (ImageButton) findViewById(R.id.main_activity_imb_bus);
//
//        mImbHotel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
//                Fragment fragment = new HotelFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                fragmentTransaction.commit();
//            }
//        });
    }
}