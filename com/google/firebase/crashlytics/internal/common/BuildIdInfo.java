package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes4.dex */
public class BuildIdInfo {

    /* renamed from: a */
    private final String f42294a;

    /* renamed from: b */
    private final String f42295b;

    /* renamed from: c */
    private final String f42296c;

    public BuildIdInfo(String str, String str2, String str3) {
        this.f42294a = str;
        this.f42295b = str2;
        this.f42296c = str3;
    }

    public String getArch() {
        return this.f42295b;
    }

    public String getBuildId() {
        return this.f42296c;
    }

    public String getLibraryName() {
        return this.f42294a;
    }
}
