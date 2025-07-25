package p769l3;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: l3.c */
/* loaded from: classes5.dex */
public class HSConnectivityManager implements HSNetworkConnectivityCallback {

    /* renamed from: g */
    private static HSConnectivityManager f99936g;

    /* renamed from: b */
    private Context f99937b;

    /* renamed from: f */
    private HSAndroidConnectivityManager f99940f;

    /* renamed from: d */
    private Set<HSNetworkConnectivityCallback> f99939d = Collections.synchronizedSet(new LinkedHashSet());

    /* renamed from: c */
    private HSAndroidConnectivityManagerProvider f99938c = new HSAndroidConnectivityManagerProvider();

    /* compiled from: HSConnectivityManager.java */
    /* renamed from: l3.c$a */
    /* loaded from: classes5.dex */
    static /* synthetic */ class C37917a {

        /* renamed from: a */
        static final /* synthetic */ int[] f99941a;

        static {
            int[] iArr = new int[HSConnectivityStatus.values().length];
            f99941a = iArr;
            try {
                iArr[HSConnectivityStatus.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99941a[HSConnectivityStatus.NOT_CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private HSConnectivityManager(Context context) {
        this.f99937b = context;
    }

    /* renamed from: a */
    public static HSConnectivityManager m15721a(Context context) {
        if (f99936g == null) {
            f99936g = new HSConnectivityManager(context.getApplicationContext());
        }
        return f99936g;
    }

    /* renamed from: c */
    private void m15719c() {
        if (this.f99940f == null) {
            this.f99940f = this.f99938c.m15722a(this.f99937b);
        }
        this.f99940f.mo15716a(this);
    }

    /* renamed from: d */
    private void m15718d() {
        HSAndroidConnectivityManager hSAndroidConnectivityManager = this.f99940f;
        if (hSAndroidConnectivityManager == null) {
            return;
        }
        hSAndroidConnectivityManager.mo15714c();
        this.f99940f = null;
    }

    /* renamed from: b */
    public synchronized void m15720b(@NonNull HSNetworkConnectivityCallback hSNetworkConnectivityCallback) {
        boolean isEmpty = this.f99939d.isEmpty();
        this.f99939d.add(hSNetworkConnectivityCallback);
        if (isEmpty) {
            m15719c();
        } else {
            int i = C37917a.f99941a[this.f99940f.mo15715b().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    hSNetworkConnectivityCallback.mo12172n();
                }
            } else {
                hSNetworkConnectivityCallback.mo12171t();
            }
        }
    }

    /* renamed from: e */
    public synchronized void m15717e(@NonNull HSNetworkConnectivityCallback hSNetworkConnectivityCallback) {
        this.f99939d.remove(hSNetworkConnectivityCallback);
        if (this.f99939d.isEmpty()) {
            m15718d();
        }
    }

    @Override // p769l3.HSNetworkConnectivityCallback
    /* renamed from: n */
    public void mo12172n() {
        if (this.f99939d.isEmpty()) {
            return;
        }
        for (HSNetworkConnectivityCallback hSNetworkConnectivityCallback : this.f99939d) {
            hSNetworkConnectivityCallback.mo12172n();
        }
    }

    @Override // p769l3.HSNetworkConnectivityCallback
    /* renamed from: t */
    public void mo12171t() {
        if (this.f99939d.isEmpty()) {
            return;
        }
        for (HSNetworkConnectivityCallback hSNetworkConnectivityCallback : this.f99939d) {
            hSNetworkConnectivityCallback.mo12171t();
        }
    }
}
