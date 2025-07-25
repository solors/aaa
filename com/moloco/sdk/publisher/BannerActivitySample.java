package com.moloco.sdk.publisher;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
final class BannerActivitySample extends Activity {
    private Banner banner;
    @NotNull
    private final FrameLayout bannerContainer = new FrameLayout(this);

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle, @Nullable PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        setContentView(this.bannerContainer);
        Moloco.createBanner$default("MOLOCO_ADUNIT_ID", null, new BannerActivitySample$onCreate$1(this), 2, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        Banner banner = this.banner;
        Banner banner2 = null;
        if (banner == null) {
            Intrinsics.m17056y("banner");
            banner = null;
        }
        banner.destroy();
        Banner banner3 = this.banner;
        if (banner3 == null) {
            Intrinsics.m17056y("banner");
            banner3 = null;
        }
        ViewParent parent = banner3.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            Banner banner4 = this.banner;
            if (banner4 == null) {
                Intrinsics.m17056y("banner");
            } else {
                banner2 = banner4;
            }
            viewGroup.removeView(banner2);
        }
    }
}
