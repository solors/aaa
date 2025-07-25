package p1003v;

import android.os.Build;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: v.f */
/* loaded from: classes2.dex */
public final class HardwareBitmaps {

    /* renamed from: a */
    private static final boolean f116739a;

    static {
        String m16547v0;
        boolean m16624M;
        boolean m17338N;
        String str;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i != 26) {
            if (i == 27 && (str = Build.DEVICE) != null) {
                m17338N = _Arrays.m17338N(new String[]{"mcv1s", "mcv3", "mcv5a", "mcv7a", "A30ATMO", "A70AXLTMO", "A3A_8_4G_TMO", "Edison_CKT", "EDISON_TF", "FERMI_TF", "U50A_ATT", "U50A_PLUS_ATT", "U50A_PLUS_TF", "U50APLUSTMO", "U5A_PLUS_4G", "RCT6513W87DK5e", "RCT6873W42BMF9A", "RCT6A03W13", "RCT6B03W12", "RCT6B03W13", "RCT6T06E13", "A3_Pro", "One", "One_Max", "One_Pro", "Z2", "Z2_PRO", "Armor_3", "Armor_6", "Blackview", "BV9500", "BV9500Pro", "A6L-C", "N5002LA", "N5501LA", "Power_2_Pro", "Power_5", "Z9", "V0310WW", "V0330WW", "A3", "ASUS_X018_4", "C210AE", "fireball", "ILA_X1", "Infinix-X605_sprout", "j7maxlte", "KING_KONG_3", "M10500", "S70", "S80Lite", "SGINO6", "st18c10bnn", "TECNO-CA8"}, str);
                z = m17338N;
            }
        } else {
            String str2 = Build.MODEL;
            if (str2 != null) {
                m16547v0 = C37690r.m16547v0(str2, "SAMSUNG-");
                m16624M = StringsJVM.m16624M(m16547v0, "SM-", false, 2, null);
                if (m16624M) {
                    m17338N = true;
                } else {
                    String str3 = Build.DEVICE;
                    if (str3 != null) {
                        m17338N = _Arrays.m17338N(new String[]{"nora", "nora_8917", "nora_8917_n", "james", "rjames_f", "rjames_go", "pettyl", "hannah", "ahannah", "rhannah", "ali", "ali_n", "aljeter", "aljeter_n", "jeter", "evert", "evert_n", "evert_nt", "G3112", "G3116", "G3121", "G3123", "G3125", "G3412", "G3416", "G3421", "G3423", "G3426", "G3212", "G3221", "G3223", "G3226", "BV6800Pro", "CatS41", "Hi9Pro", "manning", "N5702L"}, str3);
                    }
                }
                z = m17338N;
            }
        }
        f116739a = z;
    }

    @NotNull
    /* renamed from: a */
    public static final AbstractC44481n m2841a(@Nullable InterfaceC44485r interfaceC44485r) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && !f116739a) {
            if (i != 26 && i != 27) {
                return new C44482p(true);
            }
            return new C44483q(interfaceC44485r);
        }
        return new C44482p(false);
    }
}
