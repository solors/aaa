package androidx.compose.p015ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTextStyle.android.kt */
@ExperimentalTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.PlatformTextStyle */
/* loaded from: classes.dex */
public final class PlatformTextStyle {
    @Nullable
    private final PlatformParagraphStyle paragraphStyle;
    @Nullable
    private final PlatformSpanStyle spanStyle;

    public PlatformTextStyle(@Nullable PlatformSpanStyle platformSpanStyle, @Nullable PlatformParagraphStyle platformParagraphStyle) {
        this.spanStyle = platformSpanStyle;
        this.paragraphStyle = platformParagraphStyle;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        if (Intrinsics.m17075f(this.paragraphStyle, platformTextStyle.paragraphStyle) && Intrinsics.m17075f(this.spanStyle, platformTextStyle.spanStyle)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final PlatformParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    @Nullable
    public final PlatformSpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public int hashCode() {
        int i;
        PlatformSpanStyle platformSpanStyle = this.spanStyle;
        int i2 = 0;
        if (platformSpanStyle != null) {
            i = platformSpanStyle.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        PlatformParagraphStyle platformParagraphStyle = this.paragraphStyle;
        if (platformParagraphStyle != null) {
            i2 = platformParagraphStyle.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.spanStyle + ", paragraphSyle=" + this.paragraphStyle + ')';
    }

    public /* synthetic */ PlatformTextStyle(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public PlatformTextStyle(boolean z) {
        this(null, new PlatformParagraphStyle(z));
    }
}
