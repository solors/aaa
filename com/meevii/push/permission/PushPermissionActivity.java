package com.meevii.push.permission;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import p755k6.C37396g;
import p755k6.C37397h;
import p772l6.PushEvent;

/* loaded from: classes5.dex */
public class PushPermissionActivity extends AppCompatActivity {

    /* renamed from: k */
    private IPushPermissionCustomUI f61592k;

    /* renamed from: l */
    private Throwable f61593l;

    /* renamed from: m */
    private boolean f61594m;

    /* renamed from: f */
    private void m47894f() {
        try {
            if (this.f61592k == null) {
                finish();
                return;
            }
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(17);
            View inflate = LayoutInflater.from(this).inflate(this.f61592k.getLayoutId(), (ViewGroup) null);
            ((FrameLayout) findViewById(C37396g.frame_root)).addView(inflate);
            this.f61592k.init(this, inflate);
            findViewById(this.f61592k.getConfirmViewId()).setOnClickListener(new View.OnClickListener() { // from class: com.meevii.push.permission.e
                {
                    PushPermissionActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PushPermissionActivity.this.m47892h(view);
                }
            });
            findViewById(this.f61592k.getCancelViewId()).setOnClickListener(new View.OnClickListener() { // from class: com.meevii.push.permission.f
                {
                    PushPermissionActivity.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PushPermissionActivity.this.m47891i(view);
                }
            });
        } catch (Throwable th) {
            m47888l(th);
        }
    }

    /* renamed from: g */
    private void m47893g() {
        this.f61592k = PushPermissionManager.m47887a().m47885c();
    }

    /* renamed from: h */
    public /* synthetic */ void m47892h(View view) {
        try {
            m47889k(1);
            PushPermissionUtils.m47854k(this);
        } catch (Throwable th) {
            m47888l(th);
        }
    }

    /* renamed from: i */
    public /* synthetic */ void m47891i(View view) {
        m47889k(0);
        finish();
    }

    /* renamed from: j */
    private void m47890j(int i) {
        if (PushPermissionUtils.m47856i(i)) {
            PushEvent.m15664j(PushPermissionUtils.m47862c(this) ? 1 : 0);
            finish();
        }
    }

    /* renamed from: k */
    private void m47889k(int i) {
        if (this.f61594m) {
            return;
        }
        PushEvent.m15663k(i);
        this.f61594m = true;
    }

    /* renamed from: l */
    private void m47888l(Throwable th) {
        this.f61593l = new IllegalArgumentException(th.getMessage());
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        m47890j(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C37397h.activity_push_permission);
        m47893g();
        m47894f();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        int i;
        super.onDestroy();
        if (this.f61593l != null) {
            PushPermissionManager.m47887a().m47872p(this.f61593l);
            return;
        }
        m47889k(0);
        PushPermissionManager m47887a = PushPermissionManager.m47887a();
        if (PushPermissionUtils.m47862c(this)) {
            i = 1;
        } else {
            i = 2;
        }
        m47887a.m47874n(i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        m47890j(i);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(@NonNull Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f61594m = bundle.getBoolean("bundle_key_is_send_guide_btn_event", false);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("bundle_key_is_send_guide_btn_event", this.f61594m);
    }
}
