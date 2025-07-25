package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnBackPressedDispatcherOwner.kt */
@Metadata
/* loaded from: classes.dex */
public interface OnBackPressedDispatcherOwner extends LifecycleOwner {
    @NotNull
    OnBackPressedDispatcher getOnBackPressedDispatcher();
}
