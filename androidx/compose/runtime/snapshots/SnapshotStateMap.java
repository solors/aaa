package androidx.compose.runtime.snapshots;

import ae.InterfaceC0039e;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.extensions;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotStateMap.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class SnapshotStateMap<K, V> implements Map<K, V>, StateObject, InterfaceC0039e {
    @NotNull
    private StateRecord firstStateRecord = new StateMapStateRecord(extensions.persistentHashMapOf());
    @NotNull
    private final Set<Map.Entry<K, V>> entries = new SnapshotMapEntrySet(this);
    @NotNull
    private final Set<K> keys = new SnapshotMapKeySet(this);
    @NotNull
    private final Collection<V> values = new SnapshotMapValueSet(this);

    /* compiled from: SnapshotStateMap.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        @NotNull
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(@NotNull PersistentMap<K, ? extends V> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) value;
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                Unit unit = Unit.f99208a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateMapStateRecord(this.map);
        }

        @NotNull
        public final PersistentMap<K, V> getMap$runtime_release() {
            return (PersistentMap<K, ? extends V>) this.map;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setMap$runtime_release(@NotNull PersistentMap<K, ? extends V> persistentMap) {
            Intrinsics.checkNotNullParameter(persistentMap, "<set-?>");
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i) {
            this.modification = i;
        }
    }

    private final <R> R mutate(Function1<? super Map<K, V>, ? extends R> function1) {
        Object obj;
        Snapshot.Companion companion;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        R invoke;
        Object obj2;
        Snapshot current;
        boolean z;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    companion = Snapshot.Companion;
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), companion.getCurrent());
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    Unit unit = Unit.f99208a;
                    InlineMarker.m17017b(1);
                } finally {
                }
            }
            InlineMarker.m17018a(1);
            Intrinsics.m17074g(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            invoke = function1.invoke(builder);
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.m17075f(build, map$runtime_release)) {
                break;
            }
            obj2 = SnapshotStateMapKt.sync;
            synchronized (obj2) {
                try {
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        current = companion.getCurrent();
                        StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                        if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateMapStateRecord3.setMap$runtime_release(build);
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
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

    private final void update(Function1<? super PersistentMap<K, ? extends V>, ? extends PersistentMap<K, ? extends V>> function1) {
        Object obj;
        Snapshot current;
        Snapshot.Companion companion = Snapshot.Companion;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), companion.getCurrent());
        PersistentMap<K, V> persistentMap = (PersistentMap) ((PersistentMap<K, ? extends V>) function1.invoke(stateMapStateRecord.getMap$runtime_release()));
        if (persistentMap != stateMapStateRecord.getMap$runtime_release()) {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        current = companion.getCurrent();
                        StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                        stateMapStateRecord3.setMap$runtime_release(persistentMap);
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                        InlineMarker.m17017b(1);
                    }
                    InlineMarker.m17018a(1);
                    SnapshotKt.notifyWrite(current, this);
                    InlineMarker.m17017b(1);
                } catch (Throwable th) {
                    InlineMarker.m17017b(1);
                    InlineMarker.m17018a(1);
                    throw th;
                }
            }
            InlineMarker.m17018a(1);
        }
    }

    private final <R> R withCurrent(Function1<? super StateMapStateRecord<K, V>, ? extends R> function1) {
        return function1.invoke(SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), Snapshot.Companion.getCurrent()));
    }

    private final <R> R writable(Function1<? super StateMapStateRecord<K, V>, ? extends R> function1) {
        Snapshot current;
        R invoke;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) getFirstStateRecord();
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = function1.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
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

    public final boolean all$runtime_release(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry entry : (ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(@NotNull Function1<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        for (Map.Entry entry : (ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Object obj;
        Snapshot current;
        Snapshot.Companion companion = Snapshot.Companion;
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), companion.getCurrent());
        stateMapStateRecord.getMap$runtime_release();
        PersistentMap<K, V> persistentHashMapOf = extensions.persistentHashMapOf();
        if (persistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    stateMapStateRecord3.setMap$runtime_release(persistentHashMapOf);
                    stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                }
                SnapshotKt.notifyWrite(current, this);
            }
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().get(obj);
    }

    @NotNull
    public final Map<K, V> getDebuggerDisplayValue() {
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), Snapshot.Companion.getCurrent())).getMap$runtime_release();
    }

    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @NotNull
    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification$runtime_release();
    }

    @NotNull
    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) getFirstStateRecord(), this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    @NotNull
    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.firstStateRecord = (StateMapStateRecord) value;
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k, V v) {
        Object obj;
        Snapshot.Companion companion;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V put;
        Object obj2;
        Snapshot current;
        boolean z;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), companion.getCurrent());
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            put = builder.put(k, v);
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.m17075f(build, map$runtime_release)) {
                break;
            }
            obj2 = SnapshotStateMapKt.sync;
            synchronized (obj2) {
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return put;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Object obj;
        Snapshot.Companion companion;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Object obj2;
        Snapshot current;
        boolean z;
        Intrinsics.checkNotNullParameter(from, "from");
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                companion = Snapshot.Companion;
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), companion.getCurrent());
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            builder.putAll(from);
            PersistentMap<K, V> build = builder.build();
            if (!Intrinsics.m17075f(build, map$runtime_release)) {
                obj2 = SnapshotStateMapKt.sync;
                synchronized (obj2) {
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        current = companion.getCurrent();
                        StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                        if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateMapStateRecord3.setMap$runtime_release(build);
                            z = true;
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
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

    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        Object obj2;
        Snapshot.Companion companion;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V remove;
        Object obj3;
        Snapshot current;
        boolean z;
        do {
            obj2 = SnapshotStateMapKt.sync;
            synchronized (obj2) {
                companion = Snapshot.Companion;
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), companion.getCurrent());
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                Unit unit = Unit.f99208a;
            }
            Intrinsics.m17074g(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            remove = builder.remove(obj);
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.m17075f(build, map$runtime_release)) {
                break;
            }
            obj3 = SnapshotStateMapKt.sync;
            synchronized (obj3) {
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
                SnapshotKt.getSnapshotInitializer();
                synchronized (SnapshotKt.getLock()) {
                    current = companion.getCurrent();
                    StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                    if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                        stateMapStateRecord3.setMap$runtime_release(build);
                        z = true;
                        stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                    } else {
                        z = false;
                    }
                }
                SnapshotKt.notifyWrite(current, this);
            }
        } while (!z);
        return remove;
    }

    public final boolean removeIf$runtime_release(@NotNull Function1<? super Map.Entry<K, V>, Boolean> predicate) {
        Object obj;
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Object obj2;
        Snapshot current;
        boolean z;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        boolean z2 = false;
        do {
            obj = SnapshotStateMapKt.sync;
            synchronized (obj) {
                try {
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) getFirstStateRecord(), Snapshot.Companion.getCurrent());
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    Unit unit = Unit.f99208a;
                    InlineMarker.m17017b(1);
                } catch (Throwable th) {
                    InlineMarker.m17017b(1);
                    InlineMarker.m17018a(1);
                    throw th;
                }
            }
            InlineMarker.m17018a(1);
            Intrinsics.m17074g(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (predicate.invoke(entry).booleanValue()) {
                    builder.remove(entry.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.f99208a;
            PersistentMap<K, V> build = builder.build();
            if (Intrinsics.m17075f(build, map$runtime_release)) {
                break;
            }
            obj2 = SnapshotStateMapKt.sync;
            synchronized (obj2) {
                try {
                    StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) getFirstStateRecord();
                    SnapshotKt.getSnapshotInitializer();
                    synchronized (SnapshotKt.getLock()) {
                        current = Snapshot.Companion.getCurrent();
                        StateMapStateRecord stateMapStateRecord3 = (StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current);
                        if (stateMapStateRecord3.getModification$runtime_release() == modification$runtime_release) {
                            stateMapStateRecord3.setMap$runtime_release(build);
                            stateMapStateRecord3.setModification$runtime_release(stateMapStateRecord3.getModification$runtime_release() + 1);
                            z = true;
                        } else {
                            z = false;
                        }
                        InlineMarker.m17017b(1);
                    }
                    InlineMarker.m17018a(1);
                    SnapshotKt.notifyWrite(current, this);
                    InlineMarker.m17017b(1);
                } catch (Throwable th2) {
                    InlineMarker.m17017b(1);
                    InlineMarker.m17018a(1);
                    throw th2;
                }
            }
            InlineMarker.m17018a(1);
        } while (!z);
        return z2;
    }

    public final boolean removeValue$runtime_release(V v) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.m17075f(((Map.Entry) obj).getValue(), v)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }
}
