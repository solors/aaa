package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzt {

    /* renamed from: o */
    private static final Map f39241o = new HashMap();

    /* renamed from: a */
    private final Context f39242a;

    /* renamed from: b */
    private final zzi f39243b;

    /* renamed from: g */
    private boolean f39248g;

    /* renamed from: h */
    private final Intent f39249h;
    @Nullable

    /* renamed from: l */
    private ServiceConnection f39253l;
    @Nullable

    /* renamed from: m */
    private IInterface f39254m;

    /* renamed from: n */
    private final com.google.android.play.core.review.zze f39255n;

    /* renamed from: d */
    private final List f39245d = new ArrayList();
    @GuardedBy("attachedRemoteTasksLock")

    /* renamed from: e */
    private final Set f39246e = new HashSet();

    /* renamed from: f */
    private final Object f39247f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f39251j = new IBinder.DeathRecipient() { // from class: com.google.android.play.core.review.internal.zzl
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzt.zzh(zzt.this);
        }
    };
    @GuardedBy("attachedRemoteTasksLock")

    /* renamed from: k */
    private final AtomicInteger f39252k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f39244c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i */
    private final WeakReference f39250i = new WeakReference(null);

    public zzt(Context context, zzi zziVar, String str, Intent intent, com.google.android.play.core.review.zze zzeVar, @Nullable zzo zzoVar, byte[] bArr) {
        this.f39242a = context;
        this.f39243b = zziVar;
        this.f39249h = intent;
        this.f39255n = zzeVar;
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ void m70127j(zzt zztVar, zzj zzjVar) {
        if (zztVar.f39254m == null && !zztVar.f39248g) {
            zztVar.f39243b.zzd("Initiate binding to the service.", new Object[0]);
            zztVar.f39245d.add(zzjVar);
            zzs zzsVar = new zzs(zztVar, null);
            zztVar.f39253l = zzsVar;
            zztVar.f39248g = true;
            if (!zztVar.f39242a.bindService(zztVar.f39249h, zzsVar, 1)) {
                zztVar.f39243b.zzd("Failed to bind to the service.", new Object[0]);
                zztVar.f39248g = false;
                for (zzj zzjVar2 : zztVar.f39245d) {
                    zzjVar2.zzc(new zzu());
                }
                zztVar.f39245d.clear();
            }
        } else if (zztVar.f39248g) {
            zztVar.f39243b.zzd("Waiting to bind to the service.", new Object[0]);
            zztVar.f39245d.add(zzjVar);
        } else {
            zzjVar.run();
        }
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ void m70126k(zzt zztVar) {
        zztVar.f39243b.zzd("linkToDeath", new Object[0]);
        try {
            zztVar.f39254m.asBinder().linkToDeath(zztVar.f39251j, 0);
        } catch (RemoteException e) {
            zztVar.f39243b.zzc(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m70125l(zzt zztVar) {
        zztVar.f39243b.zzd("unlinkToDeath", new Object[0]);
        zztVar.f39254m.asBinder().unlinkToDeath(zztVar.f39251j, 0);
    }

    /* renamed from: n */
    private final RemoteException m70123n() {
        return new RemoteException(String.valueOf(this.f39244c).concat(" : Binder has died."));
    }

    /* renamed from: o */
    public final void m70122o() {
        synchronized (this.f39247f) {
            for (TaskCompletionSource taskCompletionSource : this.f39246e) {
                taskCompletionSource.trySetException(m70123n());
            }
            this.f39246e.clear();
        }
    }

    public static /* synthetic */ void zzh(zzt zztVar) {
        zztVar.f39243b.zzd("reportBinderDeath", new Object[0]);
        zzo zzoVar = (zzo) zztVar.f39250i.get();
        if (zzoVar != null) {
            zztVar.f39243b.zzd("calling onBinderDied", new Object[0]);
            zzoVar.zza();
        } else {
            zztVar.f39243b.zzd("%s : Binder has died.", zztVar.f39244c);
            for (zzj zzjVar : zztVar.f39245d) {
                zzjVar.zzc(zztVar.m70123n());
            }
            zztVar.f39245d.clear();
        }
        zztVar.m70122o();
    }

    /* renamed from: m */
    public final /* synthetic */ void m70124m(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f39247f) {
            this.f39246e.remove(taskCompletionSource);
        }
    }

    public final Handler zzc() {
        Handler handler;
        Map map = f39241o;
        synchronized (map) {
            if (!map.containsKey(this.f39244c)) {
                HandlerThread handlerThread = new HandlerThread(this.f39244c, 10);
                handlerThread.start();
                map.put(this.f39244c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f39244c);
        }
        return handler;
    }

    @Nullable
    public final IInterface zze() {
        return this.f39254m;
    }

    public final void zzp(zzj zzjVar, @Nullable final TaskCompletionSource taskCompletionSource) {
        synchronized (this.f39247f) {
            this.f39246e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.review.internal.zzk
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    zzt.this.m70124m(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.f39247f) {
            if (this.f39252k.getAndIncrement() > 0) {
                this.f39243b.zza("Already connected to the service.", new Object[0]);
            }
        }
        zzc().post(new zzm(this, zzjVar.m70137a(), zzjVar));
    }

    public final void zzr(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f39247f) {
            this.f39246e.remove(taskCompletionSource);
        }
        synchronized (this.f39247f) {
            if (this.f39252k.get() > 0 && this.f39252k.decrementAndGet() > 0) {
                this.f39243b.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzc().post(new zzn(this));
        }
    }
}
