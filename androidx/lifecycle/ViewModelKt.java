package androidx.lifecycle;

import kotlin.Metadata;
import kotlinx.coroutines.C37821y2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewModel.kt */
@Metadata
/* loaded from: classes.dex */
public final class ViewModelKt {
    @NotNull
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    @NotNull
    public static final CoroutineScope getViewModelScope(@NotNull ViewModel viewModel) {
        CoroutineScope coroutineScope = (CoroutineScope) viewModel.getTag(JOB_KEY);
        if (coroutineScope != null) {
            return coroutineScope;
        }
        return (CoroutineScope) viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(C37821y2.m16064b(null, 1, null).plus(Dispatchers.m16376c().getImmediate())));
    }
}
