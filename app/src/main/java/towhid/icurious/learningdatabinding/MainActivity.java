package towhid.icurious.learningdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import towhid.icurious.learningdatabinding.font.FontCache;


public class MainActivity extends AppCompatActivity {

    private RecyclerView list;
    private UserAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        FontCache.getInstance(this).addFont("font", "font.otf");
        DataBindingUtil.setContentView(this, R.layout.activity_main);

        list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        UserModel user1 = new UserModel("user 1", "https://i.stack.imgur.com/9udcy.jpg?s=328&g=1");
        UserModel user2 = new UserModel("user 2", "https://i.stack.imgur.com/9udcy.jpg?s=328&g=1");
        UserModel user3 = new UserModel("user 3", "https://i.stack.imgur.com/9udcy.jpg?s=328&g=1");

        ArrayList<UserModel> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        adapter = new UserAdapter(userList);
        list.setAdapter(adapter);
    }
}
