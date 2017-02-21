package shirangabai.recyclerviewmy.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import shirangabai.recyclerviewmy.R;
import shirangabai.recyclerviewmy.adapter.UserAdapter;
import shirangabai.recyclerviewmy.model.DB;

public class UserListActivity extends AppCompatActivity {

    private RecyclerView recView;
    private UserAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        recView = (RecyclerView) findViewById(R.id.rec_list);
        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new UserAdapter(DB.getUsers(), this);
        recView.setAdapter(adapter);

    }
}
