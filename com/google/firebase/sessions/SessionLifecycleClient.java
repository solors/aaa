package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionLifecycleClient.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SessionLifecycleClient {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String TAG = "SessionLifecycleClient";
    @NotNull

    /* renamed from: a */
    private final CoroutineContext f43781a;
    @Nullable

    /* renamed from: b */
    private Messenger f43782b;

    /* renamed from: c */
    private boolean f43783c;
    @NotNull

    /* renamed from: d */
    private final LinkedBlockingDeque<Message> f43784d;
    @NotNull

    /* renamed from: e */
    private final SessionLifecycleClient$serviceConnection$1 f43785e;

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class ClientUpdateHandler extends Handler {
        @NotNull

        /* renamed from: a */
        private final CoroutineContext f43786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(@NotNull CoroutineContext backgroundDispatcher) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            this.f43786a = backgroundDispatcher;
        }

        /* renamed from: a */
        private final void m66274a(String str) {
            Log.d(SessionLifecycleClient.TAG, "Session update received: " + str);
            C37756k.m16221d(C37785p0.m16131a(this.f43786a), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                m66274a((data == null || (r3 = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) ? "" : "");
                return;
            }
            Log.w(SessionLifecycleClient.TAG, "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(@NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f43781a = backgroundDispatcher;
        this.f43784d = new LinkedBlockingDeque<>(20);
        this.f43785e = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(@Nullable ComponentName componentName, @Nullable IBinder iBinder) {
                Log.d(SessionLifecycleClient.TAG, "Connected to SessionLifecycleService. Queue size " + SessionLifecycleClient.access$getQueuedMessages$p(SessionLifecycleClient.this).size());
                SessionLifecycleClient.access$setService$p(SessionLifecycleClient.this, new Messenger(iBinder));
                SessionLifecycleClient.access$setServiceBound$p(SessionLifecycleClient.this, true);
                SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                SessionLifecycleClient.access$sendLifecycleEvents(sessionLifecycleClient, SessionLifecycleClient.access$drainQueue(sessionLifecycleClient));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName componentName) {
                Log.d(SessionLifecycleClient.TAG, "Disconnected from SessionLifecycleService");
                SessionLifecycleClient.access$setService$p(SessionLifecycleClient.this, null);
                SessionLifecycleClient.access$setServiceBound$p(SessionLifecycleClient.this, false);
            }
        };
    }

    /* renamed from: a */
    public final List<Message> m66280a() {
        ArrayList arrayList = new ArrayList();
        this.f43784d.drainTo(arrayList);
        return arrayList;
    }

    public static final /* synthetic */ List access$drainQueue(SessionLifecycleClient sessionLifecycleClient) {
        return sessionLifecycleClient.m66280a();
    }

    public static final /* synthetic */ LinkedBlockingDeque access$getQueuedMessages$p(SessionLifecycleClient sessionLifecycleClient) {
        return sessionLifecycleClient.f43784d;
    }

    public static final /* synthetic */ InterfaceC37708b2 access$sendLifecycleEvents(SessionLifecycleClient sessionLifecycleClient, List list) {
        return sessionLifecycleClient.m66276e(list);
    }

    public static final /* synthetic */ void access$setService$p(SessionLifecycleClient sessionLifecycleClient, Messenger messenger) {
        sessionLifecycleClient.f43782b = messenger;
    }

    public static final /* synthetic */ void access$setServiceBound$p(SessionLifecycleClient sessionLifecycleClient, boolean z) {
        sessionLifecycleClient.f43783c = z;
    }

    /* renamed from: b */
    public final Message m66279b(List<Message> list, int i) {
        Object obj;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (!it.hasNext()) {
                obj = next;
            } else {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
                obj = next;
            }
        }
        return (Message) obj;
    }

    /* renamed from: c */
    private final void m66278c(Message message) {
        if (this.f43784d.offer(message)) {
            Log.d(TAG, "Queued message " + message.what + ". Queue size " + this.f43784d.size());
            return;
        }
        Log.d(TAG, "Failed to enqueue message " + message.what + ". Dropping.");
    }

    /* renamed from: d */
    private final void m66277d(int i) {
        List<Message> m66280a = m66280a();
        Message obtain = Message.obtain(null, i, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(null, messageCode, 0, 0)");
        m66280a.add(obtain);
        m66276e(m66280a);
    }

    @CanIgnoreReturnValue
    /* renamed from: e */
    public final InterfaceC37708b2 m66276e(List<Message> list) {
        InterfaceC37708b2 m16221d;
        m16221d = C37756k.m16221d(C37785p0.m16131a(this.f43781a), null, null, new SessionLifecycleClient$sendLifecycleEvents$1(this, list, null), 3, null);
        return m16221d;
    }

    /* renamed from: f */
    public final void m66275f(Message message) {
        if (this.f43782b != null) {
            try {
                Log.d(TAG, "Sending lifecycle " + message.what + " to service");
                Messenger messenger = this.f43782b;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e) {
                Log.w(TAG, "Unable to deliver message: " + message.what, e);
                m66278c(message);
                return;
            }
        }
        m66278c(message);
    }

    public final void backgrounded() {
        m66277d(2);
    }

    public final void bindToService(@NotNull SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.bindToService(new Messenger(new ClientUpdateHandler(this.f43781a)), this.f43785e);
    }

    public final void foregrounded() {
        m66277d(1);
    }
}
