package com.bytedance.sdk.openadsdk.tuV;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.Kg */
/* loaded from: classes3.dex */
public class C9380Kg {
    private int ApA;
    private long CQc;
    private String DCn;
    private int DDQ;

    /* renamed from: Dt */
    private int f20913Dt;
    private String Dxa;
    private JSONObject FFy;

    /* renamed from: Fx */
    private String f20914Fx;

    /* renamed from: Fy */
    private String f20915Fy;

    /* renamed from: GR */
    private boolean f20916GR;

    /* renamed from: GZ */
    private boolean f20917GZ;
    private boolean Gih;
    private int GvG;
    private JSONObject HXG;

    /* renamed from: IE */
    private volatile boolean f20918IE;
    private String IEI;
    private ViewTreeObserver.OnGlobalLayoutListener IGR;

    /* renamed from: IL */
    public final String f20919IL;
    private String JAA;
    private String JMw;

    /* renamed from: Ja */
    private long f20920Ja;
    private boolean JaB;
    private int JlG;
    private int JxS;
    private int KRc;

    /* renamed from: Kg */
    private final Handler f20921Kg;
    private long LKE;

    /* renamed from: LZ */
    private String f20922LZ;

    /* renamed from: Ld */
    private int f20923Ld;

    /* renamed from: Lq */
    private C9375IL f20924Lq;

    /* renamed from: Ny */
    private EnumC9393bg f20925Ny;

    /* renamed from: PC */
    private boolean f20926PC;

    /* renamed from: PX */
    private final Handler f20927PX;
    private int Pae;
    private AbstractC9396bg RFq;

    /* renamed from: RJ */
    private boolean f20928RJ;
    private int RiO;

    /* renamed from: Ta */
    private Runnable f20929Ta;

    /* renamed from: Uq */
    private long f20930Uq;

    /* renamed from: Uw */
    private long f20931Uw;

    /* renamed from: VB */
    private Runnable f20932VB;
    private String VHL;

    /* renamed from: VJ */
    private long f20933VJ;

    /* renamed from: VW */
    private long f20934VW;

    /* renamed from: Vm */
    private volatile boolean f20935Vm;
    private boolean VzQ;

    /* renamed from: WR */
    private Runnable f20936WR;

    /* renamed from: Ys */
    private long f20937Ys;
    private long ZQc;
    private String ZTq;
    private String ZyO;
    private long aGH;
    private boolean aMs;
    private long ayS;
    private int bCU;

    /* renamed from: bN */
    private String f20938bN;
    private Context bOf;

    /* renamed from: bX */
    public final String f20939bX;

    /* renamed from: bg */
    public final String f20940bg;

    /* renamed from: bu */
    private String f20941bu;
    private int cZH;
    private int dFf;

    /* renamed from: dS */
    private JSONObject f20942dS;
    private long daV;
    private boolean dtS;
    private C9425ldr eDa;

    /* renamed from: eK */
    private float f20943eK;

    /* renamed from: eo */
    private Runnable f20944eo;
    public final String eqN;
    private int ews;

    /* renamed from: fE */
    private List<JSONObject> f20945fE;
    private Map<String, String> gCm;

    /* renamed from: gJ */
    private boolean f20946gJ;
    private String gXn;
    private String gtr;
    private int hff;

    /* renamed from: hi */
    private float f20947hi;
    private String huT;

    /* renamed from: iR */
    private final String f20948iR;

    /* renamed from: jA */
    private InterfaceC9395bX f20949jA;

    /* renamed from: jf */
    private JSONObject f20950jf;

    /* renamed from: jz */
    private int f20951jz;
    private boolean kMt;
    @Nullable

    /* renamed from: kU */
    private WebView f20952kU;

    /* renamed from: lM */
    private int f20953lM;
    private final String ldr;
    private int mLT;
    private int mZk;
    private int ovC;

    /* renamed from: qC */
    private String f20954qC;
    private boolean qSG;

    /* renamed from: qp */
    private WeakReference<View> f20955qp;
    private float rgo;

    /* renamed from: rr */
    private String f20956rr;
    private boolean rri;
    private int sVc;

    /* renamed from: tC */
    private boolean f20957tC;
    private Set<String> tuV;
    private int txA;

    /* renamed from: uV */
    private String f20958uV;
    private int uny;

    /* renamed from: uu */
    private String f20959uu;

    /* renamed from: vb */
    private boolean f20960vb;

    /* renamed from: wS */
    private int f20961wS;

    /* renamed from: wq */
    private boolean f20962wq;
    private int xFs;
    private boolean xxp;
    private Runnable yDt;
    private int yda;
    private long zCS;

    /* renamed from: zU */
    private int f20963zU;

    /* renamed from: zx */
    public final String f20964zx;

