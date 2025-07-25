package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14935r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15111d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.a */
/* loaded from: classes4.dex */
public final class C14838a extends AbstractC14842e {

    /* renamed from: e */
    public static final int[] f28312e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f28313b;

    /* renamed from: c */
    public boolean f28314c;

    /* renamed from: d */
    public int f28315d;

    public C14838a(InterfaceC14935r interfaceC14935r) {
        super(interfaceC14935r);
    }

    /* renamed from: a */
    public final boolean m77515a(C15121n c15121n) {
        if (!this.f28313b) {
            int m77192j = c15121n.m77192j();
            int i = (m77192j >> 4) & 15;
            this.f28315d = i;
            if (i == 2) {
                this.f28331a.mo77419a(C15014o.m77309a(null, "audio/mpeg", -1, -1, 1, f28312e[(m77192j >> 2) & 3], null, null, null));
                this.f28314c = true;
            } else if (i == 7 || i == 8) {
                this.f28331a.mo77419a(C15014o.m77310a(null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", -1, -1, 1, 8000, (m77192j & 1) == 1 ? 2 : 3, -1, -1, null, null, 0, null, null));
                this.f28314c = true;
            } else if (i != 10) {
                throw new C14841d("Audio format not supported: " + this.f28315d);
            }
            this.f28313b = true;
        } else {
            c15121n.m77197e(c15121n.f29805b + 1);
        }
        return true;
    }

    /* renamed from: a */
    public final void m77514a(C15121n c15121n, long j) {
        if (this.f28315d == 2) {
            int i = c15121n.f29806c - c15121n.f29805b;
            this.f28331a.mo77422a(i, c15121n);
            this.f28331a.mo77421a(j, 1, i, 0, null);
            return;
        }
        int m77192j = c15121n.m77192j();
        if (m77192j == 0 && !this.f28314c) {
            int i2 = c15121n.f29806c - c15121n.f29805b;
            byte[] bArr = new byte[i2];
            c15121n.m77205a(bArr, 0, i2);
            Pair m77222a = AbstractC15111d.m77222a(bArr);
            this.f28331a.mo77419a(C15014o.m77309a(null, "audio/mp4a-latm", -1, -1, ((Integer) m77222a.second).intValue(), ((Integer) m77222a.first).intValue(), Collections.singletonList(bArr), null, null));
            this.f28314c = true;
        } else if (this.f28315d != 10 || m77192j == 1) {
            int i3 = c15121n.f29806c - c15121n.f29805b;
            this.f28331a.mo77422a(i3, c15121n);
            this.f28331a.mo77421a(j, 1, i3, 0, null);
        }
    }
}
