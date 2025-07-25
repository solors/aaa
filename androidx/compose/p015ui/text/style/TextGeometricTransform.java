package androidx.compose.p015ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextGeometricTransform.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextGeometricTransform */
/* loaded from: classes.dex */
public final class TextGeometricTransform {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final TextGeometricTransform None = new TextGeometricTransform(1.0f, 0.0f);
    private final float scaleX;
    private final float skewX;

    public TextGeometricTransform() {
        this(0.0f, 0.0f, 3, null);
    }

    public static /* synthetic */ TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = textGeometricTransform.scaleX;
        }
        if ((i & 2) != 0) {
            f2 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.copy(f, f2);
    }

    @NotNull
    public final TextGeometricTransform copy(float f, float f2) {
        return new TextGeometricTransform(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        if (this.scaleX == textGeometricTransform.scaleX) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.skewX == textGeometricTransform.skewX) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public int hashCode() {
        return (Float.hashCode(this.scaleX) * 31) + Float.hashCode(this.skewX);
    }

    @NotNull
    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }

    public TextGeometricTransform(float f, float f2) {
        this.scaleX = f;
        this.skewX = f2;
    }

    public /* synthetic */ TextGeometricTransform(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    /* compiled from: TextGeometricTransform.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.TextGeometricTransform$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextGeometricTransform getNone$ui_text_release() {
            return TextGeometricTransform.None;
        }

        @Stable
        public static /* synthetic */ void getNone$ui_text_release$annotations() {
        }
    }
}
