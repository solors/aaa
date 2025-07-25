package com.facebook.appevents.aam;

import androidx.annotation.RestrictTo;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetadataRule.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class MetadataRule {
    @NotNull
    private static final String FIELD_K = "k";
    @NotNull
    private static final String FIELD_K_DELIMITER = ",";
    @NotNull
    private static final String FIELD_V = "v";
    @NotNull
    private final List<String> keyRules;
    @NotNull
    private final String name;
    @NotNull
    private final String valRule;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Set<MetadataRule> rules = new CopyOnWriteArraySet();

    /* compiled from: MetadataRule.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void constructRules(JSONObject jSONObject) {
            boolean z;
            List m16611C0;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                if (optJSONObject != null) {
                    String k = optJSONObject.optString("k");
                    String v = optJSONObject.optString("v");
                    Intrinsics.checkNotNullExpressionValue(k, "k");
                    if (k.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Set access$getRules$cp = MetadataRule.access$getRules$cp();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        m16611C0 = C37690r.m16611C0(k, new String[]{","}, false, 0, 6, null);
                        Intrinsics.checkNotNullExpressionValue(v, "v");
                        access$getRules$cp.add(new MetadataRule(key, m16611C0, v, null));
                    }
                }
            }
        }

        @NotNull
        public final Set<String> getEnabledRuleNames() {
            HashSet hashSet = new HashSet();
            for (MetadataRule metadataRule : MetadataRule.access$getRules$cp()) {
                hashSet.add(metadataRule.getName());
            }
            return hashSet;
        }

        @NotNull
        public final Set<MetadataRule> getRules() {
            return new HashSet(MetadataRule.access$getRules$cp());
        }

        public final void updateRules(@NotNull String rulesFromServer) {
            Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                MetadataRule.access$getRules$cp().clear();
                constructRules(new JSONObject(rulesFromServer));
            } catch (JSONException unused) {
            }
        }
    }

    public /* synthetic */ MetadataRule(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set access$getRules$cp() {
        if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
            return null;
        }
        try {
            return rules;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataRule.class);
            return null;
        }
    }

    @NotNull
    public static final Set<String> getEnabledRuleNames() {
        if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
            return null;
        }
        try {
            return Companion.getEnabledRuleNames();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataRule.class);
            return null;
        }
    }

    @NotNull
    public static final Set<MetadataRule> getRules() {
        if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
            return null;
        }
        try {
            return Companion.getRules();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataRule.class);
            return null;
        }
    }

    public static final void updateRules(@NotNull String str) {
        if (CrashShieldHandler.isObjectCrashing(MetadataRule.class)) {
            return;
        }
        try {
            Companion.updateRules(str);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, MetadataRule.class);
        }
    }

    @NotNull
    public final List<String> getKeyRules() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return new ArrayList(this.keyRules);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @NotNull
    public final String getName() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.name;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @NotNull
    public final String getValRule() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.valRule;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private MetadataRule(String str, List<String> list, String str2) {
        this.name = str;
        this.valRule = str2;
        this.keyRules = list;
    }
}
