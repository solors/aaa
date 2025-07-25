package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.p047a.p048a.p059h.Metric;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p153iR.C6509bg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7754eqN;
import com.bytedance.sdk.openadsdk.core.p321Ta.p323bX.C8718bX;
import com.bytedance.sdk.openadsdk.core.p334bX.C8891eqN;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9353eqN;
import com.bytedance.sdk.openadsdk.p297bX.C8126eo;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.utils.C9533WR;
import com.bytedance.sdk.openadsdk.utils.ayS;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.WR */
/* loaded from: classes3.dex */
public class C8840WR {

    /* renamed from: IL */
    public static final Set<String> f19512IL = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.WR.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean VzQ;

    /* renamed from: bg */
    public static InterfaceC8671Ta f19513bg;

    /* renamed from: Fy */
    private boolean f19514Fy;

    /* renamed from: Kg */
    private boolean f19515Kg;

    /* renamed from: LZ */
    private String f19516LZ;

    /* renamed from: Lq */
    private Integer f19517Lq;

    /* renamed from: PX */
    private boolean f19518PX;

    /* renamed from: Ta */
    private boolean f19519Ta;

    /* renamed from: VB */
    private int f19520VB;
    @Nullable

    /* renamed from: WR */
    private String f19521WR;

    /* renamed from: bX */
    private boolean f19522bX;
    @Nullable

    /* renamed from: eo */
    private String f19523eo;
    @NonNull
    private String eqN;

    /* renamed from: iR */
    private int f19524iR;
    @NonNull
    private String ldr;
    private volatile ConcurrentHashMap<String, C8891eqN.InterfaceC8901bg> rri;

    /* renamed from: tC */
    private C8718bX f19525tC;
    private int tuV;

    /* renamed from: vb */
    private Integer f19526vb;
    private Integer xxp;
    private Bitmap yDt;

    /* renamed from: zx */
    private String f19527zx;

    /* renamed from: com.bytedance.sdk.openadsdk.core.WR$bg */
    /* loaded from: classes3.dex */
    public static class C8846bg {

        /* renamed from: bg */
        private static final C8840WR f19539bg = new C8840WR();
    }

