package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Snapshot.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public abstract class Snapshot {
    private boolean disposed;

    /* renamed from: id */
    private int f398id;
    @NotNull
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Snapshot.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion companion, Function1 function1, Function1 function12, Functions functions, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return companion.observe(function1, function12, functions);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, Function1 function1, Function1 function12, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function12 = null;
            }
            return companion.takeMutableSnapshot(function1, function12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            return companion.takeSnapshot(function1);
        }

        @NotNull
        public final Snapshot createNonObservableSnapshot() {
            SnapshotThreadLocal snapshotThreadLocal;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) snapshotThreadLocal.get(), null, false, 6, null);
        }

        @NotNull
        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final <T> T global(@NotNull Functions<? extends T> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Snapshot removeCurrent = removeCurrent();
            T invoke = block.invoke();
            Snapshot.Companion.restoreCurrent(removeCurrent);
            return invoke;
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final <T> T observe(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12, @NotNull Functions<? extends T> block) {
            SnapshotThreadLocal snapshotThreadLocal;
            MutableSnapshot mutableSnapshot;
            Snapshot transparentObserverMutableSnapshot;
            Intrinsics.checkNotNullParameter(block, "block");
            if (function1 != null || function12 != null) {
                snapshotThreadLocal = SnapshotKt.threadSnapshot;
                Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
                if (snapshot != null && !(snapshot instanceof MutableSnapshot)) {
                    if (function1 == null) {
                        return block.invoke();
                    }
                    transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(function1);
                } else {
                    if (snapshot instanceof MutableSnapshot) {
                        mutableSnapshot = (MutableSnapshot) snapshot;
                    } else {
                        mutableSnapshot = null;
                    }
                    transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(mutableSnapshot, function1, function12, true, false);
                }
                try {
                    Snapshot makeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                    T invoke = block.invoke();
                    transparentObserverMutableSnapshot.restoreCurrent(makeCurrent);
                    return invoke;
                } finally {
                    transparentObserverMutableSnapshot.dispose();
                }
            }
            return block.invoke();
        }

        @InternalComposeApi
        public final int openSnapshotCount() {
            SnapshotIdSet snapshotIdSet;
            List m17553Z0;
            snapshotIdSet = SnapshotKt.openSnapshots;
            m17553Z0 = _Collections.m17553Z0(snapshotIdSet);
            return m17553Z0.size();
        }

        @NotNull
        public final ObserverHandle registerApplyObserver(@NotNull final Function2<? super Set<? extends Object>, ? super Snapshot, Unit> observer) {
            Function1 function1;
            List list;
            Intrinsics.checkNotNullParameter(observer, "observer");
            function1 = SnapshotKt.emptyLambda;
            SnapshotKt.advanceGlobalSnapshot(function1);
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.applyObservers;
                list.add(observer);
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$registerApplyObserver$2
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    List list2;
                    Function2<Set<? extends Object>, Snapshot, Unit> function2 = observer;
                    synchronized (SnapshotKt.getLock()) {
                        list2 = SnapshotKt.applyObservers;
                        list2.remove(function2);
                        Unit unit = Unit.f99208a;
                    }
                }
            };
        }

        @NotNull
        public final ObserverHandle registerGlobalWriteObserver(@NotNull final Function1<Object, Unit> observer) {
            List list;
            Intrinsics.checkNotNullParameter(observer, "observer");
            synchronized (SnapshotKt.getLock()) {
                list = SnapshotKt.globalWriteObservers;
                list.add(observer);
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$registerGlobalWriteObserver$2
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    List list2;
                    Function1<Object, Unit> function1 = observer;
                    synchronized (SnapshotKt.getLock()) {
                        list2 = SnapshotKt.globalWriteObservers;
                        list2.remove(function1);
                    }
                    SnapshotKt.advanceGlobalSnapshot();
                }
            };
        }

        @Nullable
        public final Snapshot removeCurrent() {
            SnapshotThreadLocal snapshotThreadLocal;
            SnapshotThreadLocal snapshotThreadLocal2;
            snapshotThreadLocal = SnapshotKt.threadSnapshot;
            Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
            if (snapshot != null) {
                snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
                snapshotThreadLocal2.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(@Nullable Snapshot snapshot) {
            SnapshotThreadLocal snapshotThreadLocal;
            if (snapshot != null) {
                snapshotThreadLocal = SnapshotKt.threadSnapshot;
                snapshotThreadLocal.set(snapshot);
            }
        }

        public final void sendApplyNotifications() {
            AtomicReference atomicReference;
            Set<StateObject> modified$runtime_release;
            boolean z;
            synchronized (SnapshotKt.getLock()) {
                atomicReference = SnapshotKt.currentGlobalSnapshot;
                z = false;
                if (((GlobalSnapshot) atomicReference.get()).getModified$runtime_release() != null) {
                    if (!modified$runtime_release.isEmpty()) {
                        z = true;
                    }
                }
            }
            if (z) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        @NotNull
        public final MutableSnapshot takeMutableSnapshot(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function12) {
            MutableSnapshot mutableSnapshot;
            MutableSnapshot takeNestedMutableSnapshot;
            Snapshot currentSnapshot = SnapshotKt.currentSnapshot();
            if (currentSnapshot instanceof MutableSnapshot) {
                mutableSnapshot = (MutableSnapshot) currentSnapshot;
            } else {
                mutableSnapshot = null;
            }
            if (mutableSnapshot != null && (takeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(function1, function12)) != null) {
                return takeNestedMutableSnapshot;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
        }

        @NotNull
        public final Snapshot takeSnapshot(@Nullable Function1<Object, Unit> function1) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(function1);
        }

        public final <R> R withMutableSnapshot(@NotNull Functions<? extends R> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            MutableSnapshot takeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                R invoke = block.invoke();
                InlineMarker.m17017b(1);
                takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                InlineMarker.m17018a(1);
                takeMutableSnapshot$default.apply().check();
                return invoke;
            } finally {
                InlineMarker.m17017b(1);
                takeMutableSnapshot$default.dispose();
                InlineMarker.m17018a(1);
            }
        }

        public final <T> T withoutReadObservation(@NotNull Functions<? extends T> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Snapshot createNonObservableSnapshot = createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                T invoke = block.invoke();
                InlineMarker.m17017b(1);
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                InlineMarker.m17018a(1);
                return invoke;
            } finally {
                InlineMarker.m17017b(1);
                createNonObservableSnapshot.dispose();
                InlineMarker.m17018a(1);
            }
        }
    }

    public /* synthetic */ Snapshot(int i, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, snapshotIdSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            return snapshot.takeNestedSnapshot(function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            Unit unit = Unit.f99208a;
        }
    }

    public void closeLocked$runtime_release() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.openSnapshots;
        SnapshotKt.openSnapshots = snapshotIdSet.clear(getId());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            Unit unit = Unit.f99208a;
        }
    }

    public final <T> T enter(@NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Snapshot makeCurrent = makeCurrent();
        try {
            return block.invoke();
        } finally {
            InlineMarker.m17017b(1);
            restoreCurrent(makeCurrent);
            InlineMarker.m17018a(1);
        }
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public int getId() {
        return this.f398id;
    }

    @NotNull
    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    @Nullable
    public abstract Set<StateObject> getModified$runtime_release();

    @Nullable
    public abstract Function1<Object, Unit> getReadObserver$runtime_release();

    public abstract boolean getReadOnly();

    @NotNull
    public abstract Snapshot getRoot();

    @Nullable
    public abstract Function1<Object, Unit> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    public final boolean isPinned$runtime_release() {
        if (this.pinningTrackingHandle >= 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public Snapshot makeCurrent() {
        SnapshotThreadLocal snapshotThreadLocal;
        SnapshotThreadLocal snapshotThreadLocal2;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        Snapshot snapshot = (Snapshot) snapshotThreadLocal.get();
        snapshotThreadLocal2 = SnapshotKt.threadSnapshot;
        snapshotThreadLocal2.set(this);
        return snapshot;
    }

    /* renamed from: nestedActivated$runtime_release */
    public abstract void mo107196nestedActivated$runtime_release(@NotNull Snapshot snapshot);

    /* renamed from: nestedDeactivated$runtime_release */
    public abstract void mo107197nestedDeactivated$runtime_release(@NotNull Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* renamed from: recordModified$runtime_release */
    public abstract void mo107198recordModified$runtime_release(@NotNull StateObject stateObject);

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i = this.pinningTrackingHandle;
        if (i >= 0) {
            SnapshotKt.releasePinningLocked(i);
            this.pinningTrackingHandle = -1;
        }
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public void restoreCurrent(@Nullable Snapshot snapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        snapshotThreadLocal.set(snapshot);
    }

    public final void setDisposed$runtime_release(boolean z) {
        this.disposed = z;
    }

    public void setId$runtime_release(int i) {
        this.f398id = i;
    }

    public void setInvalid$runtime_release(@NotNull SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<set-?>");
        this.invalid = snapshotIdSet;
    }

    @NotNull
    public abstract Snapshot takeNestedSnapshot(@Nullable Function1<Object, Unit> function1);

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i;
    }

    @ExperimentalComposeApi
    @Nullable
    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    @ExperimentalComposeApi
    public final void unsafeLeave(@Nullable Snapshot snapshot) {
        SnapshotThreadLocal snapshotThreadLocal;
        boolean z;
        snapshotThreadLocal = SnapshotKt.threadSnapshot;
        if (snapshotThreadLocal.get() == this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            restoreCurrent(snapshot);
            return;
        }
        throw new IllegalStateException(("Cannot leave snapshot; " + this + " is not the current snapshot").toString());
    }

    public final void validateNotDisposed$runtime_release() {
        if (!this.disposed) {
            return;
        }
        throw new IllegalArgumentException("Cannot use a disposed snapshot".toString());
    }

    private Snapshot(int i, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.f398id = i;
        this.pinningTrackingHandle = i != 0 ? SnapshotKt.trackPinning(i, getInvalid$runtime_release()) : -1;
    }
}
