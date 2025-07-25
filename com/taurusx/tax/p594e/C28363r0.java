package com.taurusx.tax.p594e;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p594e.C28383v0;
import com.taurusx.tax.p604i.C28445h;
import com.taurusx.tax.p618ui.TaxVideoActivity;
import java.net.URI;
import java.util.ArrayList;
import p978t3.WebViewRenderException;

/* renamed from: com.taurusx.tax.e.r0 */
/* loaded from: classes7.dex */
public class C28363r0 extends C28445h implements C28383v0.InterfaceC28384a {

    /* renamed from: b */
    public C28354o f73621b;

    /* renamed from: c */
    public C28338h0 f73622c;

    /* renamed from: d */
    public WebViewClient f73623d;

    /* renamed from: e */
    public boolean f73624e;

    /* renamed from: f */
    public boolean f73625f;

    /* renamed from: g */
    public final EnumC28373j f73626g;

    /* renamed from: h */
    public C28383v0 f73627h;

    /* renamed from: i */
    public boolean f73628i;

    /* renamed from: j */
    public Context f73629j;

    /* renamed from: k */
    public Rect f73630k;

    /* renamed from: l */
    public Rect f73631l;

    /* renamed from: m */
    public C28374k f73632m;

    /* renamed from: n */
    public C28374k f73633n;

    /* renamed from: o */
    public DisplayMetrics f73634o;

    /* renamed from: p */
    public boolean f73635p;

    /* renamed from: q */
    public C28368e f73636q;

