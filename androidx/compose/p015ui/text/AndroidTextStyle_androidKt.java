package androidx.compose.p015ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTextStyle.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.AndroidTextStyle_androidKt */
/* loaded from: classes.dex */
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = true;

    @NotNull
    public static final PlatformTextStyle createPlatformTextStyle(@Nullable PlatformSpanStyle platformSpanStyle, @Nullable PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    @ExperimentalTextApi
    @NotNull
    public static final PlatformSpanStyle lerp(@NotNull PlatformSpanStyle start, @NotNull PlatformSpanStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return start;
    }

    @ExperimentalTextApi
    @NotNull
    public static final PlatformParagraphStyle lerp(@NotNull PlatformParagraphStyle start, @NotNull PlatformParagraphStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return start.getIncludeFontPadding() == stop.getIncludeFontPadding() ? start : new PlatformParagraphStyle(((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(start.getIncludeFontPadding()), Boolean.valueOf(stop.getIncludeFontPadding()), f)).booleanValue());
    }
}
