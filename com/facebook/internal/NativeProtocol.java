package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NativeProtocol.kt */
@Metadata
/* loaded from: classes4.dex */
public final class NativeProtocol {
    @NotNull
    public static final String ACTION_APPINVITE_DIALOG = "com.facebook.platform.action.request.APPINVITES_DIALOG";
    @NotNull
    public static final String ACTION_CAMERA_EFFECT = "com.facebook.platform.action.request.CAMERA_EFFECT";
    @NotNull
    public static final String ACTION_FEED_DIALOG = "com.facebook.platform.action.request.FEED_DIALOG";
    @NotNull
    public static final String ACTION_LIKE_DIALOG = "com.facebook.platform.action.request.LIKE_DIALOG";
    @NotNull
    public static final String ACTION_MESSAGE_DIALOG = "com.facebook.platform.action.request.MESSAGE_DIALOG";
    @NotNull
    public static final String ACTION_OGACTIONPUBLISH_DIALOG = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    @NotNull
    public static final String ACTION_OGMESSAGEPUBLISH_DIALOG = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    @NotNull
    public static final String ACTION_SHARE_STORY = "com.facebook.platform.action.request.SHARE_STORY";
    @NotNull
    public static final String AUDIENCE_EVERYONE = "everyone";
    @NotNull
    public static final String AUDIENCE_FRIENDS = "friends";
    @NotNull
    public static final String AUDIENCE_ME = "only_me";
    @NotNull
    public static final String BRIDGE_ARG_ACTION_ID_STRING = "action_id";
    @NotNull
    public static final String BRIDGE_ARG_APP_NAME_STRING = "app_name";
    @NotNull
    public static final String BRIDGE_ARG_ERROR_BUNDLE = "error";
    @NotNull
    public static final String BRIDGE_ARG_ERROR_CODE = "error_code";
    @NotNull
    public static final String BRIDGE_ARG_ERROR_DESCRIPTION = "error_description";
    @NotNull
    public static final String BRIDGE_ARG_ERROR_JSON = "error_json";
    @NotNull
    public static final String BRIDGE_ARG_ERROR_SUBCODE = "error_subcode";
    @NotNull
    public static final String BRIDGE_ARG_ERROR_TYPE = "error_type";
    @NotNull
    private static final String CONTENT_SCHEME = "content://";
    @NotNull
    public static final String ERROR_APPLICATION_ERROR = "ApplicationError";
    @NotNull
    public static final String ERROR_NETWORK_ERROR = "NetworkError";
    @NotNull
    public static final String ERROR_PERMISSION_DENIED = "PermissionDenied";
    @NotNull
    public static final String ERROR_PROTOCOL_ERROR = "ProtocolError";
    @NotNull
    public static final String ERROR_SERVICE_DISABLED = "ServiceDisabled";
    @NotNull
    public static final String ERROR_UNKNOWN_ERROR = "UnknownError";
    @NotNull
    public static final String ERROR_USER_CANCELED = "UserCanceled";
    @NotNull
    public static final String EXTRA_ACCESS_TOKEN = "com.facebook.platform.extra.ACCESS_TOKEN";
    @NotNull
    public static final String EXTRA_APPLICATION_ID = "com.facebook.platform.extra.APPLICATION_ID";
    @NotNull
    public static final String EXTRA_APPLICATION_NAME = "com.facebook.platform.extra.APPLICATION_NAME";
    @NotNull
    public static final String EXTRA_AUTHENTICATION_TOKEN = "com.facebook.platform.extra.ID_TOKEN";
    @NotNull
    public static final String EXTRA_DATA_ACCESS_EXPIRATION_TIME = "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME";
    @NotNull
    public static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
    @NotNull
    public static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
    @NotNull
    public static final String EXTRA_EXPIRES_SECONDS_SINCE_EPOCH = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";
    @NotNull
    public static final String EXTRA_GET_INSTALL_DATA_PACKAGE = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";
    @NotNull
    public static final String EXTRA_GRAPH_API_VERSION = "com.facebook.platform.extra.GRAPH_API_VERSION";
    @NotNull
    public static final String EXTRA_LOGGER_REF = "com.facebook.platform.extra.LOGGER_REF";
    @NotNull
    public static final String EXTRA_NONCE = "com.facebook.platform.extra.NONCE";
    @NotNull
    public static final String EXTRA_PERMISSIONS = "com.facebook.platform.extra.PERMISSIONS";
    @NotNull
    public static final String EXTRA_PROTOCOL_ACTION = "com.facebook.platform.protocol.PROTOCOL_ACTION";
    @NotNull
    public static final String EXTRA_PROTOCOL_BRIDGE_ARGS = "com.facebook.platform.protocol.BRIDGE_ARGS";
    @NotNull
    public static final String EXTRA_PROTOCOL_CALL_ID = "com.facebook.platform.protocol.CALL_ID";
    @NotNull
    public static final String EXTRA_PROTOCOL_METHOD_ARGS = "com.facebook.platform.protocol.METHOD_ARGS";
    @NotNull
    public static final String EXTRA_PROTOCOL_METHOD_RESULTS = "com.facebook.platform.protocol.RESULT_ARGS";
    @NotNull
    public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.platform.protocol.PROTOCOL_VERSION";
    @NotNull
    public static final String EXTRA_PROTOCOL_VERSIONS = "com.facebook.platform.extra.PROTOCOL_VERSIONS";
    @NotNull
    public static final String EXTRA_TOAST_DURATION_MS = "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS";
    @NotNull
    public static final String EXTRA_USER_ID = "com.facebook.platform.extra.USER_ID";
    @NotNull
    private static final String FACEBOOK_PROXY_AUTH_ACTIVITY = "com.facebook.katana.ProxyAuth";
    @NotNull
    public static final String FACEBOOK_PROXY_AUTH_APP_ID_KEY = "client_id";
    @NotNull
    public static final String FACEBOOK_PROXY_AUTH_E2E_KEY = "e2e";
    @NotNull
    public static final String FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY = "scope";
    @NotNull
    public static final String FACEBOOK_SDK_VERSION_KEY = "facebook_sdk_version";
    @NotNull
    private static final String FACEBOOK_TOKEN_REFRESH_ACTIVITY = "com.facebook.katana.platform.TokenRefreshService";
    @NotNull
    public static final String IMAGE_URL_KEY = "url";
    @NotNull
    public static final String IMAGE_USER_GENERATED_KEY = "user_generated";
    @NotNull
    public static final NativeProtocol INSTANCE;
    @NotNull
    public static final String INTENT_ACTION_PLATFORM_ACTIVITY = "com.facebook.platform.PLATFORM_ACTIVITY";
    @NotNull
    public static final String INTENT_ACTION_PLATFORM_SERVICE = "com.facebook.platform.PLATFORM_SERVICE";
    @NotNull
    private static final Integer[] KNOWN_PROTOCOL_VERSIONS;
    public static final int MESSAGE_GET_ACCESS_TOKEN_REPLY = 65537;
    public static final int MESSAGE_GET_ACCESS_TOKEN_REQUEST = 65536;
    public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY = 65545;
    public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST = 65544;
    public static final int MESSAGE_GET_INSTALL_DATA_REPLY = 65541;
    public static final int MESSAGE_GET_INSTALL_DATA_REQUEST = 65540;
    public static final int MESSAGE_GET_LIKE_STATUS_REPLY = 65543;
    public static final int MESSAGE_GET_LIKE_STATUS_REQUEST = 65542;
    public static final int MESSAGE_GET_LOGIN_STATUS_REPLY = 65547;
    public static final int MESSAGE_GET_LOGIN_STATUS_REQUEST = 65546;
    public static final int MESSAGE_GET_PROTOCOL_VERSIONS_REPLY = 65539;
    public static final int MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST = 65538;
    public static final int NO_PROTOCOL_AVAILABLE = -1;
    @NotNull
    public static final String OPEN_GRAPH_CREATE_OBJECT_KEY = "fbsdk:create_object";
    @NotNull
    private static final String PLATFORM_PROVIDER = ".provider.PlatformProvider";
    @NotNull
    private static final String PLATFORM_PROVIDER_VERSIONS = ".provider.PlatformProvider/versions";
    @NotNull
    private static final String PLATFORM_PROVIDER_VERSION_COLUMN = "version";
    public static final int PROTOCOL_VERSION_20121101 = 20121101;
    public static final int PROTOCOL_VERSION_20130502 = 20130502;
    public static final int PROTOCOL_VERSION_20130618 = 20130618;
    public static final int PROTOCOL_VERSION_20131024 = 20131024;
    public static final int PROTOCOL_VERSION_20131107 = 20131107;
    public static final int PROTOCOL_VERSION_20140204 = 20140204;
    public static final int PROTOCOL_VERSION_20140313 = 20140313;
    public static final int PROTOCOL_VERSION_20140324 = 20140324;
    public static final int PROTOCOL_VERSION_20140701 = 20140701;
    public static final int PROTOCOL_VERSION_20141001 = 20141001;
    public static final int PROTOCOL_VERSION_20141028 = 20141028;
    public static final int PROTOCOL_VERSION_20141107 = 20141107;
    public static final int PROTOCOL_VERSION_20141218 = 20141218;
    public static final int PROTOCOL_VERSION_20150401 = 20150401;
    public static final int PROTOCOL_VERSION_20150702 = 20150702;
    public static final int PROTOCOL_VERSION_20160327 = 20160327;
    public static final int PROTOCOL_VERSION_20161017 = 20161017;
    public static final int PROTOCOL_VERSION_20170213 = 20170213;
    public static final int PROTOCOL_VERSION_20170411 = 20170411;
    public static final int PROTOCOL_VERSION_20170417 = 20170417;
    public static final int PROTOCOL_VERSION_20171115 = 20171115;
    public static final int PROTOCOL_VERSION_20210906 = 20210906;
    @NotNull
    public static final String RESULT_ARGS_ACCESS_TOKEN = "access_token";
    @NotNull
    public static final String RESULT_ARGS_DIALOG_COMPLETE_KEY = "didComplete";
    @NotNull
    public static final String RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY = "completionGesture";
    @NotNull
    public static final String RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH = "expires_seconds_since_epoch";
    @NotNull
    public static final String RESULT_ARGS_GRAPH_DOMAIN = "graph_domain";
    @NotNull
    public static final String RESULT_ARGS_PERMISSIONS = "permissions";
    @NotNull
    public static final String RESULT_ARGS_SIGNED_REQUEST = "signed request";
    @NotNull
    public static final String STATUS_ERROR_CODE = "com.facebook.platform.status.ERROR_CODE";
    @NotNull
    public static final String STATUS_ERROR_DESCRIPTION = "com.facebook.platform.status.ERROR_DESCRIPTION";
    @NotNull
    public static final String STATUS_ERROR_JSON = "com.facebook.platform.status.ERROR_JSON";
    @NotNull
    public static final String STATUS_ERROR_SUBCODE = "com.facebook.platform.status.ERROR_SUBCODE";
    @NotNull
    public static final String STATUS_ERROR_TYPE = "com.facebook.platform.status.ERROR_TYPE";
    private static final String TAG;
    @NotNull
    public static final String WEB_DIALOG_ACTION = "action";
    @NotNull
    public static final String WEB_DIALOG_IS_FALLBACK = "is_fallback";
    @NotNull
    public static final String WEB_DIALOG_PARAMS = "params";
    @NotNull
    public static final String WEB_DIALOG_URL = "url";
    @NotNull
    private static final Map<String, List<NativeAppInfo>> actionToAppInfoMap;
    @NotNull
    private static final List<NativeAppInfo> effectCameraAppInfoList;
    @NotNull
    private static final List<NativeAppInfo> facebookAppInfoList;
    @NotNull
    private static final AtomicBoolean protocolVersionsAsyncUpdating;

