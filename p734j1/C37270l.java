package p734j1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.WeakHashMap;

/* renamed from: j1.l */
/* loaded from: classes3.dex */
public class C37270l {

    /* renamed from: a */
    private static boolean f98429a;

    /* renamed from: b */
    private static boolean f98430b;
    @VisibleForTesting

    /* renamed from: c */
    static final WeakHashMap<View, InterfaceC37272b> f98431c = new WeakHashMap<>();

    /* renamed from: d */
    private static final BroadcastReceiver f98432d = new C37271a();

    /* renamed from: e */
    private static final IntentFilter f98433e;

    /* renamed from: j1.l$a */
    /* loaded from: classes3.dex */
    class C37271a extends BroadcastReceiver {
        C37271a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C37270l.class) {
                boolean unused = C37270l.f98430b = "android.intent.action.SCREEN_ON".equals(intent.getAction());
            }
            WeakHashMap<View, InterfaceC37272b> weakHashMap = C37270l.f98431c;
            synchronized (weakHashMap) {
                for (InterfaceC37272b interfaceC37272b : weakHashMap.values()) {
                    interfaceC37272b.mo18598a(C37270l.f98430b);
                }
            }
        }
    }

    /* renamed from: j1.l$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC37272b {
        /* renamed from: a */
        void mo18598a(boolean z);
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        f98433e = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    /* renamed from: a */
    private static synchronized void m18604a(@NonNull Context context) {
        synchronized (C37270l.class) {
            if (!f98429a) {
                synchronized (C37270l.class) {
                    if (!f98429a) {
                        f98430b = ((PowerManager) context.getSystemService("power")).isScreenOn();
                        context.getApplicationContext().registerReceiver(f98432d, f98433e);
                        f98429a = true;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m18603b(@NonNull View view) {
        if (!f98429a) {
            return;
        }
        WeakHashMap<View, InterfaceC37272b> weakHashMap = f98431c;
        synchronized (weakHashMap) {
            weakHashMap.remove(view);
        }
    }

    /* renamed from: c */
    public static void m18602c(@NonNull View view, @NonNull InterfaceC37272b interfaceC37272b) {
        m18604a(view.getContext());
        WeakHashMap<View, InterfaceC37272b> weakHashMap = f98431c;
        synchronized (weakHashMap) {
            weakHashMap.put(view, interfaceC37272b);
        }
    }

    /* renamed from: f */
    public static boolean m18599f(Context context) {
        m18604a(context);
        return f98430b;
    }
}
