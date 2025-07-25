package com.unity3d.ads.core.domain.p619om;

import android.webkit.WebView;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: OmInteraction.kt */
@Metadata
/* renamed from: com.unity3d.ads.core.domain.om.OmInteraction */
/* loaded from: classes7.dex */
public interface OmInteraction {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    @NotNull
    public static final String OMID_CREATIVE_TYPE = "creativeType";
    @NotNull
    public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";
    @NotNull
    public static final String OMID_IMPRESSION_OWNER = "impressionOwner";
    @NotNull
    public static final String OMID_IMPRESSION_TYPE = "impressionType";
    @NotNull
    public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";
    @NotNull
    public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";
    @NotNull
    public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

    /* compiled from: OmInteraction.kt */
    @Metadata
    /* renamed from: com.unity3d.ads.core.domain.om.OmInteraction$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        public static final String OMID_CREATIVE_TYPE = "creativeType";
        @NotNull
        public static final String OMID_CUSTOM_REFERENCE_DATA = "customReferenceData";
        @NotNull
        public static final String OMID_IMPRESSION_OWNER = "impressionOwner";
        @NotNull
        public static final String OMID_IMPRESSION_TYPE = "impressionType";
        @NotNull
        public static final String OMID_ISOLATE_VERIFICATION_SCRIPTS = "isolateVerificationScripts";
        @NotNull
        public static final String OMID_MEDIA_EVENTS_OWNER = "mediaEventsOwner";
        @NotNull
        public static final String OMID_VIDEO_EVENTS_OWNER = "videoEventsOwner";

        private Companion() {
        }
    }

    @NotNull
    OmidOptions getOMidOptions(@NotNull JSONObject jSONObject);

    @Nullable
    WebView getWebview(@NotNull AdObject adObject);

    @Nullable
    Object invoke(@NotNull AdObject adObject, @NotNull JSONObject jSONObject, @NotNull Continuation<? super Unit> continuation);
}
