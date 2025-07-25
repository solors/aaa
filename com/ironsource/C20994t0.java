package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.t0 */
/* loaded from: classes6.dex */
public final class C20994t0 implements InterfaceC20784s0 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20108im f53519a;

    @Metadata
    /* renamed from: com.ironsource.t0$a */
    /* loaded from: classes6.dex */
    public static final class C20995a implements InterfaceC19928fn {

        /* renamed from: a */
        final /* synthetic */ C21135vg f53520a;

        /* renamed from: b */
        final /* synthetic */ InitListener f53521b;

        C20995a(C21135vg c21135vg, InitListener initListener) {
            this.f53520a = c21135vg;
            this.f53521b = initListener;
        }

        @Override // com.ironsource.InterfaceC19928fn
        public void onFail(@NotNull C20757rf error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.f53521b.onInitFailed(C20040hb.f50441a.m58197a(new IronSourceError(error.m55492a(), error.m55491b())));
        }

        @Override // com.ironsource.InterfaceC19928fn
        public void onSuccess() {
            String str;
            JSONObject jSONObject;
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("controllerURL = ");
            InterfaceC20732r0 m54440e = this.f53520a.m54440e();
            Integer num = null;
            if (m54440e != null) {
                str = m54440e.mo55576c();
            } else {
                str = null;
            }
            sb2.append(str);
            ironLog.verbose(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("controllerConfig = ");
            InterfaceC20732r0 m54440e2 = this.f53520a.m54440e();
            if (m54440e2 != null) {
                jSONObject = m54440e2.mo55578a();
            } else {
                jSONObject = null;
            }
            sb3.append(jSONObject);
            ironLog.verbose(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("debugMode = ");
            InterfaceC20732r0 m54440e3 = this.f53520a.m54440e();
            if (m54440e3 != null) {
                num = Integer.valueOf(m54440e3.mo55577b());
            }
            sb4.append(num);
            ironLog.verbose(sb4.toString());
            ironLog.verbose("applicationKey = " + this.f53520a.m54441d());
            ironLog.verbose("userId = " + this.f53520a.m54437h());
            this.f53521b.onInitSuccess();
        }
    }

    public C20994t0(@NotNull InterfaceC20108im networkInitApi) {
        Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.f53519a = networkInitApi;
    }

    @Override // com.ironsource.InterfaceC20784s0
    /* renamed from: a */
    public void mo54871a(@NotNull Context context, @NotNull C21135vg initConfig, @NotNull InitListener initListener) {
        int i;
        JSONObject mo55578a;
        String mo55576c;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        InterfaceC20108im interfaceC20108im = this.f53519a;
        InterfaceC20732r0 m54440e = initConfig.m54440e();
        if (m54440e != null) {
            i = m54440e.mo55577b();
        } else {
            i = 0;
        }
        interfaceC20108im.mo57804a(i);
        InterfaceC20732r0 m54440e2 = initConfig.m54440e();
        if (m54440e2 != null && (mo55576c = m54440e2.mo55576c()) != null) {
            this.f53519a.mo57800b(mo55576c);
        }
        InterfaceC20732r0 m54440e3 = initConfig.m54440e();
        if (m54440e3 != null && (mo55578a = m54440e3.mo55578a()) != null) {
            InterfaceC20108im interfaceC20108im2 = this.f53519a;
            String jSONObject = mo55578a.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "applicationConfig.toString()");
            interfaceC20108im2.mo57801a(jSONObject);
        }
        Map<String, String> m58335a = new C20002gm().m58335a();
        this.f53519a.mo57802a(new C20995a(initConfig, initListener));
        this.f53519a.mo57803a(context, initConfig.m54441d(), initConfig.m54437h(), m58335a);
    }
}
