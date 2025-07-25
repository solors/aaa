package com.five_corp.p372ad.internal.movie.partialcache;

import android.media.MediaFormat;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.google.android.gms.common.Scopes;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.m1 */
/* loaded from: classes4.dex */
public final class C13993m1 extends AbstractC13990l1 {

    /* renamed from: m */
    public MediaFormat f26086m;

    /* renamed from: n */
    public MediaFormat f26087n;

    public C13993m1(C13836a c13836a) {
        super(c13836a);
    }

    /* renamed from: a */
    public final MediaFormat m78188a() {
        if (this.f26087n == null) {
            C13942a c13942a = this.f26082h;
            if (c13942a == null) {
                return null;
            }
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", c13942a.f25985a, c13942a.f25986b);
            createAudioFormat.setByteBuffer("csd-0", c13942a.f25987c);
            this.f26087n = createAudioFormat;
        }
        return this.f26087n;
    }

    /* renamed from: b */
    public final MediaFormat m78187b() {
        if (this.f26086m == null) {
            C14048x1 c14048x1 = this.f26081g;
            if (c14048x1 == null) {
                return null;
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", c14048x1.f26199a, c14048x1.f26200b);
            createVideoFormat.setByteBuffer("csd-0", c14048x1.f26201c);
            createVideoFormat.setByteBuffer("csd-1", c14048x1.f26202d);
            createVideoFormat.setInteger(Scopes.PROFILE, c14048x1.f26203e);
            createVideoFormat.setInteger("level", c14048x1.f26204f);
            this.f26086m = createVideoFormat;
        }
        return this.f26086m;
    }
}
