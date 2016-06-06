package com.example.keverly1.todolist2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//Add the following
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //our list
    ArrayList<String> listItems = new ArrayList<String>();
    private int selectedIndex;

    //our UI elements
    private TextView myTextView;
    private Button addButton;
    private Button deleteButton;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //don't worry about these lines
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //populate our list
//        listItems.add("BMW");
//        listItems.add("Lambo");
//        listItems.add("Ferrari");

        //Add "listItems" to the list view.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, listItems);
        //MyCustomAdapter adapter = new MyCustomAdapter(MainActivity.this, R.layout.row, listItems);
        listView = (ListView)findViewById(R.id.myListView); //"myListView" is whatever you named the ListView
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> myAdapter, View myView, int myItemInt, long mylng) {
                String selectedFromList =(String) (listView.getItemAtPosition(myItemInt));
                selectedIndex = myItemInt;
                System.out.println(selectedIndex);

            }
        });

        myTextView = (TextView)findViewById(R.id.myTextView);
        addButton = (Button)findViewById(R.id.addButton);
        deleteButton = (Button)findViewById(R.id.deleteButton);

        addButton.setOnClickListener(this);
        deleteButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v.getId() == R.id.addButton) {
            String textFromField = myTextView.getText().toString();
            listItems.add(textFromField);
            System.out.println(listItems);
            ( (BaseAdapter)listView.getAdapter()).notifyDataSetChanged();
        }else if(v.getId() == R.id.deleteButton){
            System.out.println(listItems.remove(selectedIndex));
            ( (BaseAdapter)listView.getAdapter()).notifyDataSetChanged();
        }
    }
}
