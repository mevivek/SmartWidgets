package com.android.smartwidgets;

import android.content.Context;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

@Keep
public class ProgressDialog extends AlertDialog.Builder {
    private AlertDialog alertDialog;

    public ProgressDialog(@NonNull Context context) {
        super(context);
        setView(R.layout.progress_bar);
    }

    @Override
    public AlertDialog show() {
        return alertDialog = super.show();
    }

    public AlertDialog getAlertDialog() {
        return alertDialog;
    }

    public void dismiss() {
        alertDialog.dismiss();
    }
}
