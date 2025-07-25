package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SidecarAdapter.kt */
@Metadata
/* loaded from: classes2.dex */
final class SidecarAdapter$translate$checkedFeature$2 extends Lambda implements Function1<SidecarDisplayFeature, Boolean> {
    public static final SidecarAdapter$translate$checkedFeature$2 INSTANCE = new SidecarAdapter$translate$checkedFeature$2();

    SidecarAdapter$translate$checkedFeature$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull SidecarDisplayFeature require) {
        Intrinsics.checkNotNullParameter(require, "$this$require");
        return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
    }
}
