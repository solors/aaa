package p832p8;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import p698h8.RequestExtras;

/* compiled from: AdRequestFactory.java */
/* renamed from: p8.a */
/* loaded from: classes7.dex */
public class C39283a {

    /* renamed from: a */
    private RequestExtras f103149a;

    public C39283a(RequestExtras requestExtras) {
        this.f103149a = requestExtras;
    }

    /* renamed from: a */
    public AdRequest m13269a() {
        return m13267c().build();
    }

    /* renamed from: b */
    public AdRequest m13268b(String str) {
        if (str.isEmpty()) {
            return m13269a();
        }
        return m13267c().setAdString(str).build();
    }

    /* renamed from: c */
    public AdRequest.Builder m13267c() {
        return new AdRequest.Builder().setRequestAgent(this.f103149a.m23649b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f103149a.m23650a());
    }
}
