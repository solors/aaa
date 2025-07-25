package com.inmobi.compliance;

import com.inmobi.media.AbstractC19253e2;
import com.ironsource.mediationsdk.metadata.C20419a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiPrivacyCompliance {
    @NotNull
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    public static final void setDoNotSell(boolean z) {
        String str;
        HashMap hashMap = AbstractC19253e2.f48172a;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(C20419a.f51677a, str);
    }

    public static final void setUSPrivacyString(@NotNull String privacyString) {
        Intrinsics.checkNotNullParameter(privacyString, "privacyString");
        HashMap hashMap = AbstractC19253e2.f48172a;
        Intrinsics.checkNotNullParameter(privacyString, "privacyString");
        AbstractC19253e2.f48172a.put("us_privacy", privacyString);
    }
}
