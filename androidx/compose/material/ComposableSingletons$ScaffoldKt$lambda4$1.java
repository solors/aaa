package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scaffold.kt */
@Metadata
/* renamed from: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-4$1  reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$ScaffoldKt$lambda4$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ScaffoldKt$lambda4$1 INSTANCE = new ComposableSingletons$ScaffoldKt$lambda4$1();

    ComposableSingletons$ScaffoldKt$lambda4$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        }
    }
}
