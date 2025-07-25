package androidx.activity;

import androidx.annotation.MainThread;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnBackPressedCallback.kt */
@Metadata
/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    @NotNull
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    @Nullable
    private Functions<Unit> enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(@NotNull Cancellable cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    @Nullable
    public final Functions<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @MainThread
    public final void remove() {
        for (Cancellable cancellable : this.cancellables) {
            cancellable.cancel();
        }
    }

    public final void removeCancellable(@NotNull Cancellable cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        Functions<Unit> functions = this.enabledChangedCallback;
        if (functions != null) {
            functions.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@Nullable Functions<Unit> functions) {
        this.enabledChangedCallback = functions;
    }
}
