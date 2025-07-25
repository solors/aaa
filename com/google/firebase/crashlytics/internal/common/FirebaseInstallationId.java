package com.google.firebase.crashlytics.internal.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FirebaseInstallationId.kt */
@Metadata
/* loaded from: classes4.dex */
public final class FirebaseInstallationId {
    @Nullable

    /* renamed from: a */
    private final String f42404a;
    @Nullable

    /* renamed from: b */
    private final String f42405b;

    public FirebaseInstallationId(@Nullable String str, @Nullable String str2) {
        this.f42404a = str;
        this.f42405b = str2;
    }

    public static /* synthetic */ FirebaseInstallationId copy$default(FirebaseInstallationId firebaseInstallationId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firebaseInstallationId.f42404a;
        }
        if ((i & 2) != 0) {
            str2 = firebaseInstallationId.f42405b;
        }
        return firebaseInstallationId.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f42404a;
    }

    @Nullable
    public final String component2() {
        return this.f42405b;
    }

    @NotNull
    public final FirebaseInstallationId copy(@Nullable String str, @Nullable String str2) {
        return new FirebaseInstallationId(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) obj;
        if (Intrinsics.m17075f(this.f42404a, firebaseInstallationId.f42404a) && Intrinsics.m17075f(this.f42405b, firebaseInstallationId.f42405b)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getAuthToken() {
        return this.f42405b;
    }

    @Nullable
    public final String getFid() {
        return this.f42404a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f42404a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f42405b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f42404a + ", authToken=" + this.f42405b + ')';
    }
}
