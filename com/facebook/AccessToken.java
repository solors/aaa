package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.LegacyTokenHelper;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AccessToken.kt */
@Metadata
/* loaded from: classes3.dex */
public final class AccessToken implements Parcelable {
    @NotNull
    public static final String ACCESS_TOKEN_KEY = "access_token";
    @NotNull
    private static final String APPLICATION_ID_KEY = "application_id";
    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR;
    private static final int CURRENT_JSON_FORMAT = 1;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";
    @NotNull
    private static final String DECLINED_PERMISSIONS_KEY = "declined_permissions";
    @NotNull
    private static final AccessTokenSource DEFAULT_ACCESS_TOKEN_SOURCE;
    @NotNull
    private static final Date DEFAULT_EXPIRATION_TIME;
    @NotNull
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";
    @NotNull
    private static final Date DEFAULT_LAST_REFRESH_TIME;
    @NotNull
    private static final String EXPIRED_PERMISSIONS_KEY = "expired_permissions";
    @NotNull
    private static final String EXPIRES_AT_KEY = "expires_at";
    @NotNull
    public static final String EXPIRES_IN_KEY = "expires_in";
    @NotNull
    public static final String GRAPH_DOMAIN = "graph_domain";
    @NotNull
    private static final String LAST_REFRESH_KEY = "last_refresh";
    @NotNull
    private static final Date MAX_DATE;
    @NotNull
    private static final String PERMISSIONS_KEY = "permissions";
    @NotNull
    private static final String SOURCE_KEY = "source";
    @NotNull
    private static final String TOKEN_KEY = "token";
    @NotNull
    public static final String USER_ID_KEY = "user_id";
    @NotNull
    private static final String VERSION_KEY = "version";
    @NotNull
    private final String applicationId;
    @NotNull
    private final Date dataAccessExpirationTime;
    @NotNull
    private final Set<String> declinedPermissions;
    @NotNull
    private final Set<String> expiredPermissions;
    @NotNull
    private final Date expires;
    @Nullable
    private final String graphDomain;
    @NotNull
    private final Date lastRefresh;
    @NotNull
    private final Set<String> permissions;
    @NotNull
    private final AccessTokenSource source;
    @NotNull
    private final String token;
    @NotNull
    private final String userId;

