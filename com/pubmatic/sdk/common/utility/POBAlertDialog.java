package com.pubmatic.sdk.common.utility;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class POBAlertDialog {

    /* loaded from: classes7.dex */
    public interface POBDialogListener {
        void onCancel(DialogInterface dialogInterface, int i);

        void onSuccess(DialogInterface dialogInterface, int i);
    }

    /* renamed from: com.pubmatic.sdk.common.utility.POBAlertDialog$a */
    /* loaded from: classes7.dex */
    class DialogInterface$OnCancelListenerC26723a implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ POBDialogListener f70272a;

        DialogInterface$OnCancelListenerC26723a(POBDialogListener pOBDialogListener) {
            this.f70272a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            this.f70272a.onCancel(dialogInterface, 0);
        }
    }

    /* renamed from: com.pubmatic.sdk.common.utility.POBAlertDialog$b */
    /* loaded from: classes7.dex */
    class DialogInterface$OnClickListenerC26724b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ POBDialogListener f70273a;

        DialogInterface$OnClickListenerC26724b(POBDialogListener pOBDialogListener) {
            this.f70273a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f70273a.onCancel(dialogInterface, i);
        }
    }

    /* renamed from: com.pubmatic.sdk.common.utility.POBAlertDialog$c */
    /* loaded from: classes7.dex */
    class DialogInterface$OnClickListenerC26725c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ POBDialogListener f70274a;

        DialogInterface$OnClickListenerC26725c(POBDialogListener pOBDialogListener) {
            this.f70274a = pOBDialogListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.f70274a.onSuccess(dialogInterface, i);
        }
    }

    @Nullable
    public static AlertDialog.Builder build(Context context, String str, String str2, POBDialogListener pOBDialogListener) {
        boolean z;
        try {
            z = !((Activity) context).isFinishing();
        } catch (Exception unused) {
            z = true;
        }
        if (context != null && z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974374);
            builder.setTitle(str).setMessage(str2).setCancelable(true).setPositiveButton("YES", new DialogInterface$OnClickListenerC26725c(pOBDialogListener)).setNegativeButton("NO", new DialogInterface$OnClickListenerC26724b(pOBDialogListener)).setOnCancelListener(new DialogInterface$OnCancelListenerC26723a(pOBDialogListener)).create();
            return builder;
        }
        return null;
    }
}
