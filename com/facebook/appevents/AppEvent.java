package com.facebook.appevents;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.integrity.IntegrityManager;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.integrity.RedactedEventsManager;
import com.facebook.appevents.integrity.SensitiveParamsManager;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.appevents.internal.Constants;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppEvent.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class AppEvent implements Serializable {
    private static final int MAX_IDENTIFIER_LENGTH = 40;
    private static final long serialVersionUID = 1;
    @Nullable
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    @NotNull
    private final JSONObject jsonObject;
    @NotNull
    private final String name;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final HashSet<String> validatedIdentifiers = new HashSet<>();

    /* compiled from: AppEvent.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String md5Checksum(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                Charset forName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] digest = messageDigest.digest();
                    Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                    return AppEventUtility.bytesToHex(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (UnsupportedEncodingException e) {
                Utility.logd("Failed to generate checksum: ", e);
                return "1";
            } catch (NoSuchAlgorithmException e2) {
                Utility.logd("Failed to generate checksum: ", e2);
                return "0";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateIdentifier(String str) {
            boolean z;
            boolean contains;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && str.length() <= 40) {
                    synchronized (AppEvent.validatedIdentifiers) {
                        contains = AppEvent.validatedIdentifiers.contains(str);
                        Unit unit = Unit.f99208a;
                    }
                    if (!contains) {
                        if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").m16766e(str)) {
                            synchronized (AppEvent.validatedIdentifiers) {
                                AppEvent.validatedIdentifiers.add(str);
                            }
                            return;
                        }
                        C37612s0 c37612s0 = C37612s0.f99333a;
                        String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        throw new FacebookException(format);
                    }
                    return;
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            C37612s0 c37612s02 = C37612s0.f99333a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format2);
        }
    }

    /* compiled from: AppEvent.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class SerializationProxyV2 implements Serializable {
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 20160803001L;
        @Nullable
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        @NotNull
        private final String jsonString;

        /* compiled from: AppEvent.kt */
        @Metadata
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public SerializationProxyV2(@NotNull String jsonString, boolean z, boolean z2, @Nullable String str) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            this.jsonString = jsonString;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum, null);
        }
    }

    public /* synthetic */ AppEvent(String str, boolean z, boolean z2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, str2);
    }

    private final String calculateChecksum() {
        Companion companion = Companion;
        String jSONObject = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return companion.md5Checksum(jSONObject);
    }

    private final JSONObject getJSONObjectForAppEvent(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        Companion.validateIdentifier(str2);
        JSONObject jSONObject = new JSONObject();
        String processEvent = RestrictiveDataManager.processEvent(str2);
        if (Intrinsics.m17075f(processEvent, str2)) {
            processEvent = RedactedEventsManager.processEventsRedaction(str2);
        }
        jSONObject.put(Constants.EVENT_NAME_EVENT_KEY, processEvent);
        jSONObject.put(Constants.LOG_TIME_APP_EVENT_KEY, System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> validateParameters = validateParameters(bundle);
            for (String str3 : validateParameters.keySet()) {
                jSONObject.put(str3, validateParameters.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, d.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            Logger.Companion companion = Logger.Companion;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "eventObject.toString()");
            companion.log(loggingBehavior, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    private final Map<String, String> validateParameters(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String key : bundle.keySet()) {
            Companion companion = Companion;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            companion.validateIdentifier(key);
            Object obj = bundle.get(key);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                C37612s0 c37612s0 = C37612s0.f99333a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, key}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                throw new FacebookException(format);
            }
            hashMap.put(key, obj.toString());
        }
        if (!ProtectedModeManager.INSTANCE.protectedModeIsApplied(bundle)) {
            SensitiveParamsManager sensitiveParamsManager = SensitiveParamsManager.INSTANCE;
            SensitiveParamsManager.processFilterSensitiveParams(hashMap, this.name);
        }
        IntegrityManager.processParameters(hashMap);
        RestrictiveDataManager restrictiveDataManager = RestrictiveDataManager.INSTANCE;
        RestrictiveDataManager.processParameters(hashMap, this.name);
        EventDeactivationManager eventDeactivationManager = EventDeactivationManager.INSTANCE;
        EventDeactivationManager.processDeprecatedParameters(hashMap, this.name);
        return hashMap;
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.jsonObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return new SerializationProxyV2(jSONObject, this.isImplicit, this.inBackground, this.checksum);
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    @NotNull
    public final JSONObject getJSONObject() {
        return this.jsonObject;
    }

    @NotNull
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return Intrinsics.m17075f(calculateChecksum(), this.checksum);
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    @NotNull
    public String toString() {
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public AppEvent(@NotNull String contextName, @NotNull String eventName, @Nullable Double d, @Nullable Bundle bundle, boolean z, boolean z2, @Nullable UUID uuid) throws JSONException, FacebookException {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = eventName;
        this.jsonObject = getJSONObjectForAppEvent(contextName, eventName, d, bundle, uuid);
        this.checksum = calculateChecksum();
    }

    private AppEvent(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z;
        String optString = jSONObject.optString(Constants.EVENT_NAME_EVENT_KEY);
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.name = optString;
        this.checksum = str2;
        this.inBackground = z2;
    }
}
