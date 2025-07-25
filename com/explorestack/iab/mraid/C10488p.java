package com.explorestack.iab.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.explorestack.iab.mraid.p */
/* loaded from: classes3.dex */
class C10488p {
    @NonNull

    /* renamed from: a */
    private final C10487o f23962a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10488p(@NonNull C10487o c10487o) {
        this.f23962a = c10487o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m79475a(@Nullable String str) {
        if (str != null && str.startsWith("sms")) {
            return this.f23962a.m79478d();
        }
        if (str != null && str.startsWith("tel")) {
            return this.f23962a.m79476f();
        }
        return true;
    }
}
