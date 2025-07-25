package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.InterfaceC20686qe;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.BasePlacement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.ironsource.fo */
/* loaded from: classes6.dex */
public class C19929fo implements InterfaceC20686qe, InterfaceC20686qe.InterfaceC20687a {

    /* renamed from: a */
    private static final String f50113a = "CappingManager.IS_DELIVERY_ENABLED";

    /* renamed from: b */
    private static final String f50114b = "CappingManager.IS_CAPPING_ENABLED";

    /* renamed from: c */
    private static final String f50115c = "CappingManager.IS_PACING_ENABLED";

    /* renamed from: d */
    private static final String f50116d = "CappingManager.MAX_NUMBER_OF_SHOWS";

    /* renamed from: e */
    private static final String f50117e = "CappingManager.CAPPING_TYPE";

    /* renamed from: f */
    private static final String f50118f = "CappingManager.SECONDS_BETWEEN_SHOWS";

    /* renamed from: g */
    private static final String f50119g = "CappingManager.CURRENT_NUMBER_OF_SHOWS";

    /* renamed from: h */
    private static final String f50120h = "CappingManager.CAPPING_TIME_THRESHOLD";

    /* renamed from: i */
    private static final String f50121i = "CappingManager.TIME_OF_THE_PREVIOUS_SHOW";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.fo$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C19930a {

        /* renamed from: a */
        static final /* synthetic */ int[] f50122a;

        static {
            int[] iArr = new int[EnumC20005go.values().length];
            f50122a = iArr;
            try {
                iArr[EnumC20005go.PER_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50122a[EnumC20005go.PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.ironsource.fo$b */
    /* loaded from: classes6.dex */
    public enum EnumC19931b {
        CAPPED_PER_DELIVERY,
        CAPPED_PER_COUNT,
        CAPPED_PER_PACE,
        NOT_CAPPED
    }

    /* renamed from: a */
    private long m58535a(EnumC20005go enumC20005go) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = C19930a.f50122a[enumC20005go.ordinal()];
        if (i == 1) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 0);
            calendar.add(6, 1);
        } else if (i == 2) {
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.add(11, 1);
        }
        return calendar.getTimeInMillis();
    }

    /* renamed from: b */
    private EnumC19931b m58532b(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m58533a(str, f50113a, str2), true)) {
            if (IronSourceUtils.getBooleanFromSharedPrefs(context, m58533a(str, f50115c, str2), false)) {
                if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, m58533a(str, f50121i, str2), 0L) < IronSourceUtils.getIntFromSharedPrefs(context, m58533a(str, f50118f, str2), 0) * 1000) {
                    return EnumC19931b.CAPPED_PER_PACE;
                }
            }
            if (IronSourceUtils.getBooleanFromSharedPrefs(context, m58533a(str, f50114b, str2), false)) {
                int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, m58533a(str, f50116d, str2), 0);
                String m58533a = m58533a(str, f50119g, str2);
                int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, m58533a, 0);
                String m58533a2 = m58533a(str, f50120h, str2);
                if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, m58533a2, 0L)) {
                    IronSourceUtils.saveIntToSharedPrefs(context, m58533a, 0);
                    IronSourceUtils.saveLongToSharedPrefs(context, m58533a2, 0L);
                } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                    return EnumC19931b.CAPPED_PER_COUNT;
                }
            }
            return EnumC19931b.NOT_CAPPED;
        }
        return EnumC19931b.CAPPED_PER_DELIVERY;
    }

    @Override // com.ironsource.InterfaceC20686qe.InterfaceC20687a
    /* renamed from: c */
    public synchronized void mo55651c(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context != null && basePlacement != null) {
            C19721co placementAvailabilitySettings = basePlacement.getPlacementAvailabilitySettings();
            if (placementAvailabilitySettings == null) {
                return;
            }
            m58536a(context, m58534a(ad_unit), basePlacement.getPlacementName(), placementAvailabilitySettings);
        }
    }

    @Override // com.ironsource.InterfaceC20686qe
    /* renamed from: a */
    public synchronized EnumC19931b mo55654a(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return EnumC19931b.NOT_CAPPED;
        } else if (basePlacement == null) {
            return EnumC19931b.NOT_CAPPED;
        } else {
            String m58534a = m58534a(ad_unit);
            if (basePlacement.getPlacementName() == null) {
                return EnumC19931b.NOT_CAPPED;
            } else if (basePlacement.getPlacementAvailabilitySettings() == null) {
                return EnumC19931b.NOT_CAPPED;
            } else {
                return m58532b(context, m58534a, basePlacement.getPlacementName());
            }
        }
    }

    @Override // com.ironsource.InterfaceC20686qe
    /* renamed from: b */
    public synchronized boolean mo55653b(Context context, BasePlacement basePlacement, IronSource.AD_UNIT ad_unit) {
        return mo55654a(context, basePlacement, ad_unit) != EnumC19931b.NOT_CAPPED;
    }

    /* renamed from: a */
    private String m58534a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? "Interstitial" : ad_unit == IronSource.AD_UNIT.BANNER ? "Banner" : ad_unit == IronSource.AD_UNIT.NATIVE_AD ? IronSourceConstants.NATIVE_AD_UNIT : ad_unit.toString();
    }

    /* renamed from: a */
    private String m58533a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    @Override // com.ironsource.InterfaceC20686qe.InterfaceC20687a
    /* renamed from: a */
    public synchronized void mo55652a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        if (context == null) {
            return;
        }
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m58537a(context, m58534a(ad_unit), str);
    }

    /* renamed from: a */
    private void m58537a(Context context, String str, String str2) {
        EnumC20005go enumC20005go;
        int i = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m58533a(str, f50115c, str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, m58533a(str, f50121i, str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m58533a(str, f50114b, str2), false)) {
            String m58533a = m58533a(str, f50119g, str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, m58533a, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, m58533a(str, f50117e, str2), EnumC20005go.PER_DAY.toString());
                EnumC20005go[] values = EnumC20005go.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        enumC20005go = null;
                        break;
                    }
                    enumC20005go = values[i];
                    if (enumC20005go.f50290a.equals(stringFromSharedPrefs)) {
                        break;
                    }
                    i++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, m58533a(str, f50120h, str2), m58535a(enumC20005go));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, m58533a, intFromSharedPrefs + 1);
        }
    }

    /* renamed from: a */
    private void m58536a(Context context, String str, String str2, C19721co c19721co) {
        boolean m59069e = c19721co.m59069e();
        IronSourceUtils.saveBooleanToSharedPrefs(context, m58533a(str, f50113a, str2), m59069e);
        if (m59069e) {
            boolean m59070d = c19721co.m59070d();
            IronSourceUtils.saveBooleanToSharedPrefs(context, m58533a(str, f50114b, str2), m59070d);
            if (m59070d) {
                IronSourceUtils.saveIntToSharedPrefs(context, m58533a(str, f50116d, str2), c19721co.m59072b());
                IronSourceUtils.saveStringToSharedPrefs(context, m58533a(str, f50117e, str2), c19721co.m59073a().toString());
            }
            boolean m59068f = c19721co.m59068f();
            IronSourceUtils.saveBooleanToSharedPrefs(context, m58533a(str, f50115c, str2), m59068f);
            if (m59068f) {
                IronSourceUtils.saveIntToSharedPrefs(context, m58533a(str, f50118f, str2), c19721co.m59071c());
            }
        }
    }
}
