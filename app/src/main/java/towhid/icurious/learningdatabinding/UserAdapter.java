package towhid.icurious.learningdatabinding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Towhid on 11/15/2016.
 */
public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private final List<UserModel> users;

    public UserAdapter(List<UserModel> users) {
        this.users = users;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View statusContainer = inflater.inflate(R.layout.user_item, parent, false);
        return new UserViewHolder(statusContainer);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        UserModel status = users.get(position);
        holder.bind(status);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}