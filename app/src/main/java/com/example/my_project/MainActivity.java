package com.example.my_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    List<Chat> phones = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        Adapter adapter = new Adapter(this, phones);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){
        phones.add(new Chat ("Ali Connors", "Brunch this weekend?", "I‘ll ve in your neighborhood doing errands...."));
        phones.add(new Chat ("me, Scott, Jennifer", "Summer BBQ", "Aw dang. Wish I could but I‘m outta town...."));
        phones.add(new Chat ("Sandra Adams", "Oui Oui", "Do you have Paris recommendations? Ha......"));
        phones.add(new Chat ("Trevor Hansen", "Order Confirmation", "Thank you for your recent order from Stev...."));
        phones.add(new Chat ("Britta Holt", "Recipe to try", "We should eat this: Grated Squash, Corn, ...."));
    }
}