package sg.bigo.ads.controller;

import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.controller.p951g.AbstractC44042a;

/* renamed from: sg.bigo.ads.controller.b */
/* loaded from: classes10.dex */
public abstract class AbstractC43960b implements InterfaceC44009e<AbstractC44042a, String, Object> {
    @Override // sg.bigo.ads.controller.InterfaceC44009e
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3992a(int i, @NonNull AbstractC44042a abstractC44042a, @NonNull String[] strArr) {
        m4509a(i, strArr);
    }

    /* renamed from: a */
    public abstract void mo4119a(int i, @NonNull String str);

    /* renamed from: a */
    public final void m4509a(int i, @NonNull String... strArr) {
        mo4119a(i, (String) C43828k.m4870b(strArr));
    }
}
