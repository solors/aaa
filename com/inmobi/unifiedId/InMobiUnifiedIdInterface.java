package com.inmobi.unifiedId;

import androidx.annotation.UiThread;
import com.inmobi.media.C19018M4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public interface InMobiUnifiedIdInterface {
    @NotNull
    public static final C19018M4 Companion = C19018M4.f47468a;
    @NotNull
    public static final String NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT = "Fetching the unifiedIds from ID Service has failed and there are no unified ids present in cache";
    @NotNull
    public static final String NO_LOCAL_DATA_PRESENT = "No local data present";
    @NotNull
    public static final String PUSH_NEEDS_TO_BE_CALLED_FIRST = "Push api needs to called prior to fetch";
    @NotNull
    public static final String UNIFIED_SERVICE_IS_NOT_ENABLED = "UnifiedId Service not enabled, please connect with your respective partner manager";
    @NotNull
    public static final String USER_HAS_AGE_RESTRICTION = "User has age restriction";
    @NotNull
    public static final String USER_HAS_OPTED_OUT = "User has opted out for tracking";

    @UiThread
    void onFetchCompleted(@Nullable JSONObject jSONObject, @Nullable Error error);
}