    public static void rri() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            VzQ = true;
        }
    }

    /* renamed from: tC */
    public static boolean m84698tC() {
        return VzQ;
    }

    /* renamed from: Fy */
    public int m84735Fy() {
        Integer num = this.xxp;
        if (num != null) {
            return num.intValue();
        }
        return C9353eqN.m82980bg("sp_global_privacy", "global_ccpa", -1);
    }

    /* renamed from: Kg */
    public int m84728Kg() {
        Integer num = this.f19517Lq;
        if (num != null) {
            return num.intValue();
        }
        return C9353eqN.m82980bg("sp_global_privacy", "sdk_coppa", -1);
    }

    /* renamed from: LZ */
    public void m84726LZ() {
        try {
            if (this.rri != null && this.rri.size() == 0) {
                this.rri = null;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: Lq */
    public boolean m84725Lq() {
        return true;
    }

    @Nullable
    /* renamed from: PX */
    public String m84724PX() {
        if (C9307IL.m83088bX()) {
            return C9353eqN.m82984IL("sp_global_file", "keywords", null);
        }
        return this.f19521WR;
    }

    @Nullable
    /* renamed from: Ta */
    public String m84723Ta() {
        if (C9307IL.m83088bX()) {
            return C9353eqN.m82984IL("sp_global_file", "extra_data", null);
        }
        return this.f19523eo;
    }

    /* renamed from: VB */
    public boolean m84722VB() {
        if (C9307IL.m83088bX()) {
            return C9353eqN.m82973bg("sp_global_file", "is_paid", false);
        }
        return this.f19515Kg;
    }

    public boolean VzQ() {
        return "com.union_test.internationad".equals(ayS.m82439zx());
    }

    /* renamed from: WR */
    public int m84721WR() {
        Integer num = this.f19526vb;
        if (num != null) {
            return num.intValue();
        }
        return C9353eqN.m82980bg("sp_global_privacy", "tt_gdpr", -1);
    }

    /* renamed from: eo */
    public int m84702eo() {
        int m82980bg = C9353eqN.m82980bg("sp_global_privacy", "global_coppa", -99);
        this.tuV = m82980bg;
        if (m82980bg == -99) {
            this.tuV = m84728Kg();
        }
        return this.tuV;
    }

    @Nullable
    public String eqN() {
        if (TextUtils.isEmpty(this.eqN)) {
            String m84706bg = m84706bg("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(m84706bg)) {
                this.eqN = m84706bg;
            }
        }
        return this.eqN;
    }

    /* renamed from: iR */
    public int m84700iR() {
        if (C9307IL.m83088bX()) {
            return C9353eqN.m82980bg("sp_global_icon_id", "icon_id", 0);
        }
        return this.f19524iR;
    }

    @NonNull
    public String ldr() {
        if (TextUtils.isEmpty(this.ldr)) {
            this.ldr = m84711bg(C8838VzQ.m84740bg());
        }
        return this.ldr;
    }

    public String tuV() {
        if (!TextUtils.isEmpty(this.f19516LZ)) {
            return this.f19516LZ;
        }
        String m82557bg = C9533WR.m82557bg();
        this.f19516LZ = m82557bg;
        if (!TextUtils.isEmpty(m82557bg)) {
            return this.f19516LZ;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        C9533WR.m82556bg(valueOf);
        this.f19516LZ = valueOf;
        return valueOf;
    }

    /* renamed from: vb */
    public Bitmap m84697vb() {
        if (C9307IL.m83088bX()) {
            return C7754eqN.m87833bg(C9353eqN.m82984IL("sp_global_file", "pause_icon", null));
        }
        return this.yDt;
    }

    public boolean xxp() {
        return f19512IL.contains(this.eqN);
    }

    public C8718bX yDt() {
        if (this.f19525tC == null) {
            this.f19525tC = new C8718bX(10, 8);
        }
        return this.f19525tC;
    }

    /* renamed from: zx */
    public String m84696zx() {
        String str = this.f19527zx;
        if (str != null) {
            return str;
        }
        String m84706bg = m84706bg("mediation_info", Long.MAX_VALUE);
        this.f19527zx = m84706bg;
        if (m84706bg == null) {
            this.f19527zx = "";
        }
        return this.f19527zx;
    }

    private C8840WR() {
        this.f19522bX = false;
        this.f19520VB = 0;
        this.f19518PX = true;
        this.f19519Ta = false;
        this.yDt = null;
        this.f19517Lq = null;
        this.f19526vb = null;
        this.xxp = null;
        this.tuV = 0;
        this.rri = null;
        try {
            C6509bg.m91676bg(C8838VzQ.m84740bg());
        } catch (Throwable unused) {
        }
    }

    @NonNull
    /* renamed from: IL */
    public static C8840WR m84734IL() {
        return C8846bg.f19539bg;
    }

    /* renamed from: bg */
    public static void m84710bg(InterfaceC8671Ta interfaceC8671Ta) {
        f19513bg = interfaceC8671Ta;
    }

    /* renamed from: bX */
    public boolean m84719bX() {
        return C9353eqN.m82973bg("sp_global_file", "sdk_activate_init", true);
    }

    /* renamed from: IL */
    public void m84729IL(boolean z) {
        C9353eqN.m82978bg("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    /* renamed from: bX */
    public void m84718bX(final int i) {
        if (i == 1) {
            i = 0;
        } else if (i == 0) {
            i = 1;
        }
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.f19526vb;
            if (num == null || num.intValue() != i) {
                this.f19526vb = Integer.valueOf(i);
                if (!C9519VJ.m82567zx()) {
                    m84731IL(num, i);
                } else {
                    C9095yDt.m83552IL().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.3
                        {
                            C8840WR.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            C8840WR.this.m84731IL(num, i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: bg */
    public boolean m84713bg() {
        return this.f19514Fy;
    }

    /* renamed from: Kg */
    private static void m84727Kg(String str) {
        InterfaceC8671Ta interfaceC8671Ta;
        if (TextUtils.isEmpty(str) && (interfaceC8671Ta = f19513bg) != null) {
            interfaceC8671Ta.fail(4000, "appid cannot be empty");
        }
        C7741PX.m87873bg("TTAD.GlobalInfo", "appid cannot be empty");
    }

    /* renamed from: WR */
    private static void m84720WR(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        InterfaceC8671Ta interfaceC8671Ta = f19513bg;
        if (interfaceC8671Ta != null) {
            interfaceC8671Ta.fail(4000, "Data is very long, the longest is 1000");
        }
        C7741PX.m87873bg("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    /* renamed from: eo */
    private static JSONObject m84701eo(String str) {
        String m82984IL = C9353eqN.m82984IL("sp_global_file", str, null);
        if (TextUtils.isEmpty(m82984IL)) {
            return null;
        }
        try {
            return new JSONObject(m82984IL);
        } catch (JSONException e) {
            C7741PX.m87873bg("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    /* renamed from: iR */
    public static boolean m84699iR(String str) {
        return (TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.utils.kMt.f21324bg || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    /* renamed from: IL */
    public void m84730IL(String str) {
        this.f19527zx = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m84704bg("mediation_info", str);
    }

    /* renamed from: bg */
    public void m84703bg(boolean z) {
        this.f19514Fy = z;
    }

    public void ldr(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.xxp;
            if (num == null || num.intValue() != i) {
                this.xxp = Integer.valueOf(i);
                if (!C9519VJ.m82567zx()) {
                    m84716bX(num, i);
                } else {
                    C9095yDt.m83552IL().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.5
                        {
                            C8840WR.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            C8840WR.this.m84716bX(num, i);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: bg */
    public void m84707bg(@NonNull String str) {
        m84727Kg(str);
        this.eqN = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m84704bg("app_id", str);
        C9011xxp.m83746zU().eqN(7);
    }

    /* renamed from: zx */
    public void m84695zx(int i) {
        if (C9307IL.m83088bX()) {
            C9353eqN.m82977bg("sp_global_file", "title_bar_theme", Integer.valueOf(i));
        }
        this.f19520VB = i;
    }

    public void eqN(int i) {
        if (i != 0 && i != 1) {
            i = -99;
        }
        C9353eqN.m82977bg("sp_global_privacy", "global_coppa", Integer.valueOf(i));
        this.tuV = i;
    }

    /* renamed from: IL */
    public void m84733IL(final int i) {
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.f19517Lq;
            if (num == null || num.intValue() != i) {
                this.f19517Lq = Integer.valueOf(i);
                if (!C9519VJ.m82567zx()) {
                    m84708bg(num, i);
                } else {
                    C9095yDt.m83552IL().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.2
                        {
                            C8840WR.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            C8840WR.this.m84708bg(num, i);
                        }
                    });
                }
            }
        }
    }

    public static Pair<String, Long> eqN(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject m84701eo = m84701eo(str);
            if (m84701eo == null) {
                return null;
            }
            return new Pair<>(m84701eo.getString("value"), Long.valueOf(m84701eo.getLong(Metric.f2405b)));
        } catch (JSONException e) {
            C7741PX.m87873bg("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    /* renamed from: zx */
    public C8891eqN.InterfaceC8901bg m84694zx(String str) {
        try {
            if (this.rri == null || str == null) {
                return null;
            }
            return this.rri.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bX */
    public void m84715bX(@Nullable final String str) {
        m84720WR(str);
        if (C9519VJ.m82567zx()) {
            C9095yDt.m83552IL().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.WR.4
                {
                    C8840WR.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C9307IL.m83088bX()) {
                        C9353eqN.m82974bg("sp_global_file", "extra_data", str);
                    }
                }
            });
        } else if (C9307IL.m83088bX()) {
            C9353eqN.m82974bg("sp_global_file", "extra_data", str);
        }
        this.f19523eo = str;
    }

    /* renamed from: bg */
    private String m84711bg(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public void ldr(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (C9307IL.m83088bX()) {
                C8126eo.m86962bg(6, str);
            } else if (this.rri != null) {
                this.rri.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: IL */
    public void m84731IL(Integer num, int i) {
        if (num == null) {
            if (C9353eqN.m82980bg("sp_global_privacy", "tt_gdpr", -1) != i) {
                C9353eqN.m82977bg("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
                C9011xxp.m83746zU().mo83779bg(4, true);
                return;
            }
            return;
        }
        C9353eqN.m82977bg("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
        C9011xxp.m83746zU().mo83779bg(4, true);
    }

    /* renamed from: bg */
    public void m84712bg(int i) {
        if (C9307IL.m83088bX()) {
            C9353eqN.m82977bg("sp_global_icon_id", "icon_id", Integer.valueOf(i));
        }
        this.f19524iR = i;
    }

    /* renamed from: bX */
    public void m84716bX(Integer num, int i) {
        if (num == null) {
            if (C9353eqN.m82980bg("sp_global_privacy", "global_ccpa", -1) != i) {
                C9353eqN.m82977bg("sp_global_privacy", "global_ccpa", Integer.valueOf(i));
                C9011xxp.m83746zU().mo83779bg(5, true);
                return;
            }
            return;
        }
        C9353eqN.m82977bg("sp_global_privacy", "global_ccpa", Integer.valueOf(i));
        C9011xxp.m83746zU().mo83779bg(5, true);
    }

    /* renamed from: bg */
    public void m84708bg(Integer num, int i) {
        if (num == null) {
            if (C9353eqN.m82980bg("sp_global_privacy", "sdk_coppa", -1) != i) {
                C9353eqN.m82977bg("sp_global_privacy", "sdk_coppa", Integer.valueOf(i));
                C9011xxp.m83746zU().mo83779bg(3, true);
                return;
            }
            return;
        }
        C9353eqN.m82977bg("sp_global_privacy", "sdk_coppa", Integer.valueOf(i));
        C9011xxp.m83746zU().mo83779bg(3, true);
    }

    /* renamed from: bX */
    public void m84714bX(boolean z) {
        this.f19522bX = z;
    }

    /* renamed from: bg */
    public static void m84704bg(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put(Metric.f2405b, System.currentTimeMillis());
            C9353eqN.m82974bg("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            C7741PX.m87873bg("TTAD.GlobalInfo", e.getMessage());
        }
    }

    /* renamed from: bg */
    public static String m84706bg(String str, long j) {
        JSONObject m84701eo;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            m84701eo = m84701eo(str);
        } catch (JSONException e) {
            C7741PX.m87873bg("TTAD.GlobalInfo", e.getMessage());
        }
        if (m84701eo == null) {
            return null;
        }
        if (System.currentTimeMillis() - m84701eo.getLong(Metric.f2405b) <= j) {
            return m84701eo.getString("value");
        }
        return null;
    }

    /* renamed from: bg */
    public void m84705bg(String str, C8891eqN.InterfaceC8901bg interfaceC8901bg) {
        try {
            if (TextUtils.isEmpty(str) || interfaceC8901bg == null) {
                return;
            }
            if (C9307IL.m83088bX()) {
                C8126eo.m86961bg(6, str, interfaceC8901bg);
                return;
            }
            if (this.rri == null) {
                synchronized (C8840WR.class) {
                    if (this.rri == null) {
                        this.rri = new ConcurrentHashMap<>();
                    }
                }
            }
            if (this.rri != null) {
                this.rri.put(str, interfaceC8901bg);
            }
        } catch (Throwable unused) {
        }
    }
}
