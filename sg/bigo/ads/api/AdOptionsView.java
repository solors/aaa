package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.core.adview.C44109b;

/* loaded from: classes10.dex */
public class AdOptionsView extends AbstractC43512a<C44109b> {
    public AdOptionsView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.AbstractC43512a
    @NonNull
    /* renamed from: a */
    protected final /* synthetic */ C44109b mo5470a() {
        return new C44109b(this);
    }

    public AdOptionsView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m5489a(InterfaceC43550c interfaceC43550c, String str) {
        getViewImpl().m3947a(interfaceC43550c, str);
    }

    public AdOptionsView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
