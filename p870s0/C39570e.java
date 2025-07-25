package p870s0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.p367cl.aidl.IIgniteServiceAPI;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p024b1.AbstractC3343c;
import p1049y0.C44996b;
import p1049y0.InterfaceC44995a;
import p854r0.BinderC39431a;
import p975t0.C44346a;
import p989u0.C44417b;
import p989u0.EnumC44419d;

/* renamed from: s0.e */
/* loaded from: classes3.dex */
public final class C39570e implements InterfaceServiceConnectionC39566a {

    /* renamed from: g */
    public Context f103980g;

    /* renamed from: h */
    public String f103981h;

    /* renamed from: i */
    public String f103982i;

    /* renamed from: j */
    public final String f103983j;

    /* renamed from: k */
    public C44346a f103984k;

    /* renamed from: l */
    public IIgniteServiceAPI f103985l;

    /* renamed from: p */
    public InterfaceServiceConnectionC39566a f103989p;

    /* renamed from: q */
    public InterfaceServiceConnectionC39566a f103990q;

    /* renamed from: b */
    public boolean f103976b = false;

    /* renamed from: c */
    public boolean f103977c = false;

    /* renamed from: d */
    public long f103978d = 0;

    /* renamed from: f */
    public boolean f103979f = false;

    /* renamed from: m */
    public final Bundle f103986m = new Bundle();

    /* renamed from: n */
    public final Object f103987n = new Object();

    /* renamed from: r */
    public String f103991r = null;

    /* renamed from: s */
    public final RunnableC39567b f103992s = new RunnableC39567b(this);

    /* renamed from: o */
    public final BinderC39431a f103988o = new BinderC39431a(this);

