package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.r6 */
/* loaded from: classes8.dex */
public final class EnumC31260r6 {
    @NotNull

    /* renamed from: c */
    public static final C31261a f84641c;

    /* renamed from: d */
    private static final /* synthetic */ EnumC31260r6[] f84642d;

    /* renamed from: e */
    private static final /* synthetic */ EnumEntries f84643e;
    @NotNull

    /* renamed from: b */
    private final String f84644b;

    /* renamed from: com.yandex.mobile.ads.impl.r6$a */
    /* loaded from: classes8.dex */
    public static final class C31261a {

        /* renamed from: com.yandex.mobile.ads.impl.r6$a$a */
        /* loaded from: classes8.dex */
        public /* synthetic */ class C31262a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f84645a;

            static {
                int[] iArr = new int[EnumC31260r6.values().length];
                try {
                    iArr[6] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    C31261a c31261a = EnumC31260r6.f84641c;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    C31261a c31261a2 = EnumC31260r6.f84641c;
                    iArr[1] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    C31261a c31261a3 = EnumC31260r6.f84641c;
                    iArr[2] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    C31261a c31261a4 = EnumC31260r6.f84641c;
                    iArr[3] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    C31261a c31261a5 = EnumC31260r6.f84641c;
                    iArr[4] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    C31261a c31261a6 = EnumC31260r6.f84641c;
                    iArr[5] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    C31261a c31261a7 = EnumC31260r6.f84641c;
                    iArr[7] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    C31261a c31261a8 = EnumC31260r6.f84641c;
                    iArr[8] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    C31261a c31261a9 = EnumC31260r6.f84641c;
                    iArr[9] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    C31261a c31261a10 = EnumC31260r6.f84641c;
                    iArr[10] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    C31261a c31261a11 = EnumC31260r6.f84641c;
                    iArr[11] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    C31261a c31261a12 = EnumC31260r6.f84641c;
                    iArr[12] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    C31261a c31261a13 = EnumC31260r6.f84641c;
                    iArr[13] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    C31261a c31261a14 = EnumC31260r6.f84641c;
                    iArr[14] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    C31261a c31261a15 = EnumC31260r6.f84641c;
                    iArr[15] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                f84645a = iArr;
            }
        }

        private C31261a() {
        }

        @Nullable
        /* renamed from: a */
        public static AdQualityVerifiableNetwork m30138a(@Nullable EnumC31260r6 enumC31260r6) {
            int i;
            if (enumC31260r6 == null) {
                i = -1;
            } else {
                i = C31262a.f84645a[enumC31260r6.ordinal()];
            }
            switch (i) {
                case 1:
                    return AdQualityVerifiableNetwork.ADMOB;
                case 2:
                    return AdQualityVerifiableNetwork.ADCOLONY;
                case 3:
                    return AdQualityVerifiableNetwork.APPLOVIN;
                case 4:
                    return AdQualityVerifiableNetwork.APPLOVINMAX;
                case 5:
                    return AdQualityVerifiableNetwork.BIGOADS;
                case 6:
                    return AdQualityVerifiableNetwork.CHARTBOOST;
                case 7:
                    return AdQualityVerifiableNetwork.GOOGLE;
                case 8:
                    return AdQualityVerifiableNetwork.INMOBI;
                case 9:
                    return AdQualityVerifiableNetwork.IRONSOURCE;
                case 10:
                    return AdQualityVerifiableNetwork.MINTEGRAL;
                case 11:
                    return AdQualityVerifiableNetwork.MYTARGET;
                case 12:
                    return AdQualityVerifiableNetwork.PANGLE;
                case 13:
                    return AdQualityVerifiableNetwork.TAPJOY;
                case 14:
                    return AdQualityVerifiableNetwork.UNITYADS;
                case 15:
                    return AdQualityVerifiableNetwork.VUNGLE;
                case 16:
                    return AdQualityVerifiableNetwork.YANDEX;
                default:
                    return null;
            }
        }

        public /* synthetic */ C31261a(int i) {
            this();
        }
    }

    static {
        EnumC31260r6[] enumC31260r6Arr = {new EnumC31260r6(0, "ADCOLONY", "adcolony"), new EnumC31260r6(1, "APPLOVIN", "applovin"), new EnumC31260r6(2, "APPLOVINMAX", "applovin_max"), new EnumC31260r6(3, "BIGOADS", "bigoads"), new EnumC31260r6(4, "CHARTBOOST", "chartboost"), new EnumC31260r6(5, "GOOGLE", "admanager"), new EnumC31260r6(6, "ADMOB", "admob"), new EnumC31260r6(7, "INMOBI", "inmobi"), new EnumC31260r6(8, "IRONSOURCE", "ironsource"), new EnumC31260r6(9, "MINTEGRAL", "mintegral"), new EnumC31260r6(10, "MYTARGET", "mytarget"), new EnumC31260r6(11, "PANGLE", "pangle"), new EnumC31260r6(12, "TAPJOY", "tapjoy"), new EnumC31260r6(13, "UNITYADS", "unityads"), new EnumC31260r6(14, "VUNGLE", "vungle"), new EnumC31260r6(15, "YANDEX", "yandex")};
        f84642d = enumC31260r6Arr;
        f84643e = C44401b.m3113a(enumC31260r6Arr);
        f84641c = new C31261a(0);
    }

    private EnumC31260r6(int i, String str, String str2) {
        this.f84644b = str2;
    }

    @NotNull
    /* renamed from: a */
    public static EnumEntries<EnumC31260r6> m30140a() {
        return f84643e;
    }

    public static EnumC31260r6 valueOf(String str) {
        return (EnumC31260r6) Enum.valueOf(EnumC31260r6.class, str);
    }

    public static EnumC31260r6[] values() {
        return (EnumC31260r6[]) f84642d.clone();
    }

    @NotNull
    /* renamed from: b */
    public final String m30139b() {
        return this.f84644b;
    }
}
