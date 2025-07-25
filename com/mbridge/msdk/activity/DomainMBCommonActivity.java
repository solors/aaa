package com.mbridge.msdk.activity;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameSDKTool;
import com.mbridge.msdk.foundation.tools.ViewUtil;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.BrowserViewMaps;

/* loaded from: classes6.dex */
public class DomainMBCommonActivity extends Activity {

    /* renamed from: a */
    String f55052a = "";

    /* renamed from: b */
    private final BrowserView.InterfaceC22079a f55053b = new BrowserView.InterfaceC22079a() { // from class: com.mbridge.msdk.activity.DomainMBCommonActivity.1
        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC22079a
        /* renamed from: a */
        public final void mo51590a(WebView webView, int i, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC22079a
        /* renamed from: b */
        public final boolean mo51582b(WebView webView, String str) {
            SameLogTool.m51824b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (SameSDKTool.C22043a.m51777b(str) && SameSDKTool.C22043a.m51780a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.m53529a(webView, str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC22079a
        /* renamed from: c */
        public final void mo51579c(WebView webView, String str) {
            SameLogTool.m51824b("MBCommonActivity", "onPageFinished  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC22079a
        /* renamed from: a */
        public final void mo51589a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC22079a
        /* renamed from: a */
        public final void mo51592a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.InterfaceC22079a
        /* renamed from: a */
        public final void mo51588a(WebView webView, String str, Bitmap bitmap) {
            SameLogTool.m51824b("MBCommonActivity", "onPageStarted  " + str);
        }
    };
    protected BrowserView browserView;

    /* renamed from: c */
    private CampaignEx f55054c;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            SameLogTool.m51824b("MBCommonActivity", th.getMessage());
        }
        if (MBSDKContext.m52746m().m52792c() == null) {
            MBSDKContext.m52746m().m52794b(getApplicationContext());
        }
        MBSDKContext.m52746m().m52803a(this);
        String stringExtra = getIntent().getStringExtra("url");
        this.f55052a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f55054c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
            if (BrowserViewMaps.f57101a.containsKey(this.f55052a)) {
                BrowserView browserView = BrowserViewMaps.f57101a.get(this.f55052a);
                this.browserView = browserView;
                if (browserView != null) {
                    browserView.setListener(this.f55053b);
                }
            } else {
                BrowserView browserView2 = new BrowserView(this, this.f55054c);
                this.browserView = browserView2;
                browserView2.setListener(this.f55053b);
                this.browserView.loadUrl(this.f55052a);
            }
            BrowserView browserView3 = this.browserView;
            if (browserView3 != null) {
                ViewUtil.m51671a(browserView3);
                setContentView(this.browserView);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[Catch: all -> 0x00f5, TRY_LEAVE, TryCatch #2 {all -> 0x00f5, blocks: (B:3:0x0007, B:6:0x000e, B:9:0x001f, B:16:0x0030, B:19:0x003c, B:53:0x00cf, B:55:0x00d5, B:57:0x00de, B:59:0x00e4, B:61:0x00ea, B:21:0x0046, B:23:0x0051, B:29:0x0069, B:24:0x0056, B:26:0x0060, B:38:0x0097, B:40:0x00a3, B:42:0x00b1, B:48:0x00c1, B:30:0x006f, B:32:0x0079, B:34:0x0083), top: B:70:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #2 {all -> 0x00f5, blocks: (B:3:0x0007, B:6:0x000e, B:9:0x001f, B:16:0x0030, B:19:0x003c, B:53:0x00cf, B:55:0x00d5, B:57:0x00de, B:59:0x00e4, B:61:0x00ea, B:21:0x0046, B:23:0x0051, B:29:0x0069, B:24:0x0056, B:26:0x0060, B:38:0x0097, B:40:0x00a3, B:42:0x00b1, B:48:0x00c1, B:30:0x006f, B:32:0x0079, B:34:0x0083), top: B:70:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m53529a(android.webkit.WebView r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.DomainMBCommonActivity.m53529a(android.webkit.WebView, java.lang.String):boolean");
    }
}
