package com.inmobi.media;

import com.facebook.share.internal.ShareConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.o7 */
/* loaded from: classes6.dex */
public final class C19398o7 extends C19149W6 {
    public /* synthetic */ C19398o7(String str, String str2, C19162X6 c19162x6, String str3, String str4, JSONObject jSONObject) {
        this(str, str2, c19162x6, str3, new ArrayList(), str4, jSONObject);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19398o7(String assetId, String assetName, C19162X6 assetStyle, String url, List trackers, String interactionMode, JSONObject jSONObject) {
        super(assetId, assetName, ShareConstants.IMAGE_URL, assetStyle, trackers);
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(assetStyle, "assetStyle");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        Intrinsics.checkNotNullParameter(interactionMode, "interactionMode");
        this.f47905e = url;
        if (jSONObject != null) {
            Intrinsics.checkNotNullParameter(interactionMode, "<set-?>");
            this.f47907g = interactionMode;
        }
    }
}
