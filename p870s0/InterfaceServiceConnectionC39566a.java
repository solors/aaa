package p870s0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceAPI;
import p1017w0.InterfaceC44571b;

/* renamed from: s0.a */
/* loaded from: classes3.dex */
public interface InterfaceServiceConnectionC39566a extends ServiceConnection, InterfaceC44571b {
    /* renamed from: a */
    void mo12227a(ComponentName componentName, IBinder iBinder);

    /* renamed from: a */
    void mo12226a(String str);

    /* renamed from: a */
    boolean mo12228a();

    /* renamed from: b */
    void mo12225b();

    /* renamed from: b */
    void mo12224b(String str);

    /* renamed from: b */
    void mo12235b(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a);

    /* renamed from: c */
    void mo12222c(String str);

    /* renamed from: c */
    void mo12234c(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a);

    /* renamed from: c */
    boolean mo12223c();

    /* renamed from: d */
    String mo12232d();

    void destroy();

    /* renamed from: e */
    String mo12233e();

    /* renamed from: f */
    boolean mo12221f();

    /* renamed from: g */
    Context mo12220g();

    /* renamed from: h */
    boolean mo12219h();

    /* renamed from: i */
    String mo12231i();

    /* renamed from: j */
    boolean mo12230j();

    /* renamed from: k */
    IIgniteServiceAPI mo12218k();

    /* renamed from: l */
    void mo12217l();
}
