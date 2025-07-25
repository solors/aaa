package com.google.android.exoplayer2.text.ttml;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class TtmlSubtitle implements Subtitle {

    /* renamed from: b */
    private final TtmlNode f34971b;

    /* renamed from: c */
    private final long[] f34972c;

    /* renamed from: d */
    private final Map<String, TtmlStyle> f34973d;

    /* renamed from: f */
    private final Map<String, TtmlRegion> f34974f;

    /* renamed from: g */
    private final Map<String, String> f34975g;

    public TtmlSubtitle(TtmlNode ttmlNode, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        Map<String, TtmlStyle> emptyMap;
        this.f34971b = ttmlNode;
        this.f34974f = map2;
        this.f34975g = map3;
        if (map != null) {
            emptyMap = Collections.unmodifiableMap(map);
        } else {
            emptyMap = Collections.emptyMap();
        }
        this.f34973d = emptyMap;
        this.f34972c = ttmlNode.getEventTimesUs();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j) {
        return this.f34971b.getCues(j, this.f34973d, this.f34974f, this.f34975g);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i) {
        return this.f34972c[i];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.f34972c.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil(this.f34972c, j, false, false);
        if (binarySearchCeil >= this.f34972c.length) {
            return -1;
        }
        return binarySearchCeil;
    }
}
