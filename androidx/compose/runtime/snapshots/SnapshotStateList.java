package androidx.compose.runtime.snapshots;

import ae.InterfaceC0038d;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.extensions;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SnapshotStateList.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class SnapshotStateList<T> implements List<T>, StateObject, InterfaceC0038d {
    @NotNull
    private StateRecord firstStateRecord = new StateListStateRecord(extensions.persistentListOf());

    /* compiled from: SnapshotStateList.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class StateListStateRecord<T> extends StateRecord {
        @NotNull
        private PersistentList<? extends T> list;
        private int modification;

        public StateListStateRecord(@NotNull PersistentList<? extends T> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                this.list = ((StateListStateRecord) value).list;
                this.modification = ((StateListStateRecord) value).modification;
                Unit unit = Unit.f99208a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        @NotNull
        public final PersistentList<T> getList$runtime_release() {
            return (PersistentList<? extends T>) this.list;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setList$runtime_release(@NotNull PersistentList<? extends T> persistentList) {
            Intrinsics.checkNotNullParameter(persistentList, "<set-?>");
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }
    }

    private final boolean conditionalUpdate(Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> function1) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Object obj2;
        Snapshot current;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    companion = Snapshot.Companion;
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    Unit unit = Unit.f99208a;
                    InlineMarker.m17017b(1);
                } finally {
                    InlineMarker.m17017b(1);
                    InlineMarker.m17018a(1);
                }
            }
            InlineMarker.m17018a(1);
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<? extends T> invoke = function1.invoke(list$runtime_release);
            z = false;
            if (!Intrinsics.m17075f(invoke, list$runtime_release)) {
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    try {
                        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                        SnapshotKt.getSnapshotInitializer();
                        synchronized (SnapshotKt.getLock()) {
                            current = companion.getCurrent();
                            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(invoke);
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                z = true;
                            }
                            InlineMarker.m17017b(1);
                        }
                        InlineMarker.m17018a(1);
                        SnapshotKt.notifyWrite(current, this);
                        InlineMarker.m17017b(1);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                InlineMarker.m17018a(1);
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    private final <R> R mutate(Function1<? super List<T>, ? extends R> function1) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        R invoke;
        Object obj2;
        Snapshot current;
        boolean z;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    companion = Snapshot.Companion;
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    Unit unit = Unit.f99208a;
                    InlineMarker.m17017b(1);
                } finally {
                }
            }
            InlineMarker.m17018a(1);
            Intrinsics.m17074g(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = function1.invoke(builder);
            PersistentList<T> build = builder.build();
            if (Intrinsics.m17075f(build, list$runtime_release)) {
                break;
            }
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                try {
                    StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        current = companion.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(build);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        InlineMarker.m17017b(1);
                    }
                    InlineMarker.m17018a(1);
                    SnapshotKt.notifyWrite(current, this);
                    InlineMarker.m17017b(1);
                } finally {
                }
            }
            InlineMarker.m17018a(1);
        } while (!z);
        return invoke;
    }

    private final boolean mutateBoolean(Function1<? super List<T>, Boolean> function1) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Boolean invoke;
        Object obj2;
        Snapshot current;
        boolean z;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            invoke = function1.invoke(builder);
            PersistentList<T> build = builder.build();
            if (Intrinsics.m17075f(build, list$runtime_release)) {
                break;
            }
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return invoke.booleanValue();
    }

    private final void update(Function1<? super PersistentList<? extends T>, ? extends PersistentList<? extends T>> function1) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Object obj2;
        Snapshot current;
        boolean z;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                try {
                    companion = Snapshot.Companion;
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    Unit unit = Unit.f99208a;
                    InlineMarker.m17017b(1);
                } finally {
                }
            }
            InlineMarker.m17018a(1);
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<? extends T> invoke = function1.invoke(list$runtime_release);
            if (!Intrinsics.m17075f(invoke, list$runtime_release)) {
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    try {
                        StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                        SnapshotKt.getSnapshotInitializer();
                        synchronized (SnapshotKt.getLock()) {
                            current = companion.getCurrent();
                            StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                            if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                                stateListStateRecord3.setList$runtime_release(invoke);
                                stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                                z = true;
                            } else {
                                z = false;
                            }
                            InlineMarker.m17017b(1);
                        }
                        InlineMarker.m17018a(1);
                        SnapshotKt.notifyWrite(current, this);
                        InlineMarker.m17017b(1);
                    } finally {
                    }
                }
                InlineMarker.m17018a(1);
            } else {
                return;
            }
        } while (!z);
    }

    private final <R> R withCurrent(Function1<? super StateListStateRecord<T>, ? extends R> function1) {
        return function1.invoke(SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), Snapshot.Companion.getCurrent()));
    }

    private final <R> R writable(Function1<? super StateListStateRecord<T>, ? extends R> function1) {
        Snapshot current;
        R invoke;
        StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = function1.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
                InlineMarker.m17017b(1);
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        InlineMarker.m17018a(1);
        SnapshotKt.notifyWrite(current, this);
        return invoke;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Object obj2;
        Snapshot current;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add((PersistentList<T>) t);
            z = false;
            if (Intrinsics.m17075f(add, list$runtime_release)) {
                return false;
            }
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return mutateBoolean(new SnapshotStateList$addAll$1(i, elements));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Object obj;
        Snapshot current;
        obj = SnapshotStateListKt.sync;
        synchronized (obj) {
            StateListStateRecord stateListStateRecord = (StateListStateRecord) getFirstStateRecord();
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
                stateListStateRecord2.setList$runtime_release(extensions.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification$runtime_release() + 1);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return getReadable$runtime_release().getList$runtime_release().containsAll(elements);
    }

    @Override // java.util.List
    public T get(int i) {
        return getReadable$runtime_release().getList$runtime_release().get(i);
    }

    @NotNull
    public final List<T> getDebuggerDisplayValue() {
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), Snapshot.Companion.getCurrent())).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), Snapshot.Companion.getCurrent())).getModification$runtime_release();
    }

    @NotNull
    public final StateListStateRecord<T> getReadable$runtime_release() {
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) getFirstStateRecord(), this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(obj);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.setNext$runtime_release(getFirstStateRecord());
        this.firstStateRecord = (StateListStateRecord) value;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Object obj2;
        Snapshot current;
        Intrinsics.checkNotNullParameter(elements, "elements");
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<T> removeAll = list$runtime_release.removeAll((Collection<? extends T>) elements);
            z = false;
            if (!Intrinsics.m17075f(removeAll, list$runtime_release)) {
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        current = companion.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(removeAll);
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                            z = true;
                        }
                    }
                    SnapshotKt.notifyWrite(current, this);
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    public T removeAt(int i) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Object obj2;
        Snapshot current;
        boolean z;
        T t = get(i);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<T> removeAt = list$runtime_release.removeAt(i);
            if (Intrinsics.m17075f(removeAt, list$runtime_release)) {
                break;
            }
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(removeAt);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return t;
    }

    public final void removeRange(int i, int i2) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Object obj2;
        Snapshot current;
        boolean z;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i, i2).clear();
            PersistentList<T> build = builder.build();
            if (!Intrinsics.m17075f(build, list$runtime_release)) {
                obj2 = SnapshotStateListKt.sync;
                synchronized (obj2) {
                    StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        current = companion.getCurrent();
                        StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                        if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateListStateRecord3.setList$runtime_release(build);
                            z = true;
                            stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        } else {
                            z = false;
                        }
                    }
                    SnapshotKt.notifyWrite(current, this);
                }
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return mutateBoolean(new SnapshotStateList$retainAll$1(elements));
    }

    public final int retainAllInRange$runtime_release(@NotNull Collection<? extends T> elements, int i, int i2) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Object obj2;
        Snapshot current;
        boolean z;
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = size();
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i, i2).retainAll(elements);
            PersistentList<T> build = builder.build();
            if (Intrinsics.m17075f(build, list$runtime_release)) {
                break;
            }
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(build);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return size - size();
    }

    @Override // java.util.List
    public T set(int i, T t) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Object obj2;
        Snapshot current;
        boolean z;
        T t2 = get(i);
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(i, (int) t);
            if (Intrinsics.m17075f(persistentList, list$runtime_release)) {
                break;
            }
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(persistentList);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i2 > size()) {
            z2 = false;
        }
        if (z2) {
            return new SubList(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.m17045a(this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Object obj2;
        Snapshot current;
        Intrinsics.checkNotNullParameter(elements, "elements");
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<T> addAll = list$runtime_release.addAll(elements);
            z = false;
            if (Intrinsics.m17075f(addAll, list$runtime_release)) {
                return false;
            }
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(addAll);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int i) {
        return new StateListIterator(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        boolean z;
        Object obj3;
        Snapshot current;
        do {
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<T> remove = list$runtime_release.remove((PersistentList<T>) obj);
            z = false;
            if (Intrinsics.m17075f(remove, list$runtime_release)) {
                return false;
            }
            obj3 = SnapshotStateListKt.sync;
            synchronized (obj3) {
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(remove);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                        z = true;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.m17044b(this, array);
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    @Override // java.util.List
    public void add(int i, T t) {
        Object obj;
        Snapshot.Companion companion;
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Object obj2;
        Snapshot current;
        boolean z;
        do {
            obj = SnapshotStateListKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) getFirstStateRecord(), companion.getCurrent());
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(list$runtime_release);
            PersistentList<T> add = list$runtime_release.add(i, (int) t);
            if (Intrinsics.m17075f(add, list$runtime_release)) {
                return;
            }
            obj2 = SnapshotStateListKt.sync;
            synchronized (obj2) {
                StateListStateRecord stateListStateRecord2 = (StateListStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                    if (stateListStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateListStateRecord3.setList$runtime_release(add);
                        z = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
    }
}
