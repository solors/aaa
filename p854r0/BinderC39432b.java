package p854r0;

import android.text.TextUtils;
import com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback;
import java.util.ArrayList;
import java.util.Iterator;
import p1004v0.C44489a;
import p1049y0.C44996b;
import p1064z0.C45106b;
import p838q0.C39321a;
import p838q0.C39323c;
import p870s0.C39573h;
import p989u0.C44417b;
import p989u0.EnumC44418c;
import p989u0.EnumC44419d;

/* renamed from: r0.b */
/* loaded from: classes3.dex */
public final class BinderC39432b extends IIgniteServiceCallback.Stub {

    /* renamed from: c */
    public final ArrayList f103660c;

    public BinderC39432b(C44489a c44489a) {
        ArrayList arrayList = new ArrayList();
        this.f103660c = arrayList;
        arrayList.add(c44489a);
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        C44996b.m1101a("%s : unable to retrieve property: %s", "IgnitePropertyCallback", str);
        Iterator it = this.f103660c.iterator();
        while (it.hasNext()) {
            C39573h c39573h = ((C44489a) it.next()).f116775a;
            if (c39573h != null) {
                C44996b.m1101a("%s : on one dt error", "OneDTAuthenticator");
                c39573h.f104003m.set(true);
                if (c39573h.f103996f != null) {
                    C44996b.m1100b("%s : on one dt error : %s", "IgniteManager", str);
                }
            }
        }
    }

    @Override // com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) {
        C44996b.m1101a("%s : property retrieved", "IgnitePropertyCallback");
        Iterator it = this.f103660c.iterator();
        while (it.hasNext()) {
            C39573h c39573h = ((C44489a) it.next()).f116775a;
            if (c39573h != null) {
                if (TextUtils.isEmpty(str)) {
                    C44996b.m1101a("%s : on one dt error", "OneDTAuthenticator");
                    c39573h.f104003m.set(true);
                    if (c39573h.f103996f != null) {
                        C44996b.m1100b("%s : on one dt error : %s", "IgniteManager", "One DT is empty");
                    }
                    C44417b.m3082b(EnumC44419d.RAW_ONE_DT_ERROR, "error_code", EnumC44418c.ONE_DT_EMPTY_ENTITY.m3081b());
                } else {
                    c39573h.f103997g.m24958b(str);
                    c39573h.f103998h.getClass();
                    C39323c m900a = C45106b.m900a(str);
                    c39573h.f103999i = m900a;
                    C39321a c39321a = c39573h.f103996f;
                    if (c39321a != null) {
                        C44996b.m1101a("%s : setting one dt entity", "IgniteManager");
                        c39321a.f103396b = m900a;
                    }
                }
            }
        }
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
