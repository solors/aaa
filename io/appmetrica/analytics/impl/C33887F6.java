package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.F6 */
/* loaded from: classes9.dex */
public final class C33887F6 implements DataSendingRestrictionController {

    /* renamed from: a */
    public final InterfaceC33837D6 f92813a;

    /* renamed from: b */
    public Boolean f92814b;

    /* renamed from: c */
    public final HashSet f92815c = new HashSet();

    /* renamed from: d */
    public final HashSet f92816d = new HashSet();

    public C33887F6(@NonNull InterfaceC33837D6 interfaceC33837D6) {
        this.f92813a = interfaceC33837D6;
        this.f92814b = ((C33862E6) interfaceC33837D6).m22683a();
    }

    /* renamed from: a */
    public final synchronized void m22664a(@Nullable Boolean bool) {
        if (AbstractC34679kn.m21472a(bool) || this.f92814b == null) {
            Boolean valueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.f92814b = valueOf;
            InterfaceC33837D6 interfaceC33837D6 = this.f92813a;
            ((C33862E6) interfaceC33837D6).f92772a.m21019b(valueOf.booleanValue()).m21149b();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final boolean isRestrictedForBackgroundDataCollection() {
        Boolean bool = this.f92814b;
        if (bool == null) {
            if (this.f92815c.isEmpty() && !this.f92816d.isEmpty()) {
                return false;
            }
            return true;
        }
        return bool.booleanValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter() {
        boolean booleanValue;
        Boolean bool = this.f92814b;
        if (bool == null) {
            if (this.f92816d.isEmpty() && this.f92815c.isEmpty()) {
                booleanValue = true;
            } else {
                booleanValue = false;
            }
        } else {
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        boolean booleanValue;
        Boolean bool = this.f92814b;
        if (bool == null) {
            booleanValue = this.f92816d.isEmpty();
        } else {
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    public final synchronized void m22663a(@NonNull String str, @Nullable Boolean bool) {
        if (AbstractC34679kn.m21472a(bool) || (!this.f92816d.contains(str) && !this.f92815c.contains(str))) {
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f92816d.add(str);
                this.f92815c.remove(str);
            } else {
                this.f92815c.add(str);
                this.f92816d.remove(str);
            }
        }
    }
}
