package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.common.C13358R;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.login.LoginClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LoginClient.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class LoginClient implements Parcelable {
    @Nullable
    private BackgroundProcessingListener backgroundProcessingListener;
    private boolean checkedInternetPermission;
    private int currentHandler;
    @Nullable
    private Map<String, String> extraData;
    @Nullable
    private Fragment fragment;
    @Nullable
    private LoginMethodHandler[] handlersToTry;
    @Nullable
    private Map<String, String> loggingExtras;
    @Nullable
    private LoginLogger loginLogger;
    private int numActivitiesReturned;
    private int numTotalIntentsFired;
    @Nullable
    private OnCompletedListener onCompletedListener;
    @Nullable
    private Request pendingRequest;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<LoginClient> CREATOR = new Parcelable.Creator<LoginClient>() { // from class: com.facebook.login.LoginClient$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public LoginClient createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new LoginClient(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    };

    /* compiled from: LoginClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public interface BackgroundProcessingListener {
        void onBackgroundProcessingStarted();

        void onBackgroundProcessingStopped();
    }

    /* compiled from: LoginClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getE2E() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
            return jSONObject2;
        }

        public final int getLoginRequestCode() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }
    }

    /* compiled from: LoginClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public interface OnCompletedListener {
        void onCompleted(@NotNull Result result);
    }

    /* compiled from: LoginClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Request implements Parcelable {
        @NotNull
        private final String applicationId;
        @NotNull
        private String authId;
        @NotNull
        private String authType;
        @Nullable
        private final String codeChallenge;
        @Nullable
        private final CodeChallengeMethod codeChallengeMethod;
        @Nullable
        private final String codeVerifier;
        @NotNull
        private final DefaultAudience defaultAudience;
        @Nullable
        private String deviceAuthTargetUserId;
        @Nullable
        private String deviceRedirectUriString;
        private boolean isFamilyLogin;
        private boolean isRerequest;
        @NotNull
        private final LoginBehavior loginBehavior;
        @NotNull
        private final LoginTargetApp loginTargetApp;
        @Nullable
        private String messengerPageId;
        @NotNull
        private final String nonce;
        @NotNull
        private Set<String> permissions;
        private boolean resetMessengerState;
        private boolean shouldSkipAccountDeduplication;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final Parcelable.Creator<Request> CREATOR = new Parcelable.Creator<Request>() { // from class: com.facebook.login.LoginClient$Request$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            @NotNull
            public LoginClient.Request createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new LoginClient.Request(source, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public LoginClient.Request[] newArray(int i) {
                return new LoginClient.Request[i];
            }
        };

        /* compiled from: LoginClient.kt */
        @Metadata
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Request(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @NotNull
        public final String getApplicationId() {
            return this.applicationId;
        }

        @NotNull
        public final String getAuthId() {
            return this.authId;
        }

        @NotNull
        public final String getAuthType() {
            return this.authType;
        }

        @Nullable
        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        @Nullable
        public final CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        @Nullable
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        @NotNull
        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        @Nullable
        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        @Nullable
        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        @NotNull
        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        @NotNull
        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        @Nullable
        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        @NotNull
        public final String getNonce() {
            return this.nonce;
        }

        @NotNull
        public final Set<String> getPermissions() {
            return this.permissions;
        }

        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean hasPublishPermission() {
            for (String str : this.permissions) {
                if (LoginManager.Companion.isPublishPermission(str)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final boolean isInstagramLogin() {
            if (this.loginTargetApp == LoginTargetApp.INSTAGRAM) {
                return true;
            }
            return false;
        }

        public final boolean isRerequest() {
            return this.isRerequest;
        }

        public final void setAuthId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.authId = str;
        }

        public final void setAuthType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.authType = str;
        }

        public final void setDeviceAuthTargetUserId(@Nullable String str) {
            this.deviceAuthTargetUserId = str;
        }

        public final void setDeviceRedirectUriString(@Nullable String str) {
            this.deviceRedirectUriString = str;
        }

        public final void setFamilyLogin(boolean z) {
            this.isFamilyLogin = z;
        }

        public final void setMessengerPageId(@Nullable String str) {
            this.messengerPageId = str;
        }

        public final void setPermissions(@NotNull Set<String> set) {
            Intrinsics.checkNotNullParameter(set, "<set-?>");
            this.permissions = set;
        }

        public final void setRerequest(boolean z) {
            this.isRerequest = z;
        }

        public final void setResetMessengerState(boolean z) {
            this.resetMessengerState = z;
        }

        public final void setShouldSkipAccountDeduplication(boolean z) {
            this.shouldSkipAccountDeduplication = z;
        }

        public final boolean shouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i) {
            String name;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.loginBehavior.name());
            dest.writeStringList(new ArrayList(this.permissions));
            dest.writeString(this.defaultAudience.name());
            dest.writeString(this.applicationId);
            dest.writeString(this.authId);
            dest.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            dest.writeString(this.deviceRedirectUriString);
            dest.writeString(this.authType);
            dest.writeString(this.deviceAuthTargetUserId);
            dest.writeString(this.messengerPageId);
            dest.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            dest.writeString(this.loginTargetApp.name());
            dest.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            dest.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            dest.writeString(this.nonce);
            dest.writeString(this.codeVerifier);
            dest.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            if (codeChallengeMethod == null) {
                name = null;
            } else {
                name = codeChallengeMethod.name();
            }
            dest.writeString(name);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(@NotNull LoginBehavior loginBehavior, @Nullable Set<String> set, @NotNull DefaultAudience defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, null, null, null, null, null, 1984, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(@NotNull LoginBehavior loginBehavior, @Nullable Set<String> set, @NotNull DefaultAudience defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable LoginTargetApp loginTargetApp) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, null, null, null, null, 1920, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(@NotNull LoginBehavior loginBehavior, @Nullable Set<String> set, @NotNull DefaultAudience defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable LoginTargetApp loginTargetApp, @Nullable String str) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, null, null, null, 1792, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(@NotNull LoginBehavior loginBehavior, @Nullable Set<String> set, @NotNull DefaultAudience defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable LoginTargetApp loginTargetApp, @Nullable String str, @Nullable String str2) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, str2, null, null, 1536, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Request(@NotNull LoginBehavior loginBehavior, @Nullable Set<String> set, @NotNull DefaultAudience defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable LoginTargetApp loginTargetApp, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this(loginBehavior, set, defaultAudience, authType, applicationId, authId, loginTargetApp, str, str2, str3, null, 1024, null);
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
        }

        public /* synthetic */ Request(LoginBehavior loginBehavior, Set set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(loginBehavior, set, defaultAudience, str, str2, str3, (i & 64) != 0 ? LoginTargetApp.FACEBOOK : loginTargetApp, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : codeChallengeMethod);
        }

        public Request(@NotNull LoginBehavior loginBehavior, @Nullable Set<String> set, @NotNull DefaultAudience defaultAudience, @NotNull String authType, @NotNull String applicationId, @NotNull String authId, @Nullable LoginTargetApp loginTargetApp, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable CodeChallengeMethod codeChallengeMethod) {
            Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(authType, "authType");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(authId, "authId");
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = defaultAudience;
            this.authType = authType;
            this.applicationId = applicationId;
            this.authId = authId;
            this.loginTargetApp = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str != null) {
                if (!(str.length() == 0)) {
                    this.nonce = str;
                    this.codeVerifier = str2;
                    this.codeChallenge = str3;
                    this.codeChallengeMethod = codeChallengeMethod;
                }
            }
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            this.nonce = uuid;
            this.codeVerifier = str2;
            this.codeChallenge = str3;
            this.codeChallengeMethod = codeChallengeMethod;
        }

        private Request(Parcel parcel) {
            DefaultAudience defaultAudience;
            LoginTargetApp loginTargetApp;
            Validate validate = Validate.INSTANCE;
            this.loginBehavior = LoginBehavior.valueOf(Validate.notNullOrEmpty(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String readString = parcel.readString();
            if (readString != null) {
                defaultAudience = DefaultAudience.valueOf(readString);
            } else {
                defaultAudience = DefaultAudience.NONE;
            }
            this.defaultAudience = defaultAudience;
            this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
            this.authId = Validate.notNullOrEmpty(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = Validate.notNullOrEmpty(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                loginTargetApp = LoginTargetApp.valueOf(readString2);
            } else {
                loginTargetApp = LoginTargetApp.FACEBOOK;
            }
            this.loginTargetApp = loginTargetApp;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.nonce = Validate.notNullOrEmpty(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String readString3 = parcel.readString();
            this.codeChallengeMethod = readString3 == null ? null : CodeChallengeMethod.valueOf(readString3);
        }
    }

    /* compiled from: LoginClient.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Result implements Parcelable {
        @Nullable
        public final AuthenticationToken authenticationToken;
        @NotNull
        public final Code code;
        @Nullable
        public final String errorCode;
        @Nullable
        public final String errorMessage;
        @Nullable
        public Map<String, String> extraData;
        @Nullable
        public Map<String, String> loggingExtras;
        @Nullable
        public final Request request;
        @Nullable
        public final AccessToken token;
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new Parcelable.Creator<Result>() { // from class: com.facebook.login.LoginClient$Result$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            @NotNull
            public LoginClient.Result createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new LoginClient.Result(source, null);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            public LoginClient.Result[] newArray(int i) {
                return new LoginClient.Result[i];
            }
        };

        /* compiled from: LoginClient.kt */
        @Metadata
        /* loaded from: classes4.dex */
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");
            
            @NotNull
            private final String loggingValue;

            Code(String str) {
                this.loggingValue = str;
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static Code[] valuesCustom() {
                Code[] valuesCustom = values();
                return (Code[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
            }

            @NotNull
            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* compiled from: LoginClient.kt */
        @Metadata
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Result createErrorResult$default(Companion companion, Request request, String str, String str2, String str3, int i, Object obj) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return companion.createErrorResult(request, str, str2, str3);
            }

            @NotNull
            public final Result createCancelResult(@Nullable Request request, @Nullable String str) {
                return new Result(request, Code.CANCEL, null, str, null);
            }

            @NotNull
            public final Result createCompositeTokenResult(@Nullable Request request, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            @NotNull
            public final Result createErrorResult(@Nullable Request request, @Nullable String str, @Nullable String str2) {
                return createErrorResult$default(this, request, str, str2, null, 8, null);
            }

            @NotNull
            public final Result createTokenResult(@Nullable Request request, @NotNull AccessToken token) {
                Intrinsics.checkNotNullParameter(token, "token");
                return new Result(request, Code.SUCCESS, token, null, null);
            }

            @NotNull
            public final Result createErrorResult(@Nullable Request request, @Nullable String str, @Nullable String str2, @Nullable String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, Code.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }
        }

        public /* synthetic */ Result(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @NotNull
        public static final Result createCancelResult(@Nullable Request request, @Nullable String str) {
            return Companion.createCancelResult(request, str);
        }

        @NotNull
        public static final Result createCompositeTokenResult(@Nullable Request request, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken) {
            return Companion.createCompositeTokenResult(request, accessToken, authenticationToken);
        }

        @NotNull
        public static final Result createErrorResult(@Nullable Request request, @Nullable String str, @Nullable String str2) {
            return Companion.createErrorResult(request, str, str2);
        }

        @NotNull
        public static final Result createTokenResult(@Nullable Request request, @NotNull AccessToken accessToken) {
            return Companion.createTokenResult(request, accessToken);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.code.name());
            dest.writeParcelable(this.token, i);
            dest.writeParcelable(this.authenticationToken, i);
            dest.writeString(this.errorMessage);
            dest.writeString(this.errorCode);
            dest.writeParcelable(this.request, i);
            Utility utility = Utility.INSTANCE;
            Utility.writeNonnullStringMapToParcel(dest, this.loggingExtras);
            Utility.writeNonnullStringMapToParcel(dest, this.extraData);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(@Nullable Request request, @NotNull Code code, @Nullable AccessToken accessToken, @Nullable String str, @Nullable String str2) {
            this(request, code, accessToken, null, str, str2);
            Intrinsics.checkNotNullParameter(code, "code");
        }

        @NotNull
        public static final Result createErrorResult(@Nullable Request request, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return Companion.createErrorResult(request, str, str2, str3);
        }

        public Result(@Nullable Request request, @NotNull Code code, @Nullable AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        private Result(Parcel parcel) {
            String readString = parcel.readString();
            this.code = Code.valueOf(readString == null ? "error" : readString);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = Utility.readNonnullStringMapFromParcel(parcel);
            this.extraData = Utility.readNonnullStringMapFromParcel(parcel);
        }
    }

    public LoginClient(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.currentHandler = -1;
        setFragment(fragment);
    }

    private final void addLoggingExtra(String str, String str2, boolean z) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    private final void completeWithFailure() {
        complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    @NotNull
    public static final String getE2E() {
        return Companion.getE2E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0016, code lost:
        if (kotlin.jvm.internal.Intrinsics.m17075f(r1, r2) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.login.LoginLogger getLogger() {
        /*
            r3 = this;
            com.facebook.login.LoginLogger r0 = r3.loginLogger
            if (r0 == 0) goto L18
            java.lang.String r1 = r0.getApplicationId()
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            java.lang.String r2 = r2.getApplicationId()
        L12:
            boolean r1 = kotlin.jvm.internal.Intrinsics.m17075f(r1, r2)
            if (r1 != 0) goto L36
        L18:
            com.facebook.login.LoginLogger r0 = new com.facebook.login.LoginLogger
            androidx.fragment.app.FragmentActivity r1 = r3.getActivity()
            if (r1 != 0) goto L24
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()
        L24:
            com.facebook.login.LoginClient$Request r2 = r3.pendingRequest
            if (r2 != 0) goto L2d
            java.lang.String r2 = com.facebook.FacebookSdk.getApplicationId()
            goto L31
        L2d:
            java.lang.String r2 = r2.getApplicationId()
        L31:
            r0.<init>(r1, r2)
            r3.loginLogger = r0
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.LoginClient.getLogger():com.facebook.login.LoginLogger");
    }

    public static final int getLoginRequestCode() {
        return Companion.getLoginRequestCode();
    }

    private final void logAuthorizationMethodComplete(String str, Result result, Map<String, String> map) {
        logAuthorizationMethodComplete(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    private final void notifyOnCompleteListener(Result result) {
        OnCompletedListener onCompletedListener = this.onCompletedListener;
        if (onCompletedListener != null) {
            onCompletedListener.onCompleted(result);
        }
    }

    public final void addExtraData(@NotNull String key, @NotNull String value, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<String, String> map = this.extraData;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.extraData == null) {
            this.extraData = map;
        }
        if (map.containsKey(key) && z) {
            value = ((Object) map.get(key)) + ',' + value;
        }
        map.put(key, value);
    }

    public final void authorize(@Nullable Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest == null) {
            if (AccessToken.Companion.isCurrentAccessTokenActive() && !checkInternetPermission()) {
                return;
            }
            this.pendingRequest = request;
            this.handlersToTry = getHandlersToTry(request);
            tryNextHandler();
            return;
        }
        throw new FacebookException("Attempted to authorize while a request is pending.");
    }

    public final void cancelCurrentHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            currentHandler.cancel();
        }
    }

    public final boolean checkInternetPermission() {
        String string;
        if (this.checkedInternetPermission) {
            return true;
        }
        if (checkPermission("android.permission.INTERNET") != 0) {
            FragmentActivity activity = getActivity();
            String str = null;
            if (activity == null) {
                string = null;
            } else {
                string = activity.getString(C13358R.C13364string.com_facebook_internet_permission_error_title);
            }
            if (activity != null) {
                str = activity.getString(C13358R.C13364string.com_facebook_internet_permission_error_message);
            }
            complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, string, str, null, 8, null));
            return false;
        }
        this.checkedInternetPermission = true;
        return true;
    }

    public final int checkPermission(@NotNull String permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return -1;
        }
        return activity.checkCallingOrSelfPermission(permission);
    }

    public final void complete(@NotNull Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), outcome, currentHandler.getMethodLoggingExtras());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            outcome.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            outcome.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        notifyOnCompleteListener(outcome);
    }

    public final void completeAndValidate(@NotNull Result outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        if (outcome.token != null && AccessToken.Companion.isCurrentAccessTokenActive()) {
            validateSameFbidAndFinish(outcome);
        } else {
            complete(outcome);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final FragmentActivity getActivity() {
        Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    @Nullable
    public final BackgroundProcessingListener getBackgroundProcessingListener() {
        return this.backgroundProcessingListener;
    }

    public final boolean getCheckedInternetPermission() {
        return this.checkedInternetPermission;
    }

    @Nullable
    public final LoginMethodHandler getCurrentHandler() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.currentHandler;
        if (i < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    @Nullable
    public final Map<String, String> getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final Fragment getFragment() {
        return this.fragment;
    }

    @Nullable
    public final LoginMethodHandler[] getHandlersToTry() {
        return this.handlersToTry;
    }

    public final boolean getInProgress() {
        if (this.pendingRequest != null && this.currentHandler >= 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Map<String, String> getLoggingExtras() {
        return this.loggingExtras;
    }

    @Nullable
    public final OnCompletedListener getOnCompletedListener() {
        return this.onCompletedListener;
    }

    @Nullable
    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void notifyBackgroundProcessingStart() {
        BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener != null) {
            backgroundProcessingListener.onBackgroundProcessingStarted();
        }
    }

    public final void notifyBackgroundProcessingStop() {
        BackgroundProcessingListener backgroundProcessingListener = this.backgroundProcessingListener;
        if (backgroundProcessingListener != null) {
            backgroundProcessingListener.onBackgroundProcessingStopped();
        }
    }

    public final boolean onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                tryNextHandler();
                return false;
            }
            LoginMethodHandler currentHandler = getCurrentHandler();
            if (currentHandler != null && (!currentHandler.shouldKeepTrackOfMultipleIntents() || intent != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return currentHandler.onActivityResult(i, i2, intent);
            }
        }
        return false;
    }

    public final void setBackgroundProcessingListener(@Nullable BackgroundProcessingListener backgroundProcessingListener) {
        this.backgroundProcessingListener = backgroundProcessingListener;
    }

    public final void setCheckedInternetPermission(boolean z) {
        this.checkedInternetPermission = z;
    }

    protected final void setCurrentHandlerIndex(int i) {
        this.currentHandler = i;
    }

    public final void setExtraData(@Nullable Map<String, String> map) {
        this.extraData = map;
    }

    public final void setFragment(@Nullable Fragment fragment) {
        if (this.fragment == null) {
            this.fragment = fragment;
            return;
        }
        throw new FacebookException("Can't set fragment once it is already set.");
    }

    public final void setHandlersToTry(@Nullable LoginMethodHandler[] loginMethodHandlerArr) {
        this.handlersToTry = loginMethodHandlerArr;
    }

    public final void setLoggingExtras(@Nullable Map<String, String> map) {
        this.loggingExtras = map;
    }

    public final void setOnCompletedListener(@Nullable OnCompletedListener onCompletedListener) {
        this.onCompletedListener = onCompletedListener;
    }

    public final void setPendingRequest(@Nullable Request request) {
        this.pendingRequest = request;
    }

    public final void startOrContinueAuth(@Nullable Request request) {
        if (!getInProgress()) {
            authorize(request);
        }
    }

    public final boolean tryCurrentHandler() {
        String str;
        String str2;
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler == null) {
            return false;
        }
        if (currentHandler.needsInternetPermission() && !checkInternetPermission()) {
            addLoggingExtra(LoginLogger.EVENT_EXTRAS_MISSING_INTERNET_PERMISSION, "1", false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int tryAuthorize = currentHandler.tryAuthorize(request);
        this.numActivitiesReturned = 0;
        if (tryAuthorize > 0) {
            LoginLogger logger = getLogger();
            String authId = request.getAuthId();
            String nameForLogging = currentHandler.getNameForLogging();
            if (request.isFamilyLogin()) {
                str2 = LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_START;
            } else {
                str2 = LoginLogger.EVENT_NAME_LOGIN_METHOD_START;
            }
            logger.logAuthorizationMethodStart(authId, nameForLogging, str2);
            this.numTotalIntentsFired = tryAuthorize;
        } else {
            LoginLogger logger2 = getLogger();
            String authId2 = request.getAuthId();
            String nameForLogging2 = currentHandler.getNameForLogging();
            if (request.isFamilyLogin()) {
                str = LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED;
            } else {
                str = LoginLogger.EVENT_NAME_LOGIN_METHOD_NOT_TRIED;
            }
            logger2.logAuthorizationMethodNotTried(authId2, nameForLogging2, str);
            addLoggingExtra(LoginLogger.EVENT_EXTRAS_NOT_TRIED, currentHandler.getNameForLogging(), true);
        }
        if (tryAuthorize <= 0) {
            return false;
        }
        return true;
    }

    public final void tryNextHandler() {
        LoginMethodHandler currentHandler = getCurrentHandler();
        if (currentHandler != null) {
            logAuthorizationMethodComplete(currentHandler.getNameForLogging(), "skipped", null, null, currentHandler.getMethodLoggingExtras());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i = this.currentHandler;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.currentHandler = i + 1;
            if (tryCurrentHandler()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            completeWithFailure();
        }
    }

    public final void validateSameFbidAndFinish(@NotNull Result pendingResult) {
        Result createCompositeTokenResult;
        Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
        if (pendingResult.token != null) {
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            AccessToken accessToken = pendingResult.token;
            if (currentAccessToken != null) {
                try {
                    if (Intrinsics.m17075f(currentAccessToken.getUserId(), accessToken.getUserId())) {
                        createCompositeTokenResult = Result.Companion.createCompositeTokenResult(this.pendingRequest, pendingResult.token, pendingResult.authenticationToken);
                        complete(createCompositeTokenResult);
                        return;
                    }
                } catch (Exception e) {
                    complete(Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "Caught exception", e.getMessage(), null, 8, null));
                    return;
                }
            }
            createCompositeTokenResult = Result.Companion.createErrorResult$default(Result.Companion, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
            complete(createCompositeTokenResult);
            return;
        }
        throw new FacebookException("Can't validate without a token");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.handlersToTry, i);
        dest.writeInt(this.currentHandler);
        dest.writeParcelable(this.pendingRequest, i);
        Utility utility = Utility.INSTANCE;
        Utility.writeNonnullStringMapToParcel(dest, this.loggingExtras);
        Utility.writeNonnullStringMapToParcel(dest, this.extraData);
    }

    @Nullable
    public LoginMethodHandler[] getHandlersToTry(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (request.isInstagramLogin()) {
            if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsInstagramAppAuth()) {
                arrayList.add(new InstagramAppLoginMethodHandler(this));
            }
        } else {
            if (loginBehavior.allowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!FacebookSdk.bypassAppSwitch && loginBehavior.allowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        }
        if (loginBehavior.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.isInstagramLogin() && loginBehavior.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private final void logAuthorizationMethodComplete(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.pendingRequest;
        String str5 = LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE;
        if (request == null) {
            getLogger().logUnexpectedError(LoginLogger.EVENT_NAME_LOGIN_METHOD_COMPLETE, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        LoginLogger logger = getLogger();
        String authId = request.getAuthId();
        if (request.isFamilyLogin()) {
            str5 = LoginLogger.EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE;
        }
        logger.logAuthorizationMethodComplete(authId, str, str2, str3, str4, map, str5);
    }

    public LoginClient(@NotNull Parcel source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.currentHandler = -1;
        Parcelable[] readParcelableArray = source.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        readParcelableArray = readParcelableArray == null ? new Parcelable[0] : readParcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = readParcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = readParcelableArray[i];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.setLoginClient(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            this.handlersToTry = (LoginMethodHandler[]) array;
            this.currentHandler = source.readInt();
            this.pendingRequest = (Request) source.readParcelable(Request.class.getClassLoader());
            Map<String, String> readNonnullStringMapFromParcel = Utility.readNonnullStringMapFromParcel(source);
            this.loggingExtras = readNonnullStringMapFromParcel == null ? null : C37559r0.m17285D(readNonnullStringMapFromParcel);
            Map<String, String> readNonnullStringMapFromParcel2 = Utility.readNonnullStringMapFromParcel(source);
            this.extraData = readNonnullStringMapFromParcel2 != null ? C37559r0.m17285D(readNonnullStringMapFromParcel2) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
