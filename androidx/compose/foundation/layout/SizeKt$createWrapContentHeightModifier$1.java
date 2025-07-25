package androidx.compose.foundation.layout;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
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
final class SizeKt$createWrapContentHeightModifier$1 extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {
    final /* synthetic */ Alignment.Vertical $align;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeKt$createWrapContentHeightModifier$1(Alignment.Vertical vertical) {
        super(2);
        this.$align = vertical;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ IntOffset mo105910invoke(IntSize intSize, LayoutDirection layoutDirection) {
        return IntOffset.m109843boximpl(m106368invoke5SAbXVA(intSize.m109898unboximpl(), layoutDirection));
    }

    /* renamed from: invoke-5SAbXVA  reason: not valid java name */
    public final long m106368invoke5SAbXVA(long j, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        return IntOffsetKt.IntOffset(0, this.$align.align(0, IntSize.m109893getHeightimpl(j)));
    }
}
