package androidx.compose.p015ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathEffect.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.PathEffect */
/* loaded from: classes.dex */
public interface PathEffect {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: PathEffect.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.PathEffect$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PathEffect dashPathEffect$default(Companion companion, float[] fArr, float f, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return companion.dashPathEffect(fArr, f);
        }

        @NotNull
        public final PathEffect chainPathEffect(@NotNull PathEffect outer, @NotNull PathEffect inner) {
            Intrinsics.checkNotNullParameter(outer, "outer");
            Intrinsics.checkNotNullParameter(inner, "inner");
            return AndroidPathEffect_androidKt.actualChainPathEffect(outer, inner);
        }

        @NotNull
        public final PathEffect cornerPathEffect(float f) {
            return AndroidPathEffect_androidKt.actualCornerPathEffect(f);
        }

        @NotNull
        public final PathEffect dashPathEffect(@NotNull float[] intervals, float f) {
            Intrinsics.checkNotNullParameter(intervals, "intervals");
            return AndroidPathEffect_androidKt.actualDashPathEffect(intervals, f);
        }

        @NotNull
        /* renamed from: stampedPathEffect-7aD1DOk  reason: not valid java name */
        public final PathEffect m107762stampedPathEffect7aD1DOk(@NotNull Path shape, float f, float f2, int i) {
            Intrinsics.checkNotNullParameter(shape, "shape");
            return AndroidPathEffect_androidKt.m107427actualStampedPathEffect7aD1DOk(shape, f, f2, i);
        }
    }
}
