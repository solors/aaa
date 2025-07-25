package p854r0;

import com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback;
import org.json.JSONObject;
import p1049y0.C44996b;
import p870s0.InterfaceServiceConnectionC39566a;
import p989u0.C44417b;
import p989u0.EnumC44419d;

/* renamed from: r0.a */
/* loaded from: classes3.dex */
public final class BinderC39431a extends IIgniteServiceCallback.Stub {

    /* renamed from: c */
    public final InterfaceServiceConnectionC39566a f103659c;

    public BinderC39431a(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a) {
        this.f103659c = interfaceServiceConnectionC39566a;
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        this.f103659c.mo12226a(str);
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        String str2;
        try {
            str2 = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e) {
            C44417b.m3083a(EnumC44419d.ONE_DT_GENERAL_ERROR, e);
            C44996b.m1100b("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e.toString());
            str2 = null;
        }
        this.f103659c.mo12222c(str2);
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
