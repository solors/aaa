package com.inmobi.ads;

import com.inmobi.media.C19409p4;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;
import td.EnumEntries;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiAdRequestStatus {
    @NotNull
    public static final String AD_ACTIVE_MESSAGE = "The Ad Request could not be submitted as the user is viewing another Ad.";
    @NotNull
    public static final C19409p4 Companion = new C19409p4();
    @NotNull
    public static final String DEVICE_AUDIO_LEVEL_LOW = "The Ad Request could not be processed as the device volume level is below threshold.";
    @NotNull
    public static final String FEATURE_DISABLED = "The Ad Request could not be submitted as the Feature is disabled";
    @NotNull
    public static final String REQUEST_INVALID_MESSAGE = "An invalid ad request was sent and was rejected by the Ad Network. Please validate the ad request and try again";

    /* renamed from: a */
    public final StatusCode f46998a;

    /* renamed from: b */
    public String f46999b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata
    /* loaded from: classes6.dex */
    public static final class StatusCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StatusCode[] $VALUES;
        public static final StatusCode NO_ERROR = new StatusCode("NO_ERROR", 0);
        public static final StatusCode NETWORK_UNREACHABLE = new StatusCode("NETWORK_UNREACHABLE", 1);
        public static final StatusCode NO_FILL = new StatusCode("NO_FILL", 2);
        public static final StatusCode REQUEST_INVALID = new StatusCode("REQUEST_INVALID", 3);
        public static final StatusCode REQUEST_PENDING = new StatusCode("REQUEST_PENDING", 4);
        public static final StatusCode REQUEST_TIMED_OUT = new StatusCode("REQUEST_TIMED_OUT", 5);
        public static final StatusCode INTERNAL_ERROR = new StatusCode("INTERNAL_ERROR", 6);
        public static final StatusCode SERVER_ERROR = new StatusCode("SERVER_ERROR", 7);
        public static final StatusCode AD_ACTIVE = new StatusCode("AD_ACTIVE", 8);
        public static final StatusCode EARLY_REFRESH_REQUEST = new StatusCode("EARLY_REFRESH_REQUEST", 9);
        public static final StatusCode AD_NO_LONGER_AVAILABLE = new StatusCode("AD_NO_LONGER_AVAILABLE", 10);
        public static final StatusCode MISSING_REQUIRED_DEPENDENCIES = new StatusCode("MISSING_REQUIRED_DEPENDENCIES", 11);
        public static final StatusCode REPETITIVE_LOAD = new StatusCode("REPETITIVE_LOAD", 12);
        public static final StatusCode GDPR_COMPLIANCE_ENFORCED = new StatusCode("GDPR_COMPLIANCE_ENFORCED", 13);
        public static final StatusCode GET_SIGNALS_CALLED_WHILE_LOADING = new StatusCode("GET_SIGNALS_CALLED_WHILE_LOADING", 14);
        public static final StatusCode LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING = new StatusCode("LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING", 15);
        public static final StatusCode INVALID_RESPONSE_IN_LOAD = new StatusCode("INVALID_RESPONSE_IN_LOAD", 16);
        public static final StatusCode MONETIZATION_DISABLED = new StatusCode("MONETIZATION_DISABLED", 17);
        public static final StatusCode CALLED_FROM_WRONG_THREAD = new StatusCode("CALLED_FROM_WRONG_THREAD", 18);
        public static final StatusCode CONFIGURATION_ERROR = new StatusCode("CONFIGURATION_ERROR", 19);
        public static final StatusCode LOW_MEMORY = new StatusCode("LOW_MEMORY", 20);
        public static final StatusCode FEATURE_DISABLED = new StatusCode("FEATURE_DISABLED", 21);
        public static final StatusCode DEVICE_AUDIO_LEVEL_LOW = new StatusCode("DEVICE_AUDIO_LEVEL_LOW", 22);

        private static final /* synthetic */ StatusCode[] $values() {
            return new StatusCode[]{NO_ERROR, NETWORK_UNREACHABLE, NO_FILL, REQUEST_INVALID, REQUEST_PENDING, REQUEST_TIMED_OUT, INTERNAL_ERROR, SERVER_ERROR, AD_ACTIVE, EARLY_REFRESH_REQUEST, AD_NO_LONGER_AVAILABLE, MISSING_REQUIRED_DEPENDENCIES, REPETITIVE_LOAD, GDPR_COMPLIANCE_ENFORCED, GET_SIGNALS_CALLED_WHILE_LOADING, LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING, INVALID_RESPONSE_IN_LOAD, MONETIZATION_DISABLED, CALLED_FROM_WRONG_THREAD, CONFIGURATION_ERROR, LOW_MEMORY, FEATURE_DISABLED, DEVICE_AUDIO_LEVEL_LOW};
        }

        static {
            StatusCode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = C44401b.m3113a($values);
        }

        private StatusCode(String str, int i) {
        }

        @NotNull
        public static EnumEntries<StatusCode> getEntries() {
            return $ENTRIES;
        }

        public static StatusCode valueOf(String str) {
            return (StatusCode) Enum.valueOf(StatusCode.class, str);
        }

        public static StatusCode[] values() {
            return (StatusCode[]) $VALUES.clone();
        }
    }

    public InMobiAdRequestStatus(@NotNull StatusCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f46998a = statusCode;
        switch (AbstractC18835c.f47045a[statusCode.ordinal()]) {
            case 1:
                this.f46999b = "The InMobi SDK encountered an internal error.";
                return;
            case 2:
                this.f46999b = "The Internet is unreachable. Please check your Internet connection.";
                return;
            case 3:
                this.f46999b = REQUEST_INVALID_MESSAGE;
                return;
            case 4:
                this.f46999b = "The SDK is pending response to a previous ad request. Please wait for the previous ad request to complete before requesting for another ad.";
                return;
            case 5:
                this.f46999b = "The Ad Request timed out waiting for a response from the network. This can be caused due to a bad network connection. Please try again after a few minutes.";
                return;
            case 6:
                this.f46999b = "The Ad Server encountered an error when processing the ad request. This may be a transient issue. Please try again in a few minutes";
                return;
            case 7:
                this.f46999b = "Ad request successful but no ad served.";
                return;
            case 8:
                this.f46999b = AD_ACTIVE_MESSAGE;
                return;
            case 9:
                this.f46999b = "The Ad Request cannot be done so frequently. Please wait for some time before loading another ad.";
                return;
            case 10:
                this.f46999b = "An ad is no longer available. Please call load() to fetch a fresh ad.";
                return;
            case 11:
                this.f46999b = "The SDK rejected the ad request as one or more required dependencies could not be found. Please ensure you have included the required dependencies.";
                return;
            case 12:
                this.f46999b = "The SDK rejected the ad load request. Multiple load() call on the same object is not allowed if the previous ad request was successful.";
                return;
            case 13:
                this.f46999b = "Network Request dropped as current request is not GDPR compliant.";
                return;
            case 14:
                this.f46999b = "An ad load is already in progress, getSignals() call in this state is not allowed.";
                return;
            case 15:
                this.f46999b = "An ad load is already in progress, load(response) call in this state is not allowed.";
                return;
            case 16:
                this.f46999b = "Null or empty response as parameter is not allowed in load(response).";
                return;
            case 17:
                this.f46999b = "The Ad Request is terminated because monetization is disabled.";
                return;
            case 18:
                this.f46999b = "An API call is made from non-ui thread.";
                return;
            case 19:
                this.f46999b = "InMobi Ad Object is not configured properly Please check if setBannerSize(int widthInDp, int heightInDp) or setLayoutParams(<Layout_Params>) have been configured correctly";
                return;
            case 20:
                this.f46999b = "The app is running low on memory, hence resulting in failure";
                return;
            case 21:
                this.f46999b = FEATURE_DISABLED;
                return;
            case 22:
                this.f46999b = DEVICE_AUDIO_LEVEL_LOW;
                return;
            default:
                Intrinsics.checkNotNullExpressionValue("InMobiAdRequestStatus", "TAG");
                Objects.toString(statusCode);
                return;
        }
    }

    @Nullable
    public final String getMessage() {
        return this.f46999b;
    }

    @NotNull
    public final StatusCode getStatusCode() {
        return this.f46998a;
    }

    @NotNull
    public final InMobiAdRequestStatus setCustomMessage(@Nullable String str) {
        if (str != null) {
            this.f46999b = str;
        }
        return this;
    }
}
