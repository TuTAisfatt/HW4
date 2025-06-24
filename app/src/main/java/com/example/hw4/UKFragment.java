package com.example.hw4;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class UKFragment extends Fragment {

    public UKFragment() {
        // Links this fragment to its layout file
        super(R.layout.fragment_u_k);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Show a loading dialog for 1 second
        ProgressDialog dialog = new ProgressDialog(getContext());
        dialog.setMessage("Loading...");
        dialog.setCancelable(false);
        dialog.show();

        new Handler().postDelayed(dialog::dismiss, 1000);
    }
}
