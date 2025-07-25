package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.zzapy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class zc2 {

    /* renamed from: a */
    public static boolean f88824a = Log.isLoggable(zzapy.zza, 2);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.zc2$a */
    /* loaded from: classes8.dex */
    public static class C31973a {

        /* renamed from: c */
        public static final boolean f88825c = zc2.f88824a;

        /* renamed from: a */
        private final ArrayList f88826a = new ArrayList();

        /* renamed from: b */
        private boolean f88827b = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.yandex.mobile.ads.impl.zc2$a$a */
        /* loaded from: classes8.dex */
        public static class C31974a {

            /* renamed from: a */
            public final String f88828a;

            /* renamed from: b */
            public final long f88829b;

            /* renamed from: c */
            public final long f88830c;

            public C31974a(String str, long j, long j2) {
                this.f88828a = str;
                this.f88829b = j;
                this.f88830c = j2;
            }
        }

        /* renamed from: a */
        public final synchronized void m26259a(String str, long j) {
            if (!this.f88827b) {
                this.f88826a.add(new C31974a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        protected final void finalize() throws Throwable {
            if (!this.f88827b) {
                m26260a("Request on the loose");
                um0.m28727b(new Object[0]);
            }
        }

        /* renamed from: a */
        public final synchronized void m26260a(String str) {
            long j;
            this.f88827b = true;
            if (this.f88826a.size() == 0) {
                j = 0;
            } else {
                long j2 = ((C31974a) this.f88826a.get(0)).f88830c;
                ArrayList arrayList = this.f88826a;
                j = ((C31974a) arrayList.get(arrayList.size() - 1)).f88830c - j2;
            }
            if (j <= 0) {
                return;
            }
            long j3 = ((C31974a) this.f88826a.get(0)).f88830c;
            um0.m28728a(Long.valueOf(j), str);
            Iterator it = this.f88826a.iterator();
            while (it.hasNext()) {
                C31974a c31974a = (C31974a) it.next();
                long j4 = c31974a.f88830c;
                um0.m28728a(Long.valueOf(j4 - j3), Long.valueOf(c31974a.f88829b), c31974a.f88828a);
                j3 = j4;
            }
        }
    }
}
