package kotlinx.serialization.json;

import ae.KMarkers;
import com.ironsource.C21114v8;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.InterfaceC39163h;

/* compiled from: JsonElement.kt */
@Metadata
@InterfaceC39163h(with = JsonElementSerializers.class)
/* loaded from: classes8.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, KMarkers {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: b */
    private final List<JsonElement> f99702b;

    /* compiled from: JsonElement.kt */
    @Metadata
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<JsonArray> serializer() {
            return JsonElementSerializers.f99713a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(@NotNull List<? extends JsonElement> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f99702b = content;
    }

    /* renamed from: a */
    public boolean m15964a(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f99702b.contains(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    /* renamed from: c */
    public JsonElement get(int i) {
        return this.f99702b.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return m15964a((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f99702b.containsAll(elements);
    }

    /* renamed from: d */
    public int m15962d() {
        return this.f99702b.size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        return Intrinsics.m17075f(this.f99702b, obj);
    }

    /* renamed from: f */
    public int m15961f(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f99702b.indexOf(element);
    }

    /* renamed from: g */
    public int m15960g(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f99702b.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f99702b.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return m15961f((JsonElement) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f99702b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<JsonElement> iterator() {
        return this.f99702b.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        return m15960g((JsonElement) obj);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<JsonElement> listIterator() {
        return this.f99702b.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ JsonElement set(int i, JsonElement jsonElement) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m15962d();
    }

    @Override // java.util.List
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<JsonElement> subList(int i, int i2) {
        return this.f99702b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    @NotNull
    public String toString() {
        String m17521z0;
        m17521z0 = _Collections.m17521z0(this.f99702b, ",", C21114v8.C21123i.f54137d, C21114v8.C21123i.f54139e, 0, null, null, 56, null);
        return m17521z0;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<JsonElement> listIterator(int i) {
        return this.f99702b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }
}
