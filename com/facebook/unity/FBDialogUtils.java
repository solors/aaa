package com.facebook.unity;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareLinkContent;
import com.learnings.abcenter.bridge.AbUserTagData;

/* renamed from: com.facebook.unity.b */
/* loaded from: classes4.dex */
class FBDialogUtils {
    /* renamed from: a */
    public static ShareFeedContent.Builder m78582a(Bundle bundle) {
        ShareFeedContent.Builder builder = new ShareFeedContent.Builder();
        if (bundle.containsKey("toId")) {
            builder.setToId(bundle.getString("toId"));
        }
        if (bundle.containsKey("link")) {
            builder.setLink(bundle.getString("link"));
        }
        if (bundle.containsKey("linkName")) {
            builder.setLinkName(bundle.getString("linkName"));
        }
        if (bundle.containsKey("linkCaption")) {
            builder.setLinkCaption(bundle.getString("linkCaption"));
        }
        if (bundle.containsKey("linkDescription")) {
            builder.setLinkDescription(bundle.getString("linkDescription"));
        }
        if (bundle.containsKey("picture")) {
            builder.setPicture(bundle.getString("picture"));
        }
        if (bundle.containsKey(AbUserTagData.AREA_MEDIA_SOURCE)) {
            builder.setMediaSource(bundle.getString(AbUserTagData.AREA_MEDIA_SOURCE));
        }
        return builder;
    }

    /* renamed from: b */
    public static ShareLinkContent.Builder m78581b(Bundle bundle) {
        ShareLinkContent.Builder builder = new ShareLinkContent.Builder();
        if (bundle.containsKey("content_title")) {
            builder.setQuote(bundle.getString("content_title"));
        }
        if (bundle.containsKey(ShareConstants.STORY_DEEP_LINK_URL)) {
            builder.setContentUrl(Uri.parse(bundle.getString(ShareConstants.STORY_DEEP_LINK_URL)));
        }
        return builder;
    }
}
