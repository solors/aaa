package p820od;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: od.j */
/* loaded from: classes7.dex */
public final class SetBuilder<E> extends AbstractMutableSet<E> implements Serializable {
    @NotNull

    /* renamed from: c */
    private static final C39158a f102857c = new C39158a(null);
    @NotNull

    /* renamed from: d */
    private static final SetBuilder f102858d = new SetBuilder(C39144d.f102828p.m13768e());
    @NotNull

    /* renamed from: b */
    private final C39144d<E, ?> f102859b;

    /* compiled from: SetBuilder.kt */
    @Metadata
    /* renamed from: od.j$a */
    /* loaded from: classes7.dex */
    private static final class C39158a {
        private C39158a() {
        }

        public /* synthetic */ C39158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SetBuilder(@NotNull C39144d<E, ?> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f102859b = backing;
    }

    private final Object writeReplace() {
        if (this.f102859b.m13810E()) {
            return new C39154h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        if (this.f102859b.m13788j(e) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f102859b.m13785n();
        return super.addAll(elements);
    }

    @NotNull
    /* renamed from: c */
    public final Set<E> m13757c() {
        this.f102859b.m13786m();
        if (size() > 0) {
            return this;
        }
        return f102858d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f102859b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f102859b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.f102859b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f102859b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return this.f102859b.m13809F();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f102859b.m13801N(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f102859b.m13785n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f102859b.m13785n();
        return super.retainAll(elements);
    }

    public SetBuilder() {
        this(new C39144d());
    }

    public SetBuilder(int i) {
        this(new C39144d(i));
    }
}
