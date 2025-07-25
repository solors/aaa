package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.ignite.EnumC14568m;
import com.fyber.inneractive.sdk.p374dv.C14449j;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.response.e */
/* loaded from: classes4.dex */
public abstract class AbstractC15386e {

    /* renamed from: A */
    public String f30445A;

    /* renamed from: B */
    public String f30446B;

    /* renamed from: C */
    public String f30447C;

    /* renamed from: E */
    public String f30449E;

    /* renamed from: F */
    public String f30450F;

    /* renamed from: G */
    public String f30451G;

    /* renamed from: I */
    public String f30453I;

    /* renamed from: a */
    public long f30457a;

    /* renamed from: b */
    public long f30458b;

    /* renamed from: c */
    public long f30459c;

    /* renamed from: d */
    public String f30460d;

    /* renamed from: e */
    public int f30461e;

    /* renamed from: f */
    public int f30462f;

    /* renamed from: g */
    public int f30463g;

    /* renamed from: h */
    public String f30464h;

    /* renamed from: i */
    public String f30465i;

    /* renamed from: j */
    public String f30466j;

    /* renamed from: k */
    public String f30467k;

    /* renamed from: l */
    public String f30468l;

    /* renamed from: m */
    public String f30469m;

    /* renamed from: n */
    public String f30470n;

    /* renamed from: o */
    public String f30471o;

    /* renamed from: p */
    public UnitDisplayType f30472p;

    /* renamed from: q */
    public String f30473q;

    /* renamed from: r */
    public Map f30474r;

    /* renamed from: s */
    public String f30475s;

    /* renamed from: t */
    public ImpressionData f30476t;

    /* renamed from: u */
    public C14449j f30477u;

    /* renamed from: x */
    public String f30480x;

    /* renamed from: z */
    public Exception f30482z;

    /* renamed from: v */
    public int f30478v = 0;

    /* renamed from: w */
    public float f30479w = -1.0f;

    /* renamed from: y */
    public int f30481y = -1;

    /* renamed from: D */
    public boolean f30448D = false;

    /* renamed from: H */
    public EnumC14568m f30452H = EnumC14568m.NONE;

    /* renamed from: J */
    public boolean f30454J = false;

    /* renamed from: K */
    public long f30455K = 0;

    /* renamed from: L */
    public boolean f30456L = false;

    /* renamed from: a */
    public abstract InneractiveErrorCode mo76577a(InneractiveAdRequest inneractiveAdRequest, C14388r c14388r);

    /* renamed from: a */
    public final void m76578a(String str) {
        long j;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        this.f30458b = j;
        this.f30457a = TimeUnit.MINUTES.toMillis(j) + this.f30459c;
    }

    /* renamed from: b */
    public abstract InneractiveErrorCode mo76576b();

    /* renamed from: a */
    public final boolean m76579a() {
        return (this.f30452H == EnumC14568m.NONE || TextUtils.isEmpty(this.f30445A) || TextUtils.isEmpty(this.f30451G) || TextUtils.isEmpty(this.f30453I)) ? false : true;
    }
}
