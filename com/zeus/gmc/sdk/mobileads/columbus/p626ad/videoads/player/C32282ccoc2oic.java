package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player;

import android.content.Context;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.models.Protocol;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.ccoc2oic */
/* loaded from: classes8.dex */
public class C32282ccoc2oic {
    protected static final Map<String, Integer> c22o22co22i;
    public static final String c2oc2o = "1.1";
    protected static final Map<String, InterfaceC32283coo2iico> c2oicci2;
    public static final String cco22 = "1.2";
    public static final String ccoc2oic = "2.1";
    public static final String cicc2iiccc = "2.0";
    public static final String cii2c2 = "1.3";
    public static final String ciii2coi2 = "1.4";
    public static final String cioccoiococ = "1.0";
    private static final String coi222o222 = "1";
    private static final String coiic = "2";
    public static final String coiio2 = "2.2";
    private static final String coo2iico = "RewardStyleUtils";
    private static final List<String> c2oc2i = Collections.unmodifiableList(Arrays.asList("0", "1", "2", "3", Protocol.VAST_1_0_WRAPPER));
    private static final List<String> cicic = Collections.unmodifiableList(Arrays.asList("0", "1", "2"));

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.ccoc2oic$coo2iico */
    /* loaded from: classes8.dex */
    public interface InterfaceC32283coo2iico {
        AbstractC32320coo2iico coo2iico(Context context);
    }

    static {
        HashMap hashMap = new HashMap();
        c2oicci2 = hashMap;
        hashMap.put("1.0", new InterfaceC32283coo2iico() { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.a
            @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32282ccoc2oic.InterfaceC32283coo2iico
            public final AbstractC32320coo2iico coo2iico(Context context) {
                return new View$OnClickListenerC32265c2oc2i(context);
            }
        });
        hashMap.put("1.1", new InterfaceC32283coo2iico() { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.b
            @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32282ccoc2oic.InterfaceC32283coo2iico
            public final AbstractC32320coo2iico coo2iico(Context context) {
                return new C32281cco22(context);
            }
        });
        hashMap.put("1.2", new InterfaceC32283coo2iico() { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.c
            @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32282ccoc2oic.InterfaceC32283coo2iico
            public final AbstractC32320coo2iico coo2iico(Context context) {
                return new C32280c2oc2o(context);
            }
        });
        hashMap.put(cii2c2, new InterfaceC32283coo2iico() { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.d
            @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32282ccoc2oic.InterfaceC32283coo2iico
            public final AbstractC32320coo2iico coo2iico(Context context) {
                return new C32304ciii2coi2(context);
            }
        });
        hashMap.put(ciii2coi2, new InterfaceC32283coo2iico() { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.e
            @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32282ccoc2oic.InterfaceC32283coo2iico
            public final AbstractC32320coo2iico coo2iico(Context context) {
                return new C32303cii2c2(context);
            }
        });
        HashMap hashMap2 = new HashMap();
        c22o22co22i = hashMap2;
        hashMap2.put("2.0", Integer.valueOf(C32065R.C32069layout.columbus_reward_style_end_2_0));
        hashMap2.put("2.1", Integer.valueOf(C32065R.C32069layout.columbus_reward_style_end_2_1));
        hashMap2.put("2.2", Integer.valueOf(C32065R.C32069layout.columbus_reward_style_end_2_2));
    }

    private C32282ccoc2oic() {
    }

    public static boolean c2oc2i(String str) {
        if (!TextUtils.isEmpty(str) && "1.0".equals(coo2iico(str))) {
            return true;
        }
        return false;
    }

    public static boolean cioccoiococ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length < 2 || split.length > 3 || !"1".equals(split[0])) {
                return false;
            }
            return c2oc2i.contains(split[1]);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "check video style error", e);
            return false;
        }
    }

    public static boolean coi222o222(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length < 2 || split.length > 3 || !"2".equals(split[0])) {
                return false;
            }
            return cicic.contains(split[1]);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "check video style error", e);
            return false;
        }
    }

    public static String coo2iico(String str) {
        if (!cioccoiococ(str) && !coi222o222(str)) {
            return str;
        }
        String[] split = str.split("\\.");
        return split[0] + "." + split[1];
    }
}
