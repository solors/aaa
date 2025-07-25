package sg.bigo.ads.core.player.p971a;

import sg.bigo.ads.common.p918h.C43681a;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.core.player.a.i */
/* loaded from: classes10.dex */
public class C44320i {

    /* renamed from: b */
    InterfaceC44307a f116349b;

    /* renamed from: d */
    volatile boolean f116351d;

    /* renamed from: e */
    public C43681a f116352e;

    /* renamed from: a */
    private final Object f116348a = new Object();

    /* renamed from: c */
    final Object f116350c = new Object();

    /* renamed from: a */
    public final int m3401a(byte[] bArr, long j) {
        if (j < 0) {
            C43782a.m5009a(0, "ProxyCache", "buffer or offset or length is wrong");
            return 0;
        }
        int i = 0;
        while (!this.f116349b.mo3419c() && this.f116349b.mo3422a() < 8192 + j && !this.f116351d) {
            i++;
            synchronized (this.f116348a) {
                try {
                    C43782a.m5010a(0, 3, "ProxyCache", "wait for downloading. thread=" + Thread.currentThread().getName() + ",url=" + this.f116352e.f114336b + ",count=" + i);
                    this.f116348a.wait(1000L);
                } catch (InterruptedException e) {
                    C43782a.m5009a(0, "ProxyCache", "Waiting source data is interrupted!" + e.toString());
                }
            }
            if (i >= 15) {
                C43782a.m5009a(0, "ProxyCache", "wait for downloading more than 15s.");
                throw new C44321j("Error reading source " + i + " times");
            }
        }
        int mo3421a = this.f116349b.mo3421a(bArr, j);
        if (mo3421a <= 0) {
            C43782a.m5010a(0, 3, "ProxyCache", "read end, size = ".concat(String.valueOf(mo3421a)));
        }
        return mo3421a;
    }
}
