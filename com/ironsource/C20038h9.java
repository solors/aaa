package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.h9 */
/* loaded from: classes6.dex */
public final class C20038h9 {
    @NotNull

    /* renamed from: a */
    private final Throwable f50426a;
    @NotNull

    /* renamed from: b */
    private final String f50427b;

    /* renamed from: c */
    private final boolean f50428c;

    public C20038h9(@NotNull Throwable throwable) {
        boolean m16592R;
        boolean m16592R2;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f50426a = throwable;
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "throwable.stackTrace");
        sb2.append(throwable.toString());
        sb2.append(System.lineSeparator());
        boolean z = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append(';' + System.lineSeparator());
            String stackTraceElement2 = stackTraceElement.toString();
            Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "elem.toString()");
            String m57996e = C20086i9.m57997d().m57996e();
            Intrinsics.checkNotNullExpressionValue(m57996e, "getInstance().keyword");
            m16592R2 = C37690r.m16592R(stackTraceElement2, m57996e, false, 2, null);
            if (m16592R2) {
                z = true;
            }
        }
        Throwable cause = this.f50426a.getCause();
        if (cause != null) {
            sb2.append("--CAUSE");
            sb2.append(System.lineSeparator());
            sb2.append(cause.toString());
            sb2.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement3 : stackTrace2) {
                sb2.append(stackTraceElement3.toString());
                sb2.append(';' + System.lineSeparator());
                String stackTraceElement4 = stackTraceElement3.toString();
                Intrinsics.checkNotNullExpressionValue(stackTraceElement4, "elem.toString()");
                String m57996e2 = C20086i9.m57997d().m57996e();
                Intrinsics.checkNotNullExpressionValue(m57996e2, "getInstance().keyword");
                m16592R = C37690r.m16592R(stackTraceElement4, m57996e2, false, 2, null);
                if (m16592R) {
                    z = true;
                }
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        this.f50427b = sb3;
        this.f50428c = z;
    }

    /* renamed from: a */
    public static /* synthetic */ C20038h9 m58222a(C20038h9 c20038h9, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c20038h9.f50426a;
        }
        return c20038h9.m58221a(th);
    }

    @NotNull
    /* renamed from: b */
    public final String m58220b() {
        return this.f50427b;
    }

    @NotNull
    /* renamed from: c */
    public final Throwable m58219c() {
        return this.f50426a;
    }

    /* renamed from: d */
    public final boolean m58218d() {
        return this.f50428c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C20038h9) && Intrinsics.m17075f(this.f50426a, ((C20038h9) obj).f50426a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f50426a.hashCode();
    }

    @NotNull
    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f50426a + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C20038h9 m58221a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C20038h9(throwable);
    }

    @NotNull
    /* renamed from: a */
    public final Throwable m58223a() {
        return this.f50426a;
    }
}
