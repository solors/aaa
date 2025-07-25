package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: MovableContent.kt */
@Metadata
/* loaded from: classes.dex */
final class MovableContentKt$movableContentOf$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MovableContent<Unit> $movableContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovableContentKt$movableContentOf$1(MovableContent<Unit> movableContent) {
        super(2);
        this.$movableContent = movableContent;
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
        } else {
            composer.insertMovableContent(this.$movableContent, Unit.f99208a);
        }
    }
}
