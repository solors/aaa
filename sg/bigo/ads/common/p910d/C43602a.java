package sg.bigo.ads.common.p910d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.common.d.a */
/* loaded from: classes10.dex */
public final class C43602a extends BroadcastReceiver {

    /* renamed from: a */
    private boolean f114176a;

    /* renamed from: b */
    private final List<WeakReference<InterfaceC43606b>> f114177b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.d.a$a */
    /* loaded from: classes10.dex */
    public static class C43605a {

        /* renamed from: a */
        private static final C43602a f114182a = new C43602a((byte) 0);
    }

    private C43602a() {
        this.f114176a = false;
        this.f114177b = new ArrayList();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        for (WeakReference<InterfaceC43606b> weakReference : this.f114177b) {
            InterfaceC43606b interfaceC43606b = weakReference.get();
            if (interfaceC43606b != null) {
                String action = intent.getAction();
                boolean z2 = true;
                if ((interfaceC43606b instanceof InterfaceC43607c) && !TextUtils.isEmpty(action) && "android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    interfaceC43606b.mo3527a(context, intent);
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String action2 = intent.getAction();
                    if ((interfaceC43606b instanceof InterfaceC43609e) && C43836q.m4827b((CharSequence) action2)) {
                        action2.hashCode();
                        char c = 65535;
                        switch (action2.hashCode()) {
                            case -2128145023:
                                if (action2.equals("android.intent.action.SCREEN_OFF")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -1454123155:
                                if (action2.equals("android.intent.action.SCREEN_ON")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 1019184907:
                                if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                            case 2:
                                interfaceC43606b.mo3527a(context, intent);
                                break;
                        }
                        z = z2;
                    }
                    z2 = false;
                    z = z2;
                }
                if (!z) {
                    String action3 = intent.getAction();
                    if ((interfaceC43606b instanceof InterfaceC43608d) && !TextUtils.isEmpty(action3) && "android.intent.action.CONFIGURATION_CHANGED".equals(action3)) {
                        interfaceC43606b.mo3527a(context, intent);
                    }
                }
            }
        }
    }

    /* synthetic */ C43602a(byte b) {
        this();
    }

    /* renamed from: a */
    public static C43602a m5323a() {
        return C43605a.f114182a;
    }

    /* renamed from: a */
    public final void m5322a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f114176a = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(this, intentFilter);
        }
    }

    /* renamed from: a */
    public final void m5321a(Context context, final InterfaceC43606b interfaceC43606b) {
        if (!this.f114176a) {
            m5322a(context);
        }
        C43727d.m5107a(2, new Runnable() { // from class: sg.bigo.ads.common.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Iterator it = C43602a.this.f114177b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC43606b interfaceC43606b2 = (InterfaceC43606b) ((WeakReference) it.next()).get();
                        if (interfaceC43606b2 != null && interfaceC43606b2 == interfaceC43606b) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    C43602a.this.f114177b.add(new WeakReference(interfaceC43606b));
                }
            }
        }, 1L);
    }

    /* renamed from: a */
    public final void m5319a(final InterfaceC43606b interfaceC43606b) {
        C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.d.a.2
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = C43602a.this.f114177b.iterator();
                while (it.hasNext()) {
                    InterfaceC43606b interfaceC43606b2 = (InterfaceC43606b) ((WeakReference) it.next()).get();
                    InterfaceC43606b interfaceC43606b3 = interfaceC43606b;
                    if (interfaceC43606b3 != null && interfaceC43606b2 == interfaceC43606b3) {
                        it.remove();
                        return;
                    }
                }
            }
        });
    }
}
