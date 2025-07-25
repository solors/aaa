package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i */
/* loaded from: classes7.dex */
public final class C24613i {
    /* renamed from: a */
    public static final long m46052a() {
        return System.currentTimeMillis();
    }

    @NotNull
    /* renamed from: b */
    public static final SimpleDateFormat m46051b(@NotNull String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }
}
