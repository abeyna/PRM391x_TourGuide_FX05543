package funix.prm391x.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton mImbHotel, mImbAtm, mImbHospital, mImbBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImbHotel = (ImageButton) findViewById(R.id.main_activity_imb_hotel);
        mImbAtm = (ImageButton) findViewById(R.id.main_activity_imb_atm);
        mImbHospital = (ImageButton) findViewById(R.id.main_activity_imb_hospital);
        mImbBus = (ImageButton) findViewById(R.id.main_activity_imb_bus);

        mImbHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
                Fragment fragment = new HotelFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.commit();
            }
        });
    }
}