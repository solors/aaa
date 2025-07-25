package sg.bigo.ads.core.adview;

import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.AbstractC43512a;
import sg.bigo.ads.common.utils.C43841u;

/* renamed from: sg.bigo.ads.core.adview.c */
/* loaded from: classes10.dex */
public abstract class AbstractC44111c {
    @NonNull

    /* renamed from: a */
    public final AbstractC43512a<?> f115770a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC44111c(@NonNull AbstractC43512a<?> abstractC43512a) {
        this.f115770a = abstractC43512a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m3946a(int i) {
        this.f115770a.setTag(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3940a(View view) {
        C43841u.m4801a(view, this.f115770a, null, -1);
    }

    /* renamed from: a */
    public boolean mo3941a(int i, int i2) {
        return C43841u.m4804a(this.f115770a, i, i2);
    }
}
