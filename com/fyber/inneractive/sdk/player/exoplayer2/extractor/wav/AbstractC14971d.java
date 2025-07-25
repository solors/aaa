package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14979m;
import com.fyber.inneractive.sdk.player.exoplayer2.C15017r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.d */
/* loaded from: classes4.dex */
public abstract class AbstractC14971d {
    /* renamed from: a */
    public static C14969b m77387a(C14833b c14833b) {
        C15121n c15121n = new C15121n(16);
        if (C14970c.m77388a(c14833b, c15121n).f29284a != AbstractC15133z.m77158a("RIFF")) {
            return null;
        }
        c14833b.m77521a(c15121n.f29804a, 0, 4, false);
        c15121n.m77197e(0);
        int m77204b = c15121n.m77204b();
        if (m77204b != AbstractC15133z.m77158a("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + m77204b);
            return null;
        }
        C14970c m77388a = C14970c.m77388a(c14833b, c15121n);
        while (m77388a.f29284a != AbstractC15133z.m77158a("fmt ")) {
            c14833b.m77523a((int) m77388a.f29285b, false);
            m77388a = C14970c.m77388a(c14833b, c15121n);
        }
        if (m77388a.f29285b >= 16) {
            c14833b.m77521a(c15121n.f29804a, 0, 16, false);
            c15121n.m77197e(0);
            int m77196f = c15121n.m77196f();
            int m77196f2 = c15121n.m77196f();
            int m77200d = c15121n.m77200d();
            if (m77200d >= 0) {
                int m77200d2 = c15121n.m77200d();
                if (m77200d2 >= 0) {
                    int m77196f3 = c15121n.m77196f();
                    int m77196f4 = c15121n.m77196f();
                    int i = (m77196f2 * m77196f4) / 8;
                    if (m77196f3 == i) {
                        int m77163a = AbstractC15133z.m77163a(m77196f4);
                        if (m77163a == 0) {
                            Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + m77196f4);
                            return null;
                        } else if (m77196f != 1 && m77196f != 65534) {
                            Log.e("WavHeaderReader", "Unsupported WAV format type: " + m77196f);
                            return null;
                        } else {
                            c14833b.m77523a(((int) m77388a.f29285b) - 16, false);
                            return new C14969b(m77196f2, m77200d, m77200d2, m77196f3, m77196f4, m77163a);
                        }
                    }
                    throw new C15017r("Expected block alignment: " + i + "; got: " + m77196f3);
                }
                throw new IllegalStateException(AbstractC14979m.m77354a("Top bit not zero: ", m77200d2));
            }
            throw new IllegalStateException(AbstractC14979m.m77354a("Top bit not zero: ", m77200d));
        }
        throw new IllegalStateException();
    }
}
