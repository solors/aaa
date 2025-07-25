package com.p551my.target;

import com.p551my.target.InterfaceC25753f8;
import com.p551my.target.InterfaceC26211x4;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.u4 */
/* loaded from: classes7.dex */
public class C26134u4 implements InterfaceC26211x4, InterfaceC25753f8.InterfaceC25754a {

    /* renamed from: a */
    public final InterfaceC25753f8 f67992a;

    /* renamed from: b */
    public final InterfaceC26211x4.InterfaceC26212a f67993b;

    /* renamed from: c */
    public final boolean[] f67994c;

    /* renamed from: d */
    public final List f67995d = new ArrayList();

    /* renamed from: e */
    public final List f67996e;

    public C26134u4(InterfaceC25753f8 interfaceC25753f8, List list, InterfaceC26211x4.InterfaceC26212a interfaceC26212a) {
        this.f67992a = interfaceC25753f8;
        this.f67993b = interfaceC26212a;
        this.f67996e = new ArrayList(list);
        this.f67994c = new boolean[list.size()];
        interfaceC25753f8.setListener(this);
    }

    /* renamed from: a */
    public static InterfaceC26211x4 m42781a(InterfaceC25753f8 interfaceC25753f8, List list, InterfaceC26211x4.InterfaceC26212a interfaceC26212a) {
        return new C26134u4(interfaceC25753f8, list, interfaceC26212a);
    }

    @Override // com.p551my.target.InterfaceC26003p4.InterfaceC26004a
    /* renamed from: a */
    public void mo42782a(AbstractC25650b abstractC25650b, boolean z, int i, int i2) {
        if (!this.f67992a.mo43856a(i)) {
            this.f67992a.mo43854b(i);
        } else if (z) {
            this.f67993b.mo42522a(abstractC25650b, i2);
        }
    }

    @Override // com.p551my.target.InterfaceC26003p4.InterfaceC26004a
    /* renamed from: a */
    public void mo42783a(AbstractC25650b abstractC25650b) {
        if (this.f67995d.contains(abstractC25650b)) {
            return;
        }
        this.f67993b.mo42521b(abstractC25650b);
        this.f67995d.add(abstractC25650b);
    }

    @Override // com.p551my.target.InterfaceC25753f8.InterfaceC25754a
    /* renamed from: a */
    public void mo42780a(int[] iArr) {
        for (int i : iArr) {
            if (i >= 0) {
                boolean[] zArr = this.f67994c;
                if (i < zArr.length && !zArr[i]) {
                    zArr[i] = true;
                    this.f67993b.mo42523a((AbstractC25650b) this.f67996e.get(i));
                }
            }
        }
    }
}
