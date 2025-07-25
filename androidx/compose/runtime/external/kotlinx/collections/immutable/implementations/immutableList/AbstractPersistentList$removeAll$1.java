package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: AbstractPersistentList.kt */
@Metadata
/* loaded from: classes.dex */
final class AbstractPersistentList$removeAll$1<E> extends Lambda implements Function1<E, Boolean> {
    final /* synthetic */ Collection<E> $elements;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractPersistentList$removeAll$1(Collection<? extends E> collection) {
        super(1);
        this.$elements = collection;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(E e) {
        return Boolean.valueOf(this.$elements.contains(e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((AbstractPersistentList$removeAll$1<E>) obj);
    }
}