    public C39570e(Context context) {
        String str = null;
        this.f103980g = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f103980g;
        if (context2 != null) {
            List<ResolveInfo> queryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices.size() > 0) {
                str = queryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.f103983j = str;
        this.f103984k = new C44346a(false, "");
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: a */
    public final boolean mo12228a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.f103979f && (iIgniteServiceAPI = this.f103985l) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: b */
    public final void mo12225b() {
        if (!(!TextUtils.isEmpty(this.f103983j))) {
            C44996b.m1100b("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
        } else if (!mo12228a()) {
            AbstractC3343c.f1549a.execute(this.f103992s);
        } else if (this.f103976b && !mo12221f()) {
            Object[] objArr = {"IgniteAuthenticationComponent"};
            InterfaceC44995a interfaceC44995a = C44996b.f118394b.f118395a;
            if (interfaceC44995a != null) {
                interfaceC44995a.mo1103i("%s : already authenticated", objArr);
            }
        } else {
            m12236m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo12222c(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            java.lang.String r3 = "IgniteAuthenticationComponent"
            r1[r2] = r3
            java.lang.String r4 = "%s: onAuthenticationSuccess"
            p1049y0.C44996b.m1101a(r4, r1)
            r9.f103977c = r2
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto La9
            r9.f103991r = r10
            android.os.Bundle r1 = r9.f103986m
            java.lang.String r4 = "clientToken"
            r1.putString(r4, r10)
            r9.f103976b = r0
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r4 = ""
            r5 = 2
            if (r1 != 0) goto L51
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r10.split(r1)     // Catch: java.lang.Exception -> L3f
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L3f
            r1 = r1[r0]     // Catch: java.lang.Exception -> L3f
            r7 = 8
            byte[] r1 = android.util.Base64.decode(r1, r7)     // Catch: java.lang.Exception -> L3f
            java.lang.String r7 = "UTF-8"
            r6.<init>(r1, r7)     // Catch: java.lang.Exception -> L3f
            goto L52
        L3f:
            r1 = move-exception
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "JwtUtil"
            r6[r2] = r7
            r6[r0] = r1
            java.lang.String r1 = "%s : decodeJwtBody : %s"
            p1049y0.C44996b.m1100b(r1, r6)
        L51:
            r6 = r4
        L52:
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto La2
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8d
            r1.<init>(r6)     // Catch: java.lang.Exception -> L8d
            java.lang.String r6 = "exp"
            long r6 = r1.optLong(r6)     // Catch: java.lang.Exception -> L8d
            r9.f103978d = r6     // Catch: java.lang.Exception -> L8d
            java.lang.String r1 = "dd/MM/yyyy HH:mm:ss"
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Exception -> L8d
            long r6 = r8.toMillis(r6)     // Catch: java.lang.Exception -> L8d
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L81
            r8.<init>(r1)     // Catch: java.lang.Exception -> L81
            java.util.Calendar r1 = java.util.Calendar.getInstance()     // Catch: java.lang.Exception -> L81
            r1.setTimeInMillis(r6)     // Catch: java.lang.Exception -> L81
            java.util.Date r1 = r1.getTime()     // Catch: java.lang.Exception -> L81
            java.lang.String r4 = r8.format(r1)     // Catch: java.lang.Exception -> L81
        L81:
            java.lang.String r1 = "%s : Ignite session will exp in: %s"
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L8d
            r6[r2] = r3     // Catch: java.lang.Exception -> L8d
            r6[r0] = r4     // Catch: java.lang.Exception -> L8d
            p1049y0.C44996b.m1101a(r1, r6)     // Catch: java.lang.Exception -> L8d
            goto La2
        L8d:
            r1 = move-exception
            u0.d r4 = p989u0.EnumC44419d.ONE_DT_GENERAL_ERROR
            p989u0.C44417b.m3083a(r4, r1)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r2] = r3
            r4[r0] = r1
            java.lang.String r0 = "%s: resolveSessionExpiryTime : unable resolve session expiration : %s"
            p1049y0.C44996b.m1100b(r0, r4)
        La2:
            s0.a r0 = r9.f103989p
            if (r0 == 0) goto La9
            r0.mo12222c(r10)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p870s0.C39570e.mo12222c(java.lang.String):void");
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: d */
    public final String mo12232d() {
        return this.f103983j;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    public final void destroy() {
        if (this.f103980g != null && mo12228a()) {
            this.f103980g.unbindService(this);
            this.f103980g = null;
        }
        this.f103990q = null;
        this.f103989p = null;
        this.f103985l = null;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: e */
    public final String mo12233e() {
        return this.f103991r;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: f */
    public final boolean mo12221f() {
        if (this.f103978d > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.f103978d) {
            return true;
        }
        return false;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: g */
    public final Context mo12220g() {
        return this.f103980g;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: h */
    public final boolean mo12219h() {
        return this.f103976b;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: i */
    public final String mo12231i() {
        return this.f103984k.f116466a;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: j */
    public final boolean mo12230j() {
        return this.f103984k.f116467b;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: k */
    public final IIgniteServiceAPI mo12218k() {
        return this.f103985l;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: l */
    public final void mo12217l() {
        mo12225b();
    }

    /* renamed from: m */
    public final void m12236m() {
        if (mo12228a()) {
            String str = this.f103981h;
            String str2 = this.f103982i;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !this.f103977c) {
                if ((mo12221f() || !this.f103976b) && this.f103985l != null) {
                    try {
                        this.f103977c = true;
                        this.f103986m.putInt("sdkFlowTypeKey", 1);
                        this.f103985l.authenticate(this.f103981h, this.f103982i, this.f103986m, this.f103988o);
                    } catch (RemoteException e) {
                        this.f103977c = false;
                        C44417b.m3083a(EnumC44419d.ONE_DT_AUTHENTICATION_ERROR, e);
                        C44996b.m1100b("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e.toString());
                    }
                }
            }
        }
    }

    @Override // p1017w0.InterfaceC44571b
    public final void onCredentialsRequestFailed(String str) {
        C44996b.m1100b("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        mo12224b(str);
    }

    @Override // p1017w0.InterfaceC44571b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f103981h = str;
        this.f103982i = str2;
        m12236m();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C44996b.m1101a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.f103985l = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.f103979f = true;
        AbstractC3343c.f1549a.execute(new RunnableC39568c(this, new RunnableC39569d(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        String str;
        this.f103979f = false;
        this.f103978d = 0L;
        if (componentName != null) {
            str = componentName.getClassName();
        } else {
            str = "Ignite";
        }
        mo12224b("Service : " + str + " disconnected");
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: a */
    public final void mo12226a(String str) {
        C44996b.m1100b("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.f103977c = false;
        InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a = this.f103989p;
        if (interfaceServiceConnectionC39566a != null) {
            interfaceServiceConnectionC39566a.mo12226a(str);
        }
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: a */
    public final void mo12227a(ComponentName componentName, IBinder iBinder) {
        InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a = this.f103990q;
        if (interfaceServiceConnectionC39566a != null) {
            interfaceServiceConnectionC39566a.mo12227a(componentName, iBinder);
        }
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: b */
    public final void mo12235b(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a) {
        this.f103989p = interfaceServiceConnectionC39566a;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: b */
    public final void mo12224b(String str) {
        C44996b.m1100b("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a = this.f103990q;
        if (interfaceServiceConnectionC39566a != null) {
            interfaceServiceConnectionC39566a.mo12224b(str);
        }
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: c */
    public final void mo12234c(InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a) {
        this.f103990q = interfaceServiceConnectionC39566a;
    }

    @Override // p870s0.InterfaceServiceConnectionC39566a
    /* renamed from: c */
    public final boolean mo12223c() {
        return mo12221f() || !mo12228a();
    }
}
