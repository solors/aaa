package com.mbridge.msdk.tracker.network.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: ByteArrayPool.java */
/* renamed from: com.mbridge.msdk.tracker.network.toolbox.c */
/* loaded from: classes6.dex */
public final class C22918c {

    /* renamed from: a */
    protected static final Comparator<byte[]> f59824a = new Comparator<byte[]>() { // from class: com.mbridge.msdk.tracker.network.toolbox.c.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b */
    private final List<byte[]> f59825b = new ArrayList();

    /* renamed from: c */
    private final List<byte[]> f59826c = new ArrayList(64);

    /* renamed from: d */
    private int f59827d = 0;

    /* renamed from: e */
    private final int f59828e;

    public C22918c(int i) {
        this.f59828e = i;
    }

    /* renamed from: a */
    public final synchronized byte[] m49449a(int i) {
        for (int i2 = 0; i2 < this.f59826c.size(); i2++) {
            byte[] bArr = this.f59826c.get(i2);
            if (bArr.length >= i) {
                this.f59827d -= bArr.length;
                this.f59826c.remove(i2);
                this.f59825b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* renamed from: a */
    public final synchronized void m49448a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f59828e) {
                this.f59825b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f59826c, bArr, f59824a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f59826c.add(binarySearch, bArr);
                this.f59827d += bArr.length;
                m49450a();
            }
        }
    }

    /* renamed from: a */
    private synchronized void m49450a() {
        while (this.f59827d > this.f59828e) {
            byte[] remove = this.f59825b.remove(0);
            this.f59826c.remove(remove);
            this.f59827d -= remove.length;
        }
    }
}
