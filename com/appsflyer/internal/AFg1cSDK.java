package com.appsflyer.internal;

import com.ironsource.C21114v8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class AFg1cSDK {
    private final boolean values;
    @NotNull
    public static final AFa1zSDK AFa1zSDK = new AFa1zSDK(null);
    public static long AFKeystoreWrapper = System.currentTimeMillis();

    @Metadata
    /* loaded from: classes2.dex */
    public static final class AFa1zSDK {
        private AFa1zSDK() {
        }

        public /* synthetic */ AFa1zSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            aFg1cSDK.mo92131d(aFg1bSDK, str, z);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void e$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (obj == null) {
            if ((i & 8) != 0) {
                z5 = true;
            } else {
                z5 = z;
            }
            if ((i & 16) != 0) {
                z6 = true;
            } else {
                z6 = z2;
            }
            if ((i & 32) != 0) {
                z7 = true;
            } else {
                z7 = z3;
            }
            if ((i & 64) != 0) {
                z8 = true;
            } else {
                z8 = z4;
            }
            aFg1cSDK.mo92130e(aFg1bSDK, str, th, z5, z6, z7, z8);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void i$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            aFg1cSDK.mo92129i(aFg1bSDK, str, z);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void v$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            aFg1cSDK.mo92128v(aFg1bSDK, str, z);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void w$default(AFg1cSDK aFg1cSDK, AFg1bSDK aFg1bSDK, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            aFg1cSDK.mo92127w(aFg1bSDK, str, z);
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String AFInAppEventParameterName(@org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.NotNull com.appsflyer.internal.AFg1bSDK r6) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            if (r5 == 0) goto L10
            boolean r0 = kotlin.text.C37686h.m16727B(r5)
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == 0) goto L15
            java.lang.String r5 = "null"
        L15:
            java.lang.String r5 = r4.withTag$SDK_prodRelease(r5, r6)
            boolean r6 = r4.getShouldExtendMsg()
            if (r6 == 0) goto L4c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "("
            r6.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = com.appsflyer.internal.AFg1cSDK.AFKeystoreWrapper
            long r0 = r0 - r2
            r6.append(r0)
            java.lang.String r0 = ") ["
            r6.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r6.append(r0)
            java.lang.String r0 = "] "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
        L4c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1cSDK.AFInAppEventParameterName(java.lang.String, com.appsflyer.internal.AFg1bSDK):java.lang.String");
    }

    /* renamed from: d */
    public final void m92154d(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1bSDK, str, false, 4, null);
    }

    /* renamed from: e */
    public final void m92153e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1bSDK, str, th, false, false, false, false, 120, null);
    }

    public void force(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public boolean getShouldExtendMsg() {
        return this.values;
    }

    /* renamed from: i */
    public final void m92149i(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1bSDK, str, false, 4, null);
    }

    /* renamed from: v */
    public final void m92148v(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1bSDK, str, false, 4, null);
    }

    /* renamed from: w */
    public final void m92147w(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1bSDK, str, false, 4, null);
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1bSDK aFg1bSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        StringBuilder sb2 = new StringBuilder(C21114v8.C21123i.f54137d);
        sb2.append(aFg1bSDK.AFInAppEventType);
        sb2.append("] ");
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: d */
    public void mo92131d(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* renamed from: e */
    public final void m92152e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1bSDK, str, th, z, false, false, false, 112, null);
    }

    /* renamed from: i */
    public void mo92129i(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* renamed from: v */
    public void mo92128v(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* renamed from: w */
    public void mo92127w(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* renamed from: e */
    public final void m92151e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1bSDK, str, th, z, z2, false, false, 96, null);
    }

    /* renamed from: e */
    public final void m92150e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1bSDK, str, th, z, z2, z3, false, 64, null);
    }

    /* renamed from: e */
    public void mo92130e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }
}
