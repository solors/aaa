package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;

/* loaded from: classes4.dex */
public class RemoteConfigDeferredProxy {

    /* renamed from: a */
    private final Deferred<FirebaseRemoteConfigInterop> f42271a;

    public RemoteConfigDeferredProxy(Deferred<FirebaseRemoteConfigInterop> deferred) {
        this.f42271a = deferred;
    }

    /* renamed from: b */
    public static /* synthetic */ void m67204b(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, Provider provider) {
        ((FirebaseRemoteConfigInterop) provider.get()).registerRolloutsStateSubscriber(RemoteConfigComponent.DEFAULT_NAMESPACE, crashlyticsRemoteConfigListener);
        Logger.getLogger().m67216d("Registering RemoteConfig Rollouts subscriber");
    }

    public void setupListener(UserMetadata userMetadata) {
        if (userMetadata == null) {
            Logger.getLogger().m67208w("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        final CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(userMetadata);
        this.f42271a.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.internal.c
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                RemoteConfigDeferredProxy.m67204b(crashlyticsRemoteConfigListener, provider);
            }
        });
    }
}
