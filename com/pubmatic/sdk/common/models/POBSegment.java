package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class POBSegment {
    @NonNull

    /* renamed from: a */
    private final String f70177a;
    @Nullable

    /* renamed from: b */
    private String f70178b;
    @Nullable

    /* renamed from: c */
    private String f70179c;

    public POBSegment(@NonNull String str) {
        this.f70177a = str;
    }

    @Nullable
    public String getName() {
        return this.f70178b;
    }

    @NonNull
    public String getSegId() {
        return this.f70177a;
    }

    @Nullable
    public String getValue() {
        return this.f70179c;
    }

    public void setValue(@NonNull String str) {
        this.f70179c = str;
    }

    public POBSegment(@NonNull String str, @NonNull String str2) {
        this.f70177a = str;
        this.f70178b = str2;
    }
}
