package p029b6;

import com.meevii.adsdk.common.Platform;
import com.meevii.adsdk.core.config.model.NetworkConfig;
import java.util.Map;
import p798n5.LoadStrategyFactory;

/* renamed from: b6.d */
/* loaded from: classes6.dex */
public class MediationManager {

    /* renamed from: a */
    private IAdMediation f1599a;

    /* renamed from: b */
    private String f1600b;

    /* compiled from: MediationManager.java */
    /* renamed from: b6.d$b */
    /* loaded from: classes6.dex */
    private static class C3354b {

        /* renamed from: a */
        private static final MediationManager f1601a = new MediationManager();
    }

    /* renamed from: a */
    public static MediationManager m103905a() {
        return C3354b.f1601a;
    }

    /* renamed from: b */
    public Map<String, Object> m103904b(NetworkConfig networkConfig) {
        IAdMediation iAdMediation = this.f1599a;
        if (iAdMediation == null) {
            return networkConfig.toMap();
        }
        return iAdMediation.mo103907b(networkConfig);
    }

    /* renamed from: c */
    public LoadStrategyFactory m103903c() {
        IAdMediation iAdMediation = this.f1599a;
        if (iAdMediation == null) {
            return null;
        }
        return iAdMediation.mo103908a();
    }

    /* renamed from: d */
    public String m103902d() {
        if (this.f1599a == null) {
            return Platform.UNKNOWN.getName();
        }
        return this.f1600b;
    }

    /* renamed from: e */
    public void m103901e(String str) {
        this.f1600b = str;
        str.hashCode();
        if (!str.equals("max")) {
            if (str.equals("inhouse")) {
                this.f1599a = new InHouseMediation();
                return;
            }
            return;
        }
        this.f1599a = new MaxMediation();
    }

    /* renamed from: f */
    public void m103900f() {
        IAdMediation iAdMediation = this.f1599a;
        if (iAdMediation == null) {
            return;
        }
        iAdMediation.mo103906c();
    }

    private MediationManager() {
    }
}
