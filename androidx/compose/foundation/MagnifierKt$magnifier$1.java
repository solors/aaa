package androidx.compose.foundation;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Magnifier.kt */
@Metadata
/* loaded from: classes.dex */
public final class MagnifierKt$magnifier$1 extends Lambda implements Function1<Density, Offset> {
    public static final MagnifierKt$magnifier$1 INSTANCE = new MagnifierKt$magnifier$1();

    MagnifierKt$magnifier$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Offset invoke(Density density) {
        return Offset.m107280boximpl(m106119invoketuRUvjQ(density));
    }

    /* renamed from: invoke-tuRUvjQ  reason: not valid java name */
    public final long m106119invoketuRUvjQ(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "$this$null");
        return Offset.Companion.m107306getUnspecifiedF1C5BW0();
    }
}
