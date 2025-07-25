package com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32577cicc2iiccc;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.coo2iico */
/* loaded from: classes8.dex */
public class C32727coo2iico extends WebView {
    private static boolean coo2iico = false;
    protected boolean mIsDestroyed;

    public C32727coo2iico(Context context) {
        super(context.getApplicationContext());
        enablePlugins(false);
        coi222o222();
        C32577cicc2iiccc.coi222o222(this);
        if (!coo2iico) {
            coo2iico(getContext());
            coo2iico = true;
        }
    }

    private void coi222o222() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.mIsDestroyed) {
            return;
        }
        this.mIsDestroyed = true;
        C32724c2oc2o.coi222o222(this);
        removeAllViews();
        super.destroy();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void enableJavascriptCaching() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C32577cicc2iiccc.coo2iico(this);
    }

    private void coo2iico(@NonNull Context context) {
    }

    public void enablePlugins(boolean z) {
    }
}
