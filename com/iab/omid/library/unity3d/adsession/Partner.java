package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.utils.C18715g;

/* loaded from: classes6.dex */
public class Partner {
    private final String name;
    private final String version;

    private Partner(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C18715g.m61632a(str, "Name is null or empty");
        C18715g.m61632a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}
