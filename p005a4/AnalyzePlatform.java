package p005a4;

import com.facebook.AccessToken;
import com.google.firebase.remoteconfig.RemoteConfigComponent;

/* renamed from: a4.a */
/* loaded from: classes6.dex */
public class AnalyzePlatform {

    /* renamed from: b */
    public static final AnalyzePlatform f50b = new AnalyzePlatform(RemoteConfigComponent.DEFAULT_NAMESPACE);

    /* renamed from: c */
    public static final AnalyzePlatform f51c = new AnalyzePlatform("appsflyer");

    /* renamed from: d */
    public static final AnalyzePlatform f52d = new AnalyzePlatform(AccessToken.DEFAULT_GRAPH_DOMAIN);

    /* renamed from: e */
    public static final AnalyzePlatform f53e = new AnalyzePlatform("learnings");

    /* renamed from: a */
    private final String f54a;

    private AnalyzePlatform(String str) {
        this.f54a = str;
    }

    /* renamed from: a */
    public String m105878a() {
        return this.f54a;
    }
}
