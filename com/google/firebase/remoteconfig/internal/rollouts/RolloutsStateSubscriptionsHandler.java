package com.google.firebase.remoteconfig.internal.rollouts;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class RolloutsStateSubscriptionsHandler {

    /* renamed from: a */
    private ConfigCacheClient f43598a;

    /* renamed from: b */
    private RolloutsStateFactory f43599b;

    /* renamed from: c */
    private Executor f43600c;

    /* renamed from: d */
    private Set<RolloutsStateSubscriber> f43601d = Collections.newSetFromMap(new ConcurrentHashMap());

    public RolloutsStateSubscriptionsHandler(@NonNull ConfigCacheClient configCacheClient, @NonNull RolloutsStateFactory rolloutsStateFactory, @NonNull Executor executor) {
        this.f43598a = configCacheClient;
        this.f43599b = rolloutsStateFactory;
        this.f43600c = executor;
    }

    /* renamed from: f */
    public /* synthetic */ void m66305f(Task task, final RolloutsStateSubscriber rolloutsStateSubscriber, ConfigContainer configContainer) {
        try {
            ConfigContainer configContainer2 = (ConfigContainer) task.getResult();
            if (configContainer2 != null) {
                final RolloutsState m66313a = this.f43599b.m66313a(configContainer2);
                this.f43600c.execute(new Runnable() { // from class: m2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        rolloutsStateSubscriber.onRolloutsStateChanged(m66313a);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w(FirebaseRemoteConfig.TAG, "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    public void publishActiveRolloutsState(@NonNull ConfigContainer configContainer) {
        try {
            final RolloutsState m66313a = this.f43599b.m66313a(configContainer);
            for (final RolloutsStateSubscriber rolloutsStateSubscriber : this.f43601d) {
                this.f43600c.execute(new Runnable() { // from class: m2.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        rolloutsStateSubscriber.onRolloutsStateChanged(m66313a);
                    }
                });
            }
        } catch (FirebaseRemoteConfigException e) {
            Log.w(FirebaseRemoteConfig.TAG, "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e);
        }
    }

    public void registerRolloutsStateSubscriber(@NonNull final RolloutsStateSubscriber rolloutsStateSubscriber) {
        this.f43601d.add(rolloutsStateSubscriber);
        final Task<ConfigContainer> task = this.f43598a.get();
        task.addOnSuccessListener(this.f43600c, new OnSuccessListener() { // from class: m2.b
            {
                RolloutsStateSubscriptionsHandler.this = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RolloutsStateSubscriptionsHandler.this.m66305f(task, rolloutsStateSubscriber, (ConfigContainer) obj);
            }
        });
    }
}
