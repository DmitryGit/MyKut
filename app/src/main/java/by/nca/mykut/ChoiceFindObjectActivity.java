package by.nca.mykut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.CursorLoader;
import android.content.DialogInterface;
import android.content.Loader;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via email/password.
 */
public class ChoiceFindObjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_find_object);

        // получаем элемент ListView
        ListView choice_find_objectList = (ListView) findViewById(R.id.choice_find_objectList);

        // получаем ресурс
        String[] choice_find_object = getResources().getStringArray(R.array.choice_find_object);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, choice_find_object);

        // устанавливаем для списка адаптер
        choice_find_objectList.setAdapter(adapter);

        choice_find_objectList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ChoiceFindObjectActivity.this);
                builder.setTitle("Важное сообщение!")
                        .setMessage("Покормите кота!")
                        .setIcon(R.drawable.ic_launcher_foreground)
                        .setCancelable(false)
                        .setNegativeButton("ОК, иду на кухню",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();

            }

//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(ChoiceFindObjectActivity.this);
//                builder.setTitle("Важное сообщение!")
//                        .setMessage("Покормите кота!")
//                        .setIcon(R.drawable.ic_launcher_foreground)
//                        .setCancelable(false)
//                        .setNegativeButton("ОК, иду на кухню",
//                                new DialogInterface.OnClickListener() {
//                                    public void onClick(DialogInterface dialog, int id) {
//                                        dialog.cancel();
//                                    }
//                                });
//                AlertDialog alert = builder.create();
//                alert.show();
//            }

        });


    }
}

