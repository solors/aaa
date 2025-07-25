package com.five_corp.p372ad.internal.view;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.five_corp.ad.internal.view.r */
/* loaded from: classes4.dex */
public final class DialogFragmentC14148r extends DialogFragment {

    /* renamed from: a */
    public static final String f26807a = "com.five_corp.ad.internal.view.r";

    /* renamed from: b */
    public static final String f26808b;

    static {
        String name = DialogFragmentC14148r.class.getName();
        f26808b = name + "bundle.key.url";
    }

    /* renamed from: a */
    public static void m78054a(Activity activity, String str) {
        DialogFragmentC14148r dialogFragmentC14148r = new DialogFragmentC14148r();
        Bundle bundle = new Bundle();
        bundle.putString(f26808b, str);
        dialogFragmentC14148r.setArguments(bundle);
        dialogFragmentC14148r.show(activity.getFragmentManager(), f26807a);
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        WebViewClient webViewClient;
        WebView webView = new WebView(getActivity());
        if (Build.VERSION.SDK_INT >= 26) {
            webViewClient = new C14147q();
        } else {
            webViewClient = new WebViewClient();
        }
        webView.setWebViewClient(webViewClient);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setOnKeyListener(new View$OnKeyListenerC14146p(webView));
        Bundle arguments = getArguments();
        if (arguments != null) {
            webView.loadUrl(arguments.getString(f26808b));
        }
        Dialog dialog = new Dialog(getActivity(), 16973841);
        dialog.setContentView(webView);
        return dialog;
    }
}
