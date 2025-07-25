package com.taurusx.tax.p604i.p605t;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p578b.C28206a;
import com.taurusx.tax.p578b.p581e.C28236i;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.i.t.a */
/* loaded from: classes7.dex */
public class DialogC28460a extends AbstractDialogC28464c {

    /* renamed from: c */
    public View f73888c;

    /* renamed from: d */
    public FrameLayout f73889d;

    /* renamed from: e */
    public View f73890e;

    /* renamed from: f */
    public C28236i f73891f;

    /* renamed from: g */
    public String f73892g;

    /* renamed from: com.taurusx.tax.i.t.a$a */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC28461a implements View.OnClickListener {
        public View$OnClickListenerC28461a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC28460a.this.m38079a();
        }
    }

    /* renamed from: com.taurusx.tax.i.t.a$b */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC28462b implements View.OnClickListener {
        public View$OnClickListenerC28462b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC28460a.this.m38079a();
        }
    }

    public DialogC28460a(@NonNull Activity activity) {
        super(activity);
    }

    @Override // com.taurusx.tax.p604i.p605t.AbstractDialogC28464c, android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C28236i c28236i = this.f73891f;
        if (c28236i != null) {
            String str = C28236i.f73347l;
            if (!c28236i.m38368a(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    StringFogImpl stringFogImpl = C28162a.f73047a;
                    jSONObject.put(stringFogImpl.m23824a(new byte[]{-103, 93, -103, 69, -120, 116, -110, 74, -111, 78}, new byte[]{-4, 43}), str);
                    jSONObject.put(stringFogImpl.m23824a(new byte[]{-46, -102, -46, -126, -61, -77, -61, -123, -38, -119}, new byte[]{-73, -20}), System.currentTimeMillis());
                    jSONObject.put(stringFogImpl.m23824a(new byte[]{98, 17, 118}, new byte[]{18, 120}), c28236i.f73353b);
                    jSONObject.put(stringFogImpl.m23824a(new byte[]{-45}, new byte[]{-93, 79}), c28236i.f73354c);
                    C28206a.m38470e().f73193i.m38312a(jSONObject);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    @Override // com.taurusx.tax.p604i.p605t.AbstractDialogC28464c, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.content.Context r5 = r4.getContext()
            com.taurusx.tax.i.i r0 = new com.taurusx.tax.i.i
            r0.<init>(r5)
            android.widget.FrameLayout r5 = r4.f73889d
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r5.addView(r0, r1)
            com.taurusx.tax.i.t.b r5 = new com.taurusx.tax.i.t.b
            r5.<init>(r4)
            r0.setWebViewListener(r5)
            java.lang.String r5 = r4.f73892g
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto La6
            com.taurusx.tax.b.a r5 = com.taurusx.tax.p578b.C28206a.m38470e()     // Catch: java.lang.Exception -> L4e
            com.taurusx.tax.c.e.a r5 = r5.f73193i     // Catch: java.lang.Exception -> L4e
            android.app.Activity r1 = r4.m38077c()     // Catch: java.lang.Exception -> L4e
            com.taurusx.tax.c.b.a r5 = r5.f73488l     // Catch: java.lang.Exception -> L4e
            if (r5 == 0) goto L40
            if (r1 == 0) goto L40
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4e
            r2.<init>()     // Catch: java.lang.Exception -> L4e
            r5.m38330a(r1, r2)     // Catch: java.lang.Exception -> L4e
            goto L41
        L40:
            r2 = 0
        L41:
            if (r2 == 0) goto L52
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = "UTF-8"
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r1)     // Catch: java.lang.Exception -> L4e
            goto L54
        L4e:
            r5 = move-exception
            r5.printStackTrace()
        L52:
            java.lang.String r5 = ""
        L54:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto La1
            java.lang.String r1 = r4.f73892g
            java.lang.String r2 = "?"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L66
            java.lang.String r2 = "&"
        L66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r4.f73892g
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.f73892g = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.f73892g
            r1.append(r2)
            java.lang.String r2 = "device_info="
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.f73892g = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.f73892g
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.f73892g = r5
        La1:
            java.lang.String r5 = r4.f73892g
            r0.loadUrl(r5)
        La6:
            android.view.View r5 = r4.f73888c
            com.taurusx.tax.i.t.a$a r0 = new com.taurusx.tax.i.t.a$a
            r0.<init>()
            r5.setOnClickListener(r0)
            android.view.View r5 = r4.f73890e
            com.taurusx.tax.i.t.a$b r0 = new com.taurusx.tax.i.t.a$b
            r0.<init>()
            r5.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p604i.p605t.DialogC28460a.onCreate(android.os.Bundle):void");
    }

    @Override // com.taurusx.tax.p604i.p605t.AbstractDialogC28464c, android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C28236i c28236i = this.f73891f;
        if (c28236i != null) {
            String str = C28236i.f73348m;
            if (!c28236i.m38368a(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    StringFogImpl stringFogImpl = C28162a.f73047a;
                    jSONObject.put(stringFogImpl.m23824a(new byte[]{-60, -81, -60, -73, -43, -122, -49, -72, -52, -68}, new byte[]{-95, -39}), str);
                    jSONObject.put(stringFogImpl.m23824a(new byte[]{-40, -2, -40, -26, -55, -41, -55, -31, -48, -19}, new byte[]{-67, -120}), System.currentTimeMillis());
                    jSONObject.put(stringFogImpl.m23824a(new byte[]{62, 88, 42}, new byte[]{78, 49}), c28236i.f73353b);
                    jSONObject.put(stringFogImpl.m23824a(new byte[]{39}, new byte[]{87, -46}), c28236i.f73354c);
                    C28206a.m38470e().f73193i.m38312a(jSONObject);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
