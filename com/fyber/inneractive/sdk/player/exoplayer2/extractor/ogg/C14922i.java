package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i */
/* loaded from: classes4.dex */
public final class C14922i extends AbstractC14925l {

    /* renamed from: o */
    public static final int f28989o = AbstractC15133z.m77158a("Opus");

    /* renamed from: p */
    public static final byte[] f28990p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f28991n;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final void mo77425a(boolean z) {
        super.mo77425a(z);
        if (z) {
            this.f28991n = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final long mo77427a(C15121n c15121n) {
        int i;
        int i2;
        byte[] bArr = c15121n.f29804a;
        byte b = bArr[0];
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        return (this.f29002i * (i * (i5 >= 16 ? 2500 << i2 : i5 >= 12 ? 10000 << (i5 & 1) : (i5 & 3) == 3 ? 60000 : 10000 << i2))) / 1000000;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final boolean mo77426a(C15121n c15121n, long j, C14923j c14923j) {
        if (!this.f28991n) {
            byte[] copyOf = Arrays.copyOf(c15121n.f29804a, c15121n.f29806c);
            int i = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((copyOf[11] & 255) << 8) | (copyOf[10] & 255)) * 1000000000) / 48000).array());
            arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((3840 * 1000000000) / 48000).array());
            c14923j.f28992a = C15014o.m77309a(null, "audio/opus", -1, -1, i, 48000, arrayList, null, null);
            this.f28991n = true;
            return true;
        }
        boolean z = c15121n.m77204b() == f28989o;
        c15121n.m77197e(0);
        return z;
    }
}
