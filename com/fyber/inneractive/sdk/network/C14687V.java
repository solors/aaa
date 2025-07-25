package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.cache.C14274k;
import com.fyber.inneractive.sdk.cache.InterfaceC14264a;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.V */
/* loaded from: classes4.dex */
public class C14687V extends AbstractC14686U {

    /* renamed from: p */
    public final Context f27839p;

    /* renamed from: q */
    public final InterfaceC14264a f27840q;

    /* renamed from: r */
    public C14670D f27841r;

    public C14687V(InterfaceC14671E interfaceC14671E, Context context, InterfaceC14264a interfaceC14264a) {
        super(interfaceC14671E, C14673G.f27796c.m77731a(), null);
        this.f27839p = context;
        this.f27840q = interfaceC14264a;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: a */
    public C14681O mo77696a(C14714l c14714l, Map map, int i) {
        C14681O c14681o = new C14681O();
        try {
            String stringBuffer = AbstractC15471s.m76463a(c14714l.f27884c).toString();
            c14681o.f27810a = this.f27840q.mo77939a(stringBuffer);
            c14681o.f27811b = stringBuffer;
            return c14681o;
        } catch (Exception e) {
            IAlog.m76530a("failed parse cacheable network request", e, new Object[0]);
            if (e instanceof InvalidAppIdException) {
                throw e;
            }
            throw new C14680N(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: e */
    public final int mo77695e() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: f */
    public final String mo77714f() {
        return this.f27840q.mo77937c();
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: g */
    public final C14692a mo77713g() {
        C14670D c14670d = new C14670D(this.f27839p, this.f27840q);
        this.f27841r = c14670d;
        C14274k m77733a = c14670d.m77733a();
        String str = m77733a.f26979b;
        Object obj = m77733a.f26978a;
        this.f27840q.mo77937c();
        return new C14692a(obj, str);
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: k */
    public final EnumC14679M mo77694k() {
        return EnumC14679M.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: m */
    public final EnumC14705g0 mo77693m() {
        return EnumC14705g0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: p */
    public final String mo77692p() {
        return this.f27840q.mo77941a();
    }

    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: s */
    public final boolean mo77691s() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a0  */
    @Override // com.fyber.inneractive.sdk.network.AbstractC14686U
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo77715a(com.fyber.inneractive.sdk.network.C14681O r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed closing cache file: %s"
            com.fyber.inneractive.sdk.network.D r1 = r6.f27841r
            if (r1 == 0) goto Lbb
            android.content.SharedPreferences r2 = r1.f27795c
            r3 = 0
            if (r2 != 0) goto L15
            android.content.Context r2 = r1.f27793a
            java.lang.String r4 = "IAConfigurationPreferences"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r3)
            r1.f27795c = r2
        L15:
            android.content.SharedPreferences r2 = r1.f27795c
            android.content.SharedPreferences$Editor r2 = r2.edit()
            com.fyber.inneractive.sdk.cache.a r1 = r1.f27794b
            java.lang.String r1 = r1.mo77938b()
            android.content.SharedPreferences$Editor r9 = r2.putString(r1, r9)
            r9.apply()
            if (r7 == 0) goto Lbb
            java.lang.String r9 = r7.f27811b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lbb
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto Lbb
            com.fyber.inneractive.sdk.network.D r9 = r6.f27841r
            java.lang.String r1 = r7.f27811b
            r9.getClass()
            r2 = 1
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r8
            java.lang.String r5 = "caching file %s"
            com.fyber.inneractive.sdk.util.IAlog.m76529a(r5, r4)
            r4 = 0
            android.content.Context r9 = r9.f27793a     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.io.FileOutputStream r4 = r9.openFileOutput(r8, r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            byte[] r8 = r1.getBytes()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            r4.write(r8)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L74
            java.lang.String r8 = "File cached successfully"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L72
            com.fyber.inneractive.sdk.util.IAlog.m76529a(r8, r9)     // Catch: java.lang.Exception -> L6f java.lang.Throwable -> L72
            r4.close()     // Catch: java.lang.Exception -> L62
            goto L96
        L62:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r3] = r8
            com.fyber.inneractive.sdk.util.IAlog.m76524f(r0, r9)
            goto L96
        L6f:
            r8 = move-exception
            r9 = r2
            goto L76
        L72:
            r7 = move-exception
            goto La8
        L74:
            r8 = move-exception
            r9 = r3
        L76:
            java.lang.String r1 = "Failed caching file: %s"
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L72
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L72
            r5[r3] = r8     // Catch: java.lang.Throwable -> L72
            com.fyber.inneractive.sdk.util.IAlog.m76524f(r1, r5)     // Catch: java.lang.Throwable -> L72
            if (r4 == 0) goto L95
            r4.close()     // Catch: java.lang.Exception -> L89
            goto L95
        L89:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            com.fyber.inneractive.sdk.util.IAlog.m76524f(r0, r1)
        L95:
            r2 = r9
        L96:
            if (r2 != 0) goto La0
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = "Failed to cache file"
            com.fyber.inneractive.sdk.util.IAlog.m76528b(r8, r7)
            goto Lbb
        La0:
            com.fyber.inneractive.sdk.cache.a r8 = r6.f27840q
            java.lang.Object r7 = r7.f27810a
            r8.mo77940a(r7)
            goto Lbb
        La8:
            if (r4 == 0) goto Lba
            r4.close()     // Catch: java.lang.Exception -> Lae
            goto Lba
        Lae:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r3] = r8
            com.fyber.inneractive.sdk.util.IAlog.m76524f(r0, r9)
        Lba:
            throw r7
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C14687V.mo77715a(com.fyber.inneractive.sdk.network.O, java.lang.String, java.lang.String):void");
    }
}
