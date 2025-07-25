package com.bytedance.sdk.component.adexpress.p253zx;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.eqN.C7498zx;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.InterfaceC7323bX;
import com.bytedance.sdk.component.p238WR.C7268eqN;
import com.bytedance.sdk.component.p256bg.C7574Ja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.zx.zx */
/* loaded from: classes3.dex */
public class C7566zx {

    /* renamed from: Kg */
    private static int f16483Kg = 10;

    /* renamed from: WR */
    private static volatile C7566zx f16484WR = null;
    private static int ldr = 10;

    /* renamed from: zx */
    private static final byte[] f16485zx = new byte[0];

    /* renamed from: iR */
    private final AtomicBoolean f16489iR = new AtomicBoolean(false);

    /* renamed from: bg */
    private List<C7268eqN> f16488bg = new ArrayList();

    /* renamed from: IL */
    private List<C7268eqN> f16486IL = new ArrayList();

    /* renamed from: bX */
    private Map<Integer, C7562bX> f16487bX = new HashMap();
    private Map<Integer, C7565eqN> eqN = new HashMap();

    private C7566zx() {
        InterfaceC7323bX m89119bX = C7324bg.m89118bg().m89119bX();
        if (m89119bX != null) {
            ldr = m89119bX.mo85783eo();
            f16483Kg = m89119bX.mo85789VB();
        }
    }

    /* renamed from: bg */
    public static C7566zx m88531bg() {
        if (f16484WR == null) {
            synchronized (C7566zx.class) {
                if (f16484WR == null) {
                    f16484WR = new C7566zx();
                }
            }
        }
        return f16484WR;
    }

    /* renamed from: iR */
    private void m88524iR(C7268eqN c7268eqN) {
        c7268eqN.removeAllViews();
        c7268eqN.m89401bX();
        c7268eqN.setWebChromeClient(null);
        c7268eqN.setWebViewClient(null);
        c7268eqN.setDownloadListener(null);
        c7268eqN.setJavaScriptEnabled(true);
        c7268eqN.setAppCacheEnabled(false);
        c7268eqN.setSupportZoom(false);
        c7268eqN.setUseWideViewPort(true);
        c7268eqN.setJavaScriptCanOpenWindowsAutomatically(true);
        c7268eqN.setDomStorageEnabled(true);
        c7268eqN.setBuiltInZoomControls(false);
        c7268eqN.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        c7268eqN.setLoadWithOverviewMode(false);
        c7268eqN.setDefaultTextEncodingName("UTF-8");
        c7268eqN.setDefaultFontSize(16);
    }

    @UiThread
    /* renamed from: IL */
    public void m88534IL(C7268eqN c7268eqN) {
        if (c7268eqN == null) {
            return;
        }
        m88524iR(c7268eqN);
        c7268eqN.m89398b_("SDK_INJECT_GLOBAL");
        ldr(c7268eqN);
        m88526bg(c7268eqN);
    }

    @UiThread
    /* renamed from: bX */
    public void m88532bX(C7268eqN c7268eqN) {
        if (c7268eqN == null) {
            return;
        }
        m88524iR(c7268eqN);
        c7268eqN.m89398b_("SDK_INJECT_GLOBAL");
        ldr(c7268eqN);
        eqN(c7268eqN);
    }

    public void eqN(C7268eqN c7268eqN) {
        if (c7268eqN == null) {
            return;
        }
        if (this.f16488bg.size() >= ldr) {
            try {
                Context context = c7268eqN.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                c7268eqN.mo85614PX();
            } catch (Throwable th) {
                th.getMessage();
            }
        } else if (this.f16488bg.contains(c7268eqN)) {
        } else {
            try {
                Context context2 = c7268eqN.getContext();
                if (context2 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    c7268eqN.setRecycler(true);
                    this.f16488bg.add(c7268eqN);
                    m88533bX();
                }
            } catch (Throwable th2) {
                m88533bX();
                th2.getMessage();
            }
        }
    }

    public void ldr(C7268eqN c7268eqN) {
        if (c7268eqN == null) {
            return;
        }
        C7562bX c7562bX = this.f16487bX.get(Integer.valueOf(c7268eqN.hashCode()));
        if (c7562bX != null) {
            c7562bX.m88555bg(null);
        }
        c7268eqN.m89398b_("SDK_INJECT_GLOBAL");
    }

