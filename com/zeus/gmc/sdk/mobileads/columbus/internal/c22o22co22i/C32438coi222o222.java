package com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C20517nb;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32581ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.C32727coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.C32177cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.ConstantsUtil;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.coi222o222 */
/* loaded from: classes8.dex */
public class C32438coi222o222 extends C32727coo2iico implements C32177cioccoiococ.InterfaceC32178coo2iico {
    private static final String cioccoiococ = "BaseHtmlWebView";
    private boolean c2oc2i;
    private final C32177cioccoiococ coi222o222;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.coi222o222$coo2iico */
    /* loaded from: classes8.dex */
    public class View$OnTouchListenerC32439coo2iico implements View.OnTouchListener {
        View$OnTouchListenerC32439coo2iico() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            C32438coi222o222.this.coi222o222.coo2iico(motionEvent);
            if (motionEvent.getAction() == 2) {
                return true;
            }
            return false;
        }
    }

    public C32438coi222o222(Context context) {
        super(context);
        c2oc2i();
        getSettings().setJavaScriptEnabled(true);
        C32177cioccoiococ c32177cioccoiococ = new C32177cioccoiococ(context, this, new GestureDetector.SimpleOnGestureListener());
        this.coi222o222 = c32177cioccoiococ;
        c32177cioccoiococ.coo2iico(this);
        enablePlugins(true);
        setBackgroundColor(0);
    }

    private void c2oc2i() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
    }

    void c2oc2o() {
        setOnTouchListener(new View$OnTouchListenerC32439coo2iico());
    }

    public void cioccoiococ() {
        c2oc2o();
    }

    @Override // android.webkit.WebView
    public void loadUrl(@Nullable String str) {
        if (str == null) {
            return;
        }
        if (str.startsWith("javascript:")) {
            super.loadUrl(str);
            return;
        }
        MLog.m25892d(cioccoiococ, "Loading url: " + str);
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (this.mIsDestroyed) {
            MLog.m25883w(cioccoiococ, "stopLoading() called after destroy()");
            return;
        }
        WebSettings settings = getSettings();
        if (settings == null) {
            MLog.m25883w(cioccoiococ, "getSettings() returned null");
            return;
        }
        settings.setJavaScriptEnabled(false);
        super.stopLoading();
        settings.setJavaScriptEnabled(true);
    }

    public void coo2iico(String str) {
        loadDataWithBaseURL(C32581ciii2coi2.coo2iico() + "://" + ConstantsUtil.HOST + RemoteSettings.FORWARD_SLASH_STRING, str, "text/html", C20517nb.f52167N, null);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.C32177cioccoiococ.InterfaceC32178coo2iico
    public void coo2iico() {
        this.c2oc2i = true;
    }
}
