package androidx.compose.p015ui.platform;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WindowInfo.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.WindowInfoKt$WindowFocusObserver$2 */
/* loaded from: classes.dex */
public final class WindowInfoKt$WindowFocusObserver$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<Boolean, Unit> $onWindowFocusChanged;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoKt$WindowFocusObserver$2(Function1<? super Boolean, Unit> function1, int i) {
        super(2);
        this.$onWindowFocusChanged = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        WindowInfoKt.WindowFocusObserver(this.$onWindowFocusChanged, composer, this.$$changed | 1);
    }
}
