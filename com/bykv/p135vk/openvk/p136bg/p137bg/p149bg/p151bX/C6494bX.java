package com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6492bX;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.bg.bg.bg.bX.bX */
/* loaded from: classes3.dex */
public class C6494bX implements Serializable {

    /* renamed from: IL */
    public int f13561IL;

    /* renamed from: Lq */
    private long f13564Lq;

    /* renamed from: PX */
    private int f13565PX;

    /* renamed from: Ta */
    private int f13566Ta;

    /* renamed from: VB */
    private String f13567VB;
    private int VzQ;

    /* renamed from: bg */
    public String f13570bg;
    public int eqN;

    /* renamed from: iR */
    private String f13572iR;
    private C6493IL ldr;
    private int tuV;

    /* renamed from: vb */
    private boolean f13574vb;
    private boolean xxp;
    private String yDt;

    /* renamed from: zx */
    private C6493IL f13575zx;

    /* renamed from: Kg */
    private int f13562Kg = 204800;

    /* renamed from: WR */
    private int f13568WR = 0;

    /* renamed from: eo */
    private int f13571eo = 0;

    /* renamed from: bX */
    public final HashMap<String, Object> f13569bX = new HashMap<>();

    /* renamed from: Fy */
    private int f13560Fy = 10000;

    /* renamed from: LZ */
    private int f13563LZ = 10000;

    /* renamed from: tC */
    private int f13573tC = 10000;
    private int rri = 0;
    private JSONObject kMt = new JSONObject();

    public C6494bX(String str, C6493IL c6493il, C6493IL c6493il2, int i, int i2) {
        this.VzQ = 0;
        this.tuV = 0;
        this.f13572iR = str;
        this.f13575zx = c6493il;
        this.ldr = c6493il2;
        this.VzQ = i;
        this.tuV = i2;
    }

    /* renamed from: Fy */
    public C6493IL m91723Fy() {
        return this.f13575zx;
    }

    /* renamed from: IL */
    public String m91722IL() {
        return this.f13572iR;
    }

    /* renamed from: Kg */
    public boolean m91719Kg() {
        return this.f13574vb;
    }

    /* renamed from: LZ */
    public C6493IL m91718LZ() {
        return this.ldr;
    }

    /* renamed from: Lq */
    public int m91717Lq() {
        return this.VzQ;
    }

    /* renamed from: PX */
    public float m91716PX() {
        if (m91714VB()) {
            return this.ldr.m91749Kg();
        }
        C6493IL c6493il = this.f13575zx;
        if (c6493il != null) {
            return c6493il.m91749Kg();
        }
        return -1.0f;
    }

    /* renamed from: Ta */
    public String m91715Ta() {
        if (m91714VB()) {
            return this.ldr.m91743VB();
        }
        C6493IL c6493il = this.f13575zx;
        if (c6493il != null) {
            return c6493il.m91743VB();
        }
        return null;
    }

    /* renamed from: VB */
    public boolean m91714VB() {
        C6493IL c6493il;
        if (this.tuV == 1 && (c6493il = this.ldr) != null && !TextUtils.isEmpty(c6493il.m91743VB())) {
            if (C6492bX.ldr() == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.VzQ == 1) {
                return true;
            }
        }
        return false;
    }

    public int VzQ() {
        return this.f13573tC;
    }

    /* renamed from: WR */
    public long m91713WR() {
        if (m91714VB()) {
            return this.ldr.m91726zx();
        }
        C6493IL c6493il = this.f13575zx;
        if (c6493il != null) {
            return c6493il.m91726zx();
        }
        return 0L;
    }

    /* renamed from: bX */
    public int m91712bX() {
        if (m91714VB()) {
            return this.ldr.m91746Lq();
        }
        C6493IL c6493il = this.f13575zx;
        if (c6493il != null) {
            return c6493il.m91746Lq();
        }
        return 0;
    }

    /* renamed from: bg */
    public int m91709bg() {
        return this.kMt.optInt("pitaya_cache_size", 0);
    }

    /* renamed from: eo */
    public boolean m91703eo() {
        if (m91714VB()) {
            return this.ldr.m91747LZ();
        }
        C6493IL c6493il = this.f13575zx;
        if (c6493il != null) {
            return c6493il.m91747LZ();
        }
        return true;
    }

    public boolean eqN() {
        return this.xxp;
    }

    /* renamed from: iR */
    public long m91702iR() {
        return this.f13564Lq;
    }

    public int ldr() {
        return this.f13566Ta;
    }

    public int tuV() {
        return this.rri;
    }

    /* renamed from: vb */
    public int m91700vb() {
        return this.f13560Fy;
    }

    public int xxp() {
        return this.f13563LZ;
    }

    public String yDt() {
        if (m91714VB()) {
            return this.ldr.yDt();
        }
        C6493IL c6493il = this.f13575zx;
        if (c6493il != null) {
            return c6493il.yDt();
        }
        return null;
    }

    /* renamed from: zx */
    public int m91699zx() {
        return this.f13565PX;
    }

    /* renamed from: IL */
    public void m91720IL(String str) {
        this.f13567VB = str;
    }

    /* renamed from: bg */
    public void m91706bg(String str) {
        this.f13572iR = str;
    }

    public void eqN(String str) {
        this.f13570bg = str;
    }

    /* renamed from: iR */
    public void m91701iR(int i) {
        this.rri = i;
    }

    public void ldr(int i) {
        this.f13573tC = i;
    }

    /* renamed from: zx */
    public synchronized Object m91697zx(String str) {
        return this.f13569bX.get(str);
    }

    /* renamed from: IL */
    public void m91721IL(int i) {
        this.f13566Ta = i;
    }

    /* renamed from: bg */
    public void m91708bg(int i) {
        this.f13565PX = i;
    }

    public void eqN(int i) {
        this.f13560Fy = i;
    }

    /* renamed from: zx */
    public void m91698zx(int i) {
        this.f13563LZ = i;
    }

    /* renamed from: bg */
    public void m91707bg(long j) {
        this.f13564Lq = j;
    }

    /* renamed from: bX */
    public void m91710bX(String str) {
        this.yDt = str;
    }

    /* renamed from: bg */
    public void m91704bg(boolean z) {
        this.f13574vb = z;
    }

    /* renamed from: bX */
    public void m91711bX(int i) {
        this.f13561IL = i;
    }

    /* renamed from: bg */
    public synchronized void m91705bg(String str, Object obj) {
        this.f13569bX.put(str, obj);
    }
}
