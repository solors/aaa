package sg.bigo.ads.core.p969g;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.core.g.e */
/* loaded from: classes10.dex */
public class C44225e extends WebView {

    /* renamed from: a */
    private InterfaceC44226a f116095a;

    /* renamed from: e */
    protected boolean f116096e;

    /* renamed from: sg.bigo.ads.core.g.e$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC44226a {
        /* renamed from: a */
        void mo3581a(MotionEvent motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C44225e(Context context) {
        super(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMixedContentMode(0);
    }

    @Nullable
    /* renamed from: a */
    public static C44225e m3630a(@NonNull Context context) {
        try {
            return new C44225e(context);
        } catch (Exception e) {
            C44136b.m3908a(3000, 10100, Log.getStackTraceString(e));
            return null;
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f116096e) {
            return;
        }
        this.f116096e = true;
        stopLoading();
        C43841u.m4797b(this);
        removeAllViews();
        setWebChromeClient(null);
        setWebViewClient(null);
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC44226a interfaceC44226a = this.f116095a;
        if (interfaceC44226a != null) {
            interfaceC44226a.mo3581a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnWebViewTouchListener(InterfaceC44226a interfaceC44226a) {
        this.f116095a = interfaceC44226a;
    }
}
