package androidx.compose.p015ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 */
/* loaded from: classes.dex */
public final class C0942x68d8e1f6 extends Lambda implements Function1<Configuration, Unit> {
    final /* synthetic */ SnapshotState<Configuration> $configuration$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0942x68d8e1f6(SnapshotState<Configuration> snapshotState) {
        super(1);
        this.$configuration$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
        invoke2(configuration);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Configuration it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$configuration$delegate.setValue(it);
    }
}
