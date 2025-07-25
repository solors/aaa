package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.N7 */
/* loaded from: classes9.dex */
public abstract class AbstractC34082N7 {

    /* renamed from: a */
    public final Context f93262a;

    /* renamed from: b */
    public final ProtobufStateStorage f93263b;

    /* renamed from: c */
    public final AbstractC34130P7 f93264c;

    /* renamed from: d */
    public final InterfaceC34409an f93265d;

    /* renamed from: e */
    public final InterfaceC34096Nl f93266e;

    /* renamed from: f */
    public final InterfaceC34728mi f93267f;

    /* renamed from: g */
    public final InterfaceC34674ki f93268g;

    /* renamed from: h */
    public final InterfaceC33762A6 f93269h;

    /* renamed from: i */
    public InterfaceC34106O7 f93270i;

    public AbstractC34082N7(Context context, ProtobufStateStorage protobufStateStorage, AbstractC34130P7 abstractC34130P7, InterfaceC34409an interfaceC34409an, InterfaceC34096Nl interfaceC34096Nl, InterfaceC34728mi interfaceC34728mi, InterfaceC34674ki interfaceC34674ki, InterfaceC33762A6 interfaceC33762A6, InterfaceC34106O7 interfaceC34106O7) {
        this.f93262a = context;
        this.f93263b = protobufStateStorage;
        this.f93264c = abstractC34130P7;
        this.f93265d = interfaceC34409an;
        this.f93266e = interfaceC34096Nl;
        this.f93267f = interfaceC34728mi;
        this.f93268g = interfaceC34674ki;
        this.f93269h = interfaceC33762A6;
        this.f93270i = interfaceC34106O7;
    }

    @NotNull
    /* renamed from: a */
    public final synchronized InterfaceC34106O7 m22401a() {
        return this.f93270i;
    }

    /* renamed from: b */
    public final synchronized boolean m22398b(@NotNull InterfaceC34177R7 interfaceC34177R7) {
        boolean z;
        if (interfaceC34177R7.mo22320a() == EnumC34154Q7.f93389b) {
            return false;
        }
        if (Intrinsics.m17075f(interfaceC34177R7, this.f93270i.mo20867b())) {
            return false;
        }
        List list = (List) this.f93265d.mo105910invoke(this.f93270i.mo20868a(), interfaceC34177R7);
        boolean z2 = list != null;
        if (list == null) {
            list = this.f93270i.mo20868a();
        }
        if (this.f93264c.mo22297a(interfaceC34177R7, this.f93270i.mo20867b())) {
            z = true;
        } else {
            interfaceC34177R7 = (InterfaceC34177R7) this.f93270i.mo20867b();
            z = false;
        }
        if (z || z2) {
            InterfaceC34106O7 interfaceC34106O7 = this.f93270i;
            InterfaceC34106O7 interfaceC34106O72 = (InterfaceC34106O7) this.f93266e.mo105910invoke(interfaceC34177R7, list);
            this.f93270i = interfaceC34106O72;
            this.f93263b.save(interfaceC34106O72);
            AbstractC35018xi.m20774a("Update distribution data: %s -> %s", interfaceC34106O7, this.f93270i);
        }
        return z;
    }

    /* renamed from: c */
    public final synchronized InterfaceC34177R7 m22397c() {
        if (!this.f93268g.mo21485a()) {
            InterfaceC34177R7 interfaceC34177R7 = (InterfaceC34177R7) this.f93267f.invoke();
            this.f93268g.mo21484b();
            if (interfaceC34177R7 != null) {
                m22398b(interfaceC34177R7);
            }
        }
        return (InterfaceC34177R7) this.f93270i.mo20867b();
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC34177R7 m22400a(@NotNull InterfaceC34177R7 interfaceC34177R7) {
        InterfaceC34177R7 m22397c;
        this.f93269h.mo20825a(this.f93262a);
        synchronized (this) {
            m22398b(interfaceC34177R7);
            m22397c = m22397c();
        }
        return m22397c;
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC34177R7 m22399b() {
        this.f93269h.mo20825a(this.f93262a);
        return m22397c();
    }
}
