package androidx.compose.p015ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTextStyle.android.kt */
@ExperimentalTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.PlatformParagraphStyle */
/* loaded from: classes.dex */
public final class PlatformParagraphStyle {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final boolean includeFontPadding;

    /* compiled from: AndroidTextStyle.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.PlatformParagraphStyle$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }
    }

    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PlatformParagraphStyle) && this.includeFontPadding == ((PlatformParagraphStyle) obj).includeFontPadding) {
            return true;
        }
        return false;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return Boolean.hashCode(this.includeFontPadding);
    }

    @NotNull
    public final PlatformParagraphStyle merge(@Nullable PlatformParagraphStyle platformParagraphStyle) {
        if (platformParagraphStyle == null) {
            return this;
        }
        return platformParagraphStyle;
    }

    @NotNull
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ')';
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public PlatformParagraphStyle() {
        this(true);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }
}
