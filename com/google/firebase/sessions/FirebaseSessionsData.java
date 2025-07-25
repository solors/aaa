package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionDatastore.kt */
@Metadata
/* loaded from: classes4.dex */
public final class FirebaseSessionsData {
    @Nullable

    /* renamed from: a */
    private final String f43697a;

    public FirebaseSessionsData(@Nullable String str) {
        this.f43697a = str;
    }

    public static /* synthetic */ FirebaseSessionsData copy$default(FirebaseSessionsData firebaseSessionsData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firebaseSessionsData.f43697a;
        }
        return firebaseSessionsData.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.f43697a;
    }

    @NotNull
    public final FirebaseSessionsData copy(@Nullable String str) {
        return new FirebaseSessionsData(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FirebaseSessionsData) && Intrinsics.m17075f(this.f43697a, ((FirebaseSessionsData) obj).f43697a)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getSessionId() {
        return this.f43697a;
    }

    public int hashCode() {
        String str = this.f43697a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f43697a + ')';
    }
}
