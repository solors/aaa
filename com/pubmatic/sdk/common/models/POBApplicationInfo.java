package com.pubmatic.sdk.common.models;

import androidx.annotation.Nullable;
import java.net.URL;

/* loaded from: classes7.dex */
public class POBApplicationInfo {
    @Nullable

    /* renamed from: a */
    private String f70123a;
    @Nullable

    /* renamed from: b */
    private URL f70124b;
    @Nullable

    /* renamed from: c */
    private Boolean f70125c;
    @Nullable

    /* renamed from: d */
    private String f70126d;
    @Nullable

    /* renamed from: e */
    private String f70127e;

    @Nullable
    public String getCategories() {
        return this.f70126d;
    }

    @Nullable
    public String getDomain() {
        return this.f70123a;
    }

    @Nullable
    public String getKeywords() {
        return this.f70127e;
    }

    @Nullable
    public URL getStoreURL() {
        return this.f70124b;
    }

    @Nullable
    public Boolean isPaid() {
        return this.f70125c;
    }

    public void setCategories(@Nullable String str) {
        this.f70126d = str;
    }

    public void setDomain(@Nullable String str) {
        this.f70123a = str;
    }

    public void setKeywords(@Nullable String str) {
        this.f70127e = str;
    }

    public void setPaid(boolean z) {
        this.f70125c = Boolean.valueOf(z);
    }

    public void setStoreURL(@Nullable URL url) {
        this.f70124b = url;
    }
}
