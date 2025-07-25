package com.facebook.appevents.suggestedevents;

import android.util.Patterns;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.ironsource.C21114v8;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Charsets;
import net.pubnative.lite.sdk.models.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p804nd.C38513v;

/* compiled from: FeatureExtractor.kt */
@Metadata
/* loaded from: classes2.dex */
public final class FeatureExtractor {
    @NotNull
    public static final FeatureExtractor INSTANCE = new FeatureExtractor();
    private static final int NUM_OF_FEATURES = 30;
    @NotNull
    private static final String REGEX_ADD_TO_CART_BUTTON_TEXT = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";
    @NotNull
    private static final String REGEX_ADD_TO_CART_PAGE_TITLE = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";
    @NotNull
    private static final String REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";
    @NotNull
    private static final String REGEX_CR_HAS_LOG_IN_KEYWORDS = "(?i)(sign in)|login|signIn";
    @NotNull
    private static final String REGEX_CR_HAS_SIGN_ON_KEYWORDS = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";
    @NotNull
    private static final String REGEX_CR_PASSWORD_FIELD = "password";
    private static Map<String, String> eventInfo;
    private static boolean initialized;
    private static Map<String, String> languageInfo;
    private static JSONObject rules;
    private static Map<String, String> textTypeInfo;

    private FeatureExtractor() {
    }

