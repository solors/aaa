package com.google.firebase.emulators;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class EmulatedServiceSettings {

    /* renamed from: a */
    private final String f42979a;

    /* renamed from: b */
    private final int f42980b;

    public EmulatedServiceSettings(@NonNull String str, int i) {
        this.f42979a = str;
        this.f42980b = i;
    }

    public String getHost() {
        return this.f42979a;
    }

    public int getPort() {
        return this.f42980b;
    }
}