    /* renamed from: zx */
    public boolean m88523zx(C7268eqN c7268eqN) {
        if (c7268eqN == null) {
            return false;
        }
        try {
            Context context = c7268eqN.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            c7268eqN.mo85614PX();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    @Nullable
    /* renamed from: IL */
    public C7268eqN m88535IL(Context context, String str) {
        if (m88533bX() <= 0) {
            return null;
        }
        if (C7498zx.m88655bg(str) && m88533bX() <= 1) {
            m88533bX();
            return null;
        }
        C7268eqN remove = this.f16488bg.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                m88533bX();
            }
            return remove;
        } catch (Throwable unused) {
            m88533bX();
            return null;
        }
    }

    /* renamed from: bX */
    public int m88533bX() {
        return this.f16488bg.size();
    }

    @Nullable
    /* renamed from: bg */
    public C7268eqN m88529bg(Context context, String str) {
        if (eqN() <= 0) {
            return null;
        }
        if (C7498zx.m88655bg(str) && eqN() <= 1) {
            eqN();
            return null;
        }
        C7268eqN remove = this.f16486IL.remove(0);
        if (remove == null) {
            return null;
        }
        try {
            Context context2 = remove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                remove.setRecycler(false);
                eqN();
            }
            return remove;
        } catch (Throwable unused) {
            eqN();
            return null;
        }
    }

    /* renamed from: IL */
    public void m88537IL() {
        for (C7268eqN c7268eqN : this.f16488bg) {
            if (c7268eqN != null) {
                try {
                    Context context = c7268eqN.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    c7268eqN.mo85614PX();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.f16488bg.clear();
        for (C7268eqN c7268eqN2 : this.f16486IL) {
            if (c7268eqN2 != null) {
                try {
                    Context context2 = c7268eqN2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    c7268eqN2.mo85614PX();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.f16486IL.clear();
    }

    public int eqN() {
        return this.f16486IL.size();
    }

    /* renamed from: bg */
    public void m88526bg(C7268eqN c7268eqN) {
        if (c7268eqN == null) {
            return;
        }
        if (this.f16486IL.size() >= f16483Kg) {
            try {
                Context context = c7268eqN.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                c7268eqN.mo85614PX();
            } catch (Throwable th) {
                th.getMessage();
            }
        } else if (this.f16486IL.contains(c7268eqN)) {
        } else {
            try {
                Context context2 = c7268eqN.getContext();
                if (context2 instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    c7268eqN.setRecycler(true);
                    this.f16486IL.add(c7268eqN);
                    eqN();
                }
            } catch (Throwable th2) {
                eqN();
                th2.getMessage();
            }
        }
    }

    /* renamed from: IL */
    public void m88536IL(int i) {
        synchronized (f16485zx) {
            f16483Kg = i;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    /* renamed from: bg */
    public void m88525bg(C7268eqN c7268eqN, InterfaceC7561IL interfaceC7561IL) {
        if (c7268eqN == null || interfaceC7561IL == null) {
            return;
        }
        C7562bX c7562bX = this.f16487bX.get(Integer.valueOf(c7268eqN.hashCode()));
        if (c7562bX != null) {
            c7562bX.m88555bg(interfaceC7561IL);
        } else {
            c7562bX = new C7562bX(interfaceC7561IL);
            this.f16487bX.put(Integer.valueOf(c7268eqN.hashCode()), c7562bX);
        }
        c7268eqN.m89393bg(c7562bX, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    /* renamed from: bg */
    public void m88528bg(WebView webView, C7574Ja c7574Ja, String str) {
        if (webView == null || c7574Ja == null || TextUtils.isEmpty(str)) {
            return;
        }
        C7565eqN c7565eqN = this.eqN.get(Integer.valueOf(webView.hashCode()));
        if (c7565eqN != null) {
            c7565eqN.m88538bg(c7574Ja);
        } else {
            c7565eqN = new C7565eqN(c7574Ja);
            this.eqN.put(Integer.valueOf(webView.hashCode()), c7565eqN);
        }
        webView.addJavascriptInterface(c7565eqN, str);
    }

    /* renamed from: bg */
    public void m88527bg(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        C7565eqN c7565eqN = this.eqN.get(Integer.valueOf(webView.hashCode()));
        if (c7565eqN != null) {
            c7565eqN.m88538bg(null);
        }
        webView.removeJavascriptInterface(str);
    }

    /* renamed from: bg */
    public void m88530bg(int i) {
        synchronized (f16485zx) {
            ldr = i;
        }
    }
}
