package p774l8;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import p698h8.RequestExtras;

/* renamed from: l8.a */
/* loaded from: classes7.dex */
public class AdRequestFactory {

    /* renamed from: a */
    private RequestExtras f99991a;

    public AdRequestFactory(RequestExtras requestExtras) {
        this.f99991a = requestExtras;
    }

    /* renamed from: a */
    public AdRequest m15654a() {
        return m15652c().build();
    }

    /* renamed from: b */
    public AdRequest m15653b(String str) {
        if (str.isEmpty()) {
            return m15654a();
        }
        return m15652c().setAdString(str).build();
    }

    /* renamed from: c */
    public AdRequest.Builder m15652c() {
        return new AdRequest.Builder().setRequestAgent(this.f99991a.m23649b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f99991a.m23650a());
    }
}
