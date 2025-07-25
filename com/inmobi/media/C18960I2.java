package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.I2 */
/* loaded from: classes6.dex */
public class C18960I2 extends C19082R4 {

    /* renamed from: g */
    public final StackTraceElement[] f47337g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18960I2(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", AbstractC19141Vb.m60625a(thread, error));
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(error, "error");
        StackTraceElement[] stackTrace = error.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        this.f47337g = stackTrace;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C18960I2(java.lang.String r5) {
        /*
            r4 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "component"
            java.lang.String r2 = "crashReporting"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "eventType"
            java.lang.String r3 = "CatchEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.String r1 = "eventId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r4.<init>(r0, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C18960I2.<init>(java.lang.String):void");
    }
}
