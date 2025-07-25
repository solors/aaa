package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a */
/* loaded from: classes4.dex */
public final class C14890a extends AbstractC14892c {

    /* renamed from: P0 */
    public final long f28685P0;

    /* renamed from: Q0 */
    public final ArrayList f28686Q0;

    /* renamed from: R0 */
    public final ArrayList f28687R0;

    public C14890a(int i, long j) {
        super(i);
        this.f28685P0 = j;
        this.f28686Q0 = new ArrayList();
        this.f28687R0 = new ArrayList();
    }

    /* renamed from: b */
    public final C14890a m77464b(int i) {
        int size = this.f28687R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C14890a c14890a = (C14890a) this.f28687R0.get(i2);
            if (c14890a.f28781a == i) {
                return c14890a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C14891b m77463c(int i) {
        int size = this.f28686Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C14891b c14891b = (C14891b) this.f28686Q0.get(i2);
            if (c14891b.f28781a == i) {
                return c14891b;
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.AbstractC14892c
    public final String toString() {
        return AbstractC14892c.m77462a(this.f28781a) + " leaves: " + Arrays.toString(this.f28686Q0.toArray()) + " containers: " + Arrays.toString(this.f28687R0.toArray());
    }
}
