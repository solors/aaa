package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.jf */
/* loaded from: classes6.dex */
public class C20149jf extends FrameLayout implements InterfaceC20048hg {

    /* renamed from: b */
    private static final String f50708b = "IronSourceAdContainer";

    /* renamed from: a */
    private C20583of f50709a;

    /* renamed from: com.ironsource.jf$a */
    /* loaded from: classes6.dex */
    class RunnableC20150a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f50710a;

        /* renamed from: b */
        final /* synthetic */ String f50711b;

        RunnableC20150a(String str, String str2) {
            this.f50710a = str;
            this.f50711b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20149jf c20149jf = C20149jf.this;
            c20149jf.removeView(c20149jf.f50709a.getPresentingView());
            C20149jf.this.f50709a.mo56003a(this.f50710a, this.f50711b);
            C20149jf.this.f50709a = null;
        }
    }

    public C20149jf(Context context) {
        super(context);
    }

    /* renamed from: b */
    private void m57843b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f50709a.m55994c().m56338a().getJSONObject(C20096if.f50585p).getJSONObject(C20096if.f50588s);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f50709a.m56000b());
        this.f50709a.m55994c().m56329a(C21114v8.C21121g.f53977R, jSONObject);
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: c */
    public void mo55991c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f50709a.mo55991c(jSONObject, str, str2);
    }

    @Override // com.ironsource.InterfaceC20048hg
    public WebView getPresentingView() {
        return this.f50709a.getPresentingView();
    }

    public C20047hf getSize() {
        C20583of c20583of = this.f50709a;
        if (c20583of != null) {
            return c20583of.m55990d();
        }
        return new C20047hf();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        Logger.m54970i(f50708b, "onVisibilityChanged: " + i);
        C20583of c20583of = this.f50709a;
        if (c20583of == null) {
            return;
        }
        try {
            c20583of.m55994c().m56332a(C20096if.f50580k, i, isShown());
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        Logger.m54970i(f50708b, "onWindowVisibilityChanged: " + i);
        C20583of c20583of = this.f50709a;
        if (c20583of == null) {
            return;
        }
        try {
            c20583of.m55994c().m56332a(C20096if.f50581l, i, isShown());
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public C20149jf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: b */
    public void mo55995b(JSONObject jSONObject, String str, String str2) {
        this.f50709a.mo55995b(jSONObject, str, str2);
    }

    public C20149jf(C20583of c20583of, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c20583of.m55990d().m58154c(), c20583of.m55990d().m58156a()));
        this.f50709a = c20583of;
        addView(c20583of.getPresentingView());
    }

    /* renamed from: a */
    public void m57846a() throws Exception {
        C20583of c20583of = this.f50709a;
        if (c20583of == null || c20583of.m55994c() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        m57843b();
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: a */
    public synchronized void mo56003a(String str, String str2) {
        C20583of c20583of = this.f50709a;
        if (c20583of != null && c20583of.m55994c() != null && this.f50709a.getPresentingView() != null) {
            this.f50709a.m55994c().m56318e();
            C21130ve.f54189a.m54467d(new RunnableC20150a(str, str2));
        }
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: a */
    public void mo56002a(String str, String str2, String str3) {
        C20583of c20583of = this.f50709a;
        if (c20583of == null) {
            return;
        }
        c20583of.mo56002a(str, str2, str3);
    }

    @Override // com.ironsource.InterfaceC20048hg
    /* renamed from: a */
    public void mo56001a(JSONObject jSONObject, String str, String str2) {
        this.f50709a.mo56001a(jSONObject, str, str2);
    }
}
