package com.mbridge.msdk.video.signal.p534a;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneCallJs;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.signal.a.i */
/* loaded from: classes6.dex */
public final class JSActivityProxy extends DefaultJSActivity {

    /* renamed from: a */
    private WebView f60882a;

    /* renamed from: b */
    private int f60883b = 0;

    public JSActivityProxy(WebView webView) {
        this.f60882a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSActivity, com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: a */
    public final void mo48550a() {
        super.mo48550a();
        this.f60883b = 1;
        WindVaneCallJs.m51063a().m51061a(this.f60882a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSActivity, com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: b */
    public final void mo48547b() {
        super.mo48547b();
        this.f60883b = 0;
        WindVaneCallJs.m51063a().m51061a(this.f60882a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSActivity, com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: c */
    public final void mo48546c() {
        super.mo48546c();
        WindVaneCallJs.m51063a().m51061a(this.f60882a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSActivity, com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: g */
    public final void mo48542g() {
        super.mo48542g();
        WindVaneCallJs.m51063a().m51061a(this.f60882a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSActivity, com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: h */
    public final int mo48541h() {
        return this.f60883b;
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSActivity, com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: a */
    public final void mo48548a(Configuration configuration) {
        super.mo48548a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", "landscape");
            } else {
                jSONObject.put("orientation", "portrait");
            }
            WindVaneCallJs.m51063a().m51061a(this.f60882a, "orientation", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.p534a.DefaultJSActivity, com.mbridge.msdk.video.signal.IJSActivityProxy
    /* renamed from: a */
    public final void mo48549a(int i) {
        super.mo48549a(i);
        this.f60883b = i;
    }
}
