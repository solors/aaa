package sg.bigo.ads.controller.p951g;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C19577ad;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.api.core.C43578p;
import sg.bigo.ads.common.InterfaceC43665g;
import sg.bigo.ads.common.p912f.C43620c;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p926n.ExecutorC43735e;
import sg.bigo.ads.common.p933u.AbstractC43793b;
import sg.bigo.ads.common.p933u.C43806f;
import sg.bigo.ads.common.p933u.C43807g;
import sg.bigo.ads.common.p933u.C43808h;
import sg.bigo.ads.common.p933u.InterfaceC43783a;
import sg.bigo.ads.common.p933u.p935b.C43796b;
import sg.bigo.ads.common.p933u.p936c.C43800a;
import sg.bigo.ads.common.p933u.p936c.C43803d;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.common.p942y.C43911a;
import sg.bigo.ads.common.utils.C43830m;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.controller.p944a.C43938b;
import sg.bigo.ads.controller.p944a.C43958j;
import sg.bigo.ads.controller.p944a.InterfaceC43952f;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.controller.g.a */
/* loaded from: classes10.dex */
public abstract class AbstractC44042a<T extends InterfaceC43783a> {

    /* renamed from: a */
    protected final int f115552a;

    /* renamed from: b */
    protected final InterfaceC43665g f115553b;

    /* renamed from: c */
    protected final C43938b f115554c;

    /* renamed from: d */
    protected final long f115555d;
    @Nullable

    /* renamed from: e */
    protected final String f115556e;
    @Nullable

    /* renamed from: f */
    protected final String f115557f;
    @Nullable

    /* renamed from: g */
    protected final String f115558g;

    /* renamed from: h */
    public final C43578p f115559h;

    /* renamed from: i */
    private final AbstractC43793b<C43796b, C43803d> f115560i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.controller.g.a$a */
    /* loaded from: classes10.dex */
    public static class C44046a extends C43796b<InterfaceC43952f> {

        /* renamed from: o */
        private final long f115570o;

        public C44046a(int i, @NonNull InterfaceC43952f interfaceC43952f, long j) {
            super(i, interfaceC43952f);
            this.f115570o = j;
        }

        @Override // sg.bigo.ads.common.p933u.p935b.AbstractC43797c
        /* renamed from: h */
        public final void mo4089h() {
            super.mo4089h();
            InterfaceC43952f interfaceC43952f = (InterfaceC43952f) this.f114616j;
            HashMap hashMap = new HashMap();
            hashMap.put("pre_host", interfaceC43952f.mo4519e());
            hashMap.put("host_cfg_clear", Integer.valueOf(interfaceC43952f.mo4517g() ? 1 : 0));
            hashMap.put("host_src", interfaceC43952f.mo4516h());
            C43958j mo4518f = interfaceC43952f.mo4518f();
            if (mo4518f != null) {
                hashMap.put("host_type", Integer.valueOf(mo4518f.m4510b()));
            }
            m4978a(hashMap);
            long j = this.f115570o;
            if (j > 0) {
                interfaceC43952f.mo4524a(j);
            }
        }
    }

