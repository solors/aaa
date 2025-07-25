package com.taurusx.tax.mraid;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.taurusx.tax.p594e.AbstractActivityC28328d;
import com.taurusx.tax.p594e.AbstractC28330e;

/* loaded from: classes7.dex */
public class MraidVideoPlayerActivity extends AbstractActivityC28328d implements AbstractC28330e.InterfaceC28331a {

    /* renamed from: e */
    public AbstractC28330e f74071e;

    /* renamed from: a */
    public static void m37897a(Context context, String str) {
        Intent intent = new Intent(context, MraidVideoPlayerActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("video_view_class_name", "mraid");
        intent.putExtra("video_url", str);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override // com.taurusx.tax.p594e.AbstractActivityC28328d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f73557a.setVisibility(4);
        this.f74071e.start();
    }

    @Override // com.taurusx.tax.p594e.AbstractActivityC28328d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        this.f74071e.getClass();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f74071e.getClass();
    }
}
