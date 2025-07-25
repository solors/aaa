package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AggregateException.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AggregateException extends Exception {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    @NotNull
    private final List<Throwable> innerThrowables;

    /* compiled from: AggregateException.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AggregateException(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.util.List<? extends java.lang.Throwable> r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L15
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L15
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L16
        L15:
            r0 = 0
        L16:
            r1.<init>(r2, r0)
            if (r3 != 0) goto L1f
            java.util.List r3 = kotlin.collections.C37561t.m17202m()
        L1f:
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            java.lang.String r3 = "unmodifiableList(innerThrowables ?: emptyList())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.innerThrowables = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bolts.AggregateException.<init>(java.lang.String, java.util.List):void");
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintStream err) {
        Intrinsics.checkNotNullParameter(err, "err");
        super.printStackTrace(err);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i++;
            err.append((CharSequence) String.valueOf(i));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintWriter err) {
        Intrinsics.checkNotNullParameter(err, "err");
        super.printStackTrace(err);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i++;
            err.append((CharSequence) String.valueOf(i));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }
}
