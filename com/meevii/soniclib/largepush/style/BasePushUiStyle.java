package com.meevii.soniclib.largepush.style;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import com.learnings.unity.analytics.GameAnalytics;
import com.meevii.soniclib.MainActivity;
import com.meevii.soniclib.largepush.LargePushActivity;
import com.meevii.soniclib.largepush.LargePushData;
import com.meevii.soniclib.largepush.StyleData;

/* loaded from: classes5.dex */
public abstract class BasePushUiStyle implements ILargePushUiStyle {
    /* JADX INFO: Access modifiers changed from: protected */
    public void gotoSplash(Activity activity) {
        activity.finish();
        Intent intent = new Intent(activity, MainActivity.class);
        if (activity.getIntent() != null && activity.getIntent().getExtras() != null) {
            intent.putExtras(activity.getIntent());
            intent.removeExtra(LargePushActivity.LARGE_PUSH_DATA_KEY);
            intent.removeExtra("hms_push_click_disposable_key");
        }
        TaskStackBuilder create = TaskStackBuilder.create(activity);
        create.addNextIntent(intent);
        create.startActivities();
    }

    public void sendPushEvent(String str, LargePushData largePushData, StyleData styleData) {
        Bundle bundle = new Bundle();
        bundle.putString("push_id", largePushData.getPushId());
        bundle.putString("content_id", styleData.getEventID());
        bundle.putString("push_type", "fullscreen_push");
        try {
            GameAnalytics.sendEvent(str, bundle, 8);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.meevii.soniclib.largepush.style.ILargePushUiStyle
    public void onPause() {
    }

    @Override // com.meevii.soniclib.largepush.style.ILargePushUiStyle
    public void onResume() {
    }
}
