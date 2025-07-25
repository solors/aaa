package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b */
/* loaded from: classes4.dex */
public final class C14863b extends AbstractC14866e {

    /* renamed from: b */
    public final List f28465b;

    /* renamed from: c */
    public final List f28466c;

    /* renamed from: d */
    public final List f28467d;

    /* renamed from: e */
    public final C15014o f28468e;

    /* renamed from: f */
    public final List f28469f;

    public C14863b(String str, List list, List list2, List list3, C15014o c15014o, List list4) {
        super(str);
        List list5;
        this.f28465b = Collections.unmodifiableList(list);
        this.f28466c = Collections.unmodifiableList(list2);
        this.f28467d = Collections.unmodifiableList(list3);
        this.f28468e = c15014o;
        if (list4 != null) {
            list5 = Collections.unmodifiableList(list4);
        } else {
            list5 = null;
        }
        this.f28469f = list5;
    }
}