    @Nullable
    public static final float[] getDenseFeatures(@NotNull JSONObject viewHierarchy, @NotNull String appName) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        FeatureExtractor featureExtractor;
        JSONObject interactedNode;
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                screenName = viewHierarchy.optString(ViewHierarchyConstants.SCREEN_NAME_KEY);
                jSONArray = new JSONArray();
                featureExtractor = INSTANCE;
                featureExtractor.pruneTree(jSONObject, jSONArray);
                featureExtractor.sum(fArr, featureExtractor.parseFeatures(jSONObject));
                interactedNode = featureExtractor.getInteractedNode(jSONObject);
            } catch (JSONException unused) {
            }
            if (interactedNode == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
            featureExtractor.sum(fArr, featureExtractor.nonparseFeatures(interactedNode, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return null;
        }
    }

    private final JSONObject getInteractedNode(JSONObject jSONObject) {
        int length;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
        if (jSONObject.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
                JSONObject interactedNode = getInteractedNode(jSONObject2);
                if (interactedNode != null) {
                    return interactedNode;
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return null;
    }

    @NotNull
    public static final String getTextFeature(@NotNull String buttonText, @NotNull String activityName, @NotNull String appName) {
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return null;
        }
    }

    public static final void initialize(@Nullable File file) {
        Map<String, String> m17281m;
        Map<String, String> m17281m2;
        Map<String, String> m17281m3;
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return;
        }
        try {
            try {
                rules = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new JSONObject(new String(bArr, Charsets.UTF_8));
                m17281m = C37559r0.m17281m(C38513v.m14532a(ViewHierarchyConstants.ENGLISH, "1"), C38513v.m14532a(ViewHierarchyConstants.GERMAN, "2"), C38513v.m14532a(ViewHierarchyConstants.SPANISH, "3"), C38513v.m14532a(ViewHierarchyConstants.JAPANESE, Protocol.VAST_1_0_WRAPPER));
                languageInfo = m17281m;
                m17281m2 = C37559r0.m17281m(C38513v.m14532a(ViewHierarchyConstants.VIEW_CONTENT, "0"), C38513v.m14532a(ViewHierarchyConstants.SEARCH, "1"), C38513v.m14532a(ViewHierarchyConstants.ADD_TO_CART, "2"), C38513v.m14532a(ViewHierarchyConstants.ADD_TO_WISHLIST, "3"), C38513v.m14532a(ViewHierarchyConstants.INITIATE_CHECKOUT, Protocol.VAST_1_0_WRAPPER), C38513v.m14532a(ViewHierarchyConstants.ADD_PAYMENT_INFO, "5"), C38513v.m14532a(ViewHierarchyConstants.PURCHASE, "6"), C38513v.m14532a(ViewHierarchyConstants.LEAD, "7"), C38513v.m14532a(ViewHierarchyConstants.COMPLETE_REGISTRATION, "8"));
                eventInfo = m17281m2;
                m17281m3 = C37559r0.m17281m(C38513v.m14532a(ViewHierarchyConstants.BUTTON_TEXT, "1"), C38513v.m14532a(ViewHierarchyConstants.PAGE_TITLE, "2"), C38513v.m14532a(ViewHierarchyConstants.RESOLVED_DOCUMENT_LINK, "3"), C38513v.m14532a(ViewHierarchyConstants.BUTTON_ID, Protocol.VAST_1_0_WRAPPER));
                textTypeInfo = m17281m3;
                initialized = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
        }
    }

    private final boolean isButton(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (((jSONObject.optInt(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY) & 1) << 5) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final boolean isInitialized() {
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return false;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return false;
        }
    }

    private final boolean matchIndicators(String[] strArr, String[] strArr2) {
        boolean m16592R;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                i++;
                int length2 = strArr2.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str2 = strArr2[i2];
                    i2++;
                    m16592R = C37690r.m16592R(str2, str, false, 2, null);
                    if (m16592R) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] nonparseFeatures(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean m16592R;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            int length = jSONArray.length();
            if (length > 1) {
                f = length - 1.0f;
            } else {
                f = 0.0f;
            }
            fArr[3] = f;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "siblings.getJSONObject(i)");
                        if (isButton(jSONObject2)) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i3 >= length2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            updateHintAndTextRecursively(jSONObject, sb3, sb2);
            String sb4 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "hintSB.toString()");
            String sb5 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "textSB.toString()");
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_TEXT, sb5)) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[15] = f2;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.PAGE_TITLE, str4)) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr[16] = f3;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_ID, sb4)) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr[17] = f4;
            m16592R = C37690r.m16592R(str2, "password", false, 2, null);
            if (m16592R) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            fArr[18] = f5;
            if (regexMatched(REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD, str2)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr[19] = f6;
            if (regexMatched(REGEX_CR_HAS_LOG_IN_KEYWORDS, str2)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fArr[20] = f7;
            if (regexMatched(REGEX_CR_HAS_SIGN_ON_KEYWORDS, str2)) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            fArr[21] = f8;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.BUTTON_TEXT, sb5)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr[22] = f9;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.PAGE_TITLE, str4)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[24] = f10;
            if (regexMatched(REGEX_ADD_TO_CART_BUTTON_TEXT, sb5)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr[25] = f11;
            if (regexMatched(REGEX_ADD_TO_CART_PAGE_TITLE, str4)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr[27] = f12;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.BUTTON_TEXT, sb5)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr[28] = f13;
            if (regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.PAGE_TITLE, str4)) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            fArr[29] = f14;
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final float[] parseFeatures(JSONObject jSONObject) {
        boolean m16592R;
        boolean m16592R2;
        boolean m16592R3;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i = 0;
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString(ViewHierarchyConstants.HINT_KEY);
            Intrinsics.checkNotNullExpressionValue(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString(ViewHierarchyConstants.CLASS_NAME_KEY);
            Intrinsics.checkNotNullExpressionValue(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt(ViewHierarchyConstants.INPUT_TYPE_KEY, -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (matchIndicators(new String[]{"$", "amount", "price", C21114v8.C21122h.f54075l}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (matchIndicators(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (matchIndicators(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (matchIndicators(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            m16592R = C37690r.m16592R(lowerCase3, "checkbox", false, 2, null);
            if (m16592R) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (matchIndicators(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            m16592R2 = C37690r.m16592R(lowerCase3, "radio", false, 2, null);
            if (m16592R2) {
                m16592R3 = C37690r.m16592R(lowerCase3, "button", false, 2, null);
                if (m16592R3) {
                    fArr[12] = fArr[12] + 1.0f;
                }
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i3 = i + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                        sum(fArr, parseFeatures(jSONObject2));
                        if (i3 >= length) {
                            break;
                        }
                        i = i3;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean pruneTree(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (optJSONArray.getJSONObject(i).optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                        z = true;
                        break;
                    } else if (i2 >= length) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            z = false;
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i3));
                        if (i4 >= length2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        JSONObject child = optJSONArray.getJSONObject(i5);
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        if (pruneTree(child, jSONArray)) {
                            jSONArray2.put(child);
                            z2 = true;
                        }
                        if (i6 >= length3) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                jSONObject.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:5:0x0008, B:7:0x000d, B:31:0x005d, B:23:0x0043, B:26:0x004c, B:28:0x0050, B:33:0x0062, B:34:0x0068, B:15:0x0029, B:18:0x0032, B:20:0x0036, B:35:0x0069, B:36:0x006e, B:10:0x0017, B:12:0x001b, B:37:0x006f, B:38:0x0074, B:39:0x0075, B:40:0x007a), top: B:44:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:5:0x0008, B:7:0x000d, B:31:0x005d, B:23:0x0043, B:26:0x004c, B:28:0x0050, B:33:0x0062, B:34:0x0068, B:15:0x0029, B:18:0x0032, B:20:0x0036, B:35:0x0069, B:36:0x006e, B:10:0x0017, B:12:0x001b, B:37:0x006f, B:38:0x0074, B:39:0x0075, B:40:0x007a), top: B:44:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:5:0x0008, B:7:0x000d, B:31:0x005d, B:23:0x0043, B:26:0x004c, B:28:0x0050, B:33:0x0062, B:34:0x0068, B:15:0x0029, B:18:0x0032, B:20:0x0036, B:35:0x0069, B:36:0x006e, B:10:0x0017, B:12:0x001b, B:37:0x006f, B:38:0x0074, B:39:0x0075, B:40:0x007a), top: B:44:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean regexMatched(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = com.facebook.appevents.suggestedevents.FeatureExtractor.rules     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            if (r0 == 0) goto L75
            java.lang.String r3 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L17
            r5 = r2
            goto L25
        L17:
            java.util.Map<java.lang.String, java.lang.String> r3 = com.facebook.appevents.suggestedevents.FeatureExtractor.languageInfo     // Catch: java.lang.Throwable -> L7b
            if (r3 == 0) goto L6f
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L7b
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L7b
        L25:
            if (r5 != 0) goto L29
        L27:
            r5 = r2
            goto L40
        L29:
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L7b
            if (r5 != 0) goto L32
            goto L27
        L32:
            java.util.Map<java.lang.String, java.lang.String> r0 = com.facebook.appevents.suggestedevents.FeatureExtractor.eventInfo     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L69
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7b
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7b
        L40:
            if (r5 != 0) goto L43
            goto L5a
        L43:
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L7b
            if (r5 != 0) goto L4c
            goto L5a
        L4c:
            java.util.Map<java.lang.String, java.lang.String> r6 = com.facebook.appevents.suggestedevents.FeatureExtractor.textTypeInfo     // Catch: java.lang.Throwable -> L7b
            if (r6 == 0) goto L62
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = r5.optString(r6)     // Catch: java.lang.Throwable -> L7b
        L5a:
            if (r2 != 0) goto L5d
            goto L61
        L5d:
            boolean r1 = r4.regexMatched(r2, r8)     // Catch: java.lang.Throwable -> L7b
        L61:
            return r1
        L62:
            java.lang.String r5 = "textTypeInfo"
            kotlin.jvm.internal.Intrinsics.m17056y(r5)     // Catch: java.lang.Throwable -> L7b
            throw r2     // Catch: java.lang.Throwable -> L7b
        L69:
            java.lang.String r5 = "eventInfo"
            kotlin.jvm.internal.Intrinsics.m17056y(r5)     // Catch: java.lang.Throwable -> L7b
            throw r2     // Catch: java.lang.Throwable -> L7b
        L6f:
            java.lang.String r5 = "languageInfo"
            kotlin.jvm.internal.Intrinsics.m17056y(r5)     // Catch: java.lang.Throwable -> L7b
            throw r2     // Catch: java.lang.Throwable -> L7b
        L75:
            java.lang.String r5 = "rules"
            kotlin.jvm.internal.Intrinsics.m17056y(r5)     // Catch: java.lang.Throwable -> L7b
            throw r2     // Catch: java.lang.Throwable -> L7b
        L7b:
            r5 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.suggestedevents.FeatureExtractor.regexMatched(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private final void sum(float[] fArr, float[] fArr2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    fArr[i] = fArr[i] + fArr2[i];
                    if (i2 <= length) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void updateHintAndTextRecursively(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        boolean z;
        int length;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString(ViewHierarchyConstants.HINT_KEY, "");
            Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            boolean z2 = true;
            int i = 0;
            if (lowerCase.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            while (true) {
                int i2 = i + 1;
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    updateHintAndTextRecursively(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i2 < length) {
                    i = i2;
                } else {
                    return;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean regexMatched(String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
