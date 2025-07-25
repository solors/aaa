package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

/* compiled from: Snapshot.kt */
@Metadata
/* loaded from: classes.dex */
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT = 0;
    @NotNull
    private static final List<Function2<Set<? extends Object>, Snapshot, Unit>> applyObservers;
    @NotNull
    private static final AtomicReference<GlobalSnapshot> currentGlobalSnapshot;
    @NotNull
    private static final List<Function1<Object, Unit>> globalWriteObservers;
    private static int nextSnapshotId;
    @NotNull
    private static SnapshotIdSet openSnapshots;
    @NotNull
    private static final SnapshotDoubleIndexHeap pinningTable;
    @NotNull
    private static final Snapshot snapshotInitializer;
    @NotNull
    private static final Function1<SnapshotIdSet, Unit> emptyLambda = SnapshotKt$emptyLambda$1.INSTANCE;
    @NotNull
    private static final SnapshotThreadLocal<Snapshot> threadSnapshot = new SnapshotThreadLocal<>();
    @NotNull
    private static final Object lock = new Object();

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.Companion;
        openSnapshots = companion.getEMPTY();
        nextSnapshotId = 1;
        pinningTable = new SnapshotDoubleIndexHeap();
        applyObservers = new ArrayList();
        globalWriteObservers = new ArrayList();
        int i = nextSnapshotId;
        nextSnapshotId = i + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i, companion.getEMPTY());
        openSnapshots = openSnapshots.set(globalSnapshot.getId());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        currentGlobalSnapshot = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(globalSnapshot2, "currentGlobalSnapshot.get()");
        snapshotInitializer = globalSnapshot2;
    }

    @NotNull
    public static final SnapshotIdSet addRange(@NotNull SnapshotIdSet snapshotIdSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<this>");
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.set(i);
            i++;
        }
        return snapshotIdSet;
    }

    public static final <T> T advanceGlobalSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        T t;
        List m17550c1;
        GlobalSnapshot previousGlobalSnapshot = currentGlobalSnapshot.get();
        synchronized (getLock()) {
            Intrinsics.checkNotNullExpressionValue(previousGlobalSnapshot, "previousGlobalSnapshot");
            t = (T) takeNewGlobalSnapshot(previousGlobalSnapshot, function1);
        }
        Set<StateObject> modified$runtime_release = previousGlobalSnapshot.getModified$runtime_release();
        if (modified$runtime_release != null) {
            synchronized (getLock()) {
                m17550c1 = _Collections.m17550c1(applyObservers);
            }
            int size = m17550c1.size();
            for (int i = 0; i < size; i++) {
                ((Function2) m17550c1.get(i)).mo105910invoke(modified$runtime_release, previousGlobalSnapshot);
            }
        }
        return t;
    }

    public static final Snapshot createTransparentSnapshotWithNoParentReadObserver(Snapshot snapshot, Function1<Object, Unit> function1, boolean z) {
        MutableSnapshot mutableSnapshot;
        boolean z2 = snapshot instanceof MutableSnapshot;
        if (!z2 && snapshot != null) {
            return new TransparentObserverSnapshot(snapshot, function1, false, z);
        }
        if (z2) {
            mutableSnapshot = (MutableSnapshot) snapshot;
        } else {
            mutableSnapshot = null;
        }
        return new TransparentObserverMutableSnapshot(mutableSnapshot, function1, null, false, z);
    }

    public static /* synthetic */ Snapshot createTransparentSnapshotWithNoParentReadObserver$default(Snapshot snapshot, Function1 function1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return createTransparentSnapshotWithNoParentReadObserver(snapshot, function1, z);
    }

    @NotNull
    public static final <T extends StateRecord> T current(@NotNull T r, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(r, "r");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t = (T) readable(r, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t != null) {
            return t;
        }
        readError();
        throw new ExceptionsH();
    }

    @NotNull
    public static final Snapshot currentSnapshot() {
        Snapshot snapshot = threadSnapshot.get();
        if (snapshot == null) {
            GlobalSnapshot globalSnapshot = currentGlobalSnapshot.get();
            Intrinsics.checkNotNullExpressionValue(globalSnapshot, "currentGlobalSnapshot.get()");
            return globalSnapshot;
        }
        return snapshot;
    }

    @NotNull
    public static final Object getLock() {
        return lock;
    }

    @NotNull
    public static final Snapshot getSnapshotInitializer() {
        return snapshotInitializer;
    }

    public static final Function1<Object, Unit> mergedReadObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 != null && function12 != null && !Intrinsics.m17075f(function1, function12)) {
            return new SnapshotKt$mergedReadObserver$1(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    public static /* synthetic */ Function1 mergedReadObserver$default(Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return mergedReadObserver(function1, function12, z);
    }

    public static final Function1<Object, Unit> mergedWriteObserver(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        if (function1 != null && function12 != null && !Intrinsics.m17075f(function1, function12)) {
            return new SnapshotKt$mergedWriteObserver$1(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    @NotNull
    public static final <T extends StateRecord> T newOverwritableRecord(@NotNull T t, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        T t2 = (T) used(state);
        if (t2 != null) {
            t2.setSnapshotId$runtime_release(Integer.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.create();
        t3.setSnapshotId$runtime_release(Integer.MAX_VALUE);
        t3.setNext$runtime_release(state.getFirstStateRecord());
        state.prependStateRecord(t3);
        return t3;
    }

    @NotNull
    public static final <T extends StateRecord> T newWritableRecord(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        T t2 = (T) newOverwritableRecord(t, state);
        t2.assign(t);
        t2.setSnapshotId$runtime_release(snapshot.getId());
        return t2;
    }

    public static final void notifyWrite(@NotNull Snapshot snapshot, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(state, "state");
        Function1<Object, Unit> writeObserver$runtime_release = snapshot.getWriteObserver$runtime_release();
        if (writeObserver$runtime_release != null) {
            writeObserver$runtime_release.invoke(state);
        }
    }

    public static final Map<StateRecord, StateRecord> optimisticMerges(MutableSnapshot mutableSnapshot, MutableSnapshot mutableSnapshot2, SnapshotIdSet snapshotIdSet) {
        StateRecord readable;
        Set<StateObject> modified$runtime_release = mutableSnapshot2.getModified$runtime_release();
        int id2 = mutableSnapshot.getId();
        if (modified$runtime_release == null) {
            return null;
        }
        SnapshotIdSet m105429or = mutableSnapshot2.getInvalid$runtime_release().set(mutableSnapshot2.getId()).m105429or(mutableSnapshot2.getPreviousIds$runtime_release());
        HashMap hashMap = null;
        for (StateObject stateObject : modified$runtime_release) {
            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
            StateRecord readable2 = readable(firstStateRecord, id2, snapshotIdSet);
            if (readable2 != null && (readable = readable(firstStateRecord, id2, m105429or)) != null && !Intrinsics.m17075f(readable2, readable)) {
                StateRecord readable3 = readable(firstStateRecord, mutableSnapshot2.getId(), mutableSnapshot2.getInvalid$runtime_release());
                if (readable3 != null) {
                    StateRecord mergeRecords = stateObject.mergeRecords(readable, readable2, readable3);
                    if (mergeRecords == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(readable2, mergeRecords);
                    hashMap = hashMap;
                } else {
                    readError();
                    throw new ExceptionsH();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends StateRecord, R> R overwritable(@NotNull T t, @NotNull StateObject state, @NotNull T candidate, @NotNull Function1<? super T, ? extends R> block) {
        Snapshot current;
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        Intrinsics.checkNotNullParameter(block, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = block.invoke(overwritableRecord(t, state, current, candidate));
                InlineMarker.m17017b(1);
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        InlineMarker.m17018a(1);
        notifyWrite(current, state);
        return invoke;
    }

    @NotNull
    public static final <T extends StateRecord> T overwritableRecord(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull T candidate) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (snapshot.getReadOnly()) {
            snapshot.mo107198recordModified$runtime_release(state);
        }
        int id2 = snapshot.getId();
        if (candidate.getSnapshotId$runtime_release() == id2) {
            return candidate;
        }
        T t2 = (T) newOverwritableRecord(t, state);
        t2.setSnapshotId$runtime_release(id2);
        snapshot.mo107198recordModified$runtime_release(state);
        return t2;
    }

    public static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends StateRecord> T readable(T t, int i, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (valid(t, i, snapshotIdSet) && (t2 == null || t2.getSnapshotId$runtime_release() < t.getSnapshotId$runtime_release())) {
                t2 = t;
            }
            t = (T) t.getNext$runtime_release();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final void releasePinningLocked(int i) {
        pinningTable.remove(i);
    }

    public static final Void reportReadonlySnapshotWrite() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T> T sync(@NotNull Functions<? extends T> block) {
        T invoke;
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getLock()) {
            try {
                invoke = block.invoke();
                InlineMarker.m17017b(1);
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        InlineMarker.m17018a(1);
        return invoke;
    }

    public static final <T> T takeNewGlobalSnapshot(Snapshot snapshot, Function1<? super SnapshotIdSet, ? extends T> function1) {
        T invoke = function1.invoke(openSnapshots.clear(snapshot.getId()));
        synchronized (getLock()) {
            int i = nextSnapshotId;
            nextSnapshotId = i + 1;
            openSnapshots = openSnapshots.clear(snapshot.getId());
            currentGlobalSnapshot.set(new GlobalSnapshot(i, openSnapshots));
            snapshot.dispose();
            openSnapshots = openSnapshots.set(i);
            Unit unit = Unit.f99208a;
        }
        return invoke;
    }

    public static final <T extends Snapshot> T takeNewSnapshot(Function1<? super SnapshotIdSet, ? extends T> function1) {
        return (T) advanceGlobalSnapshot(new SnapshotKt$takeNewSnapshot$1(function1));
    }

    public static final int trackPinning(int i, @NotNull SnapshotIdSet invalid) {
        int add;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        int lowest = invalid.lowest(i);
        synchronized (getLock()) {
            add = pinningTable.add(lowest);
        }
        return add;
    }

    private static final StateRecord used(StateObject stateObject) {
        int lowestOrDefault = pinningTable.lowestOrDefault(nextSnapshotId) - 1;
        SnapshotIdSet empty = SnapshotIdSet.Companion.getEMPTY();
        StateRecord stateRecord = null;
        for (StateRecord firstStateRecord = stateObject.getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext$runtime_release()) {
            if (firstStateRecord.getSnapshotId$runtime_release() == 0) {
                return firstStateRecord;
            }
            if (valid(firstStateRecord, lowestOrDefault, empty)) {
                if (stateRecord == null) {
                    stateRecord = firstStateRecord;
                } else if (firstStateRecord.getSnapshotId$runtime_release() >= stateRecord.getSnapshotId$runtime_release()) {
                    return stateRecord;
                } else {
                    return firstStateRecord;
                }
            }
        }
        return null;
    }

    private static final boolean valid(int i, int i2, SnapshotIdSet snapshotIdSet) {
        return (i2 == 0 || i2 > i || snapshotIdSet.get(i2)) ? false : true;
    }

    public static final void validateOpen(Snapshot snapshot) {
        if (openSnapshots.get(snapshot.getId())) {
            return;
        }
        throw new IllegalStateException("Snapshot is not open".toString());
    }

    public static final <T extends StateRecord, R> R withCurrent(@NotNull T t, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(current(t, Snapshot.Companion.getCurrent()));
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t, @NotNull StateObject state, @NotNull Function1<? super T, ? extends R> block) {
        Snapshot current;
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        getSnapshotInitializer();
        synchronized (getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                invoke = block.invoke(writableRecord(t, state, current));
                InlineMarker.m17017b(1);
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        InlineMarker.m17018a(1);
        notifyWrite(current, state);
        return invoke;
    }

    @NotNull
    public static final <T extends StateRecord> T writableRecord(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        if (snapshot.getReadOnly()) {
            snapshot.mo107198recordModified$runtime_release(state);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t2 != null) {
            if (t2.getSnapshotId$runtime_release() == snapshot.getId()) {
                return t2;
            }
            T t3 = (T) newWritableRecord(t2, state, snapshot);
            snapshot.mo107198recordModified$runtime_release(state);
            return t3;
        }
        readError();
        throw new ExceptionsH();
    }

    private static final boolean valid(StateRecord stateRecord, int i, SnapshotIdSet snapshotIdSet) {
        return valid(i, stateRecord.getSnapshotId$runtime_release(), snapshotIdSet);
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t, @NotNull StateObject state) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return (T) readable(t, state, currentSnapshot());
    }

    @NotNull
    public static final <T extends StateRecord> T readable(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Function1<Object, Unit> readObserver$runtime_release = snapshot.getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(state);
        }
        T t2 = (T) readable(t, snapshot.getId(), snapshot.getInvalid$runtime_release());
        if (t2 != null) {
            return t2;
        }
        readError();
        throw new ExceptionsH();
    }

    public static final <T extends StateRecord, R> R writable(@NotNull T t, @NotNull StateObject state, @NotNull Snapshot snapshot, @NotNull Function1<? super T, ? extends R> block) {
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (getLock()) {
            try {
                invoke = block.invoke(writableRecord(t, state, snapshot));
                InlineMarker.m17017b(1);
            } catch (Throwable th) {
                InlineMarker.m17017b(1);
                InlineMarker.m17018a(1);
                throw th;
            }
        }
        InlineMarker.m17018a(1);
        notifyWrite(snapshot, state);
        return invoke;
    }

    public static final void advanceGlobalSnapshot() {
        advanceGlobalSnapshot(SnapshotKt$advanceGlobalSnapshot$2.INSTANCE);
    }

    public static /* synthetic */ void getLock$annotations() {
    }

    public static /* synthetic */ void getSnapshotInitializer$annotations() {
    }
}
