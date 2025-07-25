package com.p551my.target;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.maticoo.sdk.mraid.Consts;
import com.p551my.target.C26268z5;
import java.net.URI;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.my.target.u5 */
/* loaded from: classes7.dex */
public class C26135u5 {

    /* renamed from: a */
    public final String f67997a;

    /* renamed from: b */
    public final WebViewClient f67998b = new C26137b();

    /* renamed from: c */
    public InterfaceC26136a f67999c;

    /* renamed from: d */
    public C26268z5 f68000d;

    /* renamed from: e */
    public boolean f68001e;

    /* renamed from: f */
    public boolean f68002f;

    /* renamed from: com.my.target.u5$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26136a {
        /* renamed from: a */
        void mo42497a(Uri uri);

        /* renamed from: a */
        void mo42495a(C26135u5 c26135u5, WebView webView);

        /* renamed from: a */
        void mo42492a(boolean z);

        /* renamed from: a */
        boolean mo42499a(float f, float f2);

        /* renamed from: a */
        boolean mo42498a(int i, int i2, int i3, int i4, boolean z, int i5);

        /* renamed from: a */
        boolean mo42496a(ConsoleMessage consoleMessage, C26135u5 c26135u5);

        /* renamed from: a */
        boolean mo42494a(String str);

        /* renamed from: a */
        boolean mo42493a(String str, JsResult jsResult);

        /* renamed from: a */
        boolean mo42491a(boolean z, C26191w5 c26191w5);

        /* renamed from: b */
        void mo42490b();

        /* renamed from: b */
        boolean mo42489b(Uri uri);

        /* renamed from: c */
        void mo42488c();

        /* renamed from: d */
        void mo42487d();

