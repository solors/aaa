package sg.bigo.ads.core.p964e.p965a.p966a.p967a;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.core.p964e.C44180a;
import sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44191b;
import sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44193d;

/* renamed from: sg.bigo.ads.core.e.a.a.a.b */
/* loaded from: classes10.dex */
public final class C44185b implements InterfaceC44191b {
    @NonNull

    /* renamed from: a */
    private final Node f115983a;

    /* renamed from: b */
    private List<InterfaceC44193d> f115984b;

    public C44185b(@NonNull Node node) {
        this.f115983a = node;
    }

    @Override // sg.bigo.ads.core.p964e.p965a.p966a.InterfaceC44191b
    /* renamed from: a */
    public final List<InterfaceC44193d> mo3715a() {
        if (this.f115984b == null) {
            this.f115984b = new ArrayList();
            for (Node node : C44180a.m3724c(this.f115983a, "Companion")) {
                this.f115984b.add(new C44187d(node));
            }
        }
        return this.f115984b;
    }
}
