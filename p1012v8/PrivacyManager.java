package p1012v8;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.C29518o;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: v8.c */
/* loaded from: classes7.dex */
public final class PrivacyManager {
    @Nullable
    private static PrivacyConsent ccpaConsent;
    @Nullable
    private static FilePreferences filePreferences;
    @Nullable
    private static String gdprConsent;
    @Nullable
    private static String gdprConsentMessageVersion;
    @Nullable
    private static String gdprConsentSource;
    @Nullable
    private static Long gdprConsentTimestamp;
    @Nullable
    private static SharedPreferences sharedPreferences;
    @NotNull
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    @NotNull
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    @NotNull
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    @NotNull
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* compiled from: PrivacyManager.kt */
    @Metadata
    /* renamed from: v8.c$a */
    /* loaded from: classes7.dex */
    public enum EnumC44518a {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK
    }

    /* compiled from: PrivacyManager.kt */
    @Metadata
    /* renamed from: v8.c$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C44519b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC44518a.values().length];
            iArr[EnumC44518a.DISABLE_ID.ordinal()] = 1;
            iArr[EnumC44518a.FALLBACK.ordinal()] = 2;
            iArr[EnumC44518a.ALLOW_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfigPayload.C29317g.EnumC29320c.values().length];
            iArr2[ConfigPayload.C29317g.EnumC29320c.DISABLE_ID.ordinal()] = 1;
            iArr2[ConfigPayload.C29317g.EnumC29320c.ALLOW_ID.ordinal()] = 2;
            iArr2[ConfigPayload.C29317g.EnumC29320c.LEGACY.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private PrivacyManager() {
    }

    private final void saveCcpaConsent(PrivacyConsent privacyConsent) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put("ccpa_status", privacyConsent.getValue())) != null) {
            put.apply();
        }
    }

    private final void saveCoppaConsent(boolean z) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put("is_coppa", z)) != null) {
            put.apply();
        }
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j) {
        FilePreferences put;
        FilePreferences put2;
        FilePreferences put3;
        FilePreferences put4;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put("gdpr_status", str)) != null && (put2 = put.put("gdpr_source", str2)) != null && (put3 = put2.put("gdpr_message_version", str3)) != null && (put4 = put3.put("gdpr_timestamp", j)) != null) {
            put4.apply();
        }
    }

    @NotNull
    public final EnumC44518a allowDeviceIDFromTCF() {
        int i;
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (Intrinsics.m17075f(gdprAppliesFromPreferences, Boolean.TRUE)) {
            ConfigPayload.C29317g.EnumC29320c tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
            if (tcfStatus == null) {
                i = -1;
            } else {
                i = C44519b.$EnumSwitchMapping$1[tcfStatus.ordinal()];
            }
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        return EnumC44518a.ALLOW_ID;
                    }
                } else {
                    return EnumC44518a.DISABLE_ID;
                }
            }
            return EnumC44518a.FALLBACK;
        } else if (gdprAppliesFromPreferences == null) {
            return EnumC44518a.FALLBACK;
        } else {
            return EnumC44518a.ALLOW_ID;
        }
    }

    @NotNull
    public final String getCcpaStatus() {
        String value;
        PrivacyConsent privacyConsent = ccpaConsent;
        if (privacyConsent == null || (value = privacyConsent.getValue()) == null) {
            return PrivacyConsent.OPT_IN.getValue();
        }
        return value;
    }

    @NotNull
    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    public final String getConsentSource() {
        String str = gdprConsentSource;
        if (str == null) {
            return "no_interaction";
        }
        return str;
    }

    @NotNull
    public final String getConsentStatus() {
        String str = gdprConsent;
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public final long getConsentTimestamp() {
        Long l = gdprConsentTimestamp;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @NotNull
    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return COPPA.COPPA_NOTSET;
        }
        if (Intrinsics.m17075f(atomicReference.get(), Boolean.TRUE)) {
            return COPPA.COPPA_ENABLED;
        }
        if (Intrinsics.m17075f(atomicReference.get(), Boolean.FALSE)) {
            return COPPA.COPPA_DISABLED;
        }
        return COPPA.COPPA_NOTSET;
    }

    @Nullable
    public final Boolean getGdprAppliesFromPreferences() {
        Integer num;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 != null) {
            num = Integer.valueOf(sharedPreferences2.getInt("IABTCF_gdprApplies", -1));
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num == null || num.intValue() != 0) {
            return null;
        }
        return Boolean.FALSE;
    }

    @NotNull
    public final String getIABTCFString() {
        String str;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 != null) {
            str = sharedPreferences2.getString("IABTCF_TCString", "");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Nullable
    public final String getPreviousTcfToken() {
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null) {
            return filePreferences2.getString("previous_tcf_token", "");
        }
        return null;
    }

    @Nullable
    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    public final synchronized void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            C29518o.Companion.m37463w("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        FilePreferences filePreferences2 = (FilePreferences) ServiceLocator.Companion.getInstance(context).getService(FilePreferences.class);
        filePreferences = filePreferences2;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = filePreferences2.getBoolean("disable_ad_id");
            if (bool2 != null) {
                atomicReference.set(Boolean.valueOf(bool2.booleanValue()));
            }
        }
        String str = gdprConsent;
        long j = 0;
        if (str != null) {
            String str2 = gdprConsentSource;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = gdprConsentMessageVersion;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            Long l = gdprConsentTimestamp;
            if (l != null) {
                j = l.longValue();
            }
            saveGdprConsent(str, str3, str5, j);
        } else {
            String string = filePreferences2.getString("gdpr_status");
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (Intrinsics.m17075f(string, privacyConsent.getValue())) {
                string = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                if (Intrinsics.m17075f(string, privacyConsent2.getValue())) {
                    string = privacyConsent2.getValue();
                }
            }
            gdprConsent = string;
            gdprConsentSource = filePreferences2.getString("gdpr_source");
            gdprConsentMessageVersion = filePreferences2.getString("gdpr_message_version");
            gdprConsentTimestamp = Long.valueOf(filePreferences2.getLong("gdpr_timestamp", 0L));
        }
        PrivacyConsent privacyConsent3 = ccpaConsent;
        if (privacyConsent3 != null) {
            saveCcpaConsent(privacyConsent3);
        } else {
            String string2 = filePreferences2.getString("ccpa_status");
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!Intrinsics.m17075f(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            ccpaConsent = privacyConsent4;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = filePreferences2.getBoolean("is_coppa");
            if (bool4 != null) {
                atomicReference2.set(Boolean.valueOf(bool4.booleanValue()));
            }
        }
        atomicBoolean.set(true);
    }

    @VisibleForTesting
    public final void saveDisableAdId(boolean z) {
        FilePreferences put;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null && (put = filePreferences2.put("disable_ad_id", z)) != null) {
            put.apply();
        }
    }

    public final void setPreviousTcfToken(@Nullable String str) {
        boolean z;
        FilePreferences filePreferences2;
        FilePreferences put;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (filePreferences2 = filePreferences) != null && (put = filePreferences2.put("previous_tcf_token", str)) != null) {
            put.apply();
        }
    }

    public final void setSharedPreferences(@Nullable SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (!Intrinsics.m17075f(getPreviousTcfToken(), iABTCFString)) {
            setPreviousTcfToken(iABTCFString);
            return true;
        }
        return false;
    }

    public final boolean shouldSendAdIds() {
        int i = C44519b.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Boolean bool = disableAdId.get();
        if (bool != null && !bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean shouldSendTCFString() {
        int i;
        if (Intrinsics.m17075f(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            ConfigPayload.C29317g.EnumC29320c tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
            if (tcfStatus == null) {
                i = -1;
            } else {
                i = C44519b.$EnumSwitchMapping$1[tcfStatus.ordinal()];
            }
            if (i != -1) {
                if (i == 1 || i == 2) {
                    return true;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return shouldReturnTrueForLegacy$vungle_ads_release();
        }
        return false;
    }

    public final void updateCcpaConsent(@NotNull PrivacyConsent consent) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        ccpaConsent = consent;
        saveCcpaConsent(consent);
    }

    public final void updateCoppaConsent(boolean z) {
        coppaStatus.set(Boolean.valueOf(z));
        saveCoppaConsent(z);
    }

    public final void updateDisableAdId(boolean z) {
        disableAdId.set(Boolean.valueOf(z));
        saveDisableAdId(z);
    }

    public final void updateGdprConsent(@NotNull String consent, @NotNull String source, @Nullable String str) {
        Intrinsics.checkNotNullParameter(consent, "consent");
        Intrinsics.checkNotNullParameter(source, "source");
        gdprConsent = consent;
        gdprConsentSource = source;
        gdprConsentMessageVersion = str;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        gdprConsentTimestamp = Long.valueOf(currentTimeMillis);
        String str2 = gdprConsentMessageVersion;
        if (str2 == null) {
            str2 = "";
        }
        saveGdprConsent(consent, source, str2, currentTimeMillis);
    }
}
