package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SnapshotState.kt */
@Metadata
/* loaded from: classes.dex */
public class SnapshotMutableStateImpl<T> implements StateObject, SnapshotMutableState<T> {
    @NotNull
    private StateStateRecord<T> next;
    @NotNull
    private final SnapshotMutationPolicy<T> policy;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotState.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class StateStateRecord<T> extends StateRecord {
        private T value;

        public StateStateRecord(T t) {
            this.value = t;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = ((StateStateRecord) value).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateStateRecord(this.value);
        }

        public final T getValue() {
            return this.value;
        }

        public final void setValue(T t) {
            this.value = t;
        }
    }

    public SnapshotMutableStateImpl(T t, @NotNull SnapshotMutationPolicy<T> policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        this.policy = policy;
        this.next = new StateStateRecord<>(t);
    }

    @Override // androidx.compose.runtime.SnapshotState
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.SnapshotState
    @NotNull
    public Function1<T, Unit> component2() {
        return new SnapshotMutableStateImpl$component2$1(this);
    }

    public final T getDebuggerDisplayValue() {
        return (T) ((StateStateRecord) SnapshotKt.current(this.next, Snapshot.Companion.getCurrent())).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    @NotNull
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.SnapshotState, androidx.compose.runtime.State
    public T getValue() {
        return (T) ((StateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(applied, "applied");
        StateStateRecord stateStateRecord = (StateStateRecord) previous;
        StateStateRecord stateStateRecord2 = (StateStateRecord) current;
        StateStateRecord stateStateRecord3 = (StateStateRecord) applied;
        if (!getPolicy().equivalent((T) stateStateRecord2.getValue(), (T) stateStateRecord3.getValue())) {
            T merge = getPolicy().merge((T) stateStateRecord.getValue(), (T) stateStateRecord2.getValue(), (T) stateStateRecord3.getValue());
            if (merge != null) {
                StateRecord create = stateStateRecord3.create();
                ((StateStateRecord) create).setValue(merge);
                return create;
            }
            return null;
        }
        return current;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.next = (StateStateRecord) value;
    }

    @Override // androidx.compose.runtime.SnapshotState
    public void setValue(T t) {
        Snapshot current;
        StateStateRecord<T> stateStateRecord = this.next;
        Snapshot.Companion companion = Snapshot.Companion;
        StateStateRecord stateStateRecord2 = (StateStateRecord) SnapshotKt.current(stateStateRecord, companion.getCurrent());
        if (!getPolicy().equivalent((T) stateStateRecord2.getValue(), t)) {
            StateStateRecord<T> stateStateRecord3 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = companion.getCurrent();
                ((StateStateRecord) SnapshotKt.overwritableRecord(stateStateRecord3, this, current, stateStateRecord2)).setValue(t);
                Unit unit = Unit.f99208a;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @NotNull
    public String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.current(this.next, Snapshot.Companion.getCurrent())).getValue() + ")@" + hashCode();
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
