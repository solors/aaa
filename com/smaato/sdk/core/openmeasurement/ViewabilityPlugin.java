package com.smaato.sdk.core.openmeasurement;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.p569di.DiRegistry;

/* loaded from: classes7.dex */
public interface ViewabilityPlugin {
    @NonNull
    DiRegistry diRegistry();

    @NonNull
    String getName();

    void init(@NonNull Context context);
}
