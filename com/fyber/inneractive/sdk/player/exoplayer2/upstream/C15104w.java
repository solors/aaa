package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.w */
/* loaded from: classes4.dex */
public final class C15104w {

    /* renamed from: a */
    public final HashMap f29759a = new HashMap();

    /* renamed from: b */
    public Map f29760b;

    /* renamed from: a */
    public final synchronized Map m77232a() {
        if (this.f29760b == null) {
            this.f29760b = Collections.unmodifiableMap(new HashMap(this.f29759a));
        }
        return this.f29760b;
    }
}
