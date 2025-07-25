package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.d */
/* loaded from: classes4.dex */
public final class C14865d extends AbstractC14866e {

    /* renamed from: b */
    public final int f28479b;

    /* renamed from: c */
    public final long f28480c;

    /* renamed from: d */
    public final long f28481d;

    /* renamed from: e */
    public final boolean f28482e;

    /* renamed from: f */
    public final int f28483f;

    /* renamed from: g */
    public final int f28484g;

    /* renamed from: h */
    public final int f28485h;

    /* renamed from: i */
    public final long f28486i;

    /* renamed from: j */
    public final boolean f28487j;

    /* renamed from: k */
    public final boolean f28488k;

    /* renamed from: l */
    public final C14864c f28489l;

    /* renamed from: m */
    public final List f28490m;

    /* renamed from: n */
    public final List f28491n;

    /* renamed from: o */
    public final long f28492o;

    public C14865d(int i, String str, long j, long j2, boolean z, int i2, int i3, int i4, long j3, boolean z2, boolean z3, C14864c c14864c, List list, List list2) {
        super(str);
        long j4;
        this.f28479b = i;
        this.f28481d = j2;
        this.f28482e = z;
        this.f28483f = i2;
        this.f28484g = i3;
        this.f28485h = i4;
        this.f28486i = j3;
        this.f28487j = z2;
        this.f28488k = z3;
        this.f28489l = c14864c;
        this.f28490m = Collections.unmodifiableList(list);
        if (!list.isEmpty()) {
            C14864c c14864c2 = (C14864c) list.get(list.size() - 1);
            this.f28492o = c14864c2.f28473d + c14864c2.f28471b;
        } else {
            this.f28492o = 0L;
        }
        if (j == -9223372036854775807L) {
            j4 = -9223372036854775807L;
        } else if (j >= 0) {
            j4 = j;
        } else {
            j4 = this.f28492o + j;
        }
        this.f28480c = j4;
        this.f28491n = Collections.unmodifiableList(list2);
    }
}
