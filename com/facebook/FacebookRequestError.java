package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.qualityvalidation.Excuse;
import com.facebook.internal.qualityvalidation.ExcusesForDesignViolations;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: FacebookRequestError.kt */
@Metadata
@ExcusesForDesignViolations({@Excuse(reason = "Legacy migration", type = "KOTLIN_JVM_FIELD")})
/* loaded from: classes3.dex */
public final class FacebookRequestError implements Parcelable {
    @NotNull
    private static final String BODY_KEY = "body";
    @NotNull
    private static final String CODE_KEY = "code";
    @NotNull
    private static final String ERROR_CODE_FIELD_KEY = "code";
    @NotNull
    private static final String ERROR_CODE_KEY = "error_code";
    @NotNull
    private static final String ERROR_IS_TRANSIENT_KEY = "is_transient";
    @NotNull
    private static final String ERROR_KEY = "error";
    @NotNull
    private static final String ERROR_MESSAGE_FIELD_KEY = "message";
    @NotNull
    private static final String ERROR_MSG_KEY = "error_msg";
    @NotNull
    private static final String ERROR_REASON_KEY = "error_reason";
    @NotNull
    private static final String ERROR_SUB_CODE_KEY = "error_subcode";
    @NotNull
    private static final String ERROR_TYPE_FIELD_KEY = "type";
    @NotNull
    private static final String ERROR_USER_MSG_KEY = "error_user_msg";
    @NotNull
    private static final String ERROR_USER_TITLE_KEY = "error_user_title";
    public static final int INVALID_ERROR_CODE = -1;
    public static final int INVALID_HTTP_STATUS_CODE = -1;
    @Nullable
    private final Object batchRequestResult;
    @NotNull
    private final Category category;
    @Nullable
    private final HttpURLConnection connection;
    private final int errorCode;
    @Nullable
    private final String errorMessage;
    @Nullable
    private final String errorRecoveryMessage;
    @Nullable
    private final String errorType;
    @Nullable
    private final String errorUserMessage;
    @Nullable
    private final String errorUserTitle;
    @Nullable
    private FacebookException exception;
    @Nullable
    private final JSONObject requestResult;
    @Nullable
    private final JSONObject requestResultBody;
    private final int requestStatusCode;
    private final int subErrorCode;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Range HTTP_RANGE_SUCCESS = new Range(200, 299);
    @NotNull
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new Parcelable.Creator<FacebookRequestError>() { // from class: com.facebook.FacebookRequestError$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FacebookRequestError createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FacebookRequestError(parcel, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    };

    /* compiled from: FacebookRequestError.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Category[] valuesCustom() {
            Category[] valuesCustom = values();
            return (Category[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: FacebookRequestError.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x00cf A[Catch: JSONException -> 0x012d, TryCatch #0 {JSONException -> 0x012d, blocks: (B:63:0x0012, B:65:0x0018, B:67:0x0022, B:69:0x0026, B:72:0x0034, B:107:0x00cf, B:93:0x0077, B:90:0x006e, B:87:0x0064, B:84:0x005c, B:81:0x0055, B:78:0x004b, B:75:0x0041, B:95:0x0083, B:98:0x0090, B:100:0x0099, B:104:0x00aa, B:109:0x00f0, B:111:0x00fa, B:113:0x0108, B:115:0x0111), top: B:119:0x0012 }] */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.FacebookRequestError checkResponseAndCreateError(@org.jetbrains.annotations.NotNull org.json.JSONObject r20, @org.jetbrains.annotations.Nullable java.lang.Object r21, @org.jetbrains.annotations.Nullable java.net.HttpURLConnection r22) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookRequestError.Companion.checkResponseAndCreateError(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.FacebookRequestError");
        }

        @NotNull
        public final synchronized FacebookRequestErrorClassification getErrorClassification() {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
            if (appSettingsWithoutQuery == null) {
                return FacebookRequestErrorClassification.Companion.getDefaultErrorClassification();
            }
            return appSettingsWithoutQuery.getErrorClassification();
        }

        @NotNull
        public final Range getHTTP_RANGE_SUCCESS$facebook_core_release() {
            return FacebookRequestError.HTTP_RANGE_SUCCESS;
        }
    }

    /* compiled from: FacebookRequestError.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Range {
        private final int end;
        private final int start;

        public Range(int i, int i2) {
            this.start = i;
            this.end = i2;
        }

        public final boolean contains(int i) {
            int i2 = this.start;
            if (i > this.end || i2 > i) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z);
    }

    @Nullable
    public static final FacebookRequestError checkResponseAndCreateError(@NotNull JSONObject jSONObject, @Nullable Object obj, @Nullable HttpURLConnection httpURLConnection) {
        return Companion.checkResponseAndCreateError(jSONObject, obj, httpURLConnection);
    }

    @NotNull
    public static final synchronized FacebookRequestErrorClassification getErrorClassification() {
        FacebookRequestErrorClassification errorClassification;
        synchronized (FacebookRequestError.class) {
            errorClassification = Companion.getErrorClassification();
        }
        return errorClassification;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Object getBatchRequestResult() {
        return this.batchRequestResult;
    }

    @NotNull
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    public final HttpURLConnection getConnection() {
        return this.connection;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorMessage() {
        String str = this.errorMessage;
        if (str == null) {
            FacebookException facebookException = this.exception;
            if (facebookException == null) {
                return null;
            }
            return facebookException.getLocalizedMessage();
        }
        return str;
    }

    @Nullable
    public final String getErrorRecoveryMessage() {
        return this.errorRecoveryMessage;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getErrorUserMessage() {
        return this.errorUserMessage;
    }

    @Nullable
    public final String getErrorUserTitle() {
        return this.errorUserTitle;
    }

    @Nullable
    public final FacebookException getException() {
        return this.exception;
    }

    @Nullable
    public final JSONObject getRequestResult() {
        return this.requestResult;
    }

    @Nullable
    public final JSONObject getRequestResultBody() {
        return this.requestResultBody;
    }

    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    @NotNull
    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + getErrorMessage() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.requestStatusCode);
        out.writeInt(this.errorCode);
        out.writeInt(this.subErrorCode);
        out.writeString(this.errorType);
        out.writeString(getErrorMessage());
        out.writeString(this.errorUserTitle);
        out.writeString(this.errorUserMessage);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z) {
        boolean z2;
        Category classify;
        this.requestStatusCode = i;
        this.errorCode = i2;
        this.subErrorCode = i3;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            z2 = true;
        } else {
            this.exception = new FacebookServiceException(this, getErrorMessage());
            z2 = false;
        }
        if (z2) {
            classify = Category.OTHER;
        } else {
            classify = Companion.getErrorClassification().classify(i2, i3, z);
        }
        this.category = classify;
        this.errorRecoveryMessage = Companion.getErrorClassification().getRecoveryMessage(classify);
    }

    @VisibleForTesting(otherwise = 4)
    public FacebookRequestError(@Nullable HttpURLConnection httpURLConnection, @Nullable Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i, @Nullable String str, @Nullable String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    private FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
