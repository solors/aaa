package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import ge.InterfaceC33327h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Show.kt */
@Metadata
/* loaded from: classes7.dex */
public interface Show {
    @NotNull
    InterfaceC33327h<ShowEvent> invoke(@NotNull Activity activity, @NotNull AdObject adObject, @NotNull UnityAdsShowOptions unityAdsShowOptions);

    @Nullable
    Object terminate(@NotNull AdObject adObject, @NotNull Continuation<? super Unit> continuation);
}
