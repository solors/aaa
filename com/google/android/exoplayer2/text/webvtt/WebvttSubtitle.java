package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
final class WebvttSubtitle implements Subtitle {

    /* renamed from: b */
    private final List<WebvttCueInfo> f35016b;

    /* renamed from: c */
    private final long[] f35017c;

    /* renamed from: d */
    private final long[] f35018d;

    public WebvttSubtitle(List<WebvttCueInfo> list) {
        this.f35016b = Collections.unmodifiableList(new ArrayList(list));
        this.f35017c = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            WebvttCueInfo webvttCueInfo = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f35017c;
            jArr[i2] = webvttCueInfo.startTimeUs;
            jArr[i2 + 1] = webvttCueInfo.endTimeUs;
        }
        long[] jArr2 = this.f35017c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f35018d = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: b */
    public static /* synthetic */ int m73349b(WebvttCueInfo webvttCueInfo, WebvttCueInfo webvttCueInfo2) {
        return Long.compare(webvttCueInfo.startTimeUs, webvttCueInfo2.startTimeUs);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f35016b.size(); i++) {
            long[] jArr = this.f35017c;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                WebvttCueInfo webvttCueInfo = this.f35016b.get(i);
                Cue cue = webvttCueInfo.cue;
                if (cue.line == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m73349b;
                m73349b = WebvttSubtitle.m73349b((WebvttCueInfo) obj, (WebvttCueInfo) obj2);
                return m73349b;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((WebvttCueInfo) arrayList2.get(i3)).cue.buildUpon().setLine((-1) - i3, 1).build());
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (i >= this.f35018d.length) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        return this.f35018d[i];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.f35018d.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil(this.f35018d, j, false, false);
        if (binarySearchCeil >= this.f35018d.length) {
            return -1;
        }
        return binarySearchCeil;
    }
}
