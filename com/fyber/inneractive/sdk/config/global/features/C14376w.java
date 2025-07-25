package com.fyber.inneractive.sdk.config.global.features;

/* renamed from: com.fyber.inneractive.sdk.config.global.features.w */
/* loaded from: classes4.dex */
public final class C14376w extends AbstractC14361h {

    /* renamed from: e */
    public static final EnumC14374u f27202e = EnumC14374u.NONE;

    /* renamed from: f */
    public static final EnumC14375v f27203f = EnumC14375v.NONE;

    public C14376w() {
        super("video_player");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC14361h
    /* renamed from: c */
    public final AbstractC14361h mo77947c() {
        C14376w c14376w = new C14376w();
        m77954a(c14376w);
        return c14376w;
    }

    /* renamed from: d */
    public final EnumC14374u m77946d() {
        EnumC14374u[] values;
        String mo77933a = mo77933a("click_action", f27202e.mKey);
        for (EnumC14374u enumC14374u : EnumC14374u.values()) {
            if (mo77933a.equalsIgnoreCase(enumC14374u.mKey)) {
                return enumC14374u;
            }
        }
        return EnumC14374u.NONE;
    }

    /* renamed from: e */
    public final EnumC14375v m77945e() {
        EnumC14375v[] values;
        String mo77933a = mo77933a("endcard_animation_type", f27203f.mKey);
        for (EnumC14375v enumC14375v : EnumC14375v.values()) {
            if (mo77933a.equalsIgnoreCase(enumC14375v.mKey)) {
                return enumC14375v;
            }
        }
        return EnumC14375v.NONE;
    }
}
