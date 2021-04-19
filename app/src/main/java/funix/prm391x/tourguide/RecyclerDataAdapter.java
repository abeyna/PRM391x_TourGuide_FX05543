package funix.prm391x.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.ViewHolder> {
    private ArrayList<GuidePlace> places;
    private Context context;

    public RecyclerDataAdapter(Context context, ArrayList<GuidePlace> places) {
        this.context = context;
        this.places = places;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.place_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        viewHolder.place_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Test Click "+ places.get(viewHolder.getAdapterPosition()).getUrl(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(places.get(viewHolder.getAdapterPosition()).getUrl()));
                context.startActivity(intent);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(places.get(position).getImage());
        holder.titlePlace.setText(places.get(position).getName());
        holder.descriptionPlace.setText(places.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout place_item;
        ImageView img;
        TextView titlePlace, descriptionPlace;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            place_item = (LinearLayout) itemView.findViewById(R.id.place_item_instance);
            img = (ImageView) itemView.findViewById(R.id.hotel_image);
            titlePlace = (TextView) itemView.findViewById(R.id.place_item_title);
            descriptionPlace = (TextView) itemView.findViewById(R.id.place_item_description);
        }
    }
}