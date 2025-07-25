package com.facebook.ads.internal.api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.proguard.annotations.DoNotStripAny;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Keep
@DoNotStripAny
@UiThread
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes3.dex */
public interface AudienceNetworkActivityApi {
    public static final int EXTERNAL_FINISH_REASON = 0;

    void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr);

    void finish(int i);

    void onActivityResult(int i, int i2, Intent intent);

    void onBackPressed();

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    boolean onTouchEvent(MotionEvent motionEvent);
}
