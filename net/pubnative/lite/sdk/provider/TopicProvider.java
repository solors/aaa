package net.pubnative.lite.sdk.provider;

import android.content.Context;
import java.util.List;
import net.pubnative.lite.sdk.models.Topic;

/* loaded from: classes10.dex */
public interface TopicProvider {

    /* loaded from: classes10.dex */
    public interface Callback {
        void onResult(List<Topic> list);
    }

    void getTopics(Context context, Callback callback);
}
