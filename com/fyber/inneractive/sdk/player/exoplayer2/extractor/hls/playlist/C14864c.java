package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c */
/* loaded from: classes4.dex */
public final class C14864c implements Comparable {

    /* renamed from: a */
    public final String f28470a;

    /* renamed from: b */
    public final long f28471b;

    /* renamed from: c */
    public final int f28472c;

    /* renamed from: d */
    public final long f28473d;

    /* renamed from: e */
    public final boolean f28474e;

    /* renamed from: f */
    public final String f28475f;

    /* renamed from: g */
    public final String f28476g;

    /* renamed from: h */
    public final long f28477h;

    /* renamed from: i */
    public final long f28478i;

    public C14864c(String str, long j, int i, long j2, boolean z, String str2, String str3, long j3, long j4) {
        this.f28470a = str;
        this.f28471b = j;
        this.f28472c = i;
        this.f28473d = j2;
        this.f28474e = z;
        this.f28475f = str2;
        this.f28476g = str3;
        this.f28477h = j3;
        this.f28478i = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.f28473d > l.longValue()) {
            return 1;
        }
        if (this.f28473d < l.longValue()) {
            return -1;
        }
        return 0;
    }
}
