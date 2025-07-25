package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata
/* renamed from: androidx.compose.animation.ChangeSize */
/* loaded from: classes.dex */
public final class EnterExitTransition {
    @NotNull
    private final Alignment alignment;
    @NotNull
    private final FiniteAnimationSpec<IntSize> animationSpec;
    private final boolean clip;
    @NotNull
    private final Function1<IntSize, IntSize> size;

    /* compiled from: EnterExitTransition.kt */
    @Metadata
    /* renamed from: androidx.compose.animation.ChangeSize$1 */
    /* loaded from: classes.dex */
    static final class C03631 extends Lambda implements Function1<IntSize, IntSize> {
        public static final C03631 INSTANCE = new C03631();

        C03631() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
            return IntSize.m109886boximpl(m105944invokemzRDjE0(intSize.m109898unboximpl()));
        }

        /* renamed from: invoke-mzRDjE0 */
        public final long m105944invokemzRDjE0(long j) {
            return IntSizeKt.IntSize(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransition(@NotNull Alignment alignment, @NotNull Function1<? super IntSize, IntSize> size, @NotNull FiniteAnimationSpec<IntSize> animationSpec, boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.alignment = alignment;
        this.size = size;
        this.animationSpec = animationSpec;
        this.clip = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnterExitTransition copy$default(EnterExitTransition enterExitTransition, Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            alignment = enterExitTransition.alignment;
        }
        if ((i & 2) != 0) {
            function1 = enterExitTransition.size;
        }
        if ((i & 4) != 0) {
            finiteAnimationSpec = enterExitTransition.animationSpec;
        }
        if ((i & 8) != 0) {
            z = enterExitTransition.clip;
        }
        return enterExitTransition.copy(alignment, function1, finiteAnimationSpec, z);
    }

    @NotNull
    public final Alignment component1() {
        return this.alignment;
    }

    @NotNull
    public final Function1<IntSize, IntSize> component2() {
        return this.size;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    public final boolean component4() {
        return this.clip;
    }

    @NotNull
    public final EnterExitTransition copy(@NotNull Alignment alignment, @NotNull Function1<? super IntSize, IntSize> size, @NotNull FiniteAnimationSpec<IntSize> animationSpec, boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new EnterExitTransition(alignment, size, animationSpec, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransition)) {
            return false;
        }
        EnterExitTransition enterExitTransition = (EnterExitTransition) obj;
        if (Intrinsics.m17075f(this.alignment, enterExitTransition.alignment) && Intrinsics.m17075f(this.size, enterExitTransition.size) && Intrinsics.m17075f(this.animationSpec, enterExitTransition.animationSpec) && this.clip == enterExitTransition.clip) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    @NotNull
    public final Function1<IntSize, IntSize> getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.alignment.hashCode() * 31) + this.size.hashCode()) * 31) + this.animationSpec.hashCode()) * 31;
        boolean z = this.clip;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "ChangeSize(alignment=" + this.alignment + ", size=" + this.size + ", animationSpec=" + this.animationSpec + ", clip=" + this.clip + ')';
    }

    public /* synthetic */ EnterExitTransition(Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, (i & 2) != 0 ? C03631.INSTANCE : function1, finiteAnimationSpec, (i & 8) != 0 ? true : z);
    }
}
