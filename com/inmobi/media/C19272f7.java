package com.inmobi.media;

import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.f7 */
/* loaded from: classes6.dex */
public final class C19272f7 extends C18965I7 {
    public /* synthetic */ C19272f7(String str, String str2, C19258e7 c19258e7, String str3, String str4) {
        this(str, str2, c19258e7, str3, new ArrayList(), str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19272f7(String assetId, String assetName, C19258e7 assetStyle, String str, List trackers, String interactionMode) {
        super(assetId, assetName, Constants.CTA, assetStyle, str);
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(assetStyle, "assetStyle");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(interactionMode, "interactionMode");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f47919s.addAll(trackers);
        Intrinsics.checkNotNullParameter(interactionMode, "<set-?>");
        this.f47907g = interactionMode;
    }
}
