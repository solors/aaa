package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.hls.offline.ExecutorC2515a;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@AnyThread
/* loaded from: classes4.dex */
public class ConfigCacheClient {
    @GuardedBy("ConfigCacheClient.class")

    /* renamed from: d */
    private static final Map<String, ConfigCacheClient> f43459d = new HashMap();

    /* renamed from: e */
    private static final Executor f43460e = new ExecutorC2515a();

    /* renamed from: a */
    private final Executor f43461a;

    /* renamed from: b */
    private final ConfigStorageClient f43462b;
    @Nullable
    @GuardedBy("this")

    /* renamed from: c */
    private Task<ConfigContainer> f43463c = null;

    /* loaded from: classes4.dex */
    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a */
        private final CountDownLatch f43464a;

        private AwaitListener() {
            this.f43464a = new CountDownLatch(1);
        }

        public void await() throws InterruptedException {
            this.f43464a.await();
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f43464a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@NonNull Exception exc) {
            this.f43464a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f43464a.countDown();
        }

        public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f43464a.await(j, timeUnit);
        }
    }

    private ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.f43461a = executor;
        this.f43462b = configStorageClient;
    }

    /* renamed from: c */
    private static <TResult> TResult m66423c(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = f43460e;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (awaitListener.await(j, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    @VisibleForTesting
    public static synchronized void clearInstancesForTest() {
        synchronized (ConfigCacheClient.class) {
            f43459d.clear();
        }
    }

    /* renamed from: e */
    public /* synthetic */ Void m66421e(ConfigContainer configContainer) throws Exception {
        return this.f43462b.write(configContainer);
    }

    /* renamed from: f */
    public /* synthetic */ Task m66420f(boolean z, ConfigContainer configContainer, Void r3) throws Exception {
        if (z) {
            m66419g(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    /* renamed from: g */
    private synchronized void m66419g(ConfigContainer configContainer) {
        this.f43463c = Tasks.forResult(configContainer);
    }

    public static synchronized ConfigCacheClient getInstance(Executor executor, ConfigStorageClient configStorageClient) {
        ConfigCacheClient configCacheClient;
        synchronized (ConfigCacheClient.class) {
            String m66319a = configStorageClient.m66319a();
            Map<String, ConfigCacheClient> map = f43459d;
            if (!map.containsKey(m66319a)) {
                map.put(m66319a, new ConfigCacheClient(executor, configStorageClient));
            }
            configCacheClient = map.get(m66319a);
        }
        return configCacheClient;
    }

    public void clear() {
        synchronized (this) {
            this.f43463c = Tasks.forResult(null);
        }
        this.f43462b.clear();
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: d */
    ConfigContainer m66422d(long j) {
        synchronized (this) {
            Task<ConfigContainer> task = this.f43463c;
            if (task != null && task.isSuccessful()) {
                return this.f43463c.getResult();
            }
            try {
                return (ConfigContainer) m66423c(get(), j, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Log.d(FirebaseRemoteConfig.TAG, "Reading from storage file failed.", e);
                return null;
            }
        }
    }

    public synchronized Task<ConfigContainer> get() {
        Task<ConfigContainer> task = this.f43463c;
        if (task == null || (task.isComplete() && !this.f43463c.isSuccessful())) {
            Executor executor = this.f43461a;
            final ConfigStorageClient configStorageClient = this.f43462b;
            Objects.requireNonNull(configStorageClient);
            this.f43463c = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return configStorageClient.read();
                }
            });
        }
        return this.f43463c;
    }

    @Nullable
    public ConfigContainer getBlocking() {
        return m66422d(5L);
    }

    public Task<ConfigContainer> put(ConfigContainer configContainer) {
        return put(configContainer, true);
    }

    public Task<ConfigContainer> put(final ConfigContainer configContainer, final boolean z) {
        return Tasks.call(this.f43461a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
            {
                ConfigCacheClient.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m66421e;
                m66421e = ConfigCacheClient.this.m66421e(configContainer);
                return m66421e;
            }
        }).onSuccessTask(this.f43461a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.d
            {
                ConfigCacheClient.this = this;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m66420f;
                m66420f = ConfigCacheClient.this.m66420f(z, configContainer, (Void) obj);
                return m66420f;
            }
        });
    }
}
