package com.p551my.target;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.p551my.target.common.MyTargetVersion;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* renamed from: com.my.target.b5 */
/* loaded from: classes7.dex */
public class C25656b5 {

    /* renamed from: h */
    public static boolean f66629h = true;

    /* renamed from: i */
    public static String f66630i = "https://ad.mail.ru/sdk/log/";

    /* renamed from: a */
    public final String f66631a;

    /* renamed from: b */
    public final String f66632b;

    /* renamed from: c */
    public String f66633c;

    /* renamed from: d */
    public int f66634d;

    /* renamed from: e */
    public String f66635e;

    /* renamed from: f */
    public String f66636f;

    /* renamed from: g */
    public String f66637g;

    public C25656b5(String str, String str2) {
        this.f66631a = str;
        this.f66632b = str2;
    }

    /* renamed from: a */
    public String m44181a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk", "myTarget");
            jSONObject.put("sdkver", MyTargetVersion.VERSION);
            jSONObject.put("os", "Android");
            jSONObject.put("osver", Build.VERSION.RELEASE);
            jSONObject.put("type", this.f66632b);
            jSONObject.put("name", this.f66631a);
            String str = this.f66633c;
            if (str != null) {
                jSONObject.put("message", str);
            }
            int i = this.f66634d;
            if (i > 0) {
                jSONObject.put("slot", i);
            }
            String str2 = this.f66635e;
            if (str2 != null) {
                jSONObject.put("url", str2);
            }
            String str3 = this.f66636f;
            if (str3 != null) {
                jSONObject.put("bannerId", str3);
            }
            String str4 = this.f66637g;
            if (str4 != null) {
                jSONObject.put("data", str4);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public void m44177b(final Context context) {
        AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.jb
            @Override // java.lang.Runnable
            public final void run() {
                C25656b5.this.m44179a(context);
            }
        });
    }

    /* renamed from: c */
    public C25656b5 m44175c(String str) {
        this.f66636f = str;
        return this;
    }

    /* renamed from: d */
    public C25656b5 m44174d(String str) {
        this.f66637g = str;
        return this;
    }

    /* renamed from: e */
    public C25656b5 m44173e(String str) {
        this.f66633c = str;
        return this;
    }

    /* renamed from: a */
    public static C25656b5 m44178a(String str) {
        return new C25656b5(str, "error");
    }

    /* renamed from: b */
    public C25656b5 m44176b(String str) {
        this.f66635e = str;
        return this;
    }

    /* renamed from: a */
    public final /* synthetic */ void m44179a(Context context) {
        String m44181a = m44181a();
        AbstractC25846ja.m43680a("send message to log:\n " + m44181a);
        if (f66629h) {
            C25626a2.m44246a().m44185a(f66630i, Base64.encodeToString(m44181a.getBytes(StandardCharsets.UTF_8), 0), context);
        }
    }

    /* renamed from: a */
    public C25656b5 m44180a(int i) {
        this.f66634d = i;
        return this;
    }
}
