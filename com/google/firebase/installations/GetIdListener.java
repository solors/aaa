package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class GetIdListener implements StateListener {

    /* renamed from: a */
    final TaskCompletionSource<String> f43080a;

    public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
        this.f43080a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        this.f43080a.trySetResult(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }
}
