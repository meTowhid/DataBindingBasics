package towhid.icurious.learningdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import towhid.icurious.learningdatabinding.databinding.UserItemBinding;


/**
 * Created by Towhid on 11/15/2016.
 */
public class UserViewHolder extends RecyclerView.ViewHolder {

    private UserItemBinding binding;

    public UserViewHolder(View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);
    }

    public void bind(UserModel user) {
        binding.setUser(user);
        binding.setHandler(new UserClickHandler(user));
    }
}