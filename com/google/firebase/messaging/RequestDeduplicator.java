package com.google.firebase.messaging;

import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class RequestDeduplicator {

    /* renamed from: a */
    private final Executor f43259a;
    @GuardedBy("this")

    /* renamed from: b */
    private final Map<String, Task<String>> f43260b = new ArrayMap();

    /* loaded from: classes4.dex */
    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.f43259a = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ Task m66556a(RequestDeduplicator requestDeduplicator, String str, Task task) {
        return requestDeduplicator.m66554c(str, task);
    }

    /* renamed from: c */
    public /* synthetic */ Task m66554c(String str, Task task) throws Exception {
        synchronized (this) {
            this.f43260b.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public synchronized Task<String> m66555b(final String str, GetTokenRequest getTokenRequest) {
        Task<String> task = this.f43260b.get(str);
        if (task != null) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                Log.d(Constants.TAG, "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable(Constants.TAG, 3)) {
            Log.d(Constants.TAG, "Making new request for: " + str);
        }
        Task continueWithTask = getTokenRequest.start().continueWithTask(this.f43259a, new Continuation() { // from class: com.google.firebase.messaging.b0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return RequestDeduplicator.m66556a(RequestDeduplicator.this, str, task2);
            }
        });
        this.f43260b.put(str, continueWithTask);
        return continueWithTask;
    }
}
