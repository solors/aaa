package com.mobilefuse.videoplayer.tracking;

import com.mobilefuse.sdk.rtb.ApiFramework;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormatting;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VastEventTracker.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastEventTracker$createMacros$2 extends Lambda implements Function1<VastError, String> {
    public static final VastEventTracker$createMacros$2 INSTANCE = new VastEventTracker$createMacros$2();

    VastEventTracker$createMacros$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@Nullable VastError vastError) {
        int m17154x;
        Set<ApiFramework> supportedApiFrameworks = VideoPlayerSettings.Companion.getSupportedApiFrameworks();
        m17154x = C37566w.m17154x(supportedApiFrameworks, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (ApiFramework apiFramework : supportedApiFrameworks) {
            arrayList.add(String.valueOf(apiFramework.getValue()));
        }
        return StringEncodingAndFormatting.encodeUriComponent(arrayList);
    }
}
