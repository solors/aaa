package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SnapshotStateList.kt */
@Metadata
/* loaded from: classes.dex */
final class SnapshotStateList$addAll$1<T> extends Lambda implements Function1<List<T>, Boolean> {
    final /* synthetic */ Collection<T> $elements;
    final /* synthetic */ int $index;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateList$addAll$1(int i, Collection<? extends T> collection) {
        super(1);
        this.$index = i;
        this.$elements = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((List) ((List) obj));
    }

    @NotNull
    public final Boolean invoke(@NotNull List<T> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.addAll(this.$index, this.$elements));
    }
}
