package androidx.compose.p015ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontFamily.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontFamily */
/* loaded from: classes.dex */
public abstract class FontFamily {
    private final boolean canLoadSynchronously;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final SystemFontFamily Default = new DefaultFontFamily();
    @NotNull
    private static final GenericFontFamily SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
    @NotNull
    private static final GenericFontFamily Serif = new GenericFontFamily("serif", "FontFamily.Serif");
    @NotNull
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
    @NotNull
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    /* compiled from: FontFamily.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.FontFamily$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        @NotNull
        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        @NotNull
        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        @NotNull
        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        @NotNull
        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }
    }

    /* compiled from: FontFamily.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.font.FontFamily$Resolver */
    /* loaded from: classes.dex */
    public interface Resolver {
        /* renamed from: resolve-DPcqOEQ$default  reason: not valid java name */
        static /* synthetic */ State m109438resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 1) != 0) {
                    fontFamily = null;
                }
                if ((i3 & 2) != 0) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                if ((i3 & 4) != 0) {
                    i = FontStyle.Companion.m109465getNormal_LCdwA();
                }
                if ((i3 & 8) != 0) {
                    i2 = FontSynthesis.Companion.m109475getAllGVVA2EU();
                }
                return resolver.mo109439resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }

        @Nullable
        Object preload(@NotNull FontFamily fontFamily, @NotNull Continuation<? super Unit> continuation);

        @NotNull
        /* renamed from: resolve-DPcqOEQ  reason: not valid java name */
        State<Object> mo109439resolveDPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int i, int i2);
    }

    public /* synthetic */ FontFamily(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    private FontFamily(boolean z) {
        this.canLoadSynchronously = z;
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }
}
