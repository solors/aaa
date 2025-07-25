package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p928p.InterfaceC43772g;
import sg.bigo.ads.core.adview.C44108a;

@Deprecated
/* loaded from: classes10.dex */
public class AdIconView extends AbstractC43512a<C44108a> {
    public AdIconView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.AbstractC43512a
    @NonNull
    /* renamed from: a */
    protected final /* synthetic */ C44108a mo5470a() {
        return new C44108a(this);
    }

    public AdIconView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m5491a(String str, boolean z) {
        getViewImpl().m3948a(null, str, z, null);
    }

    public AdIconView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void m5490a(@Nullable Executor executor, String str, boolean z, @Nullable InterfaceC43772g interfaceC43772g) {
        getViewImpl().m3948a(executor, str, z, interfaceC43772g);
    }
}
