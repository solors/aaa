package com.inmobi.media;

import ae.KMarkers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.b7 */
/* loaded from: classes6.dex */
public final class C19216b7 extends C19149W6 implements Iterable, KMarkers {

    /* renamed from: A */
    public final ArrayList f48102A;

    /* renamed from: B */
    public int f48103B;

    /* renamed from: C */
    public final boolean f48104C;

    /* renamed from: D */
    public final boolean f48105D;

    /* renamed from: x */
    public final int f48106x;

    /* renamed from: y */
    public long f48107y;

    /* renamed from: z */
    public final byte f48108z;

    public /* synthetic */ C19216b7(String str, String str2, C19162X6 c19162x6, String str3, JSONObject jSONObject, byte b) {
        this(str, str2, c19162x6, new ArrayList(), str3, jSONObject, b);
    }

    /* renamed from: a */
    public final void m60435a(C19149W6 child) {
        Intrinsics.checkNotNullParameter(child, "child");
        int i = this.f48103B;
        if (i < this.f48106x) {
            this.f48103B = i + 1;
            this.f48102A.add(child);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C19202a7(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19216b7(String assetId, String assetName, C19162X6 assetStyle, List trackers, String interactionMode, JSONObject rawAssetJson, byte b) {
        super(assetId, assetName, "CONTAINER", assetStyle, trackers);
        boolean m16615y;
        boolean m16615y2;
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(assetStyle, "assetStyle");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(interactionMode, "interactionMode");
        Intrinsics.checkNotNullParameter(rawAssetJson, "rawAssetJson");
        this.f48106x = 16;
        this.f48108z = b;
        this.f48102A = new ArrayList();
        Intrinsics.checkNotNullParameter(interactionMode, "<set-?>");
        this.f47907g = interactionMode;
        m16615y = StringsJVM.m16615y("root", assetName, true);
        this.f48104C = m16615y;
        m16615y2 = StringsJVM.m16615y("card_scrollable", assetName, true);
        this.f48105D = m16615y2;
    }
}
