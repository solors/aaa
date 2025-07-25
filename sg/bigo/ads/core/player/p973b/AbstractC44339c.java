package sg.bigo.ads.core.player.p973b;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.core.p968f.InterfaceC44216a;

/* renamed from: sg.bigo.ads.core.player.b.c */
/* loaded from: classes10.dex */
public abstract class AbstractC44339c extends FrameLayout {
    @Nullable

    /* renamed from: a */
    private InterfaceC44216a f116435a;

    public AbstractC44339c(@NonNull Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void m3307a(String str, @Nullable int[] iArr) {
        InterfaceC44216a interfaceC44216a = this.f116435a;
        if (interfaceC44216a != null) {
            interfaceC44216a.mo3648a(str, iArr);
        }
    }

    public void setOnEventListener(InterfaceC44216a interfaceC44216a) {
        this.f116435a = interfaceC44216a;
    }
}
