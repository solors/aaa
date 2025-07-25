package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SelectionMagnifier.kt */
@Metadata
/* loaded from: classes.dex */
final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends Lambda implements Function1<Offset, AnimationVector2D> {
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 INSTANCE = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1();

    SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(Offset offset) {
        return m106707invokek4lQ0M(offset.m107301unboximpl());
    }

    @NotNull
    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final AnimationVector2D m106707invokek4lQ0M(long j) {
        AnimationVector2D animationVector2D;
        if (!OffsetKt.m107310isSpecifiedk4lQ0M(j)) {
            animationVector2D = SelectionMagnifier.UnspecifiedAnimationVector2D;
            return animationVector2D;
        }
        return new AnimationVector2D(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j));
    }
}
