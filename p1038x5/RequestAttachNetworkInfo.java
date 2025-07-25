package p1038x5;

import com.meevii.adsdk.common.Platform;
import com.meevii.adsdk.core.config.model.AttachNetwork;

/* renamed from: x5.e */
/* loaded from: classes6.dex */
public class RequestAttachNetworkInfo {

    /* renamed from: a */
    private String f117466a;

    /* renamed from: b */
    private Platform f117467b;

    /* renamed from: c */
    private String f117468c;

    public RequestAttachNetworkInfo(String str, Platform platform, String str2) {
        this.f117466a = str;
        this.f117467b = platform;
        this.f117468c = str2;
    }

    /* renamed from: d */
    public static RequestAttachNetworkInfo m1942d(AttachNetwork attachNetwork) {
        return new RequestAttachNetworkInfo(attachNetwork.getAppId(), Platform.fromStr(attachNetwork.getNetworkName()), attachNetwork.getAdUnitId());
    }

    /* renamed from: a */
    public String m1945a() {
        return this.f117468c;
    }

    /* renamed from: b */
    public String m1944b() {
        return this.f117466a;
    }

    /* renamed from: c */
    public Platform m1943c() {
        return this.f117467b;
    }
}
