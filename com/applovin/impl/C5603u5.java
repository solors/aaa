package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.C4165c6;
import com.applovin.impl.InterfaceC4509h5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.u5 */
/* loaded from: classes2.dex */
public final class C5603u5 implements InterfaceC4509h5 {

    /* renamed from: a */
    private final Context f11047a;

    /* renamed from: b */
    private final List f11048b = new ArrayList();

    /* renamed from: c */
    private final InterfaceC4509h5 f11049c;

    /* renamed from: d */
    private InterfaceC4509h5 f11050d;

    /* renamed from: e */
    private InterfaceC4509h5 f11051e;

    /* renamed from: f */
    private InterfaceC4509h5 f11052f;

    /* renamed from: g */
    private InterfaceC4509h5 f11053g;

    /* renamed from: h */
    private InterfaceC4509h5 f11054h;

    /* renamed from: i */
    private InterfaceC4509h5 f11055i;

    /* renamed from: j */
    private InterfaceC4509h5 f11056j;

    /* renamed from: k */
    private InterfaceC4509h5 f11057k;

    /* renamed from: com.applovin.impl.u5$a */
    /* loaded from: classes2.dex */
    public static final class C5604a implements InterfaceC4509h5.InterfaceC4510a {

        /* renamed from: a */
        private final Context f11058a;

        /* renamed from: b */
        private final InterfaceC4509h5.InterfaceC4510a f11059b;

        /* renamed from: c */
        private InterfaceC5862xo f11060c;

        public C5604a(Context context) {
            this(context, new C4165c6.C4167b());
        }

        @Override // com.applovin.impl.InterfaceC4509h5.InterfaceC4510a
        /* renamed from: b */
        public C5603u5 mo93968a() {
            C5603u5 c5603u5 = new C5603u5(this.f11058a, this.f11059b.mo93968a());
            InterfaceC5862xo interfaceC5862xo = this.f11060c;
            if (interfaceC5862xo != null) {
                c5603u5.mo94272a(interfaceC5862xo);
            }
            return c5603u5;
        }

        public C5604a(Context context, InterfaceC4509h5.InterfaceC4510a interfaceC4510a) {
            this.f11058a = context.getApplicationContext();
            this.f11059b = interfaceC4510a;
        }
    }

    public C5603u5(Context context, InterfaceC4509h5 interfaceC4509h5) {
        this.f11047a = context.getApplicationContext();
        this.f11049c = (InterfaceC4509h5) AbstractC4100b1.m100583a(interfaceC4509h5);
    }

    /* renamed from: a */
    private void m94275a(InterfaceC4509h5 interfaceC4509h5) {
        for (int i = 0; i < this.f11048b.size(); i++) {
            interfaceC4509h5.mo94272a((InterfaceC5862xo) this.f11048b.get(i));
        }
    }

    /* renamed from: g */
    private InterfaceC4509h5 m94268g() {
        if (this.f11051e == null) {
            C4157c1 c4157c1 = new C4157c1(this.f11047a);
            this.f11051e = c4157c1;
            m94275a(c4157c1);
        }
        return this.f11051e;
    }

    /* renamed from: h */
    private InterfaceC4509h5 m94267h() {
        if (this.f11052f == null) {
            C5236r4 c5236r4 = new C5236r4(this.f11047a);
            this.f11052f = c5236r4;
            m94275a(c5236r4);
        }
        return this.f11052f;
    }

    /* renamed from: i */
    private InterfaceC4509h5 m94266i() {
        if (this.f11055i == null) {
            C4439g5 c4439g5 = new C4439g5();
            this.f11055i = c4439g5;
            m94275a(c4439g5);
        }
        return this.f11055i;
    }

    /* renamed from: j */
    private InterfaceC4509h5 m94265j() {
        if (this.f11050d == null) {
            C5052o8 c5052o8 = new C5052o8();
            this.f11050d = c5052o8;
            m94275a(c5052o8);
        }
        return this.f11050d;
    }

    /* renamed from: k */
    private InterfaceC4509h5 m94264k() {
        if (this.f11056j == null) {
            C4778li c4778li = new C4778li(this.f11047a);
            this.f11056j = c4778li;
            m94275a(c4778li);
        }
        return this.f11056j;
    }

    /* renamed from: l */
    private InterfaceC4509h5 m94263l() {
        if (this.f11053g == null) {
            try {
                InterfaceC4509h5 interfaceC4509h5 = (InterfaceC4509h5) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f11053g = interfaceC4509h5;
                m94275a(interfaceC4509h5);
            } catch (ClassNotFoundException unused) {
                AbstractC5063oc.m96800d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.f11053g == null) {
                this.f11053g = this.f11049c;
            }
        }
        return this.f11053g;
    }

    /* renamed from: m */
    private InterfaceC4509h5 m94262m() {
        if (this.f11054h == null) {
            C5025np c5025np = new C5025np();
            this.f11054h = c5025np;
            m94275a(c5025np);
        }
        return this.f11054h;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        InterfaceC4509h5 interfaceC4509h5 = this.f11057k;
        if (interfaceC4509h5 == null) {
            return null;
        }
        return interfaceC4509h5.mo94270c();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        InterfaceC4509h5 interfaceC4509h5 = this.f11057k;
        if (interfaceC4509h5 != null) {
            try {
                interfaceC4509h5.close();
            } finally {
                this.f11057k = null;
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: e */
    public Map mo94269e() {
        InterfaceC4509h5 interfaceC4509h5 = this.f11057k;
        if (interfaceC4509h5 == null) {
            return Collections.emptyMap();
        }
        return interfaceC4509h5.mo94269e();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public void mo94272a(InterfaceC5862xo interfaceC5862xo) {
        AbstractC4100b1.m100583a(interfaceC5862xo);
        this.f11049c.mo94272a(interfaceC5862xo);
        this.f11048b.add(interfaceC5862xo);
        m94274a(this.f11050d, interfaceC5862xo);
        m94274a(this.f11051e, interfaceC5862xo);
        m94274a(this.f11052f, interfaceC5862xo);
        m94274a(this.f11053g, interfaceC5862xo);
        m94274a(this.f11054h, interfaceC5862xo);
        m94274a(this.f11055i, interfaceC5862xo);
        m94274a(this.f11056j, interfaceC5862xo);
    }

    /* renamed from: a */
    private void m94274a(InterfaceC4509h5 interfaceC4509h5, InterfaceC5862xo interfaceC5862xo) {
        if (interfaceC4509h5 != null) {
            interfaceC4509h5.mo94272a(interfaceC5862xo);
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        AbstractC4100b1.m100577b(this.f11057k == null);
        String scheme = c4698k5.f7366a.getScheme();
        if (AbstractC5863xp.m93030a(c4698k5.f7366a)) {
            String path = c4698k5.f7366a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.f11057k = m94268g();
            } else {
                this.f11057k = m94265j();
            }
        } else if ("asset".equals(scheme)) {
            this.f11057k = m94268g();
        } else if ("content".equals(scheme)) {
            this.f11057k = m94267h();
        } else if ("rtmp".equals(scheme)) {
            this.f11057k = m94263l();
        } else if ("udp".equals(scheme)) {
            this.f11057k = m94262m();
        } else if ("data".equals(scheme)) {
            this.f11057k = m94266i();
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.f11057k = this.f11049c;
        } else {
            this.f11057k = m94264k();
        }
        return this.f11057k.mo94273a(c4698k5);
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        return ((InterfaceC4509h5) AbstractC4100b1.m100583a(this.f11057k)).mo94271a(bArr, i, i2);
    }
}
