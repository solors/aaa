package androidx.compose.p015ui.node;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmTreeSet.jvm.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.TreeSet */
/* loaded from: classes.dex */
public final class TreeSet<E> extends java.util.TreeSet<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreeSet(@NotNull Comparator<? super E> comparator) {
        super(comparator);
        Intrinsics.checkNotNullParameter(comparator, "comparator");
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}
