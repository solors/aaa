package sg.bigo.ads.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.core.adview.AbstractC44111c;

/* renamed from: sg.bigo.ads.api.a */
/* loaded from: classes10.dex */
public abstract class AbstractC43512a<T extends AbstractC44111c> extends FrameLayout {

    /* renamed from: a */
    private T f114022a;

    public AbstractC43512a(@NonNull Context context) {
        super(context);
    }

    @NonNull
    /* renamed from: a */
    protected abstract T mo5470a();

    /* renamed from: a */
    public final boolean m5469a(int i, int i2) {
        return getViewImpl().mo3941a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public final synchronized T getViewImpl() {
        if (this.f114022a == null) {
            this.f114022a = mo5470a();
        }
        return this.f114022a;
    }

    @Override // android.view.View
    @Deprecated
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public AbstractC43512a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC43512a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
