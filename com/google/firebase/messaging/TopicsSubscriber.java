package com.google.firebase.messaging;

import android.content.Context;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class TopicsSubscriber {

    /* renamed from: i */
    private static final long f43291i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f43292a;

    /* renamed from: b */
    private final Metadata f43293b;

    /* renamed from: c */
    private final GmsRpc f43294c;

    /* renamed from: d */
    private final FirebaseMessaging f43295d;

    /* renamed from: f */
    private final ScheduledExecutorService f43297f;

    /* renamed from: h */
    private final TopicsStore f43299h;
    @GuardedBy("pendingOperations")

    /* renamed from: e */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f43296e = new ArrayMap();
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f43298g = false;

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, @NonNull ScheduledExecutorService scheduledExecutorService) {
        this.f43295d = firebaseMessaging;
        this.f43293b = metadata;
        this.f43299h = topicsStore;
        this.f43294c = gmsRpc;
        this.f43292a = context;
        this.f43297f = scheduledExecutorService;
    }

    /* renamed from: b */
    private void m66522b(TopicOperation topicOperation, TaskCompletionSource<Void> taskCompletionSource) {
        ArrayDeque<TaskCompletionSource<Void>> arrayDeque;
        synchronized (this.f43296e) {
            String serialize = topicOperation.serialize();
            if (this.f43296e.containsKey(serialize)) {
                arrayDeque = this.f43296e.get(serialize);
            } else {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque2 = new ArrayDeque<>();
                this.f43296e.put(serialize, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(taskCompletionSource);
        }
    }

    @WorkerThread
    /* renamed from: c */
    private static <T> void m66521c(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    @WorkerThread
    /* renamed from: d */
    private void m66520d(String str) throws IOException {
        m66521c(this.f43294c.m66615l(this.f43295d.m66646n(), str));
    }

    @WorkerThread
    /* renamed from: e */
    private void m66519e(String str) throws IOException {
        m66521c(this.f43294c.m66614m(this.f43295d.m66646n(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: f */
    public static Task<TopicsSubscriber> m66518f(final FirebaseMessaging firebaseMessaging, final Metadata metadata, final GmsRpc gmsRpc, final Context context, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.d0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TopicsSubscriber m66514j;
                m66514j = TopicsSubscriber.m66514j(context, scheduledExecutorService, firebaseMessaging, metadata, gmsRpc);
                return m66514j;
            }
        });
    }

    /* renamed from: h */
    static boolean m66516h() {
        if (!Log.isLoggable(Constants.TAG, 3)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ TopicsSubscriber m66514j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, Metadata metadata, GmsRpc gmsRpc) throws Exception {
        return new TopicsSubscriber(firebaseMessaging, metadata, TopicsStore.getInstance(context, scheduledExecutorService), gmsRpc, context, scheduledExecutorService);
    }

    /* renamed from: k */
    private void m66513k(TopicOperation topicOperation) {
        synchronized (this.f43296e) {
            String serialize = topicOperation.serialize();
            if (!this.f43296e.containsKey(serialize)) {
                return;
            }
            ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f43296e.get(serialize);
            TaskCompletionSource<Void> poll = arrayDeque.poll();
            if (poll != null) {
                poll.setResult(null);
            }
            if (arrayDeque.isEmpty()) {
                this.f43296e.remove(serialize);
            }
        }
    }

    /* renamed from: p */
    private void m66508p() {
        if (!m66515i()) {
            m66504t(0L);
        }
    }

    /* renamed from: g */
    boolean m66517g() {
        if (this.f43299h.m66526b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    synchronized boolean m66515i() {
        return this.f43298g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:3:0x0003, B:18:0x0030, B:20:0x0036, B:21:0x0050, B:23:0x005d, B:24:0x0079, B:26:0x0086, B:8:0x0015, B:11:0x001f), top: B:41:0x0003 }] */
    @androidx.annotation.WorkerThread
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m66512l(com.google.firebase.messaging.TopicOperation r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.getOperation()     // Catch: java.io.IOException -> La2
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> La2
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L1f
            r4 = 85
            if (r3 == r4) goto L15
            goto L29
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto L29
            r2 = r5
            goto L2a
        L1f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = -1
        L2a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L79
            if (r2 == r5) goto L50
            boolean r2 = m66516h()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
            goto La1
        L50:
            java.lang.String r2 = r7.getTopic()     // Catch: java.io.IOException -> La2
            r6.m66519e(r2)     // Catch: java.io.IOException -> La2
            boolean r2 = m66516h()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r7.getTopic()     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            r2.append(r3)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
            goto La1
        L79:
            java.lang.String r2 = r7.getTopic()     // Catch: java.io.IOException -> La2
            r6.m66520d(r2)     // Catch: java.io.IOException -> La2
            boolean r2 = m66516h()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r7.getTopic()     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            r2.append(r3)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
        La1:
            return r5
        La2:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc9
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lbc
            goto Lc9
        Lbc:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lc8
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        Lc8:
            throw r7
        Lc9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.m66512l(com.google.firebase.messaging.TopicOperation):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m66511m(Runnable runnable, long j) {
        this.f43297f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    @VisibleForTesting
    /* renamed from: n */
    Task<Void> m66510n(TopicOperation topicOperation) {
        this.f43299h.m66527a(topicOperation);
        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
        m66522b(topicOperation, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized void m66509o(boolean z) {
        this.f43298g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m66507q() {
        if (m66517g()) {
            m66508p();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Task<Void> m66506r(String str) {
        Task<Void> m66510n = m66510n(TopicOperation.subscribe(str));
        m66507q();
        return m66510n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (m66516h() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        return true;
     */
    @androidx.annotation.WorkerThread
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m66505s() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.TopicsStore r0 = r2.f43299h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.TopicOperation r0 = r0.m66526b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = m66516h()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.m66512l(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.TopicsStore r1 = r2.f43299h
            r1.m66524d(r0)
            r2.m66513k(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.m66505s():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m66504t(long j) {
        m66511m(new TopicsSyncTask(this, this.f43292a, this.f43293b, Math.min(Math.max(30L, 2 * j), f43291i)), j);
        m66509o(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public Task<Void> m66503u(String str) {
        Task<Void> m66510n = m66510n(TopicOperation.unsubscribe(str));
        m66507q();
        return m66510n;
    }
}
