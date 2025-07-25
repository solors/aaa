package io.bidmachine.nativead;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import p734j1.C37250e;

/* loaded from: classes9.dex */
public interface NativeMediaPrivateData extends NativeMediaPublicData {
    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Drawable getIconDrawable();

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Uri getIconUri();

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Drawable getImageDrawable();

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Uri getImageUri();

    C37250e getVastRequest();

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Uri getVideoUri();

    void setIconBitmap(Bitmap bitmap);

    void setIconUri(Uri uri);

    void setImageBitmap(Bitmap bitmap);

    void setImageUri(Uri uri);

    void setVastRequest(C37250e c37250e);

    void setVideoUri(Uri uri);
}
