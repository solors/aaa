package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public interface ContextProvider {
    @Nullable
    Activity getActivity();

    @NonNull
    Context getApplicationContext();

    @NonNull
    Context getContext();
}
