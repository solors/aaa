package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: BoxWithConstraints.kt */
@Metadata
/* loaded from: classes.dex */
final class BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC45268n<BoxWithConstraintsScope, Composer, Integer, Unit> $content;
    final /* synthetic */ BoxWithConstraintsScopeImpl $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1(InterfaceC45268n<? super BoxWithConstraintsScope, ? super Composer, ? super Integer, Unit> interfaceC45268n, BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, int i) {
        super(2);
        this.$content = interfaceC45268n;
        this.$scope = boxWithConstraintsScopeImpl;
        this.$$dirty = i;
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
            this.$content.invoke(this.$scope, composer, Integer.valueOf((this.$$dirty >> 6) & 112));
        }
    }
}
