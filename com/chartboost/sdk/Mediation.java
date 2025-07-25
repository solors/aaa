package com.chartboost.sdk;

import com.chartboost.sdk.impl.C9848f7;

/* loaded from: classes3.dex */
public class Mediation {
    public final String adapterVersion;
    public final String libraryVersion;
    public final String mediationType;

    public Mediation(String str, String str2, String str3) {
        this.mediationType = m82154a(str);
        this.libraryVersion = str2;
        this.adapterVersion = str3;
    }

    /* renamed from: a */
    public final String m82154a(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace(" ", "_");
        return replace.length() > 50 ? replace.substring(0, 50) : replace;
    }

    public C9848f7 toMediationBodyFields() {
        if (this.mediationType == null) {
            return null;
        }
        String str = this.libraryVersion;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = this.adapterVersion;
        if (str3 != null) {
            str2 = str3;
        }
        return new C9848f7(m82155a(), str, str2);
    }

    /* renamed from: a */
    public final String m82155a() {
        String str = this.libraryVersion;
        if (str != null && !str.isEmpty()) {
            return this.mediationType + " " + this.libraryVersion;
        }
        return this.mediationType;
    }
}
