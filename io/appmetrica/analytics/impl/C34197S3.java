package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.S3 */
/* loaded from: classes9.dex */
public final class C34197S3 extends AbstractC34130P7 {
    @Override // io.appmetrica.analytics.impl.AbstractC34130P7
    /* renamed from: a */
    public final boolean mo22297a(@NotNull C33982J3 c33982j3, @NotNull C33982J3 c33982j32) {
        if (!AbstractC34679kn.m21469a(c33982j32.f93049a)) {
            if (AbstractC34679kn.m21469a(c33982j3.f93049a)) {
                return false;
            }
            EnumC34154Q7 enumC34154Q7 = c33982j3.f93050b;
            if (enumC34154Q7 == EnumC34154Q7.f93390c) {
                if (((Number) this.f93328a.m21158a(enumC34154Q7)).intValue() < ((Number) this.f93328a.m21158a(c33982j32.f93050b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f93328a.m21158a(enumC34154Q7)).intValue() <= ((Number) this.f93328a.m21158a(c33982j32.f93050b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
