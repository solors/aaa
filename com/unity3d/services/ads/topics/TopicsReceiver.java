package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TopicsReceiver.kt */
@Metadata
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes7.dex */
public final class TopicsReceiver implements OutcomeReceiver<GetTopicsResponse, Exception> {
    @NotNull
    private final IEventSender eventSender;

    public TopicsReceiver(@NotNull IEventSender eventSender) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    @NotNull
    public final JSONObject formatTopic(@NotNull Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taxonomyVersion", topic.getTaxonomyVersion());
        jSONObject.put("modelVersion", topic.getModelVersion());
        jSONObject.put("topicId", topic.getTopicId());
        return jSONObject;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@NotNull Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(@NotNull GetTopicsResponse result) {
        Intrinsics.checkNotNullParameter(result, "result");
        JSONArray jSONArray = new JSONArray();
        List<Topic> topics = result.getTopics();
        Intrinsics.checkNotNullExpressionValue(topics, "result.topics");
        for (Topic it : topics) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            jSONArray.put(formatTopic(it));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, jSONArray2);
    }
}
