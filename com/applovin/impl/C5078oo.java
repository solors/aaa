package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC5044o2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.oo */
/* loaded from: classes2.dex */
public final class C5078oo implements InterfaceC5044o2 {

    /* renamed from: d */
    public static final InterfaceC5044o2.InterfaceC5045a f8918d = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.m00
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return C5078oo.m96632b(bundle);
        }
    };

    /* renamed from: a */
    public final int f8919a;

    /* renamed from: b */
    private final C4310e9[] f8920b;

    /* renamed from: c */
    private int f8921c;

    public C5078oo(C4310e9... c4310e9Arr) {
        boolean z;
        if (c4310e9Arr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        this.f8920b = c4310e9Arr;
        this.f8919a = c4310e9Arr.length;
        m96639a();
    }

    /* renamed from: b */
    public static /* synthetic */ C5078oo m96632b(Bundle bundle) {
        return m96637a(bundle);
    }

    /* renamed from: c */
    private static int m96631c(int i) {
        return i | 16384;
    }

    /* renamed from: a */
    public C4310e9 m96638a(int i) {
        return this.f8920b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5078oo.class != obj.getClass()) {
            return false;
        }
        C5078oo c5078oo = (C5078oo) obj;
        if (this.f8919a == c5078oo.f8919a && Arrays.equals(this.f8920b, c5078oo.f8920b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f8921c == 0) {
            this.f8921c = Arrays.hashCode(this.f8920b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f8921c;
    }

    /* renamed from: b */
    private static String m96633b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: a */
    public int m96636a(C4310e9 c4310e9) {
        int i = 0;
        while (true) {
            C4310e9[] c4310e9Arr = this.f8920b;
            if (i >= c4310e9Arr.length) {
                return -1;
            }
            if (c4310e9 == c4310e9Arr[i]) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: a */
    private static String m96635a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: a */
    private void m96639a() {
        String m96635a = m96635a(this.f8920b[0].f5804c);
        int m96631c = m96631c(this.f8920b[0].f5806f);
        int i = 1;
        while (true) {
            C4310e9[] c4310e9Arr = this.f8920b;
            if (i >= c4310e9Arr.length) {
                return;
            }
            if (!m96635a.equals(m96635a(c4310e9Arr[i].f5804c))) {
                C4310e9[] c4310e9Arr2 = this.f8920b;
                m96634a("languages", c4310e9Arr2[0].f5804c, c4310e9Arr2[i].f5804c, i);
                return;
            } else if (m96631c != m96631c(this.f8920b[i].f5806f)) {
                m96634a("role flags", Integer.toBinaryString(this.f8920b[0].f5806f), Integer.toBinaryString(this.f8920b[i].f5806f), i);
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ C5078oo m96637a(Bundle bundle) {
        return new C5078oo((C4310e9[]) AbstractC5102p2.m96599a(C4310e9.f5794I, bundle.getParcelableArrayList(m96633b(0)), AbstractC4247db.m99829h()).toArray(new C4310e9[0]));
    }

    /* renamed from: a */
    private static void m96634a(String str, String str2, String str3, int i) {
        AbstractC5063oc.m96808a("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }
}
