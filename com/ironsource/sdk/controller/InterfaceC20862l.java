package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C20000gl;
import com.ironsource.C20039ha;
import com.ironsource.C20688qf;
import com.ironsource.InterfaceC20515n9;
import com.ironsource.InterfaceC20573o9;
import com.ironsource.InterfaceC20628p9;
import com.ironsource.sdk.controller.InterfaceC20844f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.l */
/* loaded from: classes6.dex */
public interface InterfaceC20862l {

    /* renamed from: com.ironsource.sdk.controller.l$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC20863a {
        /* renamed from: a */
        void mo54549a(@NotNull InterfaceC20844f.C20845a c20845a);
    }

    /* renamed from: com.ironsource.sdk.controller.l$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC20864b {
        /* renamed from: a */
        void mo54379a(@NotNull C20000gl c20000gl);
    }

    /* renamed from: a */
    void mo55169a();

    /* renamed from: a */
    void mo55167a(Activity activity);

    /* renamed from: a */
    void mo55166a(Context context);

    /* renamed from: a */
    void mo55161a(C20039ha c20039ha);

    /* renamed from: a */
    void mo55159a(C20039ha c20039ha, Map<String, String> map, InterfaceC20515n9 interfaceC20515n9);

    /* renamed from: a */
    void mo55158a(C20039ha c20039ha, Map<String, String> map, InterfaceC20573o9 interfaceC20573o9);

    /* renamed from: a */
    void mo55148a(InterfaceC20844f.C20848c c20848c, @Nullable InterfaceC20863a interfaceC20863a);

    /* renamed from: a */
    void mo55119a(String str, InterfaceC20573o9 interfaceC20573o9);

    /* renamed from: a */
    void mo55115a(String str, String str2, C20039ha c20039ha, InterfaceC20515n9 interfaceC20515n9);

    /* renamed from: a */
    void mo55114a(String str, String str2, C20039ha c20039ha, InterfaceC20573o9 interfaceC20573o9);

    /* renamed from: a */
    void mo55113a(String str, String str2, C20039ha c20039ha, InterfaceC20628p9 interfaceC20628p9);

    /* renamed from: a */
    void mo55108a(JSONObject jSONObject);

    /* renamed from: a */
    void mo55106a(JSONObject jSONObject, InterfaceC20515n9 interfaceC20515n9);

    /* renamed from: a */
    void mo55105a(JSONObject jSONObject, InterfaceC20573o9 interfaceC20573o9);

    /* renamed from: a */
    void mo55104a(JSONObject jSONObject, InterfaceC20628p9 interfaceC20628p9);

    /* renamed from: a */
    boolean mo55120a(String str);

    /* renamed from: b */
    void mo55101b(Context context);

    /* renamed from: b */
    void mo55100b(C20039ha c20039ha);

    /* renamed from: b */
    void mo55099b(C20039ha c20039ha, Map<String, String> map, InterfaceC20573o9 interfaceC20573o9);

    /* renamed from: b */
    void mo55086b(JSONObject jSONObject);

    /* renamed from: d */
    void mo55073d();

    void destroy();

    @Deprecated
    /* renamed from: e */
    void mo55066e();

    /* renamed from: f */
    void mo55059f();

    /* renamed from: g */
    C20688qf.EnumC20691c mo55053g();
}
