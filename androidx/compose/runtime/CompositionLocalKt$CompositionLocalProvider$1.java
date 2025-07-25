package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CompositionLocal.kt */
@Metadata
/* loaded from: classes.dex */
public final class CompositionLocalKt$CompositionLocalProvider$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ ProvidedValue<?>[] $values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CompositionLocalKt$CompositionLocalProvider$1(ProvidedValue<?>[] providedValueArr, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$values = providedValueArr;
        this.$content = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.f99208a;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ProvidedValue<?>[] providedValueArr = this.$values;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue[]) Arrays.copyOf(providedValueArr, providedValueArr.length), this.$content, composer, this.$$changed | 1);
    }
}
