package com.ironsource;

import com.ironsource.InterfaceC20264lg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.hr */
/* loaded from: classes6.dex */
public final class C20061hr implements InterfaceC20264lg, InterfaceC20264lg.InterfaceC20265a {
    @NotNull

    /* renamed from: a */
    private final Map<String, Integer> f50487a = new HashMap();
    @NotNull

    /* renamed from: b */
    private final Map<String, Integer> f50488b = new HashMap();

    @Override // com.ironsource.InterfaceC20264lg.InterfaceC20265a
    /* renamed from: a */
    public void mo57475a(@NotNull InterfaceC20264lg.InterfaceC20266b smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String mo56362c = smash.mo56362c();
            if (this.f50487a.containsKey(mo56362c)) {
                Map<String, Integer> map = this.f50487a;
                Integer num = map.get(mo56362c);
                Intrinsics.m17074g(num);
                map.put(mo56362c, Integer.valueOf(num.intValue() + 1));
            }
            Unit unit = Unit.f99208a;
        }
    }

    @Override // com.ironsource.InterfaceC20264lg
    /* renamed from: b */
    public boolean mo57476b(@NotNull InterfaceC20264lg.InterfaceC20266b smash) {
        boolean z;
        Intrinsics.checkNotNullParameter(smash, "smash");
        synchronized (this) {
            String mo56362c = smash.mo56362c();
            if (this.f50487a.containsKey(mo56362c)) {
                Integer num = this.f50487a.get(mo56362c);
                Intrinsics.m17074g(num);
                if (num.intValue() >= smash.mo56364b()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // com.ironsource.InterfaceC20264lg.InterfaceC20265a
    /* renamed from: a */
    public void mo57474a(@NotNull List<? extends InterfaceC20264lg.InterfaceC20266b> smashes) {
        Intrinsics.checkNotNullParameter(smashes, "smashes");
        for (InterfaceC20264lg.InterfaceC20266b interfaceC20266b : smashes) {
            this.f50487a.put(interfaceC20266b.mo56362c(), 0);
            this.f50488b.put(interfaceC20266b.mo56362c(), Integer.valueOf(interfaceC20266b.mo56364b()));
        }
    }

    @Override // com.ironsource.InterfaceC20264lg
    /* renamed from: a */
    public boolean mo57477a() {
        for (String str : this.f50488b.keySet()) {
            Integer num = this.f50487a.get(str);
            Intrinsics.m17074g(num);
            int intValue = num.intValue();
            Integer num2 = this.f50488b.get(str);
            Intrinsics.m17074g(num2);
            if (intValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }
}
