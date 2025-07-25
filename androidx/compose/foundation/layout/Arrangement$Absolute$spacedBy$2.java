package androidx.compose.foundation.layout;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Arrangement.kt */
@Metadata
/* loaded from: classes.dex */
final class Arrangement$Absolute$spacedBy$2 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
    final /* synthetic */ Alignment.Vertical $alignment;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Arrangement$Absolute$spacedBy$2(Alignment.Vertical vertical) {
        super(2);
        this.$alignment = vertical;
    }

    @NotNull
    public final Integer invoke(int i, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
        return Integer.valueOf(this.$alignment.align(0, i));
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Integer mo105910invoke(Integer num, LayoutDirection layoutDirection) {
        return invoke(num.intValue(), layoutDirection);
    }
}