    /* compiled from: AccessToken.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public interface AccessTokenCreationCallback {
        void onError(@Nullable FacebookException facebookException);

        void onSuccess(@Nullable AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public interface AccessTokenRefreshCallback {
        void OnTokenRefreshFailed(@Nullable FacebookException facebookException);

        void OnTokenRefreshed(@Nullable AccessToken accessToken);
    }

    /* compiled from: AccessToken.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccessToken createFromBundle(List<String> list, Bundle bundle, AccessTokenSource accessTokenSource, Date date, String str) {
            Date bundleLongAsDate;
            String string;
            String string2 = bundle.getString("access_token");
            if (string2 == null || (bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, date)) == null || (string = bundle.getString("user_id")) == null) {
                return null;
            }
            return new AccessToken(string2, str, string, list, null, null, accessTokenSource, bundleLongAsDate, new Date(), Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L)), null, 1024, null);
        }

        @NotNull
        public final AccessToken createExpired$facebook_core_release(@NotNull AccessToken current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        @NotNull
        public final AccessToken createFromJSONObject$facebook_core_release(@NotNull JSONObject jsonObject) throws JSONException {
            Collection jsonArrayToStringList;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") <= 1) {
                String token = jsonObject.getString("token");
                Date date = new Date(jsonObject.getLong(AccessToken.EXPIRES_AT_KEY));
                JSONArray permissionsArray = jsonObject.getJSONArray("permissions");
                JSONArray declinedPermissionsArray = jsonObject.getJSONArray(AccessToken.DECLINED_PERMISSIONS_KEY);
                JSONArray optJSONArray = jsonObject.optJSONArray(AccessToken.EXPIRED_PERMISSIONS_KEY);
                Date date2 = new Date(jsonObject.getLong(AccessToken.LAST_REFRESH_KEY));
                String string = jsonObject.getString("source");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(SOURCE_KEY)");
                AccessTokenSource valueOf = AccessTokenSource.valueOf(string);
                String applicationId = jsonObject.getString(AccessToken.APPLICATION_ID_KEY);
                String userId = jsonObject.getString("user_id");
                Date date3 = new Date(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L));
                String optString = jsonObject.optString("graph_domain", null);
                Intrinsics.checkNotNullExpressionValue(token, "token");
                Intrinsics.checkNotNullExpressionValue(applicationId, "applicationId");
                Intrinsics.checkNotNullExpressionValue(userId, "userId");
                Utility utility = Utility.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(permissionsArray, "permissionsArray");
                List<String> jsonArrayToStringList2 = Utility.jsonArrayToStringList(permissionsArray);
                Intrinsics.checkNotNullExpressionValue(declinedPermissionsArray, "declinedPermissionsArray");
                List<String> jsonArrayToStringList3 = Utility.jsonArrayToStringList(declinedPermissionsArray);
                if (optJSONArray == null) {
                    jsonArrayToStringList = new ArrayList();
                } else {
                    jsonArrayToStringList = Utility.jsonArrayToStringList(optJSONArray);
                }
                return new AccessToken(token, applicationId, userId, jsonArrayToStringList2, jsonArrayToStringList3, jsonArrayToStringList, valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        @Nullable
        public final AccessToken createFromLegacyCache$facebook_core_release(@NotNull Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            List<String> permissionsFromBundle$facebook_core_release = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release2 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.DECLINED_PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release3 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY);
            LegacyTokenHelper.Companion companion = LegacyTokenHelper.Companion;
            String applicationId = companion.getApplicationId(bundle);
            if (Utility.isNullOrEmpty(applicationId)) {
                applicationId = FacebookSdk.getApplicationId();
            }
            String str = applicationId;
            String token = companion.getToken(bundle);
            if (token == null) {
                return null;
            }
            JSONObject awaitGetGraphMeRequestWithCache = Utility.awaitGetGraphMeRequestWithCache(token);
            if (awaitGetGraphMeRequestWithCache == null) {
                string = null;
            } else {
                try {
                    string = awaitGetGraphMeRequestWithCache.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(token, str, string, permissionsFromBundle$facebook_core_release, permissionsFromBundle$facebook_core_release2, permissionsFromBundle$facebook_core_release3, companion.getSource(bundle), companion.getExpirationDate(bundle), companion.getLastRefreshDate(bundle), null, null, 1024, null);
        }

        public final void createFromNativeLinkingIntent(@NotNull Intent intent, @NotNull final String applicationId, @NotNull final AccessTokenCreationCallback accessTokenCallback) {
            boolean z;
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(accessTokenCallback, "accessTokenCallback");
            if (intent.getExtras() == null) {
                accessTokenCallback.onError(new FacebookException("No extras found on intent"));
                return;
            }
            final Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString("access_token");
            if (string != null) {
                boolean z2 = true;
                if (string.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String string2 = bundle.getString("user_id");
                    if (string2 != null) {
                        if (string2.length() != 0) {
                            z2 = false;
                        }
                        if (!z2) {
                            accessTokenCallback.onSuccess(createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
                            return;
                        }
                    }
                    Utility utility = Utility.INSTANCE;
                    Utility.getGraphMeRequestWithCacheAsync(string, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.AccessToken$Companion$createFromNativeLinkingIntent$1
                        @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                        public void onFailure(@Nullable FacebookException facebookException) {
                            accessTokenCallback.onError(facebookException);
                        }

                        @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                        public void onSuccess(@Nullable JSONObject jSONObject) {
                            String string3;
                            AccessToken createFromBundle;
                            if (jSONObject == null) {
                                string3 = null;
                            } else {
                                try {
                                    string3 = jSONObject.getString("id");
                                } catch (Exception unused) {
                                    accessTokenCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
                                    return;
                                }
                            }
                            if (string3 != null) {
                                bundle.putString("user_id", string3);
                                AccessToken.AccessTokenCreationCallback accessTokenCreationCallback = accessTokenCallback;
                                createFromBundle = AccessToken.Companion.createFromBundle(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId);
                                accessTokenCreationCallback.onSuccess(createFromBundle);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    });
                    return;
                }
            }
            accessTokenCallback.onError(new FacebookException("No access token found on intent"));
        }

        @SuppressLint({"FieldGetter"})
        @Nullable
        public final AccessToken createFromRefresh$facebook_core_release(@NotNull AccessToken current, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_WEB && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
                throw new FacebookException(Intrinsics.m17064q("Invalid token source: ", current.getSource()));
            }
            Utility utility = Utility.INSTANCE;
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, AccessToken.EXPIRES_IN_KEY, new Date(0L));
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            String string2 = bundle.getString("graph_domain");
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            if (Utility.isNullOrEmpty(string)) {
                return null;
            }
            return new AccessToken(string, current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), bundleLongAsDate, new Date(), bundleLongAsDate2, string2);
        }

        public final void expireCurrentAccessToken() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            if (currentAccessToken != null) {
                setCurrentAccessToken(createExpired$facebook_core_release(currentAccessToken));
            }
        }

        @Nullable
        public final AccessToken getCurrentAccessToken() {
            return AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
        }

        @NotNull
        public final List<String> getPermissionsFromBundle$facebook_core_release(@NotNull Bundle bundle, @Nullable String str) {
            List<String> m17166m;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            Intrinsics.checkNotNullExpressionValue(unmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return unmodifiableList;
        }

        public final boolean isCurrentAccessTokenActive() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            if (currentAccessToken != null && !currentAccessToken.isExpired()) {
                return true;
            }
            return false;
        }

        public final boolean isDataAccessActive() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            if (currentAccessToken != null && !currentAccessToken.isDataAccessExpired()) {
                return true;
            }
            return false;
        }

        public final boolean isLoggedInWithInstagram() {
            AccessToken currentAccessToken = AccessTokenManager.Companion.getInstance().getCurrentAccessToken();
            if (currentAccessToken != null && !currentAccessToken.isExpired() && currentAccessToken.isInstagramToken()) {
                return true;
            }
            return false;
        }

        public final void refreshCurrentAccessTokenAsync() {
            AccessTokenManager.Companion.getInstance().refreshCurrentAccessToken(null);
        }

        public final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
            AccessTokenManager.Companion.getInstance().setCurrentAccessToken(accessToken);
        }

        public final void refreshCurrentAccessTokenAsync(@Nullable AccessTokenRefreshCallback accessTokenRefreshCallback) {
            AccessTokenManager.Companion.getInstance().refreshCurrentAccessToken(accessTokenRefreshCallback);
        }
    }

    /* compiled from: AccessToken.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessTokenSource.valuesCustom().length];
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        MAX_DATE = date;
        DEFAULT_EXPIRATION_TIME = date;
        DEFAULT_LAST_REFRESH_TIME = new Date();
        DEFAULT_ACCESS_TOKEN_SOURCE = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new Parcelable.Creator<AccessToken>() { // from class: com.facebook.AccessToken$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public AccessToken createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new AccessToken(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public AccessToken[] newArray(int i) {
                return new AccessToken[i];
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccessToken(@NotNull String accessToken, @NotNull String applicationId, @NotNull String userId, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        this(accessToken, applicationId, userId, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
    }

    private final void appendPermissions(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append(C21114v8.C21123i.f54137d);
        sb2.append(TextUtils.join(", ", this.permissions));
        sb2.append(C21114v8.C21123i.f54139e);
    }

    private final AccessTokenSource convertTokenSourceForGraphDomain(AccessTokenSource accessTokenSource, String str) {
        if (str != null && str.equals(FacebookSdk.INSTAGRAM)) {
            int i = WhenMappings.$EnumSwitchMapping$0[accessTokenSource.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return AccessTokenSource.INSTAGRAM_WEB_VIEW;
                    }
                    return accessTokenSource;
                }
                return AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
            return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
        }
        return accessTokenSource;
    }

    public static final void createFromNativeLinkingIntent(@NotNull Intent intent, @NotNull String str, @NotNull AccessTokenCreationCallback accessTokenCreationCallback) {
        Companion.createFromNativeLinkingIntent(intent, str, accessTokenCreationCallback);
    }

    public static final void expireCurrentAccessToken() {
        Companion.expireCurrentAccessToken();
    }

    @Nullable
    public static final AccessToken getCurrentAccessToken() {
        return Companion.getCurrentAccessToken();
    }

    public static final boolean isCurrentAccessTokenActive() {
        return Companion.isCurrentAccessTokenActive();
    }

    public static final boolean isDataAccessActive() {
        return Companion.isDataAccessActive();
    }

    public static final boolean isLoggedInWithInstagram() {
        return Companion.isLoggedInWithInstagram();
    }

    public static final void refreshCurrentAccessTokenAsync() {
        Companion.refreshCurrentAccessTokenAsync();
    }

    public static final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
        Companion.setCurrentAccessToken(accessToken);
    }

    private final String tokenToString() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
            return this.token;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        boolean m17075f;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (Intrinsics.m17075f(this.expires, accessToken.expires) && Intrinsics.m17075f(this.permissions, accessToken.permissions) && Intrinsics.m17075f(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.m17075f(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.m17075f(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.m17075f(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.m17075f(this.applicationId, accessToken.applicationId) && Intrinsics.m17075f(this.userId, accessToken.userId) && Intrinsics.m17075f(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null) {
                if (str2 == null) {
                    m17075f = true;
                } else {
                    m17075f = false;
                }
            } else {
                m17075f = Intrinsics.m17075f(str, str2);
            }
            if (m17075f) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    @NotNull
    public final Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    @NotNull
    public final Set<String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    @NotNull
    public final Date getExpires() {
        return this.expires;
    }

    @Nullable
    public final String getGraphDomain() {
        return this.graphDomain;
    }

    @NotNull
    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    @NotNull
    public final Set<String> getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final AccessTokenSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final boolean isDataAccessExpired() {
        return new Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isExpired() {
        return new Date().after(this.expires);
    }

    public final boolean isInstagramToken() {
        String str = this.graphDomain;
        if (str != null && str.equals(FacebookSdk.INSTAGRAM)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put(EXPIRES_AT_KEY, this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put(DECLINED_PERMISSIONS_KEY, new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put(EXPIRED_PERMISSIONS_KEY, new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put(LAST_REFRESH_KEY, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(APPLICATION_ID_KEY, this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(tokenToString());
        appendPermissions(sb2);
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return sb3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & 1024) != 0 ? DEFAULT_GRAPH_DOMAIN : str4);
    }

    public static final void refreshCurrentAccessTokenAsync(@Nullable AccessTokenRefreshCallback accessTokenRefreshCallback) {
        Companion.refreshCurrentAccessTokenAsync(accessTokenRefreshCallback);
    }

    public AccessToken(@NotNull String accessToken, @NotNull String applicationId, @NotNull String userId, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Validate.notEmpty(accessToken, SDKConstants.PARAM_ACCESS_TOKEN);
        Validate.notEmpty(applicationId, "applicationId");
        Validate.notEmpty(userId, "userId");
        this.expires = date == null ? DEFAULT_EXPIRATION_TIME : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.permissions = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = unmodifiableSet3;
        this.token = accessToken;
        this.source = convertTokenSourceForGraphDomain(accessTokenSource == null ? DEFAULT_ACCESS_TOKEN_SOURCE : accessTokenSource, str);
        this.lastRefresh = date2 == null ? DEFAULT_LAST_REFRESH_TIME : date2;
        this.applicationId = applicationId;
        this.userId = userId;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? DEFAULT_EXPIRATION_TIME : date3;
        this.graphDomain = str == null ? DEFAULT_GRAPH_DOMAIN : str;
    }

    public AccessToken(@NotNull Parcel parcel) {
        AccessTokenSource accessTokenSource;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = unmodifiableSet3;
        this.token = Validate.notNullOrEmpty(parcel.readString(), "token");
        String readString = parcel.readString();
        if (readString != null) {
            accessTokenSource = AccessTokenSource.valueOf(readString);
        } else {
            accessTokenSource = DEFAULT_ACCESS_TOKEN_SOURCE;
        }
        this.source = accessTokenSource;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
        this.userId = Validate.notNullOrEmpty(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
