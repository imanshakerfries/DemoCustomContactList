package sg.edu.rp.c346.id21014919.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<contact> alContact;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        alContact = new ArrayList<contact>();
        contact item1 = new contact("Mary", 65, 97442334, 'M');
        alContact.add(item1);

        contact item2 = new contact("Ken", 65, 97442437, 'M');
        alContact.add(item2);

        caContact = new CustomAdapter(this, R.layout.row, alContact);
        lvContact.setAdapter(caContact);

    }
}