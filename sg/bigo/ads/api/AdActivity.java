package sg.bigo.ads.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import sg.bigo.ads.api.core.BaseAdActivityImpl;

/* loaded from: classes10.dex */
public class AdActivity extends Activity {
    @Nullable

    /* renamed from: a */
    private BaseAdActivityImpl f114000a;

    @NonNull
    /* renamed from: a */
    public static Intent m5497a(Context context, @NonNull Class<? extends BaseAdActivityImpl> cls) {
        Intent intent = new Intent(context, AdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("impl_clazz", cls.getName());
        return intent;
    }

    @NonNull
    /* renamed from: c */
    public static Intent m5495c(Context context, @NonNull Class<? extends BaseAdActivityImpl> cls) {
        Intent intent = new Intent(context, LandscapeAdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("impl_clazz", cls.getName());
        return intent;
    }

    @NonNull
    /* renamed from: d */
    public static Intent m5494d(Context context, @NonNull Class<? extends BaseAdActivityImpl> cls) {
        Intent intent = new Intent(context, CompanionAdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("impl_clazz", cls.getName());
        return intent;
    }

    @NonNull
    /* renamed from: e */
    public static Intent m5493e(Context context, @NonNull Class<? extends BaseAdActivityImpl> cls) {
        Intent intent = new Intent(context, LandscapeCompanionAdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("impl_clazz", cls.getName());
        return intent;
    }

    @NonNull
    /* renamed from: f */
    public static Intent m5492f(Context context, @NonNull Class<? extends BaseAdActivityImpl> cls) {
        Intent intent = new Intent(context, LandingStyleableActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("impl_clazz", cls.getName());
        return intent;
    }

    /* renamed from: b */
    public int mo5484b() {
        return 0;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        BaseAdActivityImpl baseAdActivityImpl = this.f114000a;
        if (baseAdActivityImpl != null) {
            baseAdActivityImpl.mo3623W();
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BaseAdActivityImpl baseAdActivityImpl = this.f114000a;
        if (baseAdActivityImpl != null) {
            baseAdActivityImpl.mo3620a(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        BaseAdActivityImpl baseAdActivityImpl = this.f114000a;
        if (baseAdActivityImpl != null) {
            baseAdActivityImpl.mo3624V();
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle) {
        boolean z;
        Exception e;
        try {
            Constructor<?> declaredConstructor = Class.forName(getIntent().getStringExtra("impl_clazz")).getDeclaredConstructor(Activity.class);
            declaredConstructor.setAccessible(true);
            this.f114000a = (BaseAdActivityImpl) declaredConstructor.newInstance(this);
            mo5476a();
            super.onCreate(bundle);
            try {
                this.f114000a.f114067J = mo5484b();
                this.f114000a.mo3627N();
            } catch (Exception e2) {
                e = e2;
                z = true;
                getIntent().putExtra("create_error_flag", true);
                getIntent().putExtra("create_error_msg", Log.getStackTraceString(e));
                if (!z) {
                    super.onCreate(bundle);
                }
                finish();
            }
        } catch (Exception e3) {
            z = false;
            e = e3;
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        BaseAdActivityImpl baseAdActivityImpl = this.f114000a;
        if (baseAdActivityImpl != null) {
            baseAdActivityImpl.mo3628D();
        }
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        BaseAdActivityImpl baseAdActivityImpl = this.f114000a;
        if (baseAdActivityImpl != null) {
            baseAdActivityImpl.mo3625U();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        BaseAdActivityImpl baseAdActivityImpl = this.f114000a;
        if (baseAdActivityImpl != null) {
            baseAdActivityImpl.mo3626T();
        }
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent)) {
            BaseAdActivityImpl baseAdActivityImpl = this.f114000a;
            if (baseAdActivityImpl == null || !baseAdActivityImpl.mo5424b(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        BaseAdActivityImpl baseAdActivityImpl = this.f114000a;
        if (baseAdActivityImpl != null) {
            baseAdActivityImpl.mo3592g(z);
        }
    }

    @NonNull
    /* renamed from: b */
    public static Intent m5496b(Context context, @NonNull Class<? extends BaseAdActivityImpl> cls) {
        Intent intent = new Intent(context, PopupAdActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("impl_clazz", cls.getName());
        return intent;
    }

    /* renamed from: a */
    protected void mo5476a() {
    }
}
