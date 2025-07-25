package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.extensions;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.collections.C37572z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DerivedState.kt */
@Metadata
/* loaded from: classes.dex */
public final class DerivedSnapshotState<T> implements StateObject, DerivedState<T> {
    @NotNull
    private final Functions<T> calculation;
    @NotNull
    private ResultRecord<T> first;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DerivedState.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class ResultRecord<T> extends StateRecord {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private static final Object Unset = new Object();
        @Nullable
        private HashSet<StateObject> dependencies;
        @Nullable
        private Object result = Unset;
        private int resultHash;

        /* compiled from: DerivedState.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Object getUnset() {
                return ResultRecord.Unset;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ResultRecord resultRecord = (ResultRecord) value;
            this.dependencies = resultRecord.dependencies;
            this.result = resultRecord.result;
            this.resultHash = resultRecord.resultHash;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new ResultRecord();
        }

        @Nullable
        public final HashSet<StateObject> getDependencies() {
            return this.dependencies;
        }

        @Nullable
        public final Object getResult() {
            return this.result;
        }

        public final int getResultHash() {
            return this.resultHash;
        }

        public final boolean isValid(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            if (this.result != Unset && this.resultHash == readableHash(derivedState, snapshot)) {
                return true;
            }
            return false;
        }

        public final int readableHash(@NotNull DerivedState<?> derivedState, @NotNull Snapshot snapshot) {
            HashSet<StateObject> hashSet;
            Intrinsics.checkNotNullParameter(derivedState, "derivedState");
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            synchronized (SnapshotKt.getLock()) {
                hashSet = this.dependencies;
            }
            int i = 7;
            if (hashSet != null) {
                PersistentList persistentList = (PersistentList) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
                if (persistentList == null) {
                    persistentList = extensions.persistentListOf();
                }
                int size = persistentList.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    ((Function1) ((Tuples) persistentList.get(i3)).m17632a()).invoke(derivedState);
                }
                try {
                    Iterator<StateObject> it = hashSet.iterator();
                    while (it.hasNext()) {
                        StateObject stateObject = it.next();
                        StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                        Intrinsics.checkNotNullExpressionValue(stateObject, "stateObject");
                        StateRecord readable = SnapshotKt.readable(firstStateRecord, stateObject, snapshot);
                        i = (((i * 31) + ActualJvm_jvmKt.identityHashCode(readable)) * 31) + readable.getSnapshotId$runtime_release();
                    }
                    Unit unit = Unit.f99208a;
                } finally {
                    int size2 = persistentList.size();
                    while (i2 < size2) {
                        ((Function1) ((Tuples) persistentList.get(i2)).m17631b()).invoke(derivedState);
                        i2++;
                    }
                }
            }
            return i;
        }

        public final void setDependencies(@Nullable HashSet<StateObject> hashSet) {
            this.dependencies = hashSet;
        }

        public final void setResult(@Nullable Object obj) {
            this.result = obj;
        }

        public final void setResultHash(int i) {
            this.resultHash = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedSnapshotState(@NotNull Functions<? extends T> calculation) {
        Intrinsics.checkNotNullParameter(calculation, "calculation");
        this.calculation = calculation;
        this.first = new ResultRecord<>();
    }

    private final ResultRecord<T> currentRecord(ResultRecord<T> resultRecord, Snapshot snapshot, Functions<? extends T> functions) {
        SnapshotThreadLocal snapshotThreadLocal;
        boolean z;
        SnapshotThreadLocal snapshotThreadLocal2;
        Snapshot.Companion companion;
        ResultRecord<T> resultRecord2;
        SnapshotThreadLocal snapshotThreadLocal3;
        if (!resultRecord.isValid(this, snapshot)) {
            snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning;
            Boolean bool = (Boolean) snapshotThreadLocal.get();
            int i = 0;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            HashSet<StateObject> hashSet = new HashSet<>();
            PersistentList persistentList = (PersistentList) SnapshotStateKt__DerivedStateKt.derivedStateObservers.get();
            if (persistentList == null) {
                persistentList = extensions.persistentListOf();
            }
            int size = persistentList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((Function1) ((Tuples) persistentList.get(i2)).m17632a()).invoke(this);
            }
            if (!z) {
                try {
                    snapshotThreadLocal2 = SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning;
                    snapshotThreadLocal2.set(Boolean.TRUE);
                } finally {
                    int size2 = persistentList.size();
                    while (i < size2) {
                        ((Function1) ((Tuples) persistentList.get(i)).m17631b()).invoke(this);
                        i++;
                    }
                }
            }
            Object observe = Snapshot.Companion.observe(new DerivedSnapshotState$currentRecord$result$1$result$1(this, hashSet), null, functions);
            if (!z) {
                snapshotThreadLocal3 = SnapshotStateKt__DerivedStateKt.isCalculationBlockRunning;
                snapshotThreadLocal3.set(Boolean.FALSE);
            }
            synchronized (SnapshotKt.getLock()) {
                companion = Snapshot.Companion;
                Snapshot current = companion.getCurrent();
                resultRecord2 = (ResultRecord) SnapshotKt.newWritableRecord(this.first, this, current);
                resultRecord2.setDependencies(hashSet);
                resultRecord2.setResultHash(resultRecord2.readableHash(this, current));
                resultRecord2.setResult(observe);
            }
            if (!z) {
                companion.notifyObjectsInitialized();
            }
            return resultRecord2;
        }
        return resultRecord;
    }

    private final String displayValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.Companion;
        ResultRecord resultRecord2 = (ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent());
        if (resultRecord2.isValid(this, companion.getCurrent())) {
            return String.valueOf(resultRecord2.getResult());
        }
        return "<Not calculated>";
    }

    @Override // androidx.compose.runtime.DerivedState
    public T getCurrentValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.Companion;
        return (T) currentRecord((ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent()), companion.getCurrent(), this.calculation).getResult();
    }

    @Nullable
    public final T getDebuggerDisplayValue() {
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.Companion;
        ResultRecord resultRecord2 = (ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent());
        if (resultRecord2.isValid(this, companion.getCurrent())) {
            return (T) resultRecord2.getResult();
        }
        return null;
    }

    @Override // androidx.compose.runtime.DerivedState
    @NotNull
    public Set<StateObject> getDependencies() {
        Set<StateObject> m17123f;
        ResultRecord<T> resultRecord = this.first;
        Snapshot.Companion companion = Snapshot.Companion;
        HashSet<StateObject> dependencies = currentRecord((ResultRecord) SnapshotKt.current(resultRecord, companion.getCurrent()), companion.getCurrent(), this.calculation).getDependencies();
        if (dependencies == null) {
            m17123f = C37572z0.m17123f();
            return m17123f;
        }
        return dependencies;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.first;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        Function1<Object, Unit> readObserver$runtime_release = Snapshot.Companion.getCurrent().getReadObserver$runtime_release();
        if (readObserver$runtime_release != null) {
            readObserver$runtime_release.invoke(this);
        }
        return getCurrentValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.first = (ResultRecord) value;
    }

    @NotNull
    public String toString() {
        ResultRecord resultRecord = (ResultRecord) SnapshotKt.current(this.first, Snapshot.Companion.getCurrent());
        return "DerivedState(value=" + displayValue() + ")@" + hashCode();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }
}
