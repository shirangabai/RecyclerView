package shirangabai.recyclerviewmy.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import shirangabai.recyclerviewmy.R;
import shirangabai.recyclerviewmy.model.User;

/**
 * Created by shiran on 25/10/2016.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder>{
    private static final String TAG = "shiran";
    private User[]users;
    private LayoutInflater inflater;

    public UserAdapter(User[]users , Context c) {
        this.inflater = LayoutInflater.from(c);
        this.users = users;
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_user ,parent , false);
        Log.i(TAG, "onCreateViewHolder: ");
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {
        User item = users[position];

        holder.name.setText(item.getName());
        holder.phone.setText(item.getPhone());
        holder.favorite.setChecked(item.isFavorite());
        holder.image.setImageResource(item.getImage());

    }

    @Override
    public int getItemCount() {
        return users.length;
    }

    class UserHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView phone;
        private ImageView image;
        private CheckBox favorite;
        private View container;

        public UserHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.lbl_user_name);
            phone = (TextView) itemView.findViewById(R.id.lbl_user_phone);
            image = (ImageView) itemView.findViewById(R.id.lbl_user_image);
            favorite = (CheckBox) itemView.findViewById(R.id.lbl_user_favorite);
            container = itemView.findViewById(R.id.layout_container_item_root);

        }
    }


}
