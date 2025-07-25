package sg.bigo.ads.core.adview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import sg.bigo.ads.api.AbstractC43512a;
import sg.bigo.ads.common.p928p.InterfaceC43772g;
import sg.bigo.ads.common.view.AdImageView;

/* renamed from: sg.bigo.ads.core.adview.a */
/* loaded from: classes10.dex */
public final class C44108a extends AbstractC44111c {
    public C44108a(@NonNull AbstractC43512a<?> abstractC43512a) {
        super(abstractC43512a);
    }

    /* renamed from: a */
    public final void m3948a(@Nullable Executor executor, String str, boolean z, @Nullable InterfaceC43772g interfaceC43772g) {
        this.f115770a.removeAllViews();
        AdImageView adImageView = new AdImageView(this.f115770a.getContext());
        adImageView.setIconTag(true);
        if (interfaceC43772g != null) {
            adImageView.m4784a(interfaceC43772g);
        }
        mo3940a(adImageView);
        adImageView.m4785a(executor, str, z);
    }
}
