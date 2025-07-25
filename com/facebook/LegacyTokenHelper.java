package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.internal.Logger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LegacyTokenHelper.kt */
@Metadata
/* loaded from: classes3.dex */
public final class LegacyTokenHelper {
    @NotNull
    public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
    @NotNull
    public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
    @NotNull
    public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    @NotNull
    public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
    @NotNull
    public static final String EXPIRED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.ExpiredPermissions";
    private static final long INVALID_BUNDLE_MILLISECONDS = Long.MIN_VALUE;
    @NotNull
    private static final String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
    @NotNull
    private static final String JSON_VALUE = "value";
    @NotNull
    private static final String JSON_VALUE_ENUM_TYPE = "enumType";
    @NotNull
    private static final String JSON_VALUE_TYPE = "valueType";
    @NotNull
    public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
    @NotNull
    public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
    @NotNull
    public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
    @NotNull
    public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
    @NotNull
    private static final String TYPE_BOOLEAN = "bool";
    @NotNull
    private static final String TYPE_BOOLEAN_ARRAY = "bool[]";
    @NotNull
    private static final String TYPE_BYTE = "byte";
    @NotNull
    private static final String TYPE_BYTE_ARRAY = "byte[]";
    @NotNull
    private static final String TYPE_CHAR = "char";
    @NotNull
    private static final String TYPE_CHAR_ARRAY = "char[]";
    @NotNull
    private static final String TYPE_DOUBLE = "double";
    @NotNull
    private static final String TYPE_DOUBLE_ARRAY = "double[]";
    @NotNull
    private static final String TYPE_ENUM = "enum";
    @NotNull
    private static final String TYPE_FLOAT = "float";
    @NotNull
    private static final String TYPE_FLOAT_ARRAY = "float[]";
    @NotNull
    private static final String TYPE_INTEGER = "int";
    @NotNull
    private static final String TYPE_INTEGER_ARRAY = "int[]";
    @NotNull
    private static final String TYPE_LONG = "long";
    @NotNull
    private static final String TYPE_LONG_ARRAY = "long[]";
    @NotNull
    private static final String TYPE_SHORT = "short";
    @NotNull
    private static final String TYPE_SHORT_ARRAY = "short[]";
    @NotNull
    private static final String TYPE_STRING = "string";
    @NotNull
    private static final String TYPE_STRING_LIST = "stringList";
    @NotNull
    private final SharedPreferences cache;
    @NotNull
    private final String cacheKey;
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = LegacyTokenHelper.class.getSimpleName();

