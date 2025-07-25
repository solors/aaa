package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.dq */
/* loaded from: classes6.dex */
public final class C19784dq {
    @NotNull

    /* renamed from: c */
    public static final C19785a f49816c = new C19785a(null);

    /* renamed from: d */
    public static final int f49817d = 2070;

    /* renamed from: e */
    public static final int f49818e = 2080;

    /* renamed from: f */
    public static final int f49819f = 2090;

    /* renamed from: g */
    public static final int f49820g = 2100;

    /* renamed from: h */
    public static final int f49821h = 2110;

    /* renamed from: a */
    private final int f49822a;
    @NotNull

    /* renamed from: b */
    private final String f49823b;

    @Metadata
    /* renamed from: com.ironsource.dq$a */
    /* loaded from: classes6.dex */
    public static final class C19785a {
        private C19785a() {
        }

        public /* synthetic */ C19785a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C19784dq(int i, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f49822a = i;
        this.f49823b = errorMessage;
    }

    /* renamed from: a */
    public final int m58859a() {
        return this.f49822a;
    }

    @NotNull
    /* renamed from: b */
    public final String m58856b() {
        return this.f49823b;
    }

    /* renamed from: c */
    public final int m58855c() {
        return this.f49822a;
    }

    @NotNull
    /* renamed from: d */
    public final String m58854d() {
        return this.f49823b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19784dq)) {
            return false;
        }
        C19784dq c19784dq = (C19784dq) obj;
        if (this.f49822a == c19784dq.f49822a && Intrinsics.m17075f(this.f49823b, c19784dq.f49823b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f49822a) * 31) + this.f49823b.hashCode();
    }

    @NotNull
    public String toString() {
        return "SdkError(errorCode=" + this.f49822a + ", errorMessage=" + this.f49823b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C19784dq(@org.jetbrains.annotations.NotNull com.ironsource.mediationsdk.logger.IronSourceError r3) {
        /*
            r2 = this;
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.getErrorCode()
            java.lang.String r3 = r3.getErrorMessage()
            java.lang.String r1 = "error.errorMessage"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19784dq.<init>(com.ironsource.mediationsdk.logger.IronSourceError):void");
    }

    @NotNull
    /* renamed from: a */
    public final C19784dq m58858a(int i, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new C19784dq(i, errorMessage);
    }

    /* renamed from: a */
    public static /* synthetic */ C19784dq m58857a(C19784dq c19784dq, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c19784dq.f49822a;
        }
        if ((i2 & 2) != 0) {
            str = c19784dq.f49823b;
        }
        return c19784dq.m58858a(i, str);
    }
}
