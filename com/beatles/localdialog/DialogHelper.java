package com.beatles.localdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes2.dex */
public class DialogHelper {
    private static volatile boolean isShowDialog;

    public static boolean isShowDialog() {
        return isShowDialog;
    }

    public static void show(String str, String str2, String str3, String str4) {
        showDialog(UnityPlayer.currentActivity, str, str2, str3, str4);
    }

    public static void showDialog(final Activity activity, final String str, final String str2, final String str3, final String str4) {
        isShowDialog = false;
        activity.runOnUiThread(new Runnable() { // from class: com.beatles.localdialog.DialogHelper.1
            @Override // java.lang.Runnable
            public void run() {
                View inflate = activity.getLayoutInflater().inflate(C6312R.C6317layout.dialog, (ViewGroup) null);
                inflate.setSystemUiVisibility(inflate.getSystemUiVisibility() & (-3));
                TextView textView = (TextView) inflate.findViewById(C6312R.C6315id.dialogtextView1);
                textView.setSystemUiVisibility(textView.getSystemUiVisibility() | 512);
                textView.setText(Html.fromHtml(str));
                AlertDialog.Builder cancelable = new AlertDialog.Builder(new ContextThemeWrapper(activity, C6312R.C6319style.Theme_AppCompat_Light)).setCancelable(false);
                cancelable.setView(inflate).setPositiveButton(str2, new DialogInterface.OnClickListener() { // from class: com.beatles.localdialog.DialogHelper.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        RunnableC63101 runnableC63101 = RunnableC63101.this;
                        UnityPlayer.UnitySendMessage(str3, str4, "");
                        dialogInterface.dismiss();
                        boolean unused = DialogHelper.isShowDialog = false;
                    }
                });
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                cancelable.show();
                boolean unused = DialogHelper.isShowDialog = true;
            }
        });
    }
}
