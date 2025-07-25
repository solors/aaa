package com.mbridge.msdk.activity;

import android.os.Build;
import android.os.Bundle;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.BrowserViewMaps;

/* loaded from: classes6.dex */
public class MBCommonActivity extends DomainMBCommonActivity {

    /* renamed from: d */
    public static final /* synthetic */ int f55061d = 0;

    /* renamed from: b */
    private boolean f55062b = false;

    @Override // android.app.Activity
    public void finish() {
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView remove = BrowserViewMaps.f57101a.remove(this.f55052a);
        if (remove != null) {
            remove.setListener(null);
            remove.destroy();
        }
        this.f55062b = true;
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!this.f55062b) {
            BrowserView browserView = this.browserView;
            if (browserView != null) {
                browserView.setListener(null);
                this.browserView.destroy();
            }
            BrowserView remove = BrowserViewMaps.f57101a.remove(this.f55052a);
            if (remove != null) {
                remove.setListener(null);
                remove.destroy();
            }
        }
    }

    public void testfun() {
        SameLogTool.m51824b("ASDFA", "DSFASDFADSFADSFADS");
    }
}
