package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.collections.Maps;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.tracking.macro.b */
/* loaded from: classes7.dex */
public final class CapabilitiesInfoMacro {
    @NonNull

    /* renamed from: a */
    private static final Map<String, String> f72827a = Maps.mapOf(Maps.entryOf("[VASTVERSIONS]", "1,2,3,4,5,6,7,8,11,12"), Maps.entryOf("[APIFRAMEWORKS]", "7"), Maps.entryOf("[EXTENSIONS]", "AdVerifications"), Maps.entryOf("[VERIFICATIONVENDORS]", "moat.com-omid,ias.com-omid"), Maps.entryOf("[OMIDPARTNER]", "SmaatoInc/20.4.1"), Maps.entryOf("[MEDIAMIME]", "video/mp4,video/3gp,video/mp2t,video/webm,video/mkv"), Maps.entryOf("[PLAYERCAPABILITIES]", "skip,mute,mautoplay,fullscreen,icon"), Maps.entryOf("[CLICKTYPE]", "1"));

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public Map<String, String> m38721a() {
        return f72827a;
    }
}
