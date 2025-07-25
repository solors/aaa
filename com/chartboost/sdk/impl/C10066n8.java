package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.n8 */
/* loaded from: classes3.dex */
public final class C10066n8 {

    /* renamed from: a */
    public final Integer f22659a;

    /* renamed from: b */
    public final List f22660b;

    /* renamed from: c */
    public final Integer f22661c;

    /* renamed from: d */
    public final Integer f22662d;

    /* renamed from: e */
    public final JSONObject f22663e;

    /* renamed from: f */
    public final String f22664f;

    /* renamed from: g */
    public final String f22665g;

    /* renamed from: h */
    public final String f22666h;

    /* renamed from: i */
    public final String f22667i;

    public C10066n8(Integer num, List list, Integer num2, Integer num3, JSONObject jSONObject, String str, String str2, String str3, String str4) {
        this.f22659a = num;
        this.f22660b = list;
        this.f22661c = num2;
        this.f22662d = num3;
        this.f22663e = jSONObject;
        this.f22664f = str;
        this.f22665g = str2;
        this.f22666h = str3;
        this.f22667i = str4;
    }

    /* renamed from: a */
    public final String m81032a() {
        return this.f22667i;
    }

    /* renamed from: b */
    public final String m81031b() {
        return this.f22666h;
    }

    /* renamed from: c */
    public final Integer m81030c() {
        return this.f22659a;
    }

    /* renamed from: d */
    public final Integer m81029d() {
        return this.f22662d;
    }

    /* renamed from: e */
    public final Integer m81028e() {
        return this.f22661c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10066n8)) {
            return false;
        }
        C10066n8 c10066n8 = (C10066n8) obj;
        if (Intrinsics.m17075f(this.f22659a, c10066n8.f22659a) && Intrinsics.m17075f(this.f22660b, c10066n8.f22660b) && Intrinsics.m17075f(this.f22661c, c10066n8.f22661c) && Intrinsics.m17075f(this.f22662d, c10066n8.f22662d) && Intrinsics.m17075f(this.f22663e, c10066n8.f22663e) && Intrinsics.m17075f(this.f22664f, c10066n8.f22664f) && Intrinsics.m17075f(this.f22665g, c10066n8.f22665g) && Intrinsics.m17075f(this.f22666h, c10066n8.f22666h) && Intrinsics.m17075f(this.f22667i, c10066n8.f22667i)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m81027f() {
        return this.f22664f;
    }

    /* renamed from: g */
    public final JSONObject m81026g() {
        return this.f22663e;
    }

    /* renamed from: h */
    public final String m81025h() {
        return this.f22665g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        Integer num = this.f22659a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        List list = this.f22660b;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num2 = this.f22661c;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num3 = this.f22662d;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        JSONObject jSONObject = this.f22663e;
        if (jSONObject == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = jSONObject.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str = this.f22664f;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str2 = this.f22665g;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str3 = this.f22666h;
        if (str3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str3.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str4 = this.f22667i;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i9 + i;
    }

    /* renamed from: i */
    public final List m81024i() {
        return this.f22660b;
    }

    public String toString() {
        Integer num = this.f22659a;
        List list = this.f22660b;
        Integer num2 = this.f22661c;
        Integer num3 = this.f22662d;
        JSONObject jSONObject = this.f22663e;
        String str = this.f22664f;
        String str2 = this.f22665g;
        String str3 = this.f22666h;
        String str4 = this.f22667i;
        return "PrivacyBodyFields(openRtbConsent=" + num + ", whitelistedPrivacyStandardsList=" + list + ", openRtbGdpr=" + num2 + ", openRtbCoppa=" + num3 + ", privacyListAsJson=" + jSONObject + ", piDataUseConsent=" + str + ", tcfString=" + str2 + ", gppString=" + str3 + ", gppSid=" + str4 + ")";
    }
}
