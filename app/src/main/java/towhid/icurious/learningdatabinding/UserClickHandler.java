package towhid.icurious.learningdatabinding;


import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by Towhid on 11/15/2016.
 */
public class UserClickHandler {
    private final UserModel user;

    public UserClickHandler(UserModel user) {
        this.user = user;
    }

    public void onClick(View view) {
        Snackbar.make(view, user.name + " is selected", Snackbar.LENGTH_LONG).show();
    }
}