package androidx.compose.p015ui.layout;

import ae.KMarkers;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.MutableCollections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SubcomposeLayout.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.SubcomposeSlotReusePolicy */
/* loaded from: classes.dex */
public interface SubcomposeSlotReusePolicy {

    /* compiled from: SubcomposeLayout.kt */
    @StabilityInferred(parameters = 0)
    @Metadata
    /* renamed from: androidx.compose.ui.layout.SubcomposeSlotReusePolicy$SlotIdsSet */
    /* loaded from: classes.dex */
    public static final class SlotIdsSet implements Collection<Object>, KMarkers {
        public static final int $stable = 8;
        @NotNull
        private final Set<Object> set;

        public SlotIdsSet() {
            this(null, 1, null);
        }

        @Override // java.util.Collection
        /* renamed from: add$ui_release */
        public final boolean add(@Nullable Object obj) {
            return this.set.add(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.set.clear();
        }

        @Override // java.util.Collection
        public boolean contains(@Nullable Object obj) {
            return this.set.contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.set.containsAll(elements);
        }

        public int getSize() {
            return this.set.size();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.set.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<Object> iterator() {
            return this.set.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@Nullable Object obj) {
            return this.set.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> slotIds) {
            Intrinsics.checkNotNullParameter(slotIds, "slotIds");
            return this.set.remove(slotIds);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> slotIds) {
            Intrinsics.checkNotNullParameter(slotIds, "slotIds");
            return this.set.retainAll(slotIds);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.m17045a(this);
        }

        public SlotIdsSet(@NotNull Set<Object> set) {
            Intrinsics.checkNotNullParameter(set, "set");
            this.set = set;
        }

        public final boolean removeAll(@NotNull Function1<Object, Boolean> predicate) {
            boolean m17618J;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m17618J = MutableCollections.m17618J(this.set, predicate);
            return m17618J;
        }

        public final boolean retainAll(@NotNull Function1<Object, Boolean> predicate) {
            boolean m17609S;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m17609S = MutableCollections.m17609S(this.set, predicate);
            return m17609S;
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.m17044b(this, array);
        }

        public /* synthetic */ SlotIdsSet(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    boolean areCompatible(@Nullable Object obj, @Nullable Object obj2);

    void getSlotsToRetain(@NotNull SlotIdsSet slotIdsSet);
}
