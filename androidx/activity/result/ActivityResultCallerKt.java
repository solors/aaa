package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActivityResultCaller.kt */
@Metadata
/* loaded from: classes.dex */
public final class ActivityResultCallerKt {
    @NotNull
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(@NotNull ActivityResultCaller activityResultCaller, @NotNull ActivityResultContract<I, O> contract, I i, @NotNull ActivityResultRegistry registry, @NotNull final Function1<? super O, Unit> callback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher<I> registerForActivityResult = activityResultCaller.registerForActivityResult(contract, registry, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$0(callback, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new ActivityResultCallerLauncher(registerForActivityResult, contract, i);
    }

    public static final void registerForActivityResult$lambda$0(Function1 callback, Object obj) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(obj);
    }

    public static final void registerForActivityResult$lambda$1(Function1 callback, Object obj) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(obj);
    }

    @NotNull
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(@NotNull ActivityResultCaller activityResultCaller, @NotNull ActivityResultContract<I, O> contract, I i, @NotNull final Function1<? super O, Unit> callback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher<I> registerForActivityResult = activityResultCaller.registerForActivityResult(contract, new ActivityResultCallback() { // from class: androidx.activity.result.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$1(callback, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new ActivityResultCallerLauncher(registerForActivityResult, contract, i);
    }
}
