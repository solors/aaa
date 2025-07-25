package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.my.target.a1 */
/* loaded from: classes7.dex */
public class C25625a1 {

    /* renamed from: a */
    public final Context f66589a;

    /* renamed from: b */
    public final C26073s f66590b;

    /* renamed from: c */
    public final C25832j f66591c;

    /* renamed from: d */
    public final C25778ga f66592d;

    /* renamed from: e */
    public String f66593e;

    /* renamed from: f */
    public boolean f66594f = true;

    public C25625a1(C26073s c26073s, C25832j c25832j, Context context) {
        this.f66590b = c26073s;
        this.f66591c = c25832j;
        this.f66589a = context;
        this.f66592d = C25778ga.m43846a(c26073s, c25832j, context);
    }

    /* renamed from: a */
    public final int m44254a(int i) {
        if (i == 0 || i == 3 || i == 4 || i == 5 || i == 6) {
            return i;
        }
        switch (i) {
            case 8:
            case 9:
            case 10:
                return i;
            default:
                m44247b("Bad value", "Invalid disclaimerId");
                return 0;
        }
    }

    /* renamed from: b */
    public final void m44247b(String str, String str2) {
        if (this.f66594f) {
            String str3 = this.f66590b.f67806a;
            C25656b5 m44175c = C25656b5.m44178a(str).m44173e(str2).m44180a(this.f66591c.getSlotId()).m44175c(this.f66593e);
            if (str3 == null) {
                str3 = this.f66590b.f67807b;
            }
            m44175c.m44176b(str3).m44177b(this.f66589a);
        }
    }

    /* renamed from: a */
    public static String m44251a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb2 = new StringBuilder(str2);
            if (sb2.length() > 0) {
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*(\\\\?[\\\"\\'])mraid\\.js\\1[^>]*>\\s*<\\/script>\\n*", 2).matcher(str2);
                if (matcher.find()) {
                    int start = matcher.start();
                    sb2.delete(start, matcher.end());
                    sb2.insert(start, "<script src=\"" + str + "\"></script>");
                    return sb2.toString();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m44248b(int i) {
        this.f66592d.m43848a(i);
    }

    /* renamed from: a */
    public static C25625a1 m44252a(C26073s c26073s, C25832j c25832j, Context context) {
        return new C25625a1(c26073s, c25832j, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m44250a(org.json.JSONObject r13, com.p551my.target.AbstractC25650b r14) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C25625a1.m44250a(org.json.JSONObject, com.my.target.b):void");
    }

    /* renamed from: a */
    public final C26010p7 m44253a(C26010p7 c26010p7, JSONObject jSONObject) {
        return jSONObject == null ? c26010p7 : C26032q7.m43124a(this.f66591c, this.f66590b.f67807b, this.f66594f, this.f66589a).m43123a(c26010p7, jSONObject);
    }

    /* renamed from: a */
    public static String m44249a(JSONObject jSONObject, C25923n c25923n) {
        String str = null;
        if (!jSONObject.has("src") && !jSONObject.has("source")) {
            c25923n.m43428a(C25902m.f67232n);
            return null;
        }
        String optString = jSONObject.optString("src", "");
        if (TextUtils.isEmpty(optString) || (str = AbstractC25925n1.m43422a(optString)) == null) {
            String optString2 = jSONObject.optString("source", "");
            return !TextUtils.isEmpty(optString2) ? C25895la.m43505a(optString2) : str;
        }
        return str;
    }
}
