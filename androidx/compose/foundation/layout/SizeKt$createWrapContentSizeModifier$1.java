package androidx.compose.foundation.layout;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Size.kt */
@Metadata
/* loaded from: classes.dex */
final class SizeKt$createWrapContentSizeModifier$1 extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {
    final /* synthetic */ Alignment $align;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentSizeModifier$1(Alignment alignment) {
        super(2);
        this.$align = alignment;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ IntOffset mo105910invoke(IntSize intSize, LayoutDirection layoutDirection) {
        return IntOffset.m109843boximpl(m106369invoke5SAbXVA(intSize.m109898unboximpl(), layoutDirection));
    }

    /* renamed from: invoke-5SAbXVA  reason: not valid java name */
    public final long m106369invoke5SAbXVA(long j, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.$align.mo107199alignKFBX0sM(IntSize.Companion.m109899getZeroYbymL2g(), j, layoutDirection);
    }
}