    /* compiled from: NativeProtocol.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class ProtocolVersionQueryResult {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @Nullable
        private NativeAppInfo appInfo;
        private int protocolVersion;

        /* compiled from: NativeProtocol.kt */
        @Metadata
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final ProtocolVersionQueryResult create(@Nullable NativeAppInfo nativeAppInfo, int i) {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.appInfo = nativeAppInfo;
                protocolVersionQueryResult.protocolVersion = i;
                return protocolVersionQueryResult;
            }

            @NotNull
            public final ProtocolVersionQueryResult createEmpty() {
                ProtocolVersionQueryResult protocolVersionQueryResult = new ProtocolVersionQueryResult(null);
                protocolVersionQueryResult.protocolVersion = -1;
                return protocolVersionQueryResult;
            }
        }

        private ProtocolVersionQueryResult() {
        }

        public /* synthetic */ ProtocolVersionQueryResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static final ProtocolVersionQueryResult create(@Nullable NativeAppInfo nativeAppInfo, int i) {
            return Companion.create(nativeAppInfo, i);
        }

        @NotNull
        public static final ProtocolVersionQueryResult createEmpty() {
            return Companion.createEmpty();
        }

        @Nullable
        public final NativeAppInfo getAppInfo() {
            return this.appInfo;
        }

        public final int getProtocolVersion() {
            return this.protocolVersion;
        }
    }

    /* compiled from: NativeProtocol.kt */
    @Metadata
    /* renamed from: com.facebook.internal.NativeProtocol$a */
    /* loaded from: classes4.dex */
    public static final class C13447a extends NativeAppInfo {
        @Nullable
        /* renamed from: a */
        public Void m78710a() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public /* bridge */ /* synthetic */ String getLoginActivity() {
            return (String) m78710a();
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.facebook.arstudio.player";
        }
    }

    /* compiled from: NativeProtocol.kt */
    @Metadata
    /* renamed from: com.facebook.internal.NativeProtocol$b */
    /* loaded from: classes4.dex */
    public static final class C13448b extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getLoginActivity() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getResponseType() {
            return ServerProtocol.DIALOG_RESPONSE_TYPE_TOKEN_AND_SCOPES;
        }
    }

    /* compiled from: NativeProtocol.kt */
    @Metadata
    /* renamed from: com.facebook.internal.NativeProtocol$c */
    /* loaded from: classes4.dex */
    public static final class C13449c extends NativeAppInfo {
        /* renamed from: a */
        private final boolean m78709a() {
            if (FacebookSdk.getApplicationContext().getApplicationInfo().targetSdkVersion >= 30) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getLoginActivity() {
            return NativeProtocol.FACEBOOK_PROXY_AUTH_ACTIVITY;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.facebook.katana";
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public void onAvailableVersionsNullOrEmpty() {
            if (m78709a()) {
                Log.w(NativeProtocol.access$getTAG$p(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* compiled from: NativeProtocol.kt */
    @Metadata
    /* renamed from: com.facebook.internal.NativeProtocol$d */
    /* loaded from: classes4.dex */
    public static final class C13450d extends NativeAppInfo {
        @Nullable
        /* renamed from: a */
        public Void m78708a() {
            return null;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        public /* bridge */ /* synthetic */ String getLoginActivity() {
            return (String) m78708a();
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.facebook.orca";
        }
    }

    /* compiled from: NativeProtocol.kt */
    @Metadata
    /* renamed from: com.facebook.internal.NativeProtocol$e */
    /* loaded from: classes4.dex */
    public static final class C13451e extends NativeAppInfo {
        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getLoginActivity() {
            return NativeProtocol.FACEBOOK_PROXY_AUTH_ACTIVITY;
        }

        @Override // com.facebook.internal.NativeProtocol.NativeAppInfo
        @NotNull
        public String getPackage() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        NativeProtocol nativeProtocol = new NativeProtocol();
        INSTANCE = nativeProtocol;
        TAG = NativeProtocol.class.getName();
        facebookAppInfoList = nativeProtocol.buildFacebookAppList();
        effectCameraAppInfoList = nativeProtocol.buildEffectCameraAppInfoList();
        actionToAppInfoMap = nativeProtocol.buildActionToAppInfoMap();
        protocolVersionsAsyncUpdating = new AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new Integer[]{Integer.valueOf((int) PROTOCOL_VERSION_20210906), Integer.valueOf((int) PROTOCOL_VERSION_20171115), Integer.valueOf((int) PROTOCOL_VERSION_20170417), Integer.valueOf((int) PROTOCOL_VERSION_20170411), Integer.valueOf((int) PROTOCOL_VERSION_20170213), Integer.valueOf((int) PROTOCOL_VERSION_20161017), Integer.valueOf((int) PROTOCOL_VERSION_20160327), Integer.valueOf((int) PROTOCOL_VERSION_20150702), Integer.valueOf((int) PROTOCOL_VERSION_20150401), Integer.valueOf((int) PROTOCOL_VERSION_20141218), Integer.valueOf((int) PROTOCOL_VERSION_20141107), Integer.valueOf((int) PROTOCOL_VERSION_20141028), Integer.valueOf((int) PROTOCOL_VERSION_20141001), Integer.valueOf((int) PROTOCOL_VERSION_20140701), Integer.valueOf((int) PROTOCOL_VERSION_20140324), Integer.valueOf((int) PROTOCOL_VERSION_20140313), Integer.valueOf((int) PROTOCOL_VERSION_20140204), Integer.valueOf((int) PROTOCOL_VERSION_20131107), Integer.valueOf((int) PROTOCOL_VERSION_20131024), Integer.valueOf((int) PROTOCOL_VERSION_20130618), Integer.valueOf((int) PROTOCOL_VERSION_20130502), Integer.valueOf((int) PROTOCOL_VERSION_20121101)};
    }

    private NativeProtocol() {
    }

    public static final /* synthetic */ TreeSet access$fetchAllAvailableProtocolVersionsForAppInfo(NativeProtocol nativeProtocol, NativeAppInfo nativeAppInfo) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            return nativeProtocol.fetchAllAvailableProtocolVersionsForAppInfo(nativeAppInfo);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$p() {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    private final Map<String, List<NativeAppInfo>> buildActionToAppInfoMap() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C13450d());
            List<NativeAppInfo> list = facebookAppInfoList;
            hashMap.put(ACTION_OGACTIONPUBLISH_DIALOG, list);
            hashMap.put(ACTION_FEED_DIALOG, list);
            hashMap.put(ACTION_LIKE_DIALOG, list);
            hashMap.put(ACTION_APPINVITE_DIALOG, list);
            hashMap.put(ACTION_MESSAGE_DIALOG, arrayList);
            hashMap.put(ACTION_OGMESSAGEPUBLISH_DIALOG, arrayList);
            hashMap.put(ACTION_CAMERA_EFFECT, effectCameraAppInfoList);
            hashMap.put(ACTION_SHARE_STORY, list);
            return hashMap;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final List<NativeAppInfo> buildEffectCameraAppInfoList() {
        ArrayList m17172g;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m17172g = C37563v.m17172g(new C13447a());
                m17172g.addAll(buildFacebookAppList());
                return m17172g;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
        return null;
    }

    private final List<NativeAppInfo> buildFacebookAppList() {
        ArrayList m17172g;
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                m17172g = C37563v.m17172g(new C13449c(), new C13451e());
                return m17172g;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return null;
            }
        }
        return null;
    }

    private final Uri buildPlatformProviderVersionURI(NativeAppInfo nativeAppInfo) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(CONTENT_SCHEME + nativeAppInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final int computeLatestAvailableVersionFromVersionSpec(@Nullable TreeSet<Integer> treeSet, int i, @NotNull int[] versionSpec) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i2 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = descendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                i2 = Math.max(i2, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 != 0) {
                        return -1;
                    }
                    return Math.min(i2, i);
                }
            }
            return -1;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return 0;
        }
    }

    @Nullable
    public static final Bundle createBundleForException(@Nullable FacebookException facebookException) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || facebookException == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString(BRIDGE_ARG_ERROR_DESCRIPTION, facebookException.toString());
            if (facebookException instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", ERROR_USER_CANCELED);
            }
            return bundle;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @Nullable
    public static final Intent createInstagramIntent(@NotNull Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean z, boolean z2, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, @Nullable String str, boolean z3, boolean z4, boolean z5) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            C13448b c13448b = new C13448b();
            return validateActivityIntent(context, INSTANCE.createNativeAppIntent(c13448b, applicationId, permissions, e2e, z2, defaultAudience, clientState, authType, false, str, z3, LoginTargetApp.INSTAGRAM, z4, z5, "", null, null), c13448b);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    private final Intent createNativeAppIntent(NativeAppInfo nativeAppInfo, String str, Collection<String> collection, String str2, boolean z, DefaultAudience defaultAudience, String str3, String str4, boolean z2, String str5, boolean z3, LoginTargetApp loginTargetApp, boolean z4, boolean z5, String str6, String str7, String str8) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            String loginActivity = nativeAppInfo.getLoginActivity();
            if (loginActivity == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(nativeAppInfo.getPackage(), loginActivity).putExtra("client_id", str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            putExtra.putExtra(FACEBOOK_SDK_VERSION_KEY, FacebookSdk.getSdkVersion());
            if (!Utility.isNullOrEmpty(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!Utility.isNullOrEmpty(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE, nativeAppInfo.getResponseType());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra(ServerProtocol.DIALOG_PARAM_RETURN_SCOPES, "true");
            if (z) {
                putExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            putExtra.putExtra(ServerProtocol.DIALOG_PARAM_LEGACY_OVERRIDE, FacebookSdk.getGraphApiVersion());
            putExtra.putExtra(ServerProtocol.DIALOG_PARAM_AUTH_TYPE, str4);
            if (z2) {
                putExtra.putExtra(ServerProtocol.DIALOG_PARAM_FAIL_ON_LOGGED_OUT, true);
            }
            putExtra.putExtra(ServerProtocol.DIALOG_PARAM_MESSENGER_PAGE_ID, str5);
            putExtra.putExtra(ServerProtocol.DIALOG_PARAM_RESET_MESSENGER_STATE, z3);
            if (z4) {
                putExtra.putExtra(ServerProtocol.DIALOG_PARAM_FX_APP, loginTargetApp.toString());
            }
            if (z5) {
                putExtra.putExtra(ServerProtocol.DIALOG_PARAM_SKIP_DEDUPE, true);
            }
            return putExtra;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public static final Intent createPlatformActivityIntent(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable ProtocolVersionQueryResult protocolVersionQueryResult, @Nullable Bundle bundle) {
        NativeAppInfo appInfo;
        Intent validateActivityIntent;
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (protocolVersionQueryResult == null || (appInfo = protocolVersionQueryResult.getAppInfo()) == null || (validateActivityIntent = validateActivityIntent(context, new Intent().setAction(INTENT_ACTION_PLATFORM_ACTIVITY).setPackage(appInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), appInfo)) == null) {
                return null;
            }
            setupProtocolRequestIntent(validateActivityIntent, str, str2, protocolVersionQueryResult.getProtocolVersion(), bundle);
            return validateActivityIntent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @Nullable
    public static final Intent createPlatformServiceIntent(@NotNull Context context) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            for (NativeAppInfo nativeAppInfo : facebookAppInfoList) {
                Intent validateServiceIntent = validateServiceIntent(context, new Intent(INTENT_ACTION_PLATFORM_SERVICE).setPackage(nativeAppInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), nativeAppInfo);
                if (validateServiceIntent != null) {
                    return validateServiceIntent;
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @Nullable
    public static final Intent createProtocolResultIntent(@NotNull Intent requestIntent, @Nullable Bundle bundle, @Nullable FacebookException facebookException) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
            UUID callIdFromIntent = getCallIdFromIntent(requestIntent);
            if (callIdFromIntent == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra(EXTRA_PROTOCOL_VERSION, getProtocolVersionFromIntent(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", callIdFromIntent.toString());
            if (facebookException != null) {
                bundle2.putBundle("error", createBundleForException(facebookException));
            }
            intent.putExtra(EXTRA_PROTOCOL_BRIDGE_ARGS, bundle2);
            if (bundle != null) {
                intent.putExtra(EXTRA_PROTOCOL_METHOD_RESULTS, bundle);
            }
            return intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @NotNull
    public static final List<Intent> createProxyAuthIntents(@Nullable Context context, @NotNull String applicationId, @NotNull Collection<String> permissions, @NotNull String e2e, boolean z, boolean z2, @NotNull DefaultAudience defaultAudience, @NotNull String clientState, @NotNull String authType, boolean z3, @Nullable String str, boolean z4, boolean z5, boolean z6, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            ArrayList arrayList = new ArrayList();
            for (NativeAppInfo nativeAppInfo : facebookAppInfoList) {
                ArrayList arrayList2 = arrayList;
                Intent createNativeAppIntent = INSTANCE.createNativeAppIntent(nativeAppInfo, applicationId, permissions, e2e, z2, defaultAudience, clientState, authType, z3, str, z4, LoginTargetApp.FACEBOOK, z5, z6, str2, str3, str4);
                if (createNativeAppIntent != null) {
                    arrayList2.add(createNativeAppIntent);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    public static /* synthetic */ List createProxyAuthIntents$default(Context context, String str, Collection collection, String str2, boolean z, boolean z2, DefaultAudience defaultAudience, String str3, String str4, boolean z3, String str5, boolean z4, boolean z5, boolean z6, String str6, String str7, String str8, int i, Object obj) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            return createProxyAuthIntents(context, str, collection, str2, z, z2, defaultAudience, str3, str4, z3, str5, z4, z5, z6, str6, str7, (i & 65536) != 0 ? "S256" : str8);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x007d A[Catch: all -> 0x008a, TRY_ENTER, TryCatch #4 {all -> 0x008a, blocks: (B:107:0x000c, B:140:0x0089, B:139:0x0086, B:133:0x007d), top: B:149:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x005e A[EXC_TOP_SPLITTER, LOOP:0: B:145:0x005e->B:126:0x0064, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.TreeSet<java.lang.Integer> fetchAllAvailableProtocolVersionsForAppInfo(com.facebook.internal.NativeProtocol.NativeAppInfo r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r12)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L8a
            r2.<init>()     // Catch: java.lang.Throwable -> L8a
            android.content.Context r4 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> L8a
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L8a
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8a
            android.net.Uri r6 = r12.buildPlatformProviderVersionURI(r13)     // Catch: java.lang.Throwable -> L8a
            android.content.Context r4 = com.facebook.FacebookSdk.getApplicationContext()     // Catch: java.lang.Throwable -> L81
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L81
            java.lang.String r13 = r13.getPackage()     // Catch: java.lang.Throwable -> L81
            java.lang.String r8 = ".provider.PlatformProvider"
            java.lang.String r13 = kotlin.jvm.internal.Intrinsics.m17064q(r13, r8)     // Catch: java.lang.Throwable -> L81
            r8 = 0
            android.content.pm.ProviderInfo r13 = r4.resolveContentProvider(r13, r8)     // Catch: java.lang.RuntimeException -> L39 java.lang.Throwable -> L81
            goto L40
        L39:
            r13 = move-exception
            java.lang.String r4 = com.facebook.internal.NativeProtocol.TAG     // Catch: java.lang.Throwable -> L81
            android.util.Log.e(r4, r1, r13)     // Catch: java.lang.Throwable -> L81
            r13 = r3
        L40:
            if (r13 == 0) goto L79
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.IllegalArgumentException -> L4a java.lang.SecurityException -> L50 java.lang.NullPointerException -> L56 java.lang.Throwable -> L81
            goto L5c
        L4a:
            java.lang.String r13 = com.facebook.internal.NativeProtocol.TAG     // Catch: java.lang.Throwable -> L81
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L81
            goto L5b
        L50:
            java.lang.String r13 = com.facebook.internal.NativeProtocol.TAG     // Catch: java.lang.Throwable -> L81
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L81
            goto L5b
        L56:
            java.lang.String r13 = com.facebook.internal.NativeProtocol.TAG     // Catch: java.lang.Throwable -> L81
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L81
        L5b:
            r13 = r3
        L5c:
            if (r13 == 0) goto L7a
        L5e:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L7a
            int r1 = r13.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L74
            int r1 = r13.getInt(r1)     // Catch: java.lang.Throwable -> L74
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L74
            r2.add(r1)     // Catch: java.lang.Throwable -> L74
            goto L5e
        L74:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L83
        L79:
            r13 = r3
        L7a:
            if (r13 != 0) goto L7d
            goto L80
        L7d:
            r13.close()     // Catch: java.lang.Throwable -> L8a
        L80:
            return r2
        L81:
            r13 = move-exception
            r0 = r3
        L83:
            if (r0 != 0) goto L86
            goto L89
        L86:
            r0.close()     // Catch: java.lang.Throwable -> L8a
        L89:
            throw r13     // Catch: java.lang.Throwable -> L8a
        L8a:
            r13 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.NativeProtocol.fetchAllAvailableProtocolVersionsForAppInfo(com.facebook.internal.NativeProtocol$NativeAppInfo):java.util.TreeSet");
    }

    @Nullable
    public static final Bundle getBridgeArgumentsFromIntent(@NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
                return null;
            }
            return intent.getBundleExtra(EXTRA_PROTOCOL_BRIDGE_ARGS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @Nullable
    public static final UUID getCallIdFromIntent(@Nullable Intent intent) {
        String stringExtra;
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || intent == null) {
            return null;
        }
        try {
            if (isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
                Bundle bundleExtra = intent.getBundleExtra(EXTRA_PROTOCOL_BRIDGE_ARGS);
                if (bundleExtra != null) {
                    stringExtra = bundleExtra.getString("action_id");
                } else {
                    stringExtra = null;
                }
            } else {
                stringExtra = intent.getStringExtra(EXTRA_PROTOCOL_CALL_ID);
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @Nullable
    public static final Bundle getErrorDataFromResultIntent(@NotNull Intent resultIntent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            if (!isErrorResult(resultIntent)) {
                return null;
            }
            Bundle bridgeArgumentsFromIntent = getBridgeArgumentsFromIntent(resultIntent);
            if (bridgeArgumentsFromIntent != null) {
                return bridgeArgumentsFromIntent.getBundle("error");
            }
            return resultIntent.getExtras();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @Nullable
    public static final FacebookException getExceptionFromErrorData(@Nullable Bundle bundle) {
        boolean m16615y;
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString(STATUS_ERROR_TYPE);
            }
            String string2 = bundle.getString(BRIDGE_ARG_ERROR_DESCRIPTION);
            if (string2 == null) {
                string2 = bundle.getString(STATUS_ERROR_DESCRIPTION);
            }
            if (string != null) {
                m16615y = StringsJVM.m16615y(string, ERROR_USER_CANCELED, true);
                if (m16615y) {
                    return new FacebookOperationCanceledException(string2);
                }
            }
            return new FacebookException(string2);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @NotNull
    public static final ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAction(@NotNull String action, @NotNull int[] versionSpec) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            List<NativeAppInfo> list = actionToAppInfoMap.get(action);
            if (list == null) {
                list = C37563v.m17166m();
            }
            return INSTANCE.getLatestAvailableProtocolVersionForAppInfoList(list, versionSpec);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    private final ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAppInfoList(List<? extends NativeAppInfo> list, int[] iArr) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            updateAllAvailableProtocolVersionsAsync();
            if (list == null) {
                return ProtocolVersionQueryResult.Companion.createEmpty();
            }
            for (NativeAppInfo nativeAppInfo : list) {
                int computeLatestAvailableVersionFromVersionSpec = computeLatestAvailableVersionFromVersionSpec(nativeAppInfo.getAvailableVersions(), getLatestKnownVersion(), iArr);
                if (computeLatestAvailableVersionFromVersionSpec != -1) {
                    return ProtocolVersionQueryResult.Companion.create(nativeAppInfo, computeLatestAvailableVersionFromVersionSpec);
                }
            }
            return ProtocolVersionQueryResult.Companion.createEmpty();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public static final int getLatestAvailableProtocolVersionForService(int i) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return 0;
        }
        try {
            return INSTANCE.getLatestAvailableProtocolVersionForAppInfoList(facebookAppInfoList, new int[]{i}).getProtocolVersion();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return 0;
        }
    }

    public static final int getLatestKnownVersion() {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return 0;
        }
        try {
            return KNOWN_PROTOCOL_VERSIONS[0].intValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return 0;
        }
    }

    @Nullable
    public static final Bundle getMethodArgumentsFromIntent(@NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra(EXTRA_PROTOCOL_METHOD_ARGS);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    public static final int getProtocolVersionFromIntent(@NotNull Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra(EXTRA_PROTOCOL_VERSION, 0);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return 0;
        }
    }

    @Nullable
    public static final Bundle getSuccessResultsFromIntent(@NotNull Intent resultIntent) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            int protocolVersionFromIntent = getProtocolVersionFromIntent(resultIntent);
            Bundle extras = resultIntent.getExtras();
            if (isVersionCompatibleWithBucketedIntent(protocolVersionFromIntent) && extras != null) {
                return extras.getBundle(EXTRA_PROTOCOL_METHOD_RESULTS);
            }
            return extras;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    public static final boolean isErrorResult(@NotNull Intent resultIntent) {
        Boolean valueOf;
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            Bundle bridgeArgumentsFromIntent = getBridgeArgumentsFromIntent(resultIntent);
            if (bridgeArgumentsFromIntent == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(bridgeArgumentsFromIntent.containsKey("error"));
            }
            if (valueOf == null) {
                return resultIntent.hasExtra(STATUS_ERROR_TYPE);
            }
            return valueOf.booleanValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return false;
        }
    }

    public static final boolean isVersionCompatibleWithBucketedIntent(int i) {
        boolean m17338N;
        if (!CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            try {
                m17338N = _Arrays.m17338N(KNOWN_PROTOCOL_VERSIONS, Integer.valueOf(i));
                if (!m17338N || i < 20140701) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
                return false;
            }
        }
        return false;
    }

    public static final void setupProtocolRequestIntent(@NotNull Intent intent, @Nullable String str, @Nullable String str2, int i, @Nullable Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String applicationId = FacebookSdk.getApplicationId();
            String applicationName = FacebookSdk.getApplicationName();
            intent.putExtra(EXTRA_PROTOCOL_VERSION, i).putExtra(EXTRA_PROTOCOL_ACTION, str2).putExtra(EXTRA_APPLICATION_ID, applicationId);
            if (isVersionCompatibleWithBucketedIntent(i)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("action_id", str);
                Utility.putNonEmptyString(bundle2, "app_name", applicationName);
                intent.putExtra(EXTRA_PROTOCOL_BRIDGE_ARGS, bundle2);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                intent.putExtra(EXTRA_PROTOCOL_METHOD_ARGS, bundle);
                return;
            }
            intent.putExtra(EXTRA_PROTOCOL_CALL_ID, str);
            if (!Utility.isNullOrEmpty(applicationName)) {
                intent.putExtra(EXTRA_APPLICATION_NAME, applicationName);
            }
            if (bundle != null) {
                intent.putExtras(bundle);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
        }
    }

    public static final void updateAllAvailableProtocolVersionsAsync() {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return;
        }
        try {
            if (!protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
                return;
            }
            FacebookSdk.getExecutor().execute(new Runnable() { // from class: com.facebook.internal.p
                @Override // java.lang.Runnable
                public final void run() {
                    NativeProtocol.m110140updateAllAvailableProtocolVersionsAsync$lambda1();
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
        }
    }

    /* renamed from: updateAllAvailableProtocolVersionsAsync$lambda-1 */
    public static final void m110140updateAllAvailableProtocolVersionsAsync$lambda1() {
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return;
        }
        try {
            for (NativeAppInfo nativeAppInfo : facebookAppInfoList) {
                nativeAppInfo.fetchAvailableVersions(true);
            }
            protocolVersionsAsyncUpdating.set(false);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
        }
    }

    @Nullable
    public static final Intent validateActivityIntent(@NotNull Context context, @Nullable Intent intent, @Nullable NativeAppInfo nativeAppInfo) {
        ResolveInfo resolveActivity;
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            FacebookSignatureValidator facebookSignatureValidator = FacebookSignatureValidator.INSTANCE;
            String str = resolveActivity.activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
            if (!FacebookSignatureValidator.validateSignature(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    @Nullable
    public static final Intent validateServiceIntent(@NotNull Context context, @Nullable Intent intent, @Nullable NativeAppInfo nativeAppInfo) {
        ResolveInfo resolveService;
        if (CrashShieldHandler.isObjectCrashing(NativeProtocol.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            FacebookSignatureValidator facebookSignatureValidator = FacebookSignatureValidator.INSTANCE;
            String str = resolveService.serviceInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
            if (!FacebookSignatureValidator.validateSignature(context, str)) {
                return null;
            }
            return intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, NativeProtocol.class);
            return null;
        }
    }

    /* compiled from: NativeProtocol.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static abstract class NativeAppInfo {
        @Nullable
        private TreeSet<Integer> availableVersions;

        /* JADX WARN: Code restructure failed: missing block: B:66:0x0019, code lost:
            if (kotlin.jvm.internal.Intrinsics.m17075f(r2, java.lang.Boolean.FALSE) == false) goto L3;
         */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0033 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:60:0x0003, B:65:0x0013, B:68:0x0023, B:70:0x0027, B:76:0x0033, B:64:0x000b, B:67:0x001b), top: B:82:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void fetchAvailableVersions(boolean r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                if (r2 != 0) goto L1b
                java.util.TreeSet<java.lang.Integer> r2 = r1.availableVersions     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L1b
                if (r2 != 0) goto Lb
                r2 = 0
                goto L13
            Lb:
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            L13:
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L38
                boolean r2 = kotlin.jvm.internal.Intrinsics.m17075f(r2, r0)     // Catch: java.lang.Throwable -> L38
                if (r2 != 0) goto L23
            L1b:
                com.facebook.internal.NativeProtocol r2 = com.facebook.internal.NativeProtocol.INSTANCE     // Catch: java.lang.Throwable -> L38
                java.util.TreeSet r2 = com.facebook.internal.NativeProtocol.access$fetchAllAvailableProtocolVersionsForAppInfo(r2, r1)     // Catch: java.lang.Throwable -> L38
                r1.availableVersions = r2     // Catch: java.lang.Throwable -> L38
            L23:
                java.util.TreeSet<java.lang.Integer> r2 = r1.availableVersions     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L30
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L38
                if (r2 == 0) goto L2e
                goto L30
            L2e:
                r2 = 0
                goto L31
            L30:
                r2 = 1
            L31:
                if (r2 == 0) goto L36
                r1.onAvailableVersionsNullOrEmpty()     // Catch: java.lang.Throwable -> L38
            L36:
                monitor-exit(r1)
                return
            L38:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.NativeProtocol.NativeAppInfo.fetchAvailableVersions(boolean):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0016, code lost:
            if (kotlin.jvm.internal.Intrinsics.m17075f(r0, java.lang.Boolean.FALSE) == false) goto L11;
         */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.TreeSet<java.lang.Integer> getAvailableVersions() {
            /*
                r2 = this;
                java.util.TreeSet<java.lang.Integer> r0 = r2.availableVersions
                if (r0 == 0) goto L18
                if (r0 != 0) goto L8
                r0 = 0
                goto L10
            L8:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L10:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = kotlin.jvm.internal.Intrinsics.m17075f(r0, r1)
                if (r0 != 0) goto L1c
            L18:
                r0 = 0
                r2.fetchAvailableVersions(r0)
            L1c:
                java.util.TreeSet<java.lang.Integer> r0 = r2.availableVersions
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.NativeProtocol.NativeAppInfo.getAvailableVersions():java.util.TreeSet");
        }

        @Nullable
        public abstract String getLoginActivity();

        @NotNull
        public abstract String getPackage();

        @NotNull
        public String getResponseType() {
            return ServerProtocol.DIALOG_RESPONSE_TYPE_ID_TOKEN_AND_SIGNED_REQUEST;
        }

        public void onAvailableVersionsNullOrEmpty() {
        }
    }
}
