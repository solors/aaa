package sg.bigo.ads.api.core;

import android.app.Activity;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.C43810a;

/* loaded from: classes10.dex */
public abstract class BaseAdActivityImpl {
    @NonNull

    /* renamed from: I */
    public final Activity f114066I;

    /* renamed from: J */
    public int f114067J = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseAdActivityImpl(@NonNull Activity activity) {
        this.f114066I = activity;
    }

    /* renamed from: D */
    public abstract void mo3628D();

    /* renamed from: N */
    public abstract void mo3627N();

    /* renamed from: T */
    public abstract void mo3626T();

    /* renamed from: U */
    public abstract void mo3625U();

    /* renamed from: V */
    public abstract void mo3624V();

    /* renamed from: W */
    public abstract void mo3623W();

    /* renamed from: a */
    public abstract void mo3620a(int i, int i2, Intent intent);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a_ */
    public void mo5426a_(@LayoutRes int i) {
        this.f114066I.setContentView(C43810a.m4954a(this.f114066I, i, null, false));
    }

    /* renamed from: am */
    public void mo3609am() {
        this.f114066I.finish();
    }

    /* renamed from: an */
    public final boolean m5425an() {
        if (this.f114067J == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo5424b(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: g */
    public abstract void mo3592g(boolean z);

    @Nullable
    /* renamed from: l */
    public final <T extends View> T m5423l(@IdRes int i) {
        return (T) this.f114066I.findViewById(i);
    }
}