    /* renamed from: com.bytedance.sdk.openadsdk.tuV.Kg$bg */
    /* loaded from: classes3.dex */
    public enum EnumC9393bg {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private C9380Kg(Context context, WebView webView, InterfaceC9395bX interfaceC9395bX, AbstractC9396bg abstractC9396bg, EnumC9393bg enumC9393bg) {
        this.ldr = "playable_stuck_check_ping";
        this.f20948iR = "playable_apply_media_permission_callback";
        this.f20921Kg = new Handler(Looper.getMainLooper());
        this.f20927PX = new Handler(Looper.getMainLooper());
        this.f20960vb = true;
        this.xxp = true;
        this.VzQ = true;
        this.f20940bg = "PL_sdk_playable_global_viewable";
        this.f20919IL = "PL_sdk_page_screen_blank";
        this.f20939bX = "PL_sdk_playable_destroy_analyze_summary";
        this.eqN = "PL_sdk_playable_hardware_dialog_cancel";
        this.f20964zx = "PL_sdk_playable_hardware_dialog_setting";
        this.tuV = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.f20915Fy = null;
        this.f20922LZ = "embeded_ad";
        this.f20957tC = true;
        this.rri = true;
        this.kMt = false;
        this.JAA = "";
        this.f20920Ja = 10L;
        this.f20931Uw = 10L;
        this.DDQ = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
        this.f20930Uq = 0L;
        this.aGH = 0L;
        this.f20934VW = -1L;
        this.f20933VJ = -1L;
        this.daV = -1L;
        this.ayS = -1L;
        this.ZQc = -1L;
        this.LKE = -1L;
        this.CQc = -1L;
        this.f20959uu = "";
        this.f20954qC = "";
        this.Dxa = "";
        this.f20938bN = "";
        this.f20951jz = 0;
        this.Pae = 0;
        this.f20928RJ = false;
        this.txA = 0;
        this.sVc = -1;
        this.ApA = 0;
        this.GvG = 0;
        this.f20953lM = 0;
        this.gXn = null;
        this.f20917GZ = false;
        this.bCU = 0;
        this.f20923Ld = 0;
        this.f20961wS = 0;
        this.cZH = 0;
        this.zCS = 0L;
        this.f20937Ys = 0L;
        this.RiO = -2;
        this.f20913Dt = 0;
        this.hff = 0;
        this.xFs = 0;
        this.f20950jf = new JSONObject();
        this.gCm = new HashMap();
        this.FFy = new JSONObject();
        this.f20941bu = "";
        this.f20947hi = 0.0f;
        this.f20943eK = 0.0f;
        this.f20916GR = false;
        this.f20946gJ = false;
        this.dtS = false;
        this.f20945fE = new ArrayList();
        this.aMs = true;
        this.f20918IE = true;
        this.f20935Vm = true;
        this.IGR = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) C9380Kg.this.f20955qp.get();
                    if (view != null) {
                        C9380Kg.this.m82885IL(view);
                    }
                } catch (Throwable th) {
                    C9423iR.m82732bg("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.dFf = -1;
        this.RiO = 0;
        this.f20925Ny = enumC9393bg;
        this.f20952kU = webView;
        C9394WR.m82805bg(webView);
        m82837bg(webView);
        m82838bg(context, interfaceC9395bX, abstractC9396bg);
    }

    private void Dxa() {
        Runnable runnable;
        Runnable runnable2;
        this.f20924Lq.m82903bg(System.currentTimeMillis());
        Handler handler = this.f20927PX;
        if (handler != null) {
            int i = this.RiO;
            if (i == 0 && (runnable2 = this.f20929Ta) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.yDt) != null) {
                handler.post(runnable);
            }
            this.f20924Lq.m82904bg(500);
        }
    }

    /* renamed from: PX */
    static /* synthetic */ int m82868PX(C9380Kg c9380Kg) {
        int i = c9380Kg.f20951jz;
        c9380Kg.f20951jz = i + 1;
        return i;
    }

    /* renamed from: Ta */
    static /* synthetic */ int m82865Ta(C9380Kg c9380Kg) {
        int i = c9380Kg.Pae;
        c9380Kg.Pae = i + 1;
        return i;
    }

    /* renamed from: qC */
    private void m82819qC() {
        String str;
        if (this.FFy == null || (str = this.f20956rr) == null || str.contains("/cid_")) {
            return;
        }
        String optString = this.FFy.optString("cid");
        if (!TextUtils.isEmpty(optString)) {
            String host = Uri.parse(this.f20956rr).getHost();
            if (TextUtils.isEmpty(host)) {
                this.f20956rr += "/cid_" + optString;
                return;
            }
            this.f20956rr = this.f20956rr.replace(host, host + "/cid_" + optString);
        }
    }

