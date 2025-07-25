package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.R7 */
/* loaded from: classes6.dex */
public final class C19085R7 extends C19292h {

    /* renamed from: a */
    public final String f47662a;

    /* renamed from: b */
    public final String f47663b;

    /* renamed from: c */
    public final String f47664c;

    /* renamed from: d */
    public final List f47665d;

    /* renamed from: e */
    public final List f47666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19085R7(C19292h ad2, JSONArray jSONArray, String videoUrl, String videoDuration, String str, ArrayList trackers, ArrayList companionAds) {
        super(ad2, jSONArray);
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(videoDuration, "videoDuration");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        this.f47662a = videoUrl;
        this.f47663b = videoDuration;
        this.f47664c = str;
        this.f47665d = trackers;
        this.f47666e = companionAds;
    }
}
