package sg.bigo.ads.common.p927o;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.p927o.InterfaceC43743f;

/* renamed from: sg.bigo.ads.common.o.e */
/* loaded from: classes10.dex */
class ServiceConnectionC43742e implements ServiceConnection, IBinder.DeathRecipient {

    /* renamed from: c */
    private static volatile ServiceConnectionC43742e f114471c;

    /* renamed from: d */
    private static final Object f114472d = new Object();

    /* renamed from: e */
    private final Context f114475e;

    /* renamed from: b */
    boolean f114474b = false;

    /* renamed from: a */
    final BlockingQueue<IBinder> f114473a = new LinkedBlockingQueue(1);

    private ServiceConnectionC43742e(Context context) {
        this.f114475e = context;
    }

    /* renamed from: a */
    public static ServiceConnectionC43742e m5075a(Context context) {
        if (f114471c == null) {
            synchronized (ServiceConnectionC43742e.class) {
                if (f114471c == null) {
                    f114471c = new ServiceConnectionC43742e(context);
                }
            }
        }
        return f114471c;
    }

    /* renamed from: b */
    private void m5073b() {
        try {
            synchronized (f114472d) {
                this.f114473a.clear();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m5077a();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        m5077a();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        m5077a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m5074a(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        m5073b();
    }

    /* renamed from: a */
    public final InterfaceC43743f m5076a(long j, TimeUnit timeUnit) {
        try {
            IBinder poll = this.f114473a.poll(j, timeUnit);
            if (poll == null) {
                return null;
            }
            m5074a(poll);
            return InterfaceC43743f.AbstractBinderC43744a.m5072a(poll);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void m5077a() {
        if (this.f114474b) {
            try {
                this.f114474b = false;
                m5073b();
                this.f114475e.unbindService(this);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m5074a(IBinder iBinder) {
        try {
            synchronized (f114472d) {
                this.f114473a.clear();
                this.f114473a.add(iBinder);
            }
        } catch (Exception unused) {
        }
    }
}
