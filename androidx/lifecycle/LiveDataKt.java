package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: LiveData.kt */
@Metadata
/* loaded from: classes.dex */
public final class LiveDataKt {
    @MainThread
    @NotNull
    public static final <T> Observer<T> observe(@NotNull LiveData<T> liveData, @NotNull LifecycleOwner lifecycleOwner, @NotNull final Function1<? super T, Unit> function1) {
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                function1.invoke(t);
            }
        };
        liveData.observe(lifecycleOwner, observer);
        return observer;
    }
}
