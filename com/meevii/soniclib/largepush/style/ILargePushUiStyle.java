package com.meevii.soniclib.largepush.style;

import android.app.Activity;
import android.view.View;
import com.meevii.soniclib.largepush.LargePushData;
import com.meevii.soniclib.largepush.StyleData;

/* loaded from: classes5.dex */
public interface ILargePushUiStyle {
    void init(Activity activity, View view, LargePushData largePushData, StyleData styleData);

    void onPause();

    void onResume();
}