    /* compiled from: LegacyTokenHelper.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Date getDate(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        private final void putDate(Bundle bundle, String str, Date date) {
            bundle.putLong(str, date.getTime());
        }

        @Nullable
        public final String getApplicationId(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.APPLICATION_ID_KEY);
        }

        @Nullable
        public final Date getExpirationDate(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        public final long getExpirationMilliseconds(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @Nullable
        public final Date getLastRefreshDate(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return getDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        public final long getLastRefreshMilliseconds(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @Nullable
        public final Set<String> getPermissions(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY);
            if (stringArrayList == null) {
                return null;
            }
            return new HashSet(stringArrayList);
        }

        @Nullable
        public final AccessTokenSource getSource(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (bundle.containsKey(LegacyTokenHelper.TOKEN_SOURCE_KEY)) {
                return (AccessTokenSource) bundle.getSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY);
            }
            if (bundle.getBoolean(LegacyTokenHelper.IS_SSO_KEY)) {
                return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
            }
            return AccessTokenSource.WEB_VIEW;
        }

        @Nullable
        public final String getToken(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(LegacyTokenHelper.TOKEN_KEY);
        }

        public final boolean hasTokenInformation(@Nullable Bundle bundle) {
            String string;
            boolean z;
            if (bundle == null || (string = bundle.getString(LegacyTokenHelper.TOKEN_KEY)) == null) {
                return false;
            }
            if (string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, 0L) == 0) {
                return false;
            }
            return true;
        }

        public final void putApplicationId(@NotNull Bundle bundle, @Nullable String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putString(LegacyTokenHelper.APPLICATION_ID_KEY, str);
        }

        public final void putDeclinedPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.DECLINED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        public final void putExpirationDate(@NotNull Bundle bundle, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            putDate(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY, value);
        }

        public final void putExpirationMilliseconds(@NotNull Bundle bundle, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, j);
        }

        public final void putExpiredPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        public final void putLastRefreshDate(@NotNull Bundle bundle, @NotNull Date value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            putDate(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY, value);
        }

        public final void putLastRefreshMilliseconds(@NotNull Bundle bundle, long j) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY, j);
        }

        public final void putPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY, new ArrayList<>(value));
        }

        public final void putSource(@NotNull Bundle bundle, @NotNull AccessTokenSource value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY, value);
        }

        public final void putToken(@NotNull Bundle bundle, @NotNull String value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(LegacyTokenHelper.TOKEN_KEY, value);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyTokenHelper(@NotNull Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void deserializeKey(String str, Bundle bundle) throws JSONException {
        String str2;
        String string;
        String string2 = this.cache.getString(str, JsonUtils.EMPTY_JSON);
        if (string2 != null) {
            JSONObject jSONObject = new JSONObject(string2);
            String string3 = jSONObject.getString(JSON_VALUE_TYPE);
            if (string3 != null) {
                int i = 0;
                switch (string3.hashCode()) {
                    case -1573317553:
                        if (string3.equals(TYPE_STRING_LIST)) {
                            JSONArray jSONArray = jSONObject.getJSONArray("value");
                            int length = jSONArray.length();
                            ArrayList<String> arrayList = new ArrayList<>(length);
                            if (length > 0) {
                                while (true) {
                                    int i2 = i + 1;
                                    Object obj = jSONArray.get(i);
                                    if (obj == JSONObject.NULL) {
                                        str2 = null;
                                    } else if (obj != null) {
                                        str2 = (String) obj;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    arrayList.add(i, str2);
                                    if (i2 < length) {
                                        i = i2;
                                    }
                                }
                            }
                            bundle.putStringArrayList(str, arrayList);
                            return;
                        }
                        return;
                    case -1383386164:
                        if (string3.equals(TYPE_BOOLEAN_ARRAY)) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                            int length2 = jSONArray2.length();
                            boolean[] zArr = new boolean[length2];
                            int i3 = length2 - 1;
                            if (i3 >= 0) {
                                while (true) {
                                    int i4 = i + 1;
                                    zArr[i] = jSONArray2.getBoolean(i);
                                    if (i4 <= i3) {
                                        i = i4;
                                    }
                                }
                            }
                            bundle.putBooleanArray(str, zArr);
                            return;
                        }
                        return;
                    case -1374008726:
                        if (string3.equals(TYPE_BYTE_ARRAY)) {
                            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                            int length3 = jSONArray3.length();
                            byte[] bArr = new byte[length3];
                            int i5 = length3 - 1;
                            if (i5 >= 0) {
                                while (true) {
                                    int i6 = i + 1;
                                    bArr[i] = (byte) jSONArray3.getInt(i);
                                    if (i6 <= i5) {
                                        i = i6;
                                    }
                                }
                            }
                            bundle.putByteArray(str, bArr);
                            return;
                        }
                        return;
                    case -1361632968:
                        if (string3.equals(TYPE_CHAR_ARRAY)) {
                            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                            int length4 = jSONArray4.length();
                            char[] cArr = new char[length4];
                            int i7 = length4 - 1;
                            if (i7 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8 + 1;
                                    String string4 = jSONArray4.getString(i8);
                                    if (string4 != null && string4.length() == 1) {
                                        cArr[i8] = string4.charAt(0);
                                    }
                                    if (i9 <= i7) {
                                        i8 = i9;
                                    }
                                }
                            }
                            bundle.putCharArray(str, cArr);
                            return;
                        }
                        return;
                    case -1325958191:
                        if (string3.equals(TYPE_DOUBLE)) {
                            bundle.putDouble(str, jSONObject.getDouble("value"));
                            return;
                        }
                        return;
                    case -1097129250:
                        if (string3.equals(TYPE_LONG_ARRAY)) {
                            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                            int length5 = jSONArray5.length();
                            long[] jArr = new long[length5];
                            int i10 = length5 - 1;
                            if (i10 >= 0) {
                                while (true) {
                                    int i11 = i + 1;
                                    jArr[i] = jSONArray5.getLong(i);
                                    if (i11 <= i10) {
                                        i = i11;
                                    }
                                }
                            }
                            bundle.putLongArray(str, jArr);
                            return;
                        }
                        return;
                    case -891985903:
                        if (string3.equals("string")) {
                            bundle.putString(str, jSONObject.getString("value"));
                            return;
                        }
                        return;
                    case -766441794:
                        if (string3.equals(TYPE_FLOAT_ARRAY)) {
                            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                            int length6 = jSONArray6.length();
                            float[] fArr = new float[length6];
                            int i12 = length6 - 1;
                            if (i12 >= 0) {
                                while (true) {
                                    int i13 = i + 1;
                                    fArr[i] = (float) jSONArray6.getDouble(i);
                                    if (i13 <= i12) {
                                        i = i13;
                                    }
                                }
                            }
                            bundle.putFloatArray(str, fArr);
                            return;
                        }
                        return;
                    case 104431:
                        if (string3.equals(TYPE_INTEGER)) {
                            bundle.putInt(str, jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 3029738:
                        if (string3.equals(TYPE_BOOLEAN)) {
                            bundle.putBoolean(str, jSONObject.getBoolean("value"));
                            return;
                        }
                        return;
                    case 3039496:
                        if (string3.equals(TYPE_BYTE)) {
                            bundle.putByte(str, (byte) jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 3052374:
                        if (string3.equals(TYPE_CHAR) && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                            bundle.putChar(str, string.charAt(0));
                            return;
                        }
                        return;
                    case 3118337:
                        if (string3.equals(TYPE_ENUM)) {
                            try {
                                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString(JSON_VALUE_ENUM_TYPE)), jSONObject.getString("value")));
                                return;
                            } catch (ClassNotFoundException | IllegalArgumentException unused) {
                                return;
                            }
                        }
                        return;
                    case 3327612:
                        if (string3.equals(TYPE_LONG)) {
                            bundle.putLong(str, jSONObject.getLong("value"));
                            return;
                        }
                        return;
                    case 97526364:
                        if (string3.equals(TYPE_FLOAT)) {
                            bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                            return;
                        }
                        return;
                    case 100361105:
                        if (string3.equals(TYPE_INTEGER_ARRAY)) {
                            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                            int length7 = jSONArray7.length();
                            int[] iArr = new int[length7];
                            int i14 = length7 - 1;
                            if (i14 >= 0) {
                                while (true) {
                                    int i15 = i + 1;
                                    iArr[i] = jSONArray7.getInt(i);
                                    if (i15 <= i14) {
                                        i = i15;
                                    }
                                }
                            }
                            bundle.putIntArray(str, iArr);
                            return;
                        }
                        return;
                    case 109413500:
                        if (string3.equals(TYPE_SHORT)) {
                            bundle.putShort(str, (short) jSONObject.getInt("value"));
                            return;
                        }
                        return;
                    case 1359468275:
                        if (string3.equals(TYPE_DOUBLE_ARRAY)) {
                            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                            int length8 = jSONArray8.length();
                            double[] dArr = new double[length8];
                            int i16 = length8 - 1;
                            if (i16 >= 0) {
                                while (true) {
                                    int i17 = i + 1;
                                    dArr[i] = jSONArray8.getDouble(i);
                                    if (i17 <= i16) {
                                        i = i17;
                                    }
                                }
                            }
                            bundle.putDoubleArray(str, dArr);
                            return;
                        }
                        return;
                    case 2067161310:
                        if (string3.equals(TYPE_SHORT_ARRAY)) {
                            JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                            int length9 = jSONArray9.length();
                            short[] sArr = new short[length9];
                            int i18 = length9 - 1;
                            if (i18 >= 0) {
                                while (true) {
                                    int i19 = i + 1;
                                    sArr[i] = (short) jSONArray9.getInt(i);
                                    if (i19 <= i18) {
                                        i = i19;
                                    }
                                }
                            }
                            bundle.putShortArray(str, sArr);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Nullable
    public static final String getApplicationId(@NotNull Bundle bundle) {
        return Companion.getApplicationId(bundle);
    }

    @Nullable
    public static final Date getExpirationDate(@NotNull Bundle bundle) {
        return Companion.getExpirationDate(bundle);
    }

    public static final long getExpirationMilliseconds(@NotNull Bundle bundle) {
        return Companion.getExpirationMilliseconds(bundle);
    }

    @Nullable
    public static final Date getLastRefreshDate(@NotNull Bundle bundle) {
        return Companion.getLastRefreshDate(bundle);
    }

    public static final long getLastRefreshMilliseconds(@NotNull Bundle bundle) {
        return Companion.getLastRefreshMilliseconds(bundle);
    }

    @Nullable
    public static final Set<String> getPermissions(@NotNull Bundle bundle) {
        return Companion.getPermissions(bundle);
    }

    @Nullable
    public static final AccessTokenSource getSource(@NotNull Bundle bundle) {
        return Companion.getSource(bundle);
    }

    @Nullable
    public static final String getToken(@NotNull Bundle bundle) {
        return Companion.getToken(bundle);
    }

    public static final boolean hasTokenInformation(@Nullable Bundle bundle) {
        return Companion.hasTokenInformation(bundle);
    }

    public static final void putApplicationId(@NotNull Bundle bundle, @Nullable String str) {
        Companion.putApplicationId(bundle, str);
    }

    public static final void putDeclinedPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        Companion.putDeclinedPermissions(bundle, collection);
    }

    public static final void putExpirationDate(@NotNull Bundle bundle, @NotNull Date date) {
        Companion.putExpirationDate(bundle, date);
    }

    public static final void putExpirationMilliseconds(@NotNull Bundle bundle, long j) {
        Companion.putExpirationMilliseconds(bundle, j);
    }

    public static final void putExpiredPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        Companion.putExpiredPermissions(bundle, collection);
    }

    public static final void putLastRefreshDate(@NotNull Bundle bundle, @NotNull Date date) {
        Companion.putLastRefreshDate(bundle, date);
    }

    public static final void putLastRefreshMilliseconds(@NotNull Bundle bundle, long j) {
        Companion.putLastRefreshMilliseconds(bundle, j);
    }

    public static final void putPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        Companion.putPermissions(bundle, collection);
    }

    public static final void putSource(@NotNull Bundle bundle, @NotNull AccessTokenSource accessTokenSource) {
        Companion.putSource(bundle, accessTokenSource);
    }

    public static final void putToken(@NotNull Bundle bundle, @NotNull String str) {
        Companion.putToken(bundle, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void serializeKey(java.lang.String r9, android.os.Bundle r10, android.content.SharedPreferences.Editor r11) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.LegacyTokenHelper.serializeKey(java.lang.String, android.os.Bundle, android.content.SharedPreferences$Editor):void");
    }

    public final void clear() {
        this.cache.edit().clear().apply();
    }

    @Nullable
    public final Bundle load() {
        Bundle bundle = new Bundle();
        for (String key : this.cache.getAll().keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                deserializeKey(key, bundle);
            } catch (JSONException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, 5, TAG2, "Error reading cached value for key: '" + ((Object) key) + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public final void save(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        SharedPreferences.Editor editor = this.cache.edit();
        for (String key : bundle.keySet()) {
            try {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                serializeKey(key, bundle, editor);
            } catch (JSONException e) {
                Logger.Companion companion = Logger.Companion;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, 5, TAG2, "Error processing value for key: '" + ((Object) key) + "' -- " + e);
                return;
            }
        }
        editor.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if ((r4.length() == 0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LegacyTokenHelper(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            r0 = 0
            if (r4 == 0) goto L16
            int r1 = r4.length()
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 == 0) goto L18
        L16:
            java.lang.String r4 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
        L18:
            r2.cacheKey = r4
            android.content.Context r1 = r3.getApplicationContext()
            if (r1 != 0) goto L21
            goto L22
        L21:
            r3 = r1
        L22:
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            java.lang.String r4 = "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.cache = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.LegacyTokenHelper.<init>(android.content.Context, java.lang.String):void");
    }

    public /* synthetic */ LegacyTokenHelper(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str);
    }
}
