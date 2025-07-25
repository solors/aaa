package androidx.compose.p015ui.text.style;

import androidx.compose.p015ui.graphics.Brush;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.ShaderBrush;
import androidx.compose.p015ui.graphics.SolidColor;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: TextDrawStyle.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextDrawStyle */
/* loaded from: classes.dex */
public interface TextDrawStyle {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: TextDrawStyle.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.TextDrawStyle$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final TextDrawStyle from(@Nullable Brush brush) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m109660from8_81llA(((SolidColor) brush).m107813getValue0d7_KjU());
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush);
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        /* renamed from: from-8_81llA  reason: not valid java name */
        public final TextDrawStyle m109660from8_81llA(long j) {
            boolean z;
            if (j != Color.Companion.m107563getUnspecified0d7_KjU()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new ColorStyle(j, null);
            }
            return Unspecified.INSTANCE;
        }
    }

    /* compiled from: TextDrawStyle.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.style.TextDrawStyle$Unspecified */
    /* loaded from: classes.dex */
    public static final class Unspecified implements TextDrawStyle {
        @NotNull
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        @Override // androidx.compose.p015ui.text.style.TextDrawStyle
        @Nullable
        public Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.p015ui.text.style.TextDrawStyle
        /* renamed from: getColor-0d7_KjU */
        public long mo109605getColor0d7_KjU() {
            return Color.Companion.m107563getUnspecified0d7_KjU();
        }
    }

    @Nullable
    Brush getBrush();

    /* renamed from: getColor-0d7_KjU */
    long mo109605getColor0d7_KjU();

    @NotNull
    default TextDrawStyle merge(@NotNull TextDrawStyle other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.getBrush() == null) {
            if (getBrush() != null) {
                return this;
            }
            return other.takeOrElse(new TextDrawStyle$merge$1(this));
        }
        return other;
    }

    @NotNull
    default TextDrawStyle takeOrElse(@NotNull Functions<? extends TextDrawStyle> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.m17075f(this, Unspecified.INSTANCE)) {
            return this;
        }
        return other.invoke();
    }
}
