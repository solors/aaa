package com.facebook.gamingservices.internal;

import android.os.Build;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DateFormatter.kt */
@Metadata
/* loaded from: classes3.dex */
public final class DateFormatter {
    @NotNull
    public static final DateFormatter INSTANCE = new DateFormatter();

    private DateFormatter() {
    }

    @Nullable
    public final ZonedDateTime format$facebook_gamingservices_release(@NotNull String isoDate) {
        DateTimeFormatter ofPattern;
        ZonedDateTime parse;
        Intrinsics.checkNotNullParameter(isoDate, "isoDate");
        if (Build.VERSION.SDK_INT >= 26) {
            ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
            Intrinsics.checkNotNullExpressionValue(ofPattern, "ofPattern(\"yyyy-MM-dd'T'HH:mm:ssZ\")");
            parse = ZonedDateTime.parse(isoDate, ofPattern);
            return parse;
        }
        return null;
    }
}
