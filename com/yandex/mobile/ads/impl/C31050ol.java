package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.yandex.mobile.ads.impl.ol */
/* loaded from: classes8.dex */
public final class C31050ol {

    /* renamed from: e */
    protected static final Comparator<byte[]> f83546e = new C31051a();

    /* renamed from: a */
    private final ArrayList f83547a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f83548b = new ArrayList(64);

    /* renamed from: c */
    private int f83549c = 0;

    /* renamed from: d */
    private final int f83550d = 4096;

    /* renamed from: com.yandex.mobile.ads.impl.ol$a */
    /* loaded from: classes8.dex */
    final class C31051a implements Comparator<byte[]> {
        C31051a() {
        }

        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    /* renamed from: a */
    public final synchronized byte[] m30965a(int i) {
        for (int i2 = 0; i2 < this.f83548b.size(); i2++) {
            byte[] bArr = (byte[]) this.f83548b.get(i2);
            if (bArr.length >= i) {
                this.f83549c -= bArr.length;
                this.f83548b.remove(i2);
                this.f83547a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* renamed from: a */
    public final synchronized void m30964a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f83550d) {
                this.f83547a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f83548b, bArr, f83546e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f83548b.add(binarySearch, bArr);
                this.f83549c += bArr.length;
                m30966a();
            }
        }
    }

    /* renamed from: a */
    private synchronized void m30966a() {
        while (this.f83549c > this.f83550d) {
            byte[] bArr = (byte[]) this.f83547a.remove(0);
            this.f83548b.remove(bArr);
            this.f83549c -= bArr.length;
        }
    }
}
