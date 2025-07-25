package androidx.compose.material;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.runtime.State;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Switch.kt */
@Metadata
/* loaded from: classes.dex */
final class SwitchKt$SwitchImpl$3$1 extends Lambda implements Function1<Density, IntOffset> {
    final /* synthetic */ State<Float> $thumbValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$3$1(State<Float> state) {
        super(1);
        this.$thumbValue = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
        return IntOffset.m109843boximpl(m107089invokeBjo55l4(density));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m107089invokeBjo55l4(@NotNull Density offset) {
        int m103791d;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        m103791d = MathJVM.m103791d(this.$thumbValue.getValue().floatValue());
        return IntOffsetKt.IntOffset(m103791d, 0);
    }
}
