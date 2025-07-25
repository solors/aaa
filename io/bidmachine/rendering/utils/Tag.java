package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class Tag {

    /* renamed from: a */
    private final String f97961a;

    /* renamed from: b */
    private String f97962b;

    public Tag(@NonNull String str) {
        this.f97961a = str;
    }

    @NonNull
    public String toString() {
        if (this.f97962b == null) {
            this.f97962b = this.f97961a + " @" + Integer.toHexString(hashCode());
        }
        return this.f97962b;
    }
}
