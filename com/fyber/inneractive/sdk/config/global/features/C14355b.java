package com.fyber.inneractive.sdk.config.global.features;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.b */
/* loaded from: classes4.dex */
public final class C14355b extends AbstractC14361h {

    /* renamed from: e */
    public static final EnumC14354a f27196e = EnumC14354a.OPEN;

    public C14355b() {
        super("ad_identifier");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC14361h
    /* renamed from: c */
    public final AbstractC14361h mo77947c() {
        C14355b c14355b = new C14355b();
        m77954a(c14355b);
        return c14355b;
    }

    /* renamed from: d */
    public final EnumC14354a m77956d() {
        EnumC14354a[] values;
        String mo77933a = mo77933a("identifier_click_action", f27196e.mKey);
        for (EnumC14354a enumC14354a : EnumC14354a.values()) {
            if (mo77933a.equalsIgnoreCase(enumC14354a.mKey)) {
                return enumC14354a;
            }
        }
        return EnumC14354a.NONE;
    }
}
