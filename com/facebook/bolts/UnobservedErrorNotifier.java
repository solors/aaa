package com.facebook.bolts;

import androidx.annotation.VisibleForTesting;
import com.facebook.bolts.Task;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: UnobservedErrorNotifier.kt */
@Metadata
/* loaded from: classes2.dex */
public final class UnobservedErrorNotifier {
    @Nullable
    private Task<?> task;

    public UnobservedErrorNotifier(@Nullable Task<?> task) {
        this.task = task;
    }

    @VisibleForTesting(otherwise = 4)
    public final void finalize() {
        Task.UnobservedExceptionHandler unobservedExceptionHandler;
        Task<?> task = this.task;
        if (task != null && (unobservedExceptionHandler = Task.Companion.getUnobservedExceptionHandler()) != null) {
            unobservedExceptionHandler.unobservedException(task, new UnobservedTaskException(task.getError()));
        }
    }

    public final void setObserved() {
        this.task = null;
    }
}
