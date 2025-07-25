package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SlidingWindow.kt */
@Metadata
/* renamed from: kotlin.collections.u0 */
/* loaded from: classes7.dex */
public final class C37562u0<E> extends AbstractList<E> implements RandomAccess {
    @NotNull

    /* renamed from: b */
    private final List<E> f99263b;

    /* renamed from: c */
    private int f99264c;

    /* renamed from: d */
    private int f99265d;

    /* JADX WARN: Multi-variable type inference failed */
    public C37562u0(@NotNull List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f99263b = list;
    }

    /* renamed from: a */
    public final void m17173a(int i, int i2) {
        AbstractList.Companion.m17588d(i, i2, this.f99263b.size());
        this.f99264c = i;
        this.f99265d = i2 - i;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.m17590b(i, this.f99265d);
        return this.f99263b.get(this.f99264c + i);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f99265d;
    }
}
