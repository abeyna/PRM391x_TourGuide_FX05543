package funix.prm391x.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

/**
 * @author Luan N Nguyen
 * @since April 20th 2021
 *                     Main Activity of Project
 */
public class MainActivity extends AppCompatActivity {
    /** Variable stores FrameLayout*/
    private FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFrameLayout = findViewById(R.id.activity_main_frame_layout);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.activity_main_frame_layout, new MenuFragment());
        fragmentTransaction.commit();
    }
}