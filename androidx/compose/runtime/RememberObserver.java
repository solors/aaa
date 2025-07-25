package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: RememberObserver.kt */
@Metadata
/* loaded from: classes.dex */
public interface RememberObserver {
    void onAbandoned();

    void onForgotten();

    void onRemembered();
}
