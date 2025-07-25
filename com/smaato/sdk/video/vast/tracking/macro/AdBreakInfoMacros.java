package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.video.utils.DateFormatUtils;
import com.smaato.sdk.video.vast.model.UniversalAdId;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.Map;
import net.pubnative.lite.sdk.models.Protocol;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.tracking.macro.a */
/* loaded from: classes7.dex */
public final class AdBreakInfoMacros {
    @NonNull

    /* renamed from: a */
    private final DateFormatUtils f72824a;
    @Nullable

    /* renamed from: b */
    private final VastScenario f72825b;
    @Nullable

    /* renamed from: c */
    private final UniversalAdId f72826c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdBreakInfoMacros(@NonNull DateFormatUtils dateFormatUtils, @Nullable VastScenario vastScenario, @Nullable UniversalAdId universalAdId) {
        this.f72824a = (DateFormatUtils) Objects.requireNonNull(dateFormatUtils);
        this.f72825b = vastScenario;
        this.f72826c = universalAdId;
    }

    @NonNull
    /* renamed from: a */
    private String m38726a() {
        VastScenario vastScenario = this.f72825b;
        if (vastScenario == null) {
            return "-2";
        }
        return Joiner.join(",", vastScenario.blockedAdCategories);
    }

    @NonNull
    /* renamed from: b */
    private String m38725b(@Nullable Long l) {
        if (l == null) {
            return "-2";
        }
        return this.f72824a.offsetFromTimeInterval(l.longValue());
    }

    @NonNull
    /* renamed from: c */
    private String m38724c() {
        if (this.f72826c == null) {
            return "-2";
        }
        return this.f72826c.idRegistry + " " + this.f72826c.idValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: d */
    public Map<String, String> m38723d(@NonNull PlayerState playerState) {
        String m38725b = m38725b(playerState.offsetMillis);
        return Maps.mapOf(Maps.entryOf("[CONTENTPLAYHEAD]", m38725b), Maps.entryOf("[MEDIAPLAYHEAD]", m38725b), Maps.entryOf("[BREAKPOSITION]", Protocol.VAST_1_0_WRAPPER), Maps.entryOf("[BLOCKEDADCATEGORIES]", m38726a()), Maps.entryOf("[ADCATEGORIES]", "-1"), Maps.entryOf("[ADCOUNT]", "1"), Maps.entryOf("[TRANSACTIONID]", "-1"), Maps.entryOf("[PLACEMENTTYPE]", "5"), Maps.entryOf("[ADTYPE]", "video"), Maps.entryOf("[UNIVERSALADID]", m38724c()), Maps.entryOf("[BREAKMAXDURATION]", "60"), Maps.entryOf("[BREAKMINDURATION]", "1"), Maps.entryOf("[BREAKMAXADS]", "1"), Maps.entryOf("[BREAKMINADLENGTH]", "1"), Maps.entryOf("[BREAKMAXADLENGTH]", "60"));
    }
}
