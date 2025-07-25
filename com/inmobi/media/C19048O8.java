package com.inmobi.media;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.inmobi.commons.core.configs.SignalsConfig;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;

/* renamed from: com.inmobi.media.O8 */
/* loaded from: classes6.dex */
public final class C19048O8 {

    /* renamed from: a */
    public final Context f47594a;

    /* renamed from: b */
    public final InterfaceC18850A4 f47595b;

    /* renamed from: c */
    public final String f47596c;

    /* renamed from: d */
    public final boolean f47597d;

    /* renamed from: e */
    public final SignalsConfig.NovatiqConfig f47598e;

    public C19048O8(Context context, InterfaceC18850A4 interfaceC18850A4) {
        TelephonyManager telephonyManager;
        boolean m16596P;
        String string;
        String m16629H;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47594a = context;
        this.f47595b = interfaceC18850A4;
        this.f47596c = "";
        LinkedHashMap linkedHashMap = C19379n2.f48527a;
        SignalsConfig.NovatiqConfig novatiqConfig = ((SignalsConfig) AbstractC19423q4.m59930a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getNovatiqConfig();
        this.f47598e = novatiqConfig;
        Intrinsics.checkNotNullParameter(context, "context");
        if (novatiqConfig.isNovatiqEnabled()) {
            Object systemService = context.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            } else {
                telephonyManager = null;
            }
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            String str = networkOperatorName != null ? networkOperatorName : "";
            List<String> carrierNames = novatiqConfig.getCarrierNames();
            if (!(carrierNames instanceof Collection) || !carrierNames.isEmpty()) {
                for (String str2 : carrierNames) {
                    m16596P = C37690r.m16596P(str, str2, true);
                    if (m16596P) {
                        this.f47597d = true;
                        StringBuilder sb2 = new StringBuilder();
                        Random random = new Random();
                        for (int i = 0; i < 40; i++) {
                            char charAt = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxxxxxx".charAt(i);
                            if (charAt == 'x') {
                                sb2.append(Character.forDigit(random.nextInt(16), 16));
                            } else {
                                sb2.append(charAt);
                            }
                        }
                        String sb3 = sb2.toString();
                        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                        this.f47596c = sb3;
                        Context context2 = this.f47594a;
                        Intrinsics.checkNotNullParameter(context2, "context");
                        int i2 = context2.getApplicationInfo().labelRes;
                        if (i2 == 0) {
                            string = context2.getApplicationInfo().nonLocalizedLabel.toString();
                        } else {
                            string = context2.getString(i2);
                            Intrinsics.m17074g(string);
                        }
                        String str3 = string;
                        StringBuilder sb4 = new StringBuilder();
                        m16629H = StringsJVM.m16629H(str3, ' ', '_', false, 4, null);
                        sb4.append(m16629H);
                        sb4.append("_app");
                        new C19074Q8(new C19061P8(sb3, sb4.toString(), this.f47598e), this.f47595b).m61109a(new C19035N8(this));
                        return;
                    }
                }
            }
        }
        InterfaceC18850A4 interfaceC18850A42 = this.f47595b;
        if (interfaceC18850A42 != null) {
            ((C18864B4) interfaceC18850A42).m61259a("NovatiqDataHandler", "Novatiq disabled.. skipping");
        }
    }
}
