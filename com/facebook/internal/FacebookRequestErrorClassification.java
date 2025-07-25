package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p552ot.pubsub.p561i.p562a.C26559a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p804nd.C38513v;

/* compiled from: FacebookRequestErrorClassification.kt */
@Metadata
/* loaded from: classes4.dex */
public final class FacebookRequestErrorClassification {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int EC_APP_NOT_INSTALLED = 412;
    public static final int EC_APP_TOO_MANY_CALLS = 4;
    public static final int EC_INVALID_SESSION = 102;
    public static final int EC_INVALID_TOKEN = 190;
    public static final int EC_RATE = 9;
    public static final int EC_SERVICE_UNAVAILABLE = 2;
    public static final int EC_TOO_MANY_USER_ACTION_CALLS = 341;
    public static final int EC_USER_TOO_MANY_CALLS = 17;
    public static final int ESC_APP_INACTIVE = 493;
    public static final int ESC_APP_NOT_INSTALLED = 458;
    @NotNull
    public static final String KEY_LOGIN_RECOVERABLE = "login_recoverable";
    @NotNull
    public static final String KEY_NAME = "name";
    @NotNull
    public static final String KEY_OTHER = "other";
    @NotNull
    public static final String KEY_RECOVERY_MESSAGE = "recovery_message";
    @NotNull
    public static final String KEY_TRANSIENT = "transient";
    @Nullable
    private static FacebookRequestErrorClassification defaultInstance;
    @Nullable
    private final Map<Integer, Set<Integer>> loginRecoverableErrors;
    @Nullable
    private final String loginRecoverableRecoveryMessage;
    @Nullable
    private final Map<Integer, Set<Integer>> otherErrors;
    @Nullable
    private final String otherRecoveryMessage;
    @Nullable
    private final Map<Integer, Set<Integer>> transientErrors;
    @Nullable
    private final String transientRecoveryMessage;

    /* compiled from: FacebookRequestErrorClassification.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FacebookRequestError.Category.valuesCustom().length];
            iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FacebookRequestErrorClassification(@Nullable Map<Integer, ? extends Set<Integer>> map, @Nullable Map<Integer, ? extends Set<Integer>> map2, @Nullable Map<Integer, ? extends Set<Integer>> map3, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.otherErrors = map;
        this.transientErrors = map2;
        this.loginRecoverableErrors = map3;
        this.otherRecoveryMessage = str;
        this.transientRecoveryMessage = str2;
        this.loginRecoverableRecoveryMessage = str3;
    }

    @Nullable
    public static final FacebookRequestErrorClassification createFromJSON(@Nullable JSONArray jSONArray) {
        return Companion.createFromJSON(jSONArray);
    }

    @NotNull
    public static final synchronized FacebookRequestErrorClassification getDefaultErrorClassification() {
        FacebookRequestErrorClassification defaultErrorClassification;
        synchronized (FacebookRequestErrorClassification.class) {
            defaultErrorClassification = Companion.getDefaultErrorClassification();
        }
        return defaultErrorClassification;
    }

    @NotNull
    public final FacebookRequestError.Category classify(int i, int i2, boolean z) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (z) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.otherErrors;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = this.otherErrors.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.loginRecoverableErrors;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = this.loginRecoverableErrors.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.transientErrors;
        if (map3 != null && map3.containsKey(Integer.valueOf(i)) && ((set = this.transientErrors.get(Integer.valueOf(i))) == null || set.contains(Integer.valueOf(i2)))) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        return FacebookRequestError.Category.OTHER;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> getLoginRecoverableErrors() {
        return this.loginRecoverableErrors;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> getOtherErrors() {
        return this.otherErrors;
    }

    @Nullable
    public final String getRecoveryMessage(@Nullable FacebookRequestError.Category category) {
        int i;
        if (category == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return this.transientRecoveryMessage;
            }
            return this.loginRecoverableRecoveryMessage;
        }
        return this.otherRecoveryMessage;
    }

    @Nullable
    public final Map<Integer, Set<Integer>> getTransientErrors() {
        return this.transientErrors;
    }

    /* compiled from: FacebookRequestErrorClassification.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final FacebookRequestErrorClassification getDefaultErrorClassificationImpl() {
            HashMap m17282l;
            HashMap m17282l2;
            m17282l = C37559r0.m17282l(C38513v.m14532a(2, null), C38513v.m14532a(4, null), C38513v.m14532a(9, null), C38513v.m14532a(17, null), C38513v.m14532a(Integer.valueOf((int) FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS), null));
            m17282l2 = C37559r0.m17282l(C38513v.m14532a(102, null), C38513v.m14532a(Integer.valueOf((int) FacebookRequestErrorClassification.EC_INVALID_TOKEN), null), C38513v.m14532a(412, null));
            return new FacebookRequestErrorClassification(null, m17282l, m17282l2, null, null, null);
        }

        private final Map<Integer, Set<Integer>> parseJSONDefinition(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt(C26559a.f69635d)) != 0) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3 + 1;
                                    int optInt2 = optJSONArray2.optInt(i3);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i4 >= length2) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                        } else {
                            hashSet = null;
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return hashMap;
        }

        @Nullable
        public final FacebookRequestErrorClassification createFromJSON(@Nullable JSONArray jSONArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String optString;
            boolean m16615y;
            boolean m16615y2;
            boolean m16615y3;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                Map<Integer, Set<Integer>> map4 = null;
                Map<Integer, Set<Integer>> map5 = null;
                Map<Integer, Set<Integer>> map6 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        m16615y = StringsJVM.m16615y(optString, "other", true);
                        if (!m16615y) {
                            m16615y2 = StringsJVM.m16615y(optString, FacebookRequestErrorClassification.KEY_TRANSIENT, true);
                            if (!m16615y2) {
                                m16615y3 = StringsJVM.m16615y(optString, FacebookRequestErrorClassification.KEY_LOGIN_RECOVERABLE, true);
                                if (m16615y3) {
                                    str6 = optJSONObject.optString(FacebookRequestErrorClassification.KEY_RECOVERY_MESSAGE, null);
                                    map6 = parseJSONDefinition(optJSONObject);
                                }
                            } else {
                                str5 = optJSONObject.optString(FacebookRequestErrorClassification.KEY_RECOVERY_MESSAGE, null);
                                map5 = parseJSONDefinition(optJSONObject);
                            }
                        } else {
                            str4 = optJSONObject.optString(FacebookRequestErrorClassification.KEY_RECOVERY_MESSAGE, null);
                            map4 = parseJSONDefinition(optJSONObject);
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new FacebookRequestErrorClassification(map, map2, map3, str, str2, str3);
        }

        @NotNull
        public final synchronized FacebookRequestErrorClassification getDefaultErrorClassification() {
            FacebookRequestErrorClassification facebookRequestErrorClassification;
            if (FacebookRequestErrorClassification.defaultInstance == null) {
                FacebookRequestErrorClassification.defaultInstance = getDefaultErrorClassificationImpl();
            }
            facebookRequestErrorClassification = FacebookRequestErrorClassification.defaultInstance;
            if (facebookRequestErrorClassification == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return facebookRequestErrorClassification;
        }

        public static /* synthetic */ void getDefaultErrorClassification$annotations() {
        }
    }
}
