package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: ActivityResultCaller.kt */
@Metadata
/* loaded from: classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<Unit> {
    @NotNull
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    @NotNull
    private final ActivityResultLauncher<I> launcher;
    @NotNull
    private final InterfaceC38501j resultContract$delegate;

    public ActivityResultCallerLauncher(@NotNull ActivityResultLauncher<I> launcher, @NotNull ActivityResultContract<I, O> callerContract, I i) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(callerContract, "callerContract");
        this.launcher = launcher;
        this.callerContract = callerContract;
        this.callerInput = i;
        m14554a = LazyJVM.m14554a(new ActivityResultCallerLauncher$resultContract$2(this));
        this.resultContract$delegate = m14554a;
    }

    @NotNull
    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @NotNull
    public ActivityResultContract<Unit, ?> getContract() {
        return (ActivityResultContract<Unit, O>) getResultContract();
    }

    @NotNull
    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    @NotNull
    public final ActivityResultContract<Unit, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(@NotNull Unit input, @Nullable ActivityOptionsCompat activityOptionsCompat) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }
}