        /* renamed from: e */
        boolean mo42486e();
    }

    /* renamed from: com.my.target.u5$b */
    /* loaded from: classes7.dex */
    public class C26137b extends AbstractC25751f6 {
        public C26137b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C26135u5.this.m42768b();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            AbstractC25846ja.m43680a("MraidBridge: Error - " + str);
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C26135u5.this.m42777a(webResourceRequest.getUrl());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C26135u5.this.m42777a(Uri.parse(str));
            return true;
        }
    }

    /* renamed from: com.my.target.u5$c */
    /* loaded from: classes7.dex */
    public static class C26138c {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static int m42759a(String str) {
            char c;
            if (str == null) {
                return 53;
            }
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1314880604:
                    if (str.equals("top-right")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1012429441:
                    if (str.equals("top-left")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -655373719:
                    if (str.equals("bottom-left")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1163912186:
                    if (str.equals("bottom-right")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1288627767:
                    if (str.equals(Consts.ResizePropertiesCCPositionBottomCenter)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1755462605:
                    if (str.equals(Consts.ResizePropertiesCCPositionTopCenter)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    return 53;
                                }
                                return 81;
                            }
                            return 49;
                        }
                        return 85;
                    }
                    return 83;
                }
                return 17;
            }
            return 51;
        }
    }

    /* renamed from: com.my.target.u5$d */
    /* loaded from: classes7.dex */
    public class C26139d extends WebChromeClient {
        public C26139d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String message = consoleMessage.message();
            int lineNumber = consoleMessage.lineNumber();
            AbstractC25846ja.m43680a("MraidBridge: JS console message - " + message + " - at line " + lineNumber);
            C26135u5 c26135u5 = C26135u5.this;
            InterfaceC26136a interfaceC26136a = c26135u5.f67999c;
            if (interfaceC26136a != null) {
                return interfaceC26136a.mo42496a(consoleMessage, c26135u5);
            }
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            InterfaceC26136a interfaceC26136a = C26135u5.this.f67999c;
            if (interfaceC26136a != null) {
                return interfaceC26136a.mo42493a(str2, jsResult);
            }
            return super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    /* renamed from: com.my.target.u5$e */
    /* loaded from: classes7.dex */
    public class C26140e implements C26268z5.InterfaceC26269a {
        public C26140e() {
        }

        @Override // com.p551my.target.C26268z5.InterfaceC26269a
        /* renamed from: a */
        public void mo42247a(boolean z) {
            InterfaceC26136a interfaceC26136a = C26135u5.this.f67999c;
            if (interfaceC26136a != null) {
                interfaceC26136a.mo42492a(z);
            }
        }

        @Override // com.p551my.target.C26268z5.InterfaceC26269a
        /* renamed from: b */
        public void mo42246b() {
            InterfaceC26136a interfaceC26136a = C26135u5.this.f67999c;
            if (interfaceC26136a != null) {
                interfaceC26136a.mo42490b();
            }
        }
    }

    public C26135u5(String str) {
        this.f67997a = str;
    }

    /* renamed from: a */
    public void m42773a(C26268z5 c26268z5) {
        this.f68000d = c26268z5;
        WebSettings settings = c26268z5.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            if ("interstitial".equals(this.f67997a)) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        }
        this.f68000d.setScrollContainer(false);
        this.f68000d.setVerticalScrollBarEnabled(false);
        this.f68000d.setHorizontalScrollBarEnabled(false);
        this.f68000d.setWebViewClient(this.f67998b);
        this.f68000d.setWebChromeClient(new C26139d());
        this.f68000d.setVisibilityChangedListener(new C26140e());
    }

    /* renamed from: b */
    public final void m42768b() {
        if (this.f68001e) {
            return;
        }
        this.f68001e = true;
        InterfaceC26136a interfaceC26136a = this.f67999c;
        if (interfaceC26136a != null) {
            interfaceC26136a.mo42495a(this, this.f68000d.getWebView());
        }
    }

    /* renamed from: c */
    public boolean m42765c() {
        C26268z5 c26268z5 = this.f68000d;
        return c26268z5 != null && c26268z5.m42249h();
    }

    /* renamed from: d */
    public void m42762d(String str) {
        m42772a("mraidbridge.setPlacementType(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: e */
    public void m42761e(String str) {
        m42772a("mraidbridge.setState(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: f */
    public void m42760f(String str) {
        C26268z5 c26268z5 = this.f68000d;
        if (c26268z5 == null) {
            AbstractC25846ja.m43680a("MraidBridge: MRAID bridge called setContentHtml before WebView was attached");
            return;
        }
        this.f68001e = false;
        c26268z5.m43814a("https://ad.mail.ru/", str, "text/html", "UTF-8", null);
    }

    /* renamed from: b */
    public static C26135u5 m42766b(String str) {
        return new C26135u5(str);
    }

    /* renamed from: a */
    public void m42779a() {
        this.f68000d = null;
    }

    /* renamed from: c */
    public final void m42764c(String str) {
        m42772a("mraidbridge.nativeComplete(" + JSONObject.quote(str) + ")");
    }

    /* renamed from: d */
    public void m42763d() {
        m42772a("mraidbridge.fireReadyEvent()");
    }

    /* renamed from: a */
    public void m42771a(String str, String str2) {
        m42772a("mraidbridge.fireErrorEvent(" + JSONObject.quote(str2) + ", " + JSONObject.quote(str) + ")");
    }

    /* renamed from: b */
    public final String m42767b(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    /* renamed from: a */
    public void m42777a(Uri uri) {
        InterfaceC26136a interfaceC26136a;
        JSONObject jSONObject;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if ("mytarget".equals(scheme)) {
            if ("onloadmraidjs".equals(host)) {
                AbstractC25846ja.m43680a("MraidBridge: JS call onLoad");
            }
            AbstractC25846ja.m43680a("MraidBridge: Got mytarget scheme - " + uri);
        } else if (!"mraid".equals(scheme)) {
            try {
                new URI(uri.toString());
                C26268z5 c26268z5 = this.f68000d;
                if (c26268z5 == null || !c26268z5.m42251g() || (interfaceC26136a = this.f67999c) == null) {
                    return;
                }
                interfaceC26136a.mo42497a(uri);
            } catch (Throwable unused) {
                AbstractC25846ja.m43680a("MraidBridge: Invalid MRAID URL - " + uri);
                m42771a("", "Mraid command sent an invalid URL");
            }
        } else {
            if (host.contains(",")) {
                host = host.substring(0, host.indexOf(",")).trim();
            }
            AbstractC25846ja.m43680a("MraidBridge: Got mraid command - " + uri);
            String uri2 = uri.toString();
            C26164v5 c26164v5 = new C26164v5(host, this.f67997a);
            m42764c(c26164v5.toString());
            int indexOf = uri2.indexOf("{");
            int lastIndexOf = uri2.lastIndexOf("}") + 1;
            if (indexOf >= 0 && lastIndexOf > 0 && indexOf < lastIndexOf) {
                try {
                    if (lastIndexOf <= uri2.length()) {
                        jSONObject = new JSONObject(uri2.substring(indexOf, lastIndexOf));
                        m42775a(c26164v5, jSONObject);
                    }
                } catch (Throwable th) {
                    m42771a(c26164v5.toString(), th.getMessage());
                    return;
                }
            }
            jSONObject = null;
            m42775a(c26164v5, jSONObject);
        }
    }

    /* renamed from: a */
    public final void m42772a(String str) {
        if (this.f68000d == null) {
            AbstractC25846ja.m43680a("MraidBridge: Attempted to inject Javascript into MRAID WebView while was not attached - \n\t" + str);
            return;
        }
        String str2 = "javascript:window." + str + ";";
        AbstractC25846ja.m43680a("MraidBridge: Injecting Javascript into MRAID WebView " + hashCode() + " - " + str2);
        this.f68000d.m43815a(str2);
    }

    /* renamed from: a */
    public void m42774a(C26246y5 c26246y5) {
        m42772a("mraidbridge.setScreenSize(" + m42767b(c26246y5.m42340d()) + ");window.mraidbridge.setMaxSize(" + m42767b(c26246y5.m42342c()) + ");window.mraidbridge.setCurrentPosition(" + m42778a(c26246y5.m42348a()) + ");window.mraidbridge.setDefaultPosition(" + m42778a(c26246y5.m42344b()) + ")");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mraidbridge.fireSizeChangeEvent(");
        sb2.append(m42767b(c26246y5.m42348a()));
        sb2.append(")");
        m42772a(sb2.toString());
    }

    /* renamed from: a */
    public void m42770a(ArrayList arrayList) {
        m42772a("mraidbridge.setSupports(" + TextUtils.join(",", arrayList) + ")");
    }

    /* renamed from: a */
    public void m42769a(boolean z) {
        if (z != this.f68002f) {
            m42772a("mraidbridge.setIsViewable(" + z + ")");
        }
        this.f68002f = z;
    }

    /* renamed from: a */
    public boolean m42775a(C26164v5 c26164v5, JSONObject jSONObject) {
        C26268z5 c26268z5;
        String c26164v52 = c26164v5.toString();
        if (c26164v5.f68055a && (c26268z5 = this.f68000d) != null && !c26268z5.m42251g()) {
            m42771a(c26164v52, "Cannot execute this command unless the user clicks");
            return false;
        } else if (this.f67999c == null) {
            m42771a(c26164v52, "Invalid state to execute this command");
            return false;
        } else if (this.f68000d == null) {
            m42771a(c26164v52, "The current WebView is being destroyed");
            return false;
        } else {
            c26164v52.hashCode();
            char c = 65535;
            switch (c26164v52.hashCode()) {
                case -1910759310:
                    if (c26164v52.equals("vpaidInit")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1886160473:
                    if (c26164v52.equals("playVideo")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1289167206:
                    if (c26164v52.equals("expand")) {
                        c = 2;
                        break;
                    }
                    break;
                case -934437708:
                    if (c26164v52.equals("resize")) {
                        c = 3;
                        break;
                    }
                    break;
                case -733616544:
                    if (c26164v52.equals(Consts.CommandCreateCalendarEvent)) {
                        c = 4;
                        break;
                    }
                    break;
                case 0:
                    if (c26164v52.equals("")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3417674:
                    if (c26164v52.equals("open")) {
                        c = 6;
                        break;
                    }
                    break;
                case 94756344:
                    if (c26164v52.equals("close")) {
                        c = 7;
                        break;
                    }
                    break;
                case 133423073:
                    if (c26164v52.equals("setOrientationProperties")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 459238621:
                    if (c26164v52.equals("storePicture")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 624734601:
                    if (c26164v52.equals(Consts.CommandSetResizeProperties)) {
                        c = '\n';
                        break;
                    }
                    break;
                case 892543864:
                    if (c26164v52.equals("vpaidEvent")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1797992422:
                    if (c26164v52.equals("playheadEvent")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f67999c.mo42487d();
                    break;
                case 1:
                    AbstractC25846ja.m43680a("MraidBridge: playVideo is currently unsupported");
                    return false;
                case 2:
                    return this.f67999c.mo42489b(jSONObject != null ? Uri.parse(jSONObject.getString("url")) : null);
                case 3:
                    return this.f67999c.mo42486e();
                case 4:
                    AbstractC25846ja.m43680a("MraidBridge: createCalendarEvent is currently unsupported");
                    return false;
                case 5:
                    m42771a(c26164v52, "Unspecified MRAID Javascript command");
                    return false;
                case 6:
                    if (jSONObject != null) {
                        this.f67999c.mo42497a(Uri.parse(jSONObject.getString("url")));
                        break;
                    } else {
                        m42771a(c26164v52, "open params cannot be null");
                        return false;
                    }
                case 7:
                    this.f67999c.mo42488c();
                    break;
                case '\b':
                    if (jSONObject == null) {
                        m42771a(c26164v52, "setOrientationProperties params cannot be null");
                        return false;
                    }
                    boolean z = jSONObject.getBoolean(Consts.OrientationPpropertiesAllowOrientationChange);
                    String string = jSONObject.getString(Consts.OrientationPpropertiesForceOrientation);
                    C26191w5 m42587a = C26191w5.m42587a(string);
                    if (m42587a == null) {
                        m42771a(c26164v52, "wrong orientation " + string);
                        return false;
                    }
                    return this.f67999c.mo42491a(z, m42587a);
                case '\t':
                    AbstractC25846ja.m43680a("MraidBridge: storePicture is currently unsupported");
                    return false;
                case '\n':
                    if (jSONObject == null) {
                        m42771a(c26164v52, "setResizeProperties params cannot be null");
                        return false;
                    }
                    return this.f67999c.mo42498a(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt(Consts.ResizePropertiesOffsetX), jSONObject.getInt(Consts.ResizePropertiesOffsetY), jSONObject.optBoolean(Consts.ResizePropertiesAllowOffscreen, false), C26138c.m42759a(jSONObject.optString(Consts.ResizePropertiesCustomClosePosition)));
                case 11:
                    if (jSONObject == null) {
                        m42771a(c26164v52, "vpaidEvent params cannot be null");
                        return false;
                    }
                    return this.f67999c.mo42494a(jSONObject.getString("event"));
                case '\f':
                    if (jSONObject == null) {
                        m42771a(c26164v52, "playheadEvent params cannot be null");
                        return false;
                    }
                    return this.f67999c.mo42499a((float) jSONObject.getDouble("remain"), (float) jSONObject.getDouble("duration"));
            }
            return true;
        }
    }

    /* renamed from: a */
    public void m42776a(InterfaceC26136a interfaceC26136a) {
        this.f67999c = interfaceC26136a;
    }

    /* renamed from: a */
    public final String m42778a(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }
}
