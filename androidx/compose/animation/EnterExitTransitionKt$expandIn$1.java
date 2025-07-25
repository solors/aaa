package androidx.compose.animation;

import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$expandIn$1 extends Lambda implements Function1<IntSize, IntSize> {
    public static final EnterExitTransitionKt$expandIn$1 INSTANCE = new EnterExitTransitionKt$expandIn$1();

    EnterExitTransitionKt$expandIn$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
        return IntSize.m109886boximpl(m105966invokemzRDjE0(intSize.m109898unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0  reason: not valid java name */
    public final long m105966invokemzRDjE0(long j) {
        return IntSizeKt.IntSize(0, 0);
    }
}
