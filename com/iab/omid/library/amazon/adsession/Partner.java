package com.iab.omid.library.amazon.adsession;

import com.iab.omid.library.amazon.utils.C17776g;

/* loaded from: classes6.dex */
public class Partner {
    private final String name;
    private final String version;

    private Partner(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public static Partner createPartner(String str, String str2) {
        C17776g.m65255a(str, "Name is null or empty");
        C17776g.m65255a(str2, "Version is null or empty");
        return new Partner(str, str2);
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }
}
