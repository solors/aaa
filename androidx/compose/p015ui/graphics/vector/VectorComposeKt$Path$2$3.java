package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.PathFillType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorCompose.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3 */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$3 extends Lambda implements Function2<PathComponent, PathFillType, Unit> {
    public static final VectorComposeKt$Path$2$3 INSTANCE = new VectorComposeKt$Path$2$3();

    VectorComposeKt$Path$2$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(PathComponent pathComponent, PathFillType pathFillType) {
        m108126invokepweu1eQ(pathComponent, pathFillType.m107769unboximpl());
        return Unit.f99208a;
    }

    /* renamed from: invoke-pweu1eQ  reason: not valid java name */
    public final void m108126invokepweu1eQ(@NotNull PathComponent set, int i) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.m108109setPathFillTypeoQ8Xj4U(i);
    }
}
