package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.D */
/* loaded from: classes4.dex */
public final class C14939D {

    /* renamed from: a */
    public final String f29049a;

    /* renamed from: b */
    public final List f29050b;

    /* renamed from: c */
    public final byte[] f29051c;

    public C14939D(int i, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f29049a = str;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f29050b = unmodifiableList;
        this.f29051c = bArr;
    }
}
