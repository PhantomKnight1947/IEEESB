package com.example.ieee_sb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class GalleryActivity extends AppCompatActivity {
    private GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        grid = findViewById(R.id.gallery_grid);

        grid.setAdapter(new GalleryAdapter(this));

//        StorageReference storageReference = firebaseStorage.getReference();
//        storageReference.child("gallery").getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//            @Override
//            public void onSuccess(Uri uri) {
//            }
//        });
    }
}
