package p820od;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MapBuilder.kt */
@Metadata
/* renamed from: od.e */
/* loaded from: classes7.dex */
public final class C39151e<K, V> extends MapBuilder<Map.Entry<K, V>, K, V> {
    @NotNull

    /* renamed from: b */
    private final C39144d<K, V> f102849b;

    public C39151e(@NotNull C39144d<K, V> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f102849b = backing;
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((Map.Entry) ((Map.Entry) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f102849b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f102849b.m13783p(elements);
    }

    @Override // p820od.MapBuilder
    public boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f102849b.m13782q(element);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f102849b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f102849b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f102849b.m13778u();
    }

    @Override // p820od.MapBuilder
    public boolean remove(@NotNull Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f102849b.m13803L(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f102849b.m13785n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f102849b.m13785n();
        return super.retainAll(elements);
    }

    public boolean add(@NotNull Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }
}