    /* renamed from: sg.bigo.ads.controller.g.a$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC44047b {
        /* renamed from: a */
        void mo4088a(String str, Object obj);
    }

    public AbstractC44042a(@NonNull InterfaceC43665g interfaceC43665g, @Nullable C43938b c43938b) {
        this(interfaceC43665g, c43938b, 15000L);
    }

    /* renamed from: a */
    public final int m4095a() {
        return this.f115552a;
    }

    /* renamed from: a */
    protected abstract void mo4079a(int i, int i2, String str);

    /* renamed from: a */
    protected abstract void mo4076a(@NonNull String str, @NonNull Map<String, Object> map);

    /* renamed from: a */
    protected abstract void mo4071a(@NonNull InterfaceC44047b interfaceC44047b);

    /* renamed from: b */
    public final void m4091b() {
        final JSONObject jSONObject;
        String str;
        Object m4835a;
        String str2;
        T mo4068f = mo4068f();
        C43796b c44046a = mo4068f instanceof InterfaceC43952f ? new C44046a(this.f115552a, (InterfaceC43952f) mo4068f, mo4069e()) : new C43796b(this.f115552a, mo4068f);
        boolean z = false;
        int i = 0;
        z = false;
        if (C43906a.m4616p() && !(this instanceof C44059l)) {
            String str3 = "Missing CCPA consent";
            if (C43906a.m4620l() == 2) {
                str2 = "Missing GDPR consent";
                i = 1;
            } else {
                str2 = "Missing CCPA consent";
            }
            if (C43906a.m4618n() == 2) {
                i++;
                str2 = "Missing LGPD consent";
            }
            if (C43906a.m4619m() == 2) {
                i++;
            } else {
                str3 = str2;
            }
            if (C43906a.m4617o() == 2) {
                i++;
                str3 = "Missing COPPA consent";
            }
            if (i > 1) {
                str3 = "Missing user consent";
            }
            this.f115560i.mo3802a((AbstractC43793b<C43796b, C43803d>) c44046a, new C43808h(800, str3));
            return;
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.putOpt(MBridgeConstans.APP_KEY, C43836q.m4835a(this.f115553b.mo4153a()));
            jSONObject.putOpt("pkg_name", C43836q.m4835a(this.f115553b.mo4145b()));
            jSONObject.putOpt("pkg_ver", C43836q.m4835a(this.f115553b.mo4144c()));
            jSONObject.putOpt("pkg_vc", Integer.valueOf(this.f115553b.mo4143d()));
            jSONObject.putOpt("pkg_ch", this.f115553b.mo4142e());
            jSONObject.putOpt("os", C43836q.m4835a(this.f115553b.mo4138i()));
            jSONObject.putOpt("os_ver", C43836q.m4835a(this.f115553b.mo4137j()));
            jSONObject.putOpt("os_lang", this.f115553b.mo4136k());
            jSONObject.putOpt(Verification.VENDOR, this.f115553b.mo4135l());
            jSONObject.putOpt("model", this.f115553b.mo4134m());
            jSONObject.putOpt("isp", this.f115553b.mo4133n());
            jSONObject.putOpt("resolution", this.f115553b.mo4132o());
            jSONObject.putOpt("dpi", Integer.valueOf(this.f115553b.mo4131p()));
            jSONObject.putOpt("net", this.f115553b.mo4130q());
            jSONObject.putOpt("timezone", this.f115553b.mo4129r());
            if (this.f115553b.mo4128s()) {
                jSONObject.putOpt("ewd", String.valueOf(this.f115553b.mo4127t() ^ 3023727));
                jSONObject.putOpt("ejd", String.valueOf(this.f115553b.mo4126u() ^ 3023727));
            }
            jSONObject.putOpt("country", this.f115553b.mo4125v());
            jSONObject.putOpt("state", this.f115553b.mo4122y());
            jSONObject.putOpt("city", this.f115553b.mo4121z());
            jSONObject.putOpt("sdk_ver", C43836q.m4835a(this.f115553b.mo4179A()));
            jSONObject.putOpt("sdk_vc", 50002);
            if (C43906a.m4616p()) {
                str = "consent_status";
                m4835a = Integer.valueOf(C44136b.m3849b());
            } else {
                jSONObject.putOpt(C19577ad.f49047D0, C43836q.m4835a(this.f115553b.mo4177C()));
                jSONObject.putOpt("hw_id", C43836q.m4835a(this.f115553b.mo4171I()));
                jSONObject.putOpt("fire_id", C43836q.m4835a(this.f115553b.mo4146ag()));
                str = "af_id";
                m4835a = C43836q.m4835a(this.f115553b.mo4176D());
            }
            jSONObject.putOpt(str, m4835a);
            jSONObject.putOpt(KeyConstants.RequestBody.KEY_UID, C43836q.m4835a(this.f115553b.mo4175E()));
            long mo4174F = this.f115553b.mo4174F();
            jSONObject.putOpt("timestamp", Long.valueOf(mo4174F));
            jSONObject.putOpt("abflags", this.f115553b.mo4173G());
            jSONObject.putOpt("gg_service_ver", this.f115553b.mo4170J());
            jSONObject.putOpt("webkit_ver", this.f115553b.mo4169K());
            jSONObject.putOpt("cpu_core_num", Integer.valueOf(this.f115553b.mo4168L()));
            jSONObject.putOpt("cpu_clock_speed", Long.valueOf(this.f115553b.mo4167M()));
            jSONObject.putOpt("total_memory", Long.valueOf(this.f115553b.mo4166N()));
            jSONObject.putOpt("free_memory", Long.valueOf(this.f115553b.mo4165O()));
            jSONObject.putOpt("rom_free_in", Long.valueOf(this.f115553b.mo4164P()));
            jSONObject.putOpt("rom_free_ext", Long.valueOf(this.f115553b.mo4163Q()));
            String uuid = UUID.randomUUID().toString();
            jSONObject.putOpt("request_id", C43836q.m4835a(uuid));
            jSONObject.putOpt("sdk_channel", this.f115553b.mo4150ac());
            jSONObject.putOpt("simulator_file", Integer.valueOf(this.f115553b.mo4149ad()));
            jSONObject.putOpt("gps_country", this.f115556e);
            jSONObject.putOpt("sim_country", this.f115557f);
            jSONObject.putOpt("system_country", this.f115558g);
            jSONObject.putOpt("inst_src", this.f115553b.mo4158V());
            mo4071a(new InterfaceC44047b() { // from class: sg.bigo.ads.controller.g.a.3
                @Override // sg.bigo.ads.controller.p951g.AbstractC44042a.InterfaceC44047b
                /* renamed from: a */
                public final void mo4088a(String str4, Object obj) {
                    if (!TextUtils.isEmpty(str4)) {
                        try {
                            jSONObject.putOpt(str4, obj);
                        } catch (JSONException unused) {
                        }
                    }
                }
            });
            jSONObject.putOpt("sign", C43830m.m4866a(mo4087a(mo4174F, uuid).toString()));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (C43906a.m4613s() && mo4065j()) {
            z = true;
        }
        C43806f mo4075d = mo4075d();
        c44046a.f114607b = jSONObject;
        c44046a.f114608c = null;
        c44046a.f114609d = mo4075d;
        c44046a.f114610e = z;
        c44046a.f114618l = this.f115555d;
        c44046a.m4975a("SDK-Version-Code", BigoAdSdk.getSDKVersion());
        c44046a.f114617k = mo4070c();
        AbstractC43793b abstractC43793b = this.f115560i;
        if (abstractC43793b == null) {
            abstractC43793b = AbstractC43793b.f114602c;
        }
        C43807g.f114640a.mo4962a(c44046a, abstractC43793b);
    }

    @Nullable
    /* renamed from: c */
    protected abstract ExecutorC43735e mo4070c();

    /* renamed from: d */
    protected C43806f mo4075d() {
        return C43796b.f114606a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public long mo4069e() {
        return 0L;
    }

    @NonNull
    /* renamed from: f */
    protected abstract T mo4068f();

    /* renamed from: g */
    protected boolean mo4067g() {
        return true;
    }

    /* renamed from: h */
    protected boolean mo4074h() {
        return true;
    }

    /* renamed from: i */
    protected abstract void mo4066i();

    /* renamed from: j */
    protected abstract boolean mo4065j();

    public AbstractC44042a(@NonNull InterfaceC43665g interfaceC43665g, @Nullable C43938b c43938b, long j) {
        this.f115559h = new C43578p();
        this.f115560i = new AbstractC43793b<C43796b, C43803d>() { // from class: sg.bigo.ads.controller.g.a.1

            /* renamed from: b */
            private long f115562b = -1;

            /* renamed from: d */
            private boolean f115563d = false;

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ C43803d mo3801a(@NonNull C43800a c43800a) {
                return new C43803d(c43800a);
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo4090a(@NonNull C43796b c43796b) {
                super.mo4090a((C440431) c43796b);
                this.f115562b = SystemClock.elapsedRealtime();
                this.f115563d = C43620c.m5295d();
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ void mo3803a(@androidx.annotation.NonNull sg.bigo.ads.common.p933u.p935b.C43796b r26, @androidx.annotation.NonNull sg.bigo.ads.common.p933u.p936c.C43803d r27) {
                /*
                    Method dump skipped, instructions count: 264
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.p951g.AbstractC44042a.C440431.mo3803a(sg.bigo.ads.common.u.b.c, sg.bigo.ads.common.u.c.c):void");
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo3802a(@NonNull C43796b c43796b, @NonNull C43808h c43808h) {
                String str;
                int i;
                C43796b c43796b2 = c43796b;
                if (AbstractC44042a.this.mo4067g()) {
                    long elapsedRealtime = this.f115562b > 0 ? SystemClock.elapsedRealtime() - this.f115562b : 0L;
                    String m4968g = c43796b2.m4968g();
                    int i2 = c43808h.f114641a;
                    if (i2 == 900) {
                        m4968g = "https://invalid.url";
                    }
                    String str2 = m4968g;
                    String message = c43808h.getMessage();
                    boolean z = this.f115563d;
                    int mo4970e = c43796b2.mo4970e();
                    AbstractC44042a abstractC44042a = AbstractC44042a.this;
                    String str3 = abstractC44042a.f115556e;
                    String str4 = abstractC44042a.f115557f;
                    String str5 = abstractC44042a.f115558g;
                    InterfaceC43665g interfaceC43665g2 = abstractC44042a.f115553b;
                    C44136b.m3897a(str2, false, elapsedRealtime, i2, message, z, mo4970e, str3, str4, str5, interfaceC43665g2 == null ? null : interfaceC43665g2.mo4154Z(), c43796b2.f114610e, c43796b2.f114611f, c43796b2.f114612g, c43796b2.f114613h);
                }
                int i3 = c43808h.f114641a;
                if (i3 == 701 || i3 == 702) {
                    i = 1025;
                    str = "Request timeout.";
                } else {
                    str = "(" + c43808h.f114641a + ") " + c43808h.getMessage();
                    i = 1026;
                }
                AbstractC44042a.this.mo4078a(c43796b2.m4968g(), i, c43808h.f114641a, str, null);
                AbstractC44042a.this.m4094a(c43796b2.m4968g());
            }
        };
        this.f115552a = C43911a.m4595a();
        this.f115553b = interfaceC43665g;
        this.f115554c = c43938b;
        this.f115555d = j;
        this.f115556e = interfaceC43665g.mo4161S();
        this.f115557f = interfaceC43665g.mo4160T();
        this.f115558g = interfaceC43665g.mo4159U();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    @CallSuper
    /* renamed from: a */
    public StringBuilder mo4087a(long j, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C43836q.m4835a(this.f115553b.mo4153a()));
        sb2.append(",");
        sb2.append(C43836q.m4835a(this.f115553b.mo4145b()));
        sb2.append(",");
        sb2.append(C43836q.m4835a(this.f115553b.mo4144c()));
        sb2.append(",");
        sb2.append(this.f115553b.mo4143d());
        sb2.append(",");
        sb2.append(C43836q.m4835a(this.f115553b.mo4138i()));
        sb2.append(",");
        sb2.append(C43836q.m4835a(this.f115553b.mo4137j()));
        sb2.append(",");
        sb2.append(C43836q.m4835a(this.f115553b.mo4179A()));
        sb2.append(",50002");
        sb2.append(",");
        sb2.append(j);
        boolean m4616p = C43906a.m4616p();
        sb2.append(",");
        if (m4616p) {
            sb2.append(",");
            sb2.append(",");
            sb2.append(C43836q.m4835a(this.f115553b.mo4175E()));
            sb2.append(",");
        } else {
            sb2.append(C43836q.m4835a(this.f115553b.mo4177C()));
            sb2.append(",");
            sb2.append(C43836q.m4835a(this.f115553b.mo4176D()));
            sb2.append(",");
            sb2.append(C43836q.m4835a(this.f115553b.mo4175E()));
            sb2.append(",");
            sb2.append(C43836q.m4835a(this.f115553b.mo4171I()));
        }
        sb2.append(",");
        sb2.append(C43836q.m4835a(str));
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4094a(String str) {
        if (this.f115554c == null || !mo4074h()) {
            return;
        }
        this.f115554c.m4537a(100L, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: a */
    public void mo4078a(String str, int i, int i2, String str2, @Nullable Map<String, Object> map) {
        mo4079a(i, i2, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: a */
    public void mo4077a(String str, @NonNull String str2, @NonNull Map<String, Object> map) {
        mo4076a(str2, map);
    }

    /* renamed from: a */
    static /* synthetic */ void m4092a(AbstractC44042a abstractC44042a, final String str, final String str2, final long j) {
        if (abstractC44042a.f115554c != null) {
            if (TextUtils.isEmpty(str)) {
                abstractC44042a.m4094a(str2);
            } else {
                C43727d.m5108a(3, new Runnable() { // from class: sg.bigo.ads.controller.g.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC44042a abstractC44042a2 = AbstractC44042a.this;
                        C43938b c43938b = abstractC44042a2.f115554c;
                        if (c43938b != null && c43938b.m4533a(str, str2, j, abstractC44042a2.mo4067g()).f115120d != 0) {
                            AbstractC44042a.this.m4094a(str2);
                        }
                    }
                });
            }
        }
    }
}
