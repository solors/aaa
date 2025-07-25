package sg.bigo.ads.controller;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.api.core.C43562g;
import sg.bigo.ads.api.p903a.InterfaceC43528l;

/* renamed from: sg.bigo.ads.controller.a */
/* loaded from: classes10.dex */
public final class C43913a implements InterfaceC43979c {

    /* renamed from: a */
    public final InterfaceC43979c f114987a;

    public C43913a(InterfaceC43979c interfaceC43979c) {
        this.f114987a = interfaceC43979c;
    }

    @Override // sg.bigo.ads.controller.InterfaceC44009e
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public final void mo3993a(int i, int i2, int i3, @NonNull String str, @Nullable Pair<AbstractC43532b, InterfaceC43528l> pair) {
        InterfaceC43979c interfaceC43979c = this.f114987a;
        if (interfaceC43979c != null) {
            interfaceC43979c.mo3993a(i, i2, i3, str, pair);
        }
    }

    @Override // sg.bigo.ads.controller.InterfaceC44009e
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3992a(int i, @NonNull AbstractC43532b abstractC43532b, @NonNull C43562g[] c43562gArr) {
        AbstractC43532b abstractC43532b2 = abstractC43532b;
        C43562g[] c43562gArr2 = c43562gArr;
        InterfaceC43979c interfaceC43979c = this.f114987a;
        if (interfaceC43979c != null) {
            interfaceC43979c.mo3992a(i, abstractC43532b2, c43562gArr2);
        }
    }
}
