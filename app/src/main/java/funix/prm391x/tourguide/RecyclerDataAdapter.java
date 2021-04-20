package funix.prm391x.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * @author Luan N Nguyen
 * @since April 20th 2021
 *                     RecyclerAdapter for display list of places
 */
public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.ViewHolder> {
    /** ArrayList stores data of items per fragment.*/
    private ArrayList<GuidePlace> mPlacesList;

    /** Context for RecyclerView*/
    private Context mContext;

    /**
     * Constructor for RecyclerAdapter
     * @param context
     *                     Context of RecyclerView.
     * @param places
     *                     List of places.
     */
    public RecyclerDataAdapter(Context context, ArrayList<GuidePlace> places) {
        this.mContext = context;
        this.mPlacesList = places;
    }

    /**
     * Called when RecyclerView needs a new RecyclerView.ViewHolder of the given type to represent a place.
     * @param parent
     *                     The ViewGroup into which the new View will be added after it is bound to an adapter position.
     * @param viewType
     *                     The view type of the new View.
     * @return A new ViewHolder that holds a View of the given view type.
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.place_view_holder_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        // Set event when user click any item in RecyclerView.
        viewHolder.mViewHolderItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(mPlacesList.get(viewHolder.getAdapterPosition()).getUrl()));
                mContext.startActivity(intent);
            }
        });
        return viewHolder;
    }

    /**
     * Update the RecyclerView.ViewHolder contents with the place at the given position and also sets up some private fields to be used by RecyclerView.
     * @param holder
     *                     The view holder whose contents should be updated.
     * @param position
     *                     The position of the holder with respect to this adapter.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mViewHolderImg.setImageResource(mPlacesList.get(position).getImage());
        holder.mViewHolderName.setText(mPlacesList.get(position).getName());
        holder.mViewHolderAddress.setText(mPlacesList.get(position).getAddress());
    }

    /**
     *
     * @return total number of places in the data set held by the adapter.
     */
    @Override
    public int getItemCount() {
        return mPlacesList.size();
    }

    /**
     * Describes a place view and metadata about its place within the RecyclerView.
     */
    public class ViewHolder extends RecyclerView.ViewHolder{
        /** ViewHolder item for click event.*/
        private LinearLayout mViewHolderItem;

        /** Image of Place's view.*/
        private ImageView mViewHolderImg;

        /** Name and address of Place.*/
        private TextView mViewHolderName, mViewHolderAddress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mViewHolderItem = (LinearLayout) itemView.findViewById(R.id.place_view_holder_item_instance);
            mViewHolderImg = (ImageView) itemView.findViewById(R.id.place_view_holder_item_image);
            mViewHolderName = (TextView) itemView.findViewById(R.id.place_view_holder_item_title);
            mViewHolderAddress = (TextView) itemView.findViewById(R.id.place_view_holder_item_address);
        }
    }
}