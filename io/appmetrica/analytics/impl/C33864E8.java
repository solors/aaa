package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.E8 */
/* loaded from: classes9.dex */
public final class C33864E8 {

    /* renamed from: a */
    public final C34803pc f92782a;

    /* renamed from: b */
    public final C34803pc f92783b;

    public C33864E8() {
        this(new C34249U7(), new C33988J9(), new C34412b());
    }

    public C33864E8(C34249U7 c34249u7, C33988J9 c33988j9, C34412b c34412b) {
        C34803pc c34803pc = new C34803pc(c34249u7);
        this.f92782a = c34803pc;
        c34803pc.m21157a(EnumC33889F8.NONE, c34249u7);
        c34803pc.m21157a(EnumC33889F8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c33988j9);
        c34803pc.m21157a(EnumC33889F8.AES_VALUE_ENCRYPTION, c34412b);
        this.f92783b = new C34803pc(c34249u7);
    }
}
