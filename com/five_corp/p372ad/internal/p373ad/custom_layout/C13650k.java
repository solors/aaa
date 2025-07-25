package com.five_corp.p372ad.internal.p373ad.custom_layout;

/* renamed from: com.five_corp.ad.internal.ad.custom_layout.k */
/* loaded from: classes4.dex */
public final class C13650k {

    /* renamed from: a */
    public final String f25321a;

    /* renamed from: b */
    public final String f25322b;

    /* renamed from: c */
    public final String f25323c;

    /* renamed from: d */
    public final int f25324d;

    /* renamed from: e */
    public final boolean f25325e;

    /* renamed from: f */
    public final boolean f25326f;

    /* renamed from: g */
    public final Integer f25327g;

    /* renamed from: h */
    public final Integer f25328h;

    public C13650k(String str, String str2, String str3, int i, Boolean bool, Boolean bool2, Integer num, Integer num2) {
        boolean z;
        this.f25321a = str;
        this.f25322b = str2;
        this.f25323c = str3;
        if (i != 0) {
            this.f25324d = i;
        } else {
            this.f25324d = 1;
        }
        this.f25325e = bool != null ? bool.booleanValue() : true;
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = false;
        }
        this.f25326f = z;
        this.f25327g = num;
        this.f25328h = num2;
    }

    public final String toString() {
        return "CustomLayoutObjectText{text='" + this.f25321a + "', textColorArgb='" + this.f25322b + "', backgroundColorArgb='" + this.f25323c + "', gravity='" + AbstractC13652m.m78463b(this.f25324d) + "', isRenderFrame='" + this.f25325e + "', fontSize='" + this.f25327g + "', tvsHackHorizontalSpace=" + this.f25328h + '}';
    }
}
