package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SetInitializationState.kt */
@Metadata
/* loaded from: classes7.dex */
public interface SetInitializationState {

    /* compiled from: SetInitializationState.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void invoke$default(SetInitializationState setInitializationState, InitializationState initializationState, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                setInitializationState.invoke(initializationState, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    void invoke(@NotNull InitializationState initializationState, boolean z);
}
