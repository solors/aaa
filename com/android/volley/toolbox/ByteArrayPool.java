package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.android.volley.toolbox.c */
/* loaded from: classes2.dex */
public class ByteArrayPool {

    /* renamed from: e */
    protected static final Comparator<byte[]> f3511e = new C3758a();

    /* renamed from: a */
    private final List<byte[]> f3512a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f3513b = new ArrayList(64);

    /* renamed from: c */
    private int f3514c = 0;

    /* renamed from: d */
    private final int f3515d;

    /* compiled from: ByteArrayPool.java */
    /* renamed from: com.android.volley.toolbox.c$a */
    /* loaded from: classes2.dex */
    class C3758a implements Comparator<byte[]> {
        C3758a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public ByteArrayPool(int i) {
        this.f3515d = i;
    }

    /* renamed from: c */
    private synchronized void m102267c() {
        while (this.f3514c > this.f3515d) {
            byte[] remove = this.f3512a.remove(0);
            this.f3513b.remove(remove);
            this.f3514c -= remove.length;
        }
    }

    /* renamed from: a */
    public synchronized byte[] m102269a(int i) {
        for (int i2 = 0; i2 < this.f3513b.size(); i2++) {
            byte[] bArr = this.f3513b.get(i2);
            if (bArr.length >= i) {
                this.f3514c -= bArr.length;
                this.f3513b.remove(i2);
                this.f3512a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* renamed from: b */
    public synchronized void m102268b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f3515d) {
                this.f3512a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f3513b, bArr, f3511e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f3513b.add(binarySearch, bArr);
                this.f3514c += bArr.length;
                m102267c();
            }
        }
    }
}