    /* renamed from: uu */
    private void m82817uu() {
        this.f20924Lq = new C9375IL(this, this.DDQ);
        this.f20936WR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.5
            @Override // java.lang.Runnable
            public void run() {
                if (C9380Kg.this.f20957tC) {
                    C9380Kg.this.f20957tC = false;
                    C9380Kg.this.f20921Kg.removeCallbacks(C9380Kg.this.f20944eo);
                    C9380Kg.this.m82842bg(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.f20944eo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.6
            @Override // java.lang.Runnable
            public void run() {
                if (C9380Kg.this.f20957tC) {
                    C9380Kg.this.f20957tC = false;
                    C9380Kg.this.f20918IE = false;
                    C9380Kg.this.f20921Kg.removeCallbacks(C9380Kg.this.f20936WR);
                    C9380Kg.this.m82842bg(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.f20929Ta = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (C9380Kg.this.f20952kU != null) {
                    C9380Kg.this.f20952kU.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.7.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: bg */
                        public void onReceiveValue(String str) {
                            if (C9380Kg.this.f20924Lq != null) {
                                C9380Kg.this.f20924Lq.m82903bg(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (C9380Kg.this.f20927PX != null) {
                    C9380Kg.this.f20927PX.postDelayed(this, 500L);
                }
            }
        };
        this.yDt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                C9380Kg.this.m82830bg("playable_stuck_check_ping", new JSONObject());
                if (C9380Kg.this.f20927PX != null) {
                    C9380Kg.this.f20927PX.postDelayed(this, 500L);
                }
            }
        };
        this.f20932VB = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.9
            @Override // java.lang.Runnable
            public void run() {
                if (C9380Kg.this.f20937Ys > 0) {
                    if (C9380Kg.this.f20937Ys - C9380Kg.this.zCS <= C9380Kg.this.DDQ) {
                        C9380Kg.this.m82858VW();
                        C9380Kg.this.zCS = 0L;
                        C9380Kg.this.f20937Ys = 0L;
                        return;
                    }
                    C9380Kg.this.m82887IL(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                C9380Kg.this.m82887IL(1, "Clicking on the hot zone causes the program to freeze.");
            }
        };
    }

    public int CQc() {
        return this.dFf;
    }

    public void DDQ() {
        C9375IL c9375il;
        this.f20937Ys = System.currentTimeMillis();
        int i = this.RiO;
        if ((i == 1 || i == 2) && (c9375il = this.f20924Lq) != null) {
            c9375il.m82903bg(System.currentTimeMillis());
        }
    }

    /* renamed from: Fy */
    public JSONObject m82890Fy() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.rgo);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.ovC);
            jSONObject2.put("height", this.ews);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.uny);
            jSONObject3.put("y", this.f20963zU);
            jSONObject3.put("width", this.JxS);
            jSONObject3.put("height", this.KRc);
            jSONObject.put(C21114v8.C21122h.f54036K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.JlG);
            jSONObject4.put("y", this.yda);
            jSONObject4.put("width", this.mZk);
            jSONObject4.put("height", this.mLT);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void JAA() {
        if (this.RFq != null) {
            EnumC9393bg enumC9393bg = EnumC9393bg.LAND_PAGE;
        }
    }

    /* renamed from: Ja */
    public void m82876Ja() {
        if (this.RFq != null) {
            EnumC9393bg enumC9393bg = EnumC9393bg.LAND_PAGE;
        }
    }

    public String LKE() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    /* renamed from: LZ */
    public void m82871LZ() {
        AbstractC9396bg abstractC9396bg = this.RFq;
        if (abstractC9396bg != null) {
            abstractC9396bg.mo82757IL();
        }
    }

    /* renamed from: Lq */
    public JSONObject m82870Lq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.f20925Ny.ordinal());
            jSONObject.put("safe_area_top_height", this.f20947hi);
            jSONObject.put("safe_area_bottom_height", this.f20943eK);
            jSONObject.put("playable_enter_from", this.GvG);
            jSONObject.put("playable_retry_count", this.ApA);
            jSONObject.put("playable_card_session", this.f20959uu);
            jSONObject.put("playable_video_session", this.f20954qC);
            jSONObject.put("playable_network_type", m82816vb());
            jSONObject.put("aweme_id", this.f20938bN);
            return jSONObject;
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    /* renamed from: Uq */
    public void m82864Uq() {
        int i;
        int i2 = this.RiO;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.f20918IE) {
                this.f20921Kg.postDelayed(this.f20936WR, this.f20920Ja * 1000);
            }
            if ((this.f20935Vm && m82867PX(this.f20956rr)) || (i = this.RiO) == 1 || i == 2) {
                this.f20921Kg.postDelayed(this.f20944eo, this.f20931Uw * 1000);
            }
        }
    }

    /* renamed from: Uw */
    public void m82863Uw() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.ZQc > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.ZQc);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.daV > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.daV);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            m82848bX("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: VJ */
    public void m82859VJ() {
        try {
            C9375IL c9375il = this.f20924Lq;
            if (c9375il != null) {
                c9375il.m82905bg();
            }
            Handler handler = this.f20927PX;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* renamed from: VW */
    public void m82858VW() {
        if (!this.rri) {
            return;
        }
        this.LKE = System.currentTimeMillis();
        if (this.f20925Ny == EnumC9393bg.FEED_AWEME) {
            if (this.f20962wq && this.f20913Dt == 3) {
                C9375IL c9375il = this.f20924Lq;
                if (c9375il != null && c9375il.m82908IL()) {
                    Dxa();
                } else if (this.f20924Lq == null) {
                    this.f20924Lq = new C9375IL(this, this.DDQ);
                    Dxa();
                }
            }
        } else if (this.f20962wq && this.f20913Dt == 2) {
            C9375IL c9375il2 = this.f20924Lq;
            if (c9375il2 != null && c9375il2.m82908IL()) {
                Dxa();
            } else if (this.f20924Lq == null) {
                this.f20924Lq = new C9375IL(this, this.DDQ);
                Dxa();
            }
        }
    }

    public JSONObject VzQ() {
        if (this.f20950jf.isNull("width")) {
            View view = this.f20955qp.get();
            if (view == null) {
                return this.f20950jf;
            }
            m82885IL(view);
        }
        return this.f20950jf;
    }

    public int ZQc() {
        if (this.f20933VJ != -1 && this.f20962wq) {
            return 2;
        }
        return 1;
    }

    public void aGH() {
        this.f20935Vm = false;
        this.f20921Kg.removeCallbacks(this.f20944eo);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.daV > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.daV);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            m82848bX("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void ayS() {
        if (this.dtS) {
            return;
        }
        this.dtS = true;
        this.aGH = 0L;
        this.xxp = true;
        daV();
        try {
            View view = this.f20955qp.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.IGR);
            }
        } catch (Throwable unused) {
        }
        try {
            C9375IL c9375il = this.f20924Lq;
            if (c9375il != null) {
                c9375il.m82905bg();
                this.f20924Lq = null;
            }
            Handler handler = this.f20927PX;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.f20956rr)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.f20951jz);
                jSONObject.put("playable_hit_times", this.Pae);
                int i = this.f20951jz;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", this.Pae / (i * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                m82848bX("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused2) {
        }
        try {
            if (!TextUtils.isEmpty(this.f20956rr)) {
                if (this.f20934VW != -1) {
                    this.f20930Uq += System.currentTimeMillis() - this.f20934VW;
                    this.f20934VW = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.f20930Uq);
                m82848bX("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused3) {
        }
        this.f20918IE = false;
        this.f20935Vm = false;
        this.f20921Kg.removeCallbacks(this.f20936WR);
        this.f20921Kg.removeCallbacks(this.f20944eo);
        this.f20921Kg.removeCallbacksAndMessages(null);
    }

    public void daV() {
        this.hff = 0;
        this.xFs = 0;
        this.rgo = 0.0f;
        this.ovC = 0;
        this.ews = 0;
        this.f20963zU = 0;
        this.uny = 0;
        this.JxS = 0;
        this.KRc = 0;
        this.yda = 0;
        this.JlG = 0;
        this.mZk = 0;
        this.mLT = 0;
    }

    public void kMt() {
        this.f20917GZ = true;
    }

    public void rri() {
        this.sVc = 2;
    }

    /* renamed from: tC */
    public void m82818tC() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.ZQc > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.ZQc);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.daV > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.daV;
                this.CQc = currentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", currentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            m82848bX("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public JSONObject tuV() {
        return this.FFy;
    }

    /* renamed from: vb */
    public String m82816vb() {
        AbstractC9396bg abstractC9396bg;
        if (TextUtils.isEmpty(this.Dxa) && (abstractC9396bg = this.RFq) != null) {
            this.Dxa = abstractC9396bg.mo82756bg().toString();
        }
        return this.Dxa;
    }

    public AbstractC9396bg xxp() {
        return this.RFq;
    }

    public JSONObject yDt() {
        boolean m82716bg;
        boolean m82716bg2;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                m82716bg = C9490zx.m82716bg(this.bOf, "android.permission.READ_MEDIA_IMAGES");
                m82716bg2 = true;
            } else {
                m82716bg = C9490zx.m82716bg(this.bOf, "android.permission.READ_EXTERNAL_STORAGE");
                m82716bg2 = C9490zx.m82716bg(this.bOf, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", m82716bg);
            jSONObject.put("isHasWrite", m82716bg2);
            if (!m82716bg || !m82716bg2) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    /* renamed from: PX */
    private boolean m82867PX(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    /* renamed from: Kg */
    public boolean m82875Kg() {
        return this.qSG;
    }

    /* renamed from: Ta */
    public JSONObject m82866Ta() {
        try {
            boolean m82716bg = C9490zx.m82716bg(this.bOf, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", m82716bg);
            return jSONObject;
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    /* renamed from: VB */
    public Set<String> m82862VB() {
        return this.eDa.m82727bg();
    }

    /* renamed from: WR */
    public boolean m82857WR() {
        return this.f20962wq;
    }

    /* renamed from: bX */
    public JSONObject m82853bX() {
        return this.HXG;
    }

    /* renamed from: eo */
    public JSONObject m82826eo() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.Gih);
            return jSONObject;
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public String eqN() {
        return this.ZyO;
    }

    /* renamed from: iR */
    public String m82823iR() {
        return this.f20958uV;
    }

    public String ldr() {
        return this.ZTq;
    }

    /* renamed from: zx */
    public String m82815zx() {
        return this.huT;
    }

    /* renamed from: Kg */
    public JSONObject m82872Kg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            jSONObject2.put("result", C9490zx.m82719IL(this.bOf, "android.permission.RECORD_AUDIO"));
        } else if (optInt != 2) {
            if (optInt == 3) {
                jSONObject2.put("result", C9490zx.m82718bg(this.bOf));
            }
            return jSONObject2;
        } else {
            jSONObject2.put("result", C9490zx.m82719IL(this.bOf, "android.permission.CAMERA"));
        }
        return jSONObject2;
    }

    /* renamed from: PX */
    public JSONObject m82869PX() {
        try {
            boolean m82716bg = C9490zx.m82716bg(this.bOf, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", m82716bg);
            return jSONObject;
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    /* renamed from: VB */
    public void m82860VB(String str) {
        this.f20921Kg.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.3
            @Override // java.lang.Runnable
            public void run() {
                C9380Kg.m82865Ta(C9380Kg.this);
            }
        });
    }

    /* renamed from: WR */
    public void m82855WR(String str) {
        WebView webView;
        boolean z = this.f20913Dt == -1;
        this.f20913Dt = 2;
        if (!z) {
            this.gtr = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.ayS = currentTimeMillis;
                long j = this.daV;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? currentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", ZQc());
            } catch (Throwable th) {
                C9423iR.m82732bg("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            m82848bX("PL_sdk_html_load_finish", jSONObject);
        }
        this.f20918IE = false;
        this.f20921Kg.removeCallbacks(this.f20936WR);
        try {
            if (this.RiO == 0) {
                if (this.f20960vb && (webView = this.f20952kU) != null) {
                    this.f20960vb = false;
                    webView.evaluateJavascript(LKE(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                m82858VW();
            }
        } catch (Throwable th2) {
            C9423iR.m82732bg("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    /* renamed from: bX */
    public C9380Kg m82850bX(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.HXG = jSONObject;
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public C9380Kg eqN(String str) {
        this.ZTq = str;
        return this;
    }

    /* renamed from: iR */
    public C9380Kg m82821iR(String str) {
        Uri parse;
        String scheme;
        int indexOf;
        String decode;
        this.f20941bu = str;
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Throwable unused) {
        }
        if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
            String host = parse.getHost();
            if (!C21114v8.C21122h.f54036K.equalsIgnoreCase(host) && (host == null || !host.contains(C21114v8.C21122h.f54036K))) {
                if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.RiO == -1) {
                        m82888IL(2);
                    } else {
                        m82888IL(1);
                    }
                }
                this.f20956rr = str;
                return this;
            }
            m82888IL(0);
            String queryParameter = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter) && (decode = Uri.decode(queryParameter)) != null) {
                int indexOf2 = decode.indexOf("?");
                str = indexOf2 != -1 ? decode.substring(0, indexOf2) : decode;
            }
            this.f20956rr = str;
            return this;
        }
        m82888IL(0);
        if (str != null && (indexOf = str.indexOf("?")) != -1) {
            str = str.substring(0, indexOf);
        }
        this.f20956rr = str;
        return this;
    }

    public C9380Kg ldr(String str) {
        this.f20922LZ = str;
        return this;
    }

    /* renamed from: zx */
    public C9380Kg m82813zx(String str) {
        this.f20958uV = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m82885IL(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.hff == view.getWidth() && this.xFs == view.getHeight()) {
                return;
            }
            this.hff = view.getWidth();
            this.xFs = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.hff);
            jSONObject.put("height", this.xFs);
            m82830bg("resize", jSONObject);
            this.f20950jf = jSONObject;
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public C9380Kg eqN(boolean z) {
        this.Gih = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.Gih);
            m82830bg("change_playable_click", jSONObject);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public void ldr(JSONObject jSONObject) {
        m82887IL(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    /* renamed from: zx */
    public void m82811zx(JSONObject jSONObject) {
        this.f20942dS = jSONObject;
        this.f20953lM++;
        m82859VJ();
        this.f20921Kg.removeCallbacks(this.f20932VB);
        if (this.rri) {
            this.LKE = System.currentTimeMillis();
            this.zCS = System.currentTimeMillis();
            this.f20937Ys = 0L;
            int i = this.RiO;
            if (i == 0) {
                WebView webView = this.f20952kU;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.10
                        @Override // android.webkit.ValueCallback
                        /* renamed from: bg */
                        public void onReceiveValue(String str) {
                            C9380Kg.this.f20937Ys = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                m82830bg("playable_stuck_check_ping", new JSONObject());
            }
            this.f20921Kg.postDelayed(this.f20932VB, this.DDQ);
        }
    }

    /* renamed from: bg */
    private void m82838bg(Context context, InterfaceC9395bX interfaceC9395bX, AbstractC9396bg abstractC9396bg) {
        this.f20915Fy = UUID.randomUUID().toString();
        this.bOf = context;
        this.RFq = abstractC9396bg;
        this.f20949jA = interfaceC9395bX;
        C9421eo.m82735bg(abstractC9396bg);
        this.eDa = new C9425ldr(this);
        m82817uu();
        if (this.f20952kU == null) {
            this.dFf = 4;
            this.f20921Kg.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.4
                @Override // java.lang.Runnable
                public void run() {
                    C9380Kg.this.m82842bg(5, "webview is null");
                }
            });
        }
    }

    /* renamed from: eo */
    public void m82824eo(String str) {
        this.f20921Kg.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.2
            @Override // java.lang.Runnable
            public void run() {
                C9380Kg.m82868PX(C9380Kg.this);
            }
        });
    }

    public void ldr(boolean z) {
        this.f20926PC = z;
    }

    /* renamed from: bX */
    public C9380Kg m82846bX(boolean z) {
        if (this.dFf == -1 || this.f20962wq == z) {
            return this;
        }
        this.f20962wq = z;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.f20962wq) {
                jSONObject.put("playable_background_show_type", this.f20923Ld);
            }
        } catch (JSONException unused) {
        }
        m82848bX(this.f20962wq ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.f20933VJ == -1 && this.f20962wq) {
            this.f20933VJ = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", this.dFf == 1 ? 1 : 2);
                int i = this.dFf;
                if (i != -1) {
                    jSONObject2.put("webview_state", i);
                }
            } catch (JSONException unused2) {
            }
            m82848bX("PL_sdk_page_show", jSONObject2);
        }
        if (this.f20933VJ != -1 && !this.f20962wq && !this.f20916GR) {
            this.f20916GR = true;
        }
        if (this.f20962wq) {
            this.f20934VW = System.currentTimeMillis();
        } else if (this.f20934VW != -1) {
            this.f20930Uq += System.currentTimeMillis() - this.f20934VW;
            this.f20934VW = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.f20962wq);
            m82830bg(C21114v8.C21121g.f53980U, jSONObject3);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "setViewable error", th);
        }
        if (this.f20962wq) {
            m82858VW();
        } else {
            m82859VJ();
        }
        return this;
    }

    /* renamed from: Kg */
    public void m82873Kg(String str) {
        this.f20913Dt = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.daV = currentTimeMillis;
            long j = this.f20933VJ;
            jSONObject.put("playable_page_show_duration", j != -1 ? currentTimeMillis - j : 0L);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        m82848bX("PL_sdk_html_load_start", jSONObject);
        this.f20918IE = true;
        this.f20935Vm = true;
        if (this.aMs) {
            m82864Uq();
            this.f20918IE = false;
            this.f20935Vm = false;
        }
        if (this.xxp) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (C9490zx.m82717bg(this.bOf, C9490zx.f21119PX)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (C9490zx.m82719IL(this.bOf, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C9490zx.m82717bg(this.bOf, C9490zx.f21120VB)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C9490zx.m82717bg(this.bOf, C9490zx.f21124eo)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C9490zx.m82717bg(this.bOf, C9490zx.f21121WR)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C9490zx.m82717bg(this.bOf, C9490zx.f21118Kg)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (C9490zx.m82719IL(this.bOf, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (C9490zx.m82717bg(this.bOf, C9490zx.f21125iR)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (C9490zx.m82718bg(this.bOf)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                m82848bX("PL_sdk_hardware_detect", jSONObject2);
                this.xxp = false;
            } catch (Throwable th2) {
                C9423iR.m82732bg("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public void eqN(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.gXn = jSONObject.optString("section");
        }
    }

    private String eqN(String str, String str2) {
        String format = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.f20956rr = format;
        return format;
    }

    public JSONObject eqN(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (C9423iR.m82734bg() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject m82725bg = this.eDa.m82725bg(str, jSONObject);
        if (C9423iR.m82734bg()) {
            System.currentTimeMillis();
            if (m82725bg != null) {
                m82725bg.toString();
            }
        }
        return m82725bg;
    }

    /* renamed from: IL */
    public Map<String, String> m82889IL() {
        return this.gCm;
    }

    /* renamed from: IL */
    public C9380Kg m82881IL(String str) {
        this.ZyO = str;
        return this;
    }

    /* renamed from: IL */
    public C9380Kg m82877IL(boolean z) {
        this.JaB = z;
        return this;
    }

    /* renamed from: bg */
    public void m82837bg(View view) {
        if (view == null) {
            return;
        }
        try {
            this.f20955qp = new WeakReference<>(view);
            m82885IL(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.IGR);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    /* renamed from: IL */
    public C9380Kg m82886IL(long j) {
        if (j <= 0) {
            this.f20931Uw = 10L;
        } else {
            this.f20931Uw = j;
        }
        return this;
    }

    /* renamed from: zx */
    private void m82812zx(String str, JSONObject jSONObject) {
        try {
            int i = this.RiO;
            if (i == 0) {
                if (this.f20925Ny != EnumC9393bg.LAND_PAGE && !m82867PX(this.f20956rr)) {
                    m82819qC();
                }
                jSONObject.put("playable_url", this.f20956rr);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", m82849bX(this.DCn, this.f20914Fx));
                    }
                }
                jSONObject.put("playable_url", eqN(this.JMw, this.VHL));
            }
            jSONObject.put("playable_render_type", this.RiO);
            if (this.RFq != null) {
                if (this.RiO == 0 && (this.f20925Ny != EnumC9393bg.LAND_PAGE || m82867PX(this.f20956rr))) {
                    this.RFq.mo82754bg(jSONObject);
                } else if (this.RiO != 0) {
                    this.RFq.mo82754bg(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: IL */
    public void m82878IL(JSONObject jSONObject) {
        if (this.RFq != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: bg */
    public Context m82845bg() {
        return this.bOf;
    }

    /* renamed from: IL */
    public void m82880IL(String str, String str2) {
        Bitmap m82715bg;
        if (TextUtils.isEmpty(str2) || (m82715bg = C9490zx.m82715bg(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.bOf.getContentResolver(), m82715bg, str, "");
    }

    /* renamed from: bg */
    public C9380Kg m82831bg(String str, String str2) {
        this.gCm.put(str, str2);
        return this;
    }

    /* renamed from: WR */
    public void m82854WR(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("success", true);
            if (optBoolean) {
                this.f20913Dt = 3;
                m82858VW();
            } else {
                this.f20913Dt = -2;
            }
            if (optBoolean || !this.f20957tC) {
                return;
            }
            this.f20957tC = false;
            this.f20918IE = false;
            this.f20935Vm = false;
            this.f20921Kg.removeCallbacks(this.f20936WR);
            this.f20921Kg.removeCallbacks(this.f20944eo);
            m82842bg(4, "CaseRenderFail");
        }
    }

    /* renamed from: bg */
    public C9380Kg m82832bg(String str) {
        this.huT = str;
        return this;
    }

    /* renamed from: bg */
    public C9380Kg m82828bg(boolean z) {
        this.qSG = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.qSG);
            m82830bg("volumeChange", jSONObject);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    /* renamed from: IL */
    public C9380Kg m82888IL(int i) {
        this.RiO = i;
        return this;
    }

    /* renamed from: iR */
    public JSONObject m82820iR(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt != 1) {
            if (optInt != 2) {
                return optInt != 3 ? jSONObject2 : yDt();
            }
            return m82866Ta();
        }
        return m82869PX();
    }

    /* renamed from: IL */
    public void m82887IL(int i, String str) {
        this.sVc = i;
        if (this.f20942dS == null) {
            this.f20942dS = new JSONObject();
        }
        try {
            this.f20942dS.put("playable_stuck_type", i);
            this.f20942dS.put("playable_stuck_reason", str);
            if (this.LKE > 0) {
                this.f20942dS.put("playable_stuck_duration", System.currentTimeMillis() - this.LKE);
            } else {
                this.f20942dS.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        m82848bX("PL_sdk_page_stuck", this.f20942dS);
        m82859VJ();
        if (this.RFq == null || i != 2) {
            return;
        }
        this.f20942dS = new JSONObject();
    }

    /* renamed from: bg */
    public C9380Kg m82840bg(long j) {
        if (j <= 0) {
            this.f20920Ja = 10L;
        } else {
            this.f20920Ja = j;
        }
        return this;
    }

    /* renamed from: bg */
    public void m82843bg(int i) {
        this.dFf = i;
    }

    /* renamed from: zx */
    public C9380Kg m82810zx(boolean z) {
        this.aMs = z;
        return this;
    }

    /* renamed from: bg */
    public void m82829bg(JSONObject jSONObject) {
        AbstractC9396bg abstractC9396bg = this.RFq;
        if (abstractC9396bg == null || abstractC9396bg.m82804IL(jSONObject) || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("resource_type", -1);
        String optString2 = jSONObject.optString("resource_name", "playable_media");
        if (optInt == 1) {
            m82880IL(optString2, optString);
        }
    }

    /* renamed from: bX */
    public C9380Kg m82847bX(JSONObject jSONObject) {
        this.FFy = jSONObject;
        return this;
    }

    /* renamed from: bX */
    private void m82852bX(int i, String str) {
        AbstractC9396bg abstractC9396bg = this.RFq;
        if (abstractC9396bg != null) {
            abstractC9396bg.mo82755bg(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: IL */
    public void m82879IL(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m82812zx(str, jSONObject);
    }

    /* renamed from: bg */
    public void m82830bg(String str, JSONObject jSONObject) {
        if (C9423iR.m82734bg() && jSONObject != null) {
            jSONObject.toString();
        }
        InterfaceC9395bX interfaceC9395bX = this.f20949jA;
        if (interfaceC9395bX != null) {
            interfaceC9395bX.mo82758bg(str, jSONObject);
        }
    }

    /* renamed from: bX */
    private String m82849bX(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.IEI) && !TextUtils.isEmpty(this.f20941bu)) {
            Uri parse = Uri.parse(this.f20941bu);
            String host = parse.getHost();
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter = parse.getQueryParameter("surl");
                queryParameter2 = parse.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
                queryParameter2 = "";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(parse.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                appendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.IEI = appendQueryParameter.toString();
        }
        return this.IEI;
    }

    /* renamed from: bg */
    public C9380Kg m82844bg(float f) {
        this.rgo = f;
        return this;
    }

    /* renamed from: bg */
    protected void m82842bg(int i, String str) {
        m82859VJ();
        m82852bX(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "reportRenderFatal error", th);
        }
        m82848bX("PL_sdk_global_faild", jSONObject);
    }

    /* renamed from: bg */
    public void m82841bg(int i, String str, String str2) {
        this.f20913Dt = -1;
        this.gtr = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", ZQc());
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "onWebReceivedError error", th);
        }
        m82848bX("PL_sdk_html_load_error", jSONObject);
        if (this.f20957tC) {
            this.f20957tC = false;
            this.f20918IE = false;
            this.f20935Vm = false;
            this.f20921Kg.removeCallbacks(this.f20936WR);
            this.f20921Kg.removeCallbacks(this.f20944eo);
            m82842bg(1, "ContainerLoadFail");
        }
    }

    /* renamed from: bX */
    public void m82848bX(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.f20928RJ && this.Pae > 0) {
                this.f20928RJ = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.f20926PC ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.f20962wq);
            jSONObject.put("playable_session_id", this.f20915Fy);
            int i = this.RiO;
            if (i == 0) {
                if (this.f20925Ny != EnumC9393bg.LAND_PAGE && !m82867PX(this.f20956rr)) {
                    m82819qC();
                }
                jSONObject.put("playable_url", this.f20956rr);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", m82849bX(this.DCn, this.f20914Fx));
                    }
                }
                jSONObject.put("playable_url", eqN(this.JMw, this.VHL));
            }
            jSONObject.put("playable_full_url", this.f20941bu);
            jSONObject.put("playable_replay_count", this.txA);
            jSONObject.put("playable_is_prerender", this.JaB);
            jSONObject.put("playable_is_preload", this.f20928RJ);
            jSONObject.put("playable_render_type", this.RiO);
            jSONObject.put("playable_scenes_type", this.f20925Ny.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.DCn) ? "" : this.DCn);
            if (!TextUtils.isEmpty(this.f20914Fx)) {
                str2 = this.f20914Fx;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.JMw);
            jSONObject.put("playable_minigamelite_schema", this.VHL);
            jSONObject.put("playable_is_debug", this.f20946gJ);
            jSONObject.put("playable_retry_count", this.ApA);
            jSONObject.put("playable_enter_from", this.GvG);
            jSONObject.put("playable_sequence", this.f20953lM);
            jSONObject.put("playable_current_section", this.gXn);
            jSONObject.put("is_playable_finish", this.f20917GZ);
            jSONObject.put("playable_card_session", this.f20959uu);
            jSONObject.put("playable_video_session", this.f20954qC);
            jSONObject.put("playable_network_type", m82816vb());
            jSONObject.put("playable_lynx_version", this.JAA);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.f20922LZ);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.FFy.opt("cid"));
            jSONObject2.put("log_extra", this.FFy.opt("log_extra"));
            int i2 = this.RiO;
            if (i2 != -1 && i2 != -2) {
                if (this.RFq != null) {
                    List<JSONObject> list = this.f20945fE;
                    if (list != null && !list.isEmpty()) {
                        for (JSONObject jSONObject3 : this.f20945fE) {
                            JSONObject optJSONObject = jSONObject3.optJSONObject("ad_extra_data");
                            if (optJSONObject != null) {
                                optJSONObject.put("playable_render_type", this.RiO);
                                optJSONObject.put("playable_url", this.f20956rr);
                            }
                            this.RFq.mo82754bg(optJSONObject);
                        }
                        this.f20945fE.clear();
                    }
                    if (this.RiO == 0 && (this.f20925Ny != EnumC9393bg.LAND_PAGE || m82867PX(this.f20956rr))) {
                        this.RFq.mo82754bg(jSONObject);
                        return;
                    } else if (this.RiO != 0) {
                        this.RFq.mo82754bg(jSONObject);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (this.f20945fE == null) {
                this.f20945fE = new ArrayList();
            }
            this.f20945fE.add(jSONObject2);
        } catch (Throwable th) {
            C9423iR.m82732bg("PlayablePlugin", "reportEvent error", th);
        }
    }

    /* renamed from: bg */
    public void m82827bg(boolean z, String str, int i) {
        if (z) {
            this.f20913Dt = -1;
            this.gtr = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", ZQc());
            } catch (Throwable th) {
                C9423iR.m82732bg("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            m82848bX("PL_sdk_html_load_error", jSONObject);
            if (this.f20957tC) {
                this.f20957tC = false;
                this.f20918IE = false;
                this.f20935Vm = false;
                this.f20921Kg.removeCallbacks(this.f20936WR);
                this.f20921Kg.removeCallbacks(this.f20944eo);
                m82842bg(1, "ContainerLoadFail");
            }
        }
    }

    private C9380Kg(Context context, int i, InterfaceC9395bX interfaceC9395bX, AbstractC9396bg abstractC9396bg) {
        this.ldr = "playable_stuck_check_ping";
        this.f20948iR = "playable_apply_media_permission_callback";
        this.f20921Kg = new Handler(Looper.getMainLooper());
        this.f20927PX = new Handler(Looper.getMainLooper());
        this.f20960vb = true;
        this.xxp = true;
        this.VzQ = true;
        this.f20940bg = "PL_sdk_playable_global_viewable";
        this.f20919IL = "PL_sdk_page_screen_blank";
        this.f20939bX = "PL_sdk_playable_destroy_analyze_summary";
        this.eqN = "PL_sdk_playable_hardware_dialog_cancel";
        this.f20964zx = "PL_sdk_playable_hardware_dialog_setting";
        this.tuV = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.f20915Fy = null;
        this.f20922LZ = "embeded_ad";
        this.f20957tC = true;
        this.rri = true;
        this.kMt = false;
        this.JAA = "";
        this.f20920Ja = 10L;
        this.f20931Uw = 10L;
        this.DDQ = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
        this.f20930Uq = 0L;
        this.aGH = 0L;
        this.f20934VW = -1L;
        this.f20933VJ = -1L;
        this.daV = -1L;
        this.ayS = -1L;
        this.ZQc = -1L;
        this.LKE = -1L;
        this.CQc = -1L;
        this.f20959uu = "";
        this.f20954qC = "";
        this.Dxa = "";
        this.f20938bN = "";
        this.f20951jz = 0;
        this.Pae = 0;
        this.f20928RJ = false;
        this.txA = 0;
        this.sVc = -1;
        this.ApA = 0;
        this.GvG = 0;
        this.f20953lM = 0;
        this.gXn = null;
        this.f20917GZ = false;
        this.bCU = 0;
        this.f20923Ld = 0;
        this.f20961wS = 0;
        this.cZH = 0;
        this.zCS = 0L;
        this.f20937Ys = 0L;
        this.RiO = -2;
        this.f20913Dt = 0;
        this.hff = 0;
        this.xFs = 0;
        this.f20950jf = new JSONObject();
        this.gCm = new HashMap();
        this.FFy = new JSONObject();
        this.f20941bu = "";
        this.f20947hi = 0.0f;
        this.f20943eK = 0.0f;
        this.f20916GR = false;
        this.f20946gJ = false;
        this.dtS = false;
        this.f20945fE = new ArrayList();
        this.aMs = true;
        this.f20918IE = true;
        this.f20935Vm = true;
        this.IGR = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tuV.Kg.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) C9380Kg.this.f20955qp.get();
                    if (view != null) {
                        C9380Kg.this.m82885IL(view);
                    }
                } catch (Throwable th) {
                    C9423iR.m82732bg("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.dFf = -1;
        this.RiO = i;
        this.f20925Ny = EnumC9393bg.LAND_PAGE;
        m82838bg(context, interfaceC9395bX, abstractC9396bg);
    }

    /* renamed from: bg */
    public static C9380Kg m82839bg(Context context, @Nullable WebView webView, InterfaceC9395bX interfaceC9395bX, AbstractC9396bg abstractC9396bg) {
        if (interfaceC9395bX == null || abstractC9396bg == null) {
            return null;
        }
        if (webView == null) {
            return new C9380Kg(context, 0, interfaceC9395bX, abstractC9396bg);
        }
        return new C9380Kg(context, webView, interfaceC9395bX, abstractC9396bg, EnumC9393bg.LAND_PAGE);
    }
}
