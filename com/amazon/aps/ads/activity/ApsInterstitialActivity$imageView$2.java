package com.amazon.aps.ads.activity;

import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import com.amazon.aps.ads.C3582R;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ApsInterstitialActivity.kt */
@Metadata
/* loaded from: classes2.dex */
final class ApsInterstitialActivity$imageView$2 extends Lambda implements Functions<ImageView> {
    final /* synthetic */ ApsInterstitialActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsInterstitialActivity$imageView$2(ApsInterstitialActivity apsInterstitialActivity) {
        super(0);
        this.this$0 = apsInterstitialActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final ImageView invoke() {
        ImageView imageView = new ImageView(this.this$0);
        imageView.setImageDrawable(AppCompatResources.getDrawable(this.this$0, C3582R.C3584drawable.mraid_close));
        return imageView;
    }
}
