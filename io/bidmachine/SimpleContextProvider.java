package io.bidmachine;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.bidmachine.i5 */
/* loaded from: classes9.dex */
public final class SimpleContextProvider implements ContextProvider {
    @NonNull
    private final Context applicationContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimpleContextProvider(@NonNull Context context) {
        this.applicationContext = context.getApplicationContext();
    }

    @Override // io.bidmachine.ContextProvider
    @Nullable
    public Activity getActivity() {
        return BidMachineActivityManager.getTopActivity();
    }

    @Override // io.bidmachine.ContextProvider
    @NonNull
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // io.bidmachine.ContextProvider
    @NonNull
    public Context getContext() {
        return this.applicationContext;
    }
}
