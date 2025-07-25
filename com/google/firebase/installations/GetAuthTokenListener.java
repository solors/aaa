package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class GetAuthTokenListener implements StateListener {

    /* renamed from: a */
    private final Utils f43078a;

    /* renamed from: b */
    private final TaskCompletionSource<InstallationTokenResult> f43079b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
        this.f43078a = utils;
        this.f43079b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onException(Exception exc) {
        this.f43079b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean onStateReached(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.isRegistered() && !this.f43078a.isAuthTokenExpired(persistedInstallationEntry)) {
            this.f43079b.setResult(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
            return true;
        }
        return false;
    }
}
