package sg.bigo.ads.api;

import android.view.Window;

/* loaded from: classes10.dex */
public class PopupAdActivity extends AdActivity {
    @Override // sg.bigo.ads.api.AdActivity
    /* renamed from: a */
    protected final void mo5476a() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(67108864);
        window.setStatusBarColor(0);
    }
}
