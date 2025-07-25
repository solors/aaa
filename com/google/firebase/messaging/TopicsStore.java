package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TopicsStore {
    @GuardedBy("TopicsStore.class")

    /* renamed from: d */
    private static WeakReference<TopicsStore> f43287d;

    /* renamed from: a */
    private final SharedPreferences f43288a;

    /* renamed from: b */
    private SharedPreferencesQueue f43289b;

    /* renamed from: c */
    private final Executor f43290c;

    private TopicsStore(SharedPreferences sharedPreferences, Executor executor) {
        this.f43290c = executor;
        this.f43288a = sharedPreferences;
    }

    @WorkerThread
    /* renamed from: c */
    private synchronized void m66525c() {
        this.f43289b = SharedPreferencesQueue.m66543d(this.f43288a, "topic_operation_queue", ",", this.f43290c);
    }

    @WorkerThread
    public static synchronized TopicsStore getInstance(Context context, Executor executor) {
        TopicsStore topicsStore;
        synchronized (TopicsStore.class) {
            WeakReference<TopicsStore> weakReference = f43287d;
            if (weakReference != null) {
                topicsStore = weakReference.get();
            } else {
                topicsStore = null;
            }
            if (topicsStore == null) {
                topicsStore = new TopicsStore(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                topicsStore.m66525c();
                f43287d = new WeakReference<>(topicsStore);
            }
        }
        return topicsStore;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized boolean m66527a(TopicOperation topicOperation) {
        return this.f43289b.add(topicOperation.serialize());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public synchronized TopicOperation m66526b() {
        return TopicOperation.m66529a(this.f43289b.peek());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean m66524d(TopicOperation topicOperation) {
        return this.f43289b.remove(topicOperation.serialize());
    }
}
