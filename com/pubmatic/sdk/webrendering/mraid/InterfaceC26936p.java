package com.pubmatic.sdk.webrendering.mraid;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener;

/* renamed from: com.pubmatic.sdk.webrendering.mraid.p */
/* loaded from: classes7.dex */
interface InterfaceC26936p extends POBObstructionUpdateListener {
    @Override // com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void addFriendlyObstructions(@NonNull View view, @NonNull POBObstructionUpdateListener.POBFriendlyObstructionPurpose pOBFriendlyObstructionPurpose);

    boolean isUserInteracted(boolean z);

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdUnload();

    void onAdViewChanged(@NonNull View view);

    void onLeavingApplication();

    void onMRAIDAdClick();

    void onOpen(@Nullable String str);

    @Override // com.pubmatic.sdk.common.viewability.POBObstructionUpdateListener
    /* synthetic */ void removeFriendlyObstructions(@Nullable View view);

    void shouldUseCustomClose(boolean z);
}