    /* renamed from: com.taurusx.tax.e.r0$a */
    /* loaded from: classes7.dex */
    public class View$OnTouchListenerC28364a implements View.OnTouchListener {
        public View$OnTouchListenerC28364a() {
            C28363r0.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:65:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0048  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
                Method dump skipped, instructions count: 280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p594e.C28363r0.View$OnTouchListenerC28364a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.taurusx.tax.e.r0$b */
    /* loaded from: classes7.dex */
    public static class C28365b implements InterfaceC28367d {
    }

    /* renamed from: com.taurusx.tax.e.r0$c */
    /* loaded from: classes7.dex */
    public enum EnumC28366c {
        ENABLED,
        DISABLED
    }

    /* renamed from: com.taurusx.tax.e.r0$d */
    /* loaded from: classes7.dex */
    public interface InterfaceC28367d {
    }

    /* renamed from: com.taurusx.tax.e.r0$e */
    /* loaded from: classes7.dex */
    public static class C28368e {

        /* renamed from: a */
        public InterfaceC28367d f73639a;

        /* renamed from: b */
        public InterfaceC28371h f73640b;

        /* renamed from: c */
        public InterfaceC28372i f73641c;
    }

    /* renamed from: com.taurusx.tax.e.r0$f */
    /* loaded from: classes7.dex */
    public class C28369f extends WebViewClient {
        public C28369f() {
            C28363r0.this = r1;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            LogUtil.m37905d("MraidView", "Loaded resource: " + str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            boolean z;
            String str2;
            int i;
            int i2;
            int i3;
            int i4;
            String obj;
            C28363r0 c28363r0 = C28363r0.this;
            if (!c28363r0.f73624e) {
                c28363r0.post(new RunnableC28377s0(c28363r0, c28363r0));
                C28363r0 c28363r02 = C28363r0.this;
                boolean z2 = false;
                if (c28363r02.getResources().getConfiguration().orientation == 1) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("calculateScreenSize orientation ");
                if (z) {
                    str2 = "portrait";
                } else {
                    str2 = "landscape";
                }
                sb2.append(str2);
                LogUtil.m37905d("MraidView", sb2.toString());
                DisplayMetrics displayMetrics = c28363r02.f73634o;
                int i5 = displayMetrics.widthPixels;
                int i6 = displayMetrics.heightPixels;
                LogUtil.m37905d("MraidView", "calculateScreenSize screen size " + i5 + "x" + i6);
                C28374k c28374k = c28363r02.f73633n;
                if (i5 != c28374k.f73645a || i6 != c28374k.f73646b) {
                    c28374k.f73645a = i5;
                    c28374k.f73646b = i6;
                }
                LogUtil.m37905d("MraidView", "setScreenSize " + c28374k.f73645a + "x" + c28374k.f73646b);
                c28363r02.m38215a("mraid.setScreenSize(" + C28207b.m38465a(i, c28363r02.f73629j) + "," + C28207b.m38465a(i2, c28363r02.f73629j) + ");");
                C28363r0 c28363r03 = C28363r0.this;
                C28374k c28374k2 = c28363r03.f73633n;
                int i7 = c28374k2.f73645a;
                int i8 = c28374k2.f73646b;
                LogUtil.m37905d("MraidView", "calculateMaxSize max size " + i7 + "x" + i8);
                C28374k c28374k3 = c28363r03.f73632m;
                if (i7 != c28374k3.f73645a || i8 != c28374k3.f73646b) {
                    c28374k3.f73645a = i7;
                    c28374k3.f73646b = i8;
                }
                LogUtil.m37905d("MraidView", "setMaxSize " + c28374k3.f73645a + "x" + c28374k3.f73646b);
                c28363r03.m38215a("mraid.setMaxSize(" + C28207b.m38465a(i3, c28363r03.f73629j) + "," + C28207b.m38465a(i4, c28363r03.f73629j) + ");");
                C28338h0 c28338h0 = C28363r0.this.f73622c;
                c28338h0.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C28351m0(c28338h0.f73585m, c28338h0.f73586n));
                arrayList.add(new C28379t0(c28338h0.f73572a.getIsVisible()));
                C28363r0 c28363r04 = c28338h0.f73572a;
                c28363r04.getClass();
                if (arrayList.toString().length() >= 2) {
                    String str3 = "{" + obj.substring(1, obj.length() - 1) + "}";
                    c28363r04.m38215a("window.mraidbridge.fireChangeEvent(" + str3 + ");");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Fire changes: ");
                    sb3.append(str3);
                    LogUtil.m37905d("MraidView", sb3.toString());
                }
                EnumC28375l enumC28375l = EnumC28375l.DEFAULT;
                c28338h0.f73574b = enumC28375l;
                c28338h0.f73572a.m38220a(new C28353n0(enumC28375l));
                Context context = c28338h0.f73572a.getContext();
                C28363r0 c28363r05 = c28338h0.f73572a;
                C28355o0 c28355o0 = new C28355o0();
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:"));
                c28355o0.f73613b = C28207b.m38462a(context, intent);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("sms:"));
                c28355o0.f73612a = C28207b.m38462a(context, intent2);
                c28355o0.f73614c = C28207b.m38432k(context);
                c28355o0.f73616e = C28207b.m38462a(context, new Intent(context, TaxVideoActivity.class));
                c28355o0.f73615d = C28207b.m38431l(context);
                c28363r05.m38220a(c28355o0);
                C28363r0 c28363r06 = C28363r0.this;
                c28363r06.m38220a(new C28347k0(c28363r06.f73626g));
                C28363r0.this.m38215a("window.mraidbridge.fireReadyEvent();");
                if (C28363r0.this.getMraidListener() != null) {
                    ((C28365b) C28363r0.this.getMraidListener()).getClass();
                }
                C28363r0 c28363r07 = C28363r0.this;
                if (c28363r07.getVisibility() == 0) {
                    z2 = true;
                }
                c28363r07.f73628i = z2;
                C28363r0 c28363r08 = C28363r0.this;
                c28363r08.m38220a(new C28379t0(c28363r08.f73628i));
                C28363r0.this.f73624e = true;
                C28445h.InterfaceC28446a interfaceC28446a = C28363r0.this.mWebViewListener;
                if (interfaceC28446a != null) {
                    interfaceC28446a.mo37825a();
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            LogUtil.m37905d("MraidView", "Error: " + str);
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            LogUtil.m37905d("MraidView", "url: " + str);
            String scheme = Uri.parse(str).getScheme();
            C28445h.InterfaceC28446a interfaceC28446a = C28363r0.this.mWebViewListener;
            if (interfaceC28446a != null && interfaceC28446a.mo37823a(str)) {
                return true;
            }
            if ("mraid".equals(scheme)) {
                C28363r0.m38218a(C28363r0.this, URI.create(str));
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.taurusx.tax.e.r0$g */
    /* loaded from: classes7.dex */
    public enum EnumC28370g {
        ALWAYS_VISIBLE,
        ALWAYS_HIDDEN,
        AD_CONTROLLED
    }

    /* renamed from: com.taurusx.tax.e.r0$h */
    /* loaded from: classes7.dex */
    public interface InterfaceC28371h {
        /* renamed from: a */
        void m38211a(C28363r0 c28363r0, boolean z);
    }

    /* renamed from: com.taurusx.tax.e.r0$i */
    /* loaded from: classes7.dex */
    public interface InterfaceC28372i {
        /* renamed from: a */
        void m38210a(C28363r0 c28363r0);
    }

    /* renamed from: com.taurusx.tax.e.r0$j */
    /* loaded from: classes7.dex */
    public enum EnumC28373j {
        INLINE,
        INTERSTITIAL
    }

    /* renamed from: com.taurusx.tax.e.r0$k */
    /* loaded from: classes7.dex */
    public final class C28374k {

        /* renamed from: a */
        public int f73645a;

        /* renamed from: b */
        public int f73646b;

        public C28374k(C28363r0 c28363r0) {
        }

        public /* synthetic */ C28374k(C28363r0 c28363r0, View$OnTouchListenerC28364a view$OnTouchListenerC28364a) {
            this(c28363r0);
        }
    }

    /* renamed from: com.taurusx.tax.e.r0$l */
    /* loaded from: classes7.dex */
    public enum EnumC28375l {
        LOADING,
        DEFAULT,
        EXPANDED,
        RESIZED,
        HIDDEN
    }

    public C28363r0(Context context, boolean z) {
        this(context, EnumC28366c.ENABLED, EnumC28370g.AD_CONTROLLED, EnumC28373j.INLINE);
        this.f73635p = z;
    }

    /* renamed from: c */
    public void m38212c() {
        Rect rect = this.f73631l;
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = this.f73631l.height();
        LogUtil.m37905d("MraidView", "setDefaultPosition [" + i + "," + i2 + "] (" + width + "x" + height + ")");
        m38215a("mraid.setDefaultPosition(" + C28207b.m38465a(i, this.f73629j) + "," + C28207b.m38465a(i2, this.f73629j) + "," + C28207b.m38465a(width, this.f73629j) + "," + C28207b.m38465a(height, this.f73629j) + ");");
    }

    @Override // com.taurusx.tax.p604i.C28445h, android.webkit.WebView
    public void destroy() {
        super.destroy();
    }

    public C28354o getBrowserController() {
        return this.f73621b;
    }

    public C28338h0 getDisplayController() {
        return this.f73622c;
    }

    public boolean getIsVisible() {
        return this.f73628i;
    }

    public InterfaceC28367d getMraidListener() {
        return this.f73636q.f73639a;
    }

    @Deprecated
    public WebViewClient getMraidWebViewClient() {
        return this.f73623d;
    }

    public InterfaceC28371h getOnCloseButtonStateChangeListener() {
        return this.f73636q.f73640b;
    }

    public InterfaceC28372i getOnOpenListener() {
        return this.f73636q.f73641c;
    }

    @Override // com.taurusx.tax.p604i.C28445h
    public void loadHtmlResponse(String str) {
        if (str != null) {
            if (!str.contains("<html>")) {
                str = "<html><head></head><body style='margin:0;padding:0;'>" + str + "</body></html>";
            }
            String replace = str.replace("<head>", "<head><script>" + C28207b.m38460a(this.f73629j, "taurusx_mraid.js") + "</script>");
            if (this.f73635p) {
                replace = replace.replace("<head>", "<head><script>" + C28207b.m38439d(this.f73629j) + "</script>");
            }
            loadDataWithBaseURL("file:///taurusx", replace, "text/html", "UTF-8", null);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (str != null && str.startsWith("javascript:")) {
            super.loadUrl(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C28445h.InterfaceC28446a interfaceC28446a = this.mWebViewListener;
        if (interfaceC28446a != null) {
            interfaceC28446a.mo37822b();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f73628i) {
            this.f73628i = z;
            if (this.f73624e) {
                m38220a(new C28379t0(z));
            }
        }
    }

    @Deprecated
    public void setHasFiredReadyEvent(boolean z) {
        this.f73624e = z;
    }

    @Deprecated
    public void setMraidDisplayController(C28338h0 c28338h0) {
        this.f73622c = c28338h0;
    }

    public void setMraidListener(InterfaceC28367d interfaceC28367d) {
        this.f73636q.f73639a = interfaceC28367d;
    }

    public void setOnCloseButtonStateChange(InterfaceC28371h interfaceC28371h) {
        this.f73636q.f73640b = interfaceC28371h;
    }

    public void setOnOpenListener(InterfaceC28372i interfaceC28372i) {
        this.f73636q.f73641c = interfaceC28372i;
    }

    /* renamed from: a */
    public void m38216a(EnumC28378t enumC28378t, String str) {
        String str2 = enumC28378t.f73651a;
        m38215a("window.mraidbridge.fireErrorEvent('" + str2 + "', '" + str + "');");
    }

    /* renamed from: b */
    public final void m38214b() {
        Rect rect = this.f73630k;
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = this.f73630k.height();
        LogUtil.m37905d("MraidView", "setCurrentPosition [" + i + "," + i2 + "] (" + width + "x" + height + ")");
        m38215a("mraid.setCurrentPosition(" + C28207b.m38465a(i, this.f73629j) + "," + C28207b.m38465a(i2, this.f73629j) + "," + C28207b.m38465a(width, this.f73629j) + "," + C28207b.m38465a(height, this.f73629j) + ");");
    }

    public C28363r0(Context context, EnumC28366c enumC28366c, EnumC28370g enumC28370g, EnumC28373j enumC28373j) {
        super(context);
        this.f73630k = new Rect();
        this.f73631l = new Rect();
        this.f73632m = new C28374k(this, null);
        this.f73633n = new C28374k(this, null);
        this.f73629j = context;
        this.f73626g = enumC28373j;
        C28383v0 c28383v0 = new C28383v0(context, this);
        this.f73627h = c28383v0;
        c28383v0.m38208a(this);
        this.f73628i = getVisibility() == 0;
        this.f73634o = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(this.f73634o);
        m38219a(enumC28366c, enumC28370g);
    }

    /* renamed from: a */
    public final void m38219a(EnumC28366c enumC28366c, EnumC28370g enumC28370g) {
        setScrollContainer(false);
        setBackgroundColor(0);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setOnTouchListener(new View$OnTouchListenerC28364a());
        getSettings().setJavaScriptEnabled(true);
        this.f73621b = new C28354o(this);
        this.f73622c = new C28338h0(this, enumC28366c, enumC28370g);
        C28369f c28369f = new C28369f();
        this.f73623d = c28369f;
        setWebViewClient(c28369f);
        this.f73636q = new C28368e();
    }

    /* renamed from: a */
    public void m38215a(String str) {
        if (str != null) {
            super.loadUrl("javascript:" + str);
        }
    }

    /* renamed from: a */
    public void m38220a(AbstractC28349l0 abstractC28349l0) {
        String str = "{" + abstractC28349l0.toString() + "}";
        m38215a("window.mraidbridge.fireChangeEvent(" + str + ");");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fire change: ");
        sb2.append(str);
        LogUtil.m37905d("MraidView", sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00c3 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m38218a(com.taurusx.tax.p594e.C28363r0 r11, java.net.URI r12) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p594e.C28363r0.m38218a(com.taurusx.tax.e.r0, java.net.URI):boolean");
    }
}
