package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: AppBar.kt */
@Metadata
/* renamed from: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$AppBarKt$lambda1$1 extends Lambda implements InterfaceC45268n<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$AppBarKt$lambda1$1 INSTANCE = new ComposableSingletons$AppBarKt$lambda1$1();

    ComposableSingletons$AppBarKt$lambda1$1() {
        super(3);
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(rowScope, "$this$null");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        }
    }
}
