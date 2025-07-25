package com.ironsource;

import com.ironsource.InterfaceC20470mg;
import com.ironsource.mediationsdk.IronSource;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.ir */
/* loaded from: classes6.dex */
public class C20113ir implements InterfaceC20470mg, InterfaceC20470mg.InterfaceC20471a {

    /* renamed from: c */
    private static final int f50633c = 1;

    /* renamed from: a */
    private final Map<IronSource.AD_UNIT, Integer> f50634a = new HashMap();

    /* renamed from: b */
    private final C19712cj f50635b = new C19712cj();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.ir$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C20114a {

        /* renamed from: a */
        static final /* synthetic */ int[] f50636a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f50636a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50636a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50636a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50636a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20113ir() {
        for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
            m57942a(ad_unit, 1);
        }
    }

    @Override // com.ironsource.InterfaceC20470mg
    /* renamed from: a */
    public synchronized int mo56312a(IronSource.AD_UNIT ad_unit) {
        int i = -1;
        if (ad_unit == null) {
            return -1;
        }
        Integer num = this.f50634a.get(ad_unit);
        if (num != null) {
            i = num.intValue();
        }
        return i;
    }

    @Override // com.ironsource.InterfaceC20470mg.InterfaceC20471a
    /* renamed from: b */
    public synchronized void mo56311b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        m57942a(ad_unit, this.f50634a.get(ad_unit).intValue() + 1);
    }

    /* renamed from: a */
    private void m57942a(@NotNull IronSource.AD_UNIT ad_unit, int i) {
        this.f50634a.put(ad_unit, Integer.valueOf(i));
        int i2 = C20114a.f50636a[ad_unit.ordinal()];
        if (i2 == 1) {
            this.f50635b.m59150d(i);
        } else if (i2 == 2) {
            this.f50635b.m59152b(i);
        } else if (i2 == 3) {
            this.f50635b.m59153a(i);
        } else if (i2 != 4) {
        } else {
            this.f50635b.m59151c(i);
        }
    }
}
