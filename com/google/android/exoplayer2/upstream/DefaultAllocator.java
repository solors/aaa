package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DefaultAllocator implements Allocator {

    /* renamed from: a */
    private final boolean f35774a;

    /* renamed from: b */
    private final int f35775b;
    @Nullable

    /* renamed from: c */
    private final byte[] f35776c;

    /* renamed from: d */
    private int f35777d;

    /* renamed from: e */
    private int f35778e;

    /* renamed from: f */
    private int f35779f;

    /* renamed from: g */
    private Allocation[] f35780g;

    public DefaultAllocator(boolean z, int i) {
        this(z, i, 0);
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized Allocation allocate() {
        Allocation allocation;
        this.f35778e++;
        int i = this.f35779f;
        if (i > 0) {
            Allocation[] allocationArr = this.f35780g;
            int i2 = i - 1;
            this.f35779f = i2;
            allocation = (Allocation) Assertions.checkNotNull(allocationArr[i2]);
            this.f35780g[this.f35779f] = null;
        } else {
            allocation = new Allocation(new byte[this.f35775b], 0);
            int i3 = this.f35778e;
            Allocation[] allocationArr2 = this.f35780g;
            if (i3 > allocationArr2.length) {
                this.f35780g = (Allocation[]) Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
            }
        }
        return allocation;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.f35775b;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.f35778e * this.f35775b;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(Allocation allocation) {
        Allocation[] allocationArr = this.f35780g;
        int i = this.f35779f;
        this.f35779f = i + 1;
        allocationArr[i] = allocation;
        this.f35778e--;
        notifyAll();
    }

    public synchronized void reset() {
        if (this.f35774a) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z;
        if (i < this.f35777d) {
            z = true;
        } else {
            z = false;
        }
        this.f35777d = i;
        if (z) {
            trim();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void trim() {
        int i = 0;
        int max = Math.max(0, Util.ceilDivide(this.f35777d, this.f35775b) - this.f35778e);
        int i2 = this.f35779f;
        if (max >= i2) {
            return;
        }
        if (this.f35776c != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                Allocation allocation = (Allocation) Assertions.checkNotNull(this.f35780g[i]);
                if (allocation.data == this.f35776c) {
                    i++;
                } else {
                    Allocation allocation2 = (Allocation) Assertions.checkNotNull(this.f35780g[i3]);
                    if (allocation2.data != this.f35776c) {
                        i3--;
                    } else {
                        Allocation[] allocationArr = this.f35780g;
                        allocationArr[i] = allocation2;
                        allocationArr[i3] = allocation;
                        i3--;
                        i++;
                    }
                }
            }
            max = Math.max(max, i);
            if (max >= this.f35779f) {
                return;
            }
        }
        Arrays.fill(this.f35780g, max, this.f35779f, (Object) null);
        this.f35779f = max;
    }

    public DefaultAllocator(boolean z, int i, int i2) {
        Assertions.checkArgument(i > 0);
        Assertions.checkArgument(i2 >= 0);
        this.f35774a = z;
        this.f35775b = i;
        this.f35779f = i2;
        this.f35780g = new Allocation[i2 + 100];
        if (i2 > 0) {
            this.f35776c = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f35780g[i3] = new Allocation(this.f35776c, i3 * i);
            }
            return;
        }
        this.f35776c = null;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(@Nullable Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            Allocation[] allocationArr = this.f35780g;
            int i = this.f35779f;
            this.f35779f = i + 1;
            allocationArr[i] = allocationNode.getAllocation();
            this.f35778e--;
            allocationNode = allocationNode.next();
        }
        notifyAll();
    }
}
