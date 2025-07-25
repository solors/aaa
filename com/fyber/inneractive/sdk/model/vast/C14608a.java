package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* renamed from: com.fyber.inneractive.sdk.model.vast.a */
/* loaded from: classes4.dex */
public final class C14608a {

    /* renamed from: a */
    public final String f27684a;

    /* renamed from: b */
    public final String f27685b;

    /* renamed from: c */
    public final String f27686c;

    /* renamed from: d */
    public final boolean f27687d;

    public C14608a(String str, String str2, String str3) {
        String str4;
        String str5;
        boolean z;
        if (str != null) {
            str4 = str.trim();
        } else {
            str4 = null;
        }
        this.f27684a = str4;
        if (str2 != null) {
            str5 = str2.trim();
        } else {
            str5 = null;
        }
        this.f27685b = str5;
        String trim = str3 != null ? str3.trim() : null;
        this.f27686c = trim;
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5) && !TextUtils.isEmpty(trim) && trim.contains("[TIME]")) {
            z = true;
        } else {
            z = false;
        }
        this.f27687d = z;
    }
}
