package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstraintController.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {
    @Nullable
    private OnConstraintUpdatedCallback callback;
    @Nullable
    private T currentValue;
    @NotNull
    private final List<String> matchingWorkSpecIds;
    @NotNull
    private final List<WorkSpec> matchingWorkSpecs;
    @NotNull
    private final ConstraintTracker<T> tracker;

    /* compiled from: ConstraintController.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(@NotNull List<WorkSpec> list);

        void onConstraintNotMet(@NotNull List<WorkSpec> list);
    }

    public ConstraintController(@NotNull ConstraintTracker<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
        this.matchingWorkSpecs = new ArrayList();
        this.matchingWorkSpecIds = new ArrayList();
    }

    private final void updateCallback(OnConstraintUpdatedCallback onConstraintUpdatedCallback, T t) {
        if (!this.matchingWorkSpecs.isEmpty() && onConstraintUpdatedCallback != null) {
            if (t != null && !isConstrained(t)) {
                onConstraintUpdatedCallback.onConstraintMet(this.matchingWorkSpecs);
            } else {
                onConstraintUpdatedCallback.onConstraintNotMet(this.matchingWorkSpecs);
            }
        }
    }

    @Nullable
    public final OnConstraintUpdatedCallback getCallback() {
        return this.callback;
    }

    public abstract boolean hasConstraint(@NotNull WorkSpec workSpec);

    public abstract boolean isConstrained(T t);

    public final boolean isWorkSpecConstrained(@NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        T t = this.currentValue;
        if (t != null && isConstrained(t) && this.matchingWorkSpecIds.contains(workSpecId)) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(T t) {
        this.currentValue = t;
        updateCallback(this.callback, t);
    }

    public final void replace(@NotNull Iterable<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.matchingWorkSpecs.clear();
        this.matchingWorkSpecIds.clear();
        List<WorkSpec> list = this.matchingWorkSpecs;
        for (WorkSpec workSpec : workSpecs) {
            if (hasConstraint(workSpec)) {
                list.add(workSpec);
            }
        }
        List<String> list2 = this.matchingWorkSpecIds;
        for (WorkSpec workSpec2 : this.matchingWorkSpecs) {
            list2.add(workSpec2.f1521id);
        }
        if (this.matchingWorkSpecs.isEmpty()) {
            this.tracker.removeListener(this);
        } else {
            this.tracker.addListener(this);
        }
        updateCallback(this.callback, this.currentValue);
    }

    public final void reset() {
        if (!this.matchingWorkSpecs.isEmpty()) {
            this.matchingWorkSpecs.clear();
            this.tracker.removeListener(this);
        }
    }

    public final void setCallback(@Nullable OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.callback != onConstraintUpdatedCallback) {
            this.callback = onConstraintUpdatedCallback;
            updateCallback(onConstraintUpdatedCallback, this.currentValue);
        }
    }
}
