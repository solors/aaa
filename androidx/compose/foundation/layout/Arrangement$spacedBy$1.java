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
final class Arrangement$spacedBy$1 extends Lambda implements Function2<Integer, LayoutDirection, Integer> {
    public static final Arrangement$spacedBy$1 INSTANCE = new Arrangement$spacedBy$1();

    Arrangement$spacedBy$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Integer mo105910invoke(Integer num, LayoutDirection layoutDirection) {
        return invoke(num.intValue(), layoutDirection);
    }

    @NotNull
    public final Integer invoke(int i, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Integer.valueOf(Alignment.Companion.getStart().align(0, i, layoutDirection));
    }
}
