package com.facebook.bolts;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellationToken.kt */
@Metadata
/* loaded from: classes2.dex */
public final class CancellationToken {
    @NotNull
    private final CancellationTokenSource tokenSource;

    public CancellationToken(@NotNull CancellationTokenSource tokenSource) {
        Intrinsics.checkNotNullParameter(tokenSource, "tokenSource");
        this.tokenSource = tokenSource;
    }

    public final boolean isCancellationRequested() {
        return this.tokenSource.isCancellationRequested();
    }

    @NotNull
    public final CancellationTokenRegistration register(@Nullable Runnable runnable) {
        return this.tokenSource.register$facebook_bolts_release(runnable);
    }

    public final void throwIfCancellationRequested() throws CancellationException {
        this.tokenSource.throwIfCancellationRequested$facebook_bolts_release();
    }

    @NotNull
    public String toString() {
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{CancellationToken.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.tokenSource.isCancellationRequested())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
}
