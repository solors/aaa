package net.pubnative.lite.sdk.vpaid.response;

import com.iab.omid.library.pubnativenet.adsession.VerificationScriptResource;
import java.util.ArrayList;
import java.util.List;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.vpaid.models.vast.AdServingId;
import net.pubnative.lite.sdk.vpaid.models.vast.Category;
import net.pubnative.lite.sdk.vpaid.models.vast.Icon;
import net.pubnative.lite.sdk.vpaid.models.vast.Tracking;

/* loaded from: classes10.dex */
public class AdParams {
    private Icon adIcon;
    private String adParams;
    private String ctaExtensionHtml;
    private Integer duration;
    private String endCardRedirectUrl;

    /* renamed from: id */
    private String f102196id;
    private String skipTime;
    private String videoRedirectUrl;
    private boolean vpaid;
    private String vpaidJsUrl;
    private int publisherSkipSeconds = -1;
    private final List<String> videoFileUrlsList = new ArrayList();
    private final List<EndCardData> endCardList = new ArrayList();
    private final List<String> impressions = new ArrayList();
    private final List<String> companionCreativeViewEvents = new ArrayList();
    private final List<String> videoClicks = new ArrayList();
    private final List<String> endCardClicks = new ArrayList();
    private final List<String> ctaExtensionClicks = new ArrayList();
    private final List<Tracking> events = new ArrayList();
    private final List<AdServingId> adServingIds = new ArrayList();
    private final List<Category> adCategories = new ArrayList();
    private final List<VerificationScriptResource> verificationScriptResources = new ArrayList();

    public void addAdCategories(List<Category> list) {
        if (list != null) {
            this.adCategories.addAll(list);
        }
    }

    public void addAdServingId(AdServingId adServingId) {
        if (adServingId != null) {
            this.adServingIds.add(adServingId);
        }
    }

    public void addEvents(List<Tracking> list) {
        if (list != null) {
            this.events.addAll(list);
        }
    }

    public void addVerificationScriptResources(List<VerificationScriptResource> list) {
        if (list != null) {
            this.verificationScriptResources.addAll(list);
        }
    }

    public List<Category> getAdCategories() {
        return this.adCategories;
    }

    public Icon getAdIcon() {
        return this.adIcon;
    }

    public String getAdParams() {
        return this.adParams;
    }

    public List<AdServingId> getAdServingIds() {
        return this.adServingIds;
    }

    public List<AdData> getCompanionCreativeViewEvents() {
        ArrayList arrayList = new ArrayList();
        if (this.companionCreativeViewEvents.isEmpty()) {
            return arrayList;
        }
        for (String str : this.companionCreativeViewEvents) {
            arrayList.add(new AdData("url", "impression", str));
        }
        return arrayList;
    }

    public List<String> getCtaExtensionClicks() {
        return this.ctaExtensionClicks;
    }

    public String getCtaExtensionHtml() {
        return this.ctaExtensionHtml;
    }

    public int getDuration() {
        return this.duration.intValue();
    }

    public List<String> getEndCardClicks() {
        return this.endCardClicks;
    }

    public List<EndCardData> getEndCardList() {
        return this.endCardList;
    }

    public String getEndCardRedirectUrl() {
        return this.endCardRedirectUrl;
    }

    public List<Tracking> getEvents() {
        return this.events;
    }

    public String getId() {
        return this.f102196id;
    }

    public List<String> getImpressions() {
        return this.impressions;
    }

    public int getPublisherSkipSeconds() {
        return this.publisherSkipSeconds;
    }

    public String getSkipTime() {
        return this.skipTime;
    }

    public List<VerificationScriptResource> getVerificationScriptResources() {
        return this.verificationScriptResources;
    }

    public List<String> getVideoClicks() {
        return this.videoClicks;
    }

    public List<String> getVideoFileUrlsList() {
        return this.videoFileUrlsList;
    }

    public String getVideoRedirectUrl() {
        return this.videoRedirectUrl;
    }

    public String getVpaidJsUrl() {
        return this.vpaidJsUrl;
    }

    public boolean isVpaid() {
        return this.vpaid;
    }

    public void setAdIcon(Icon icon) {
        this.adIcon = icon;
    }

    public void setAdParams(String str) {
        this.adParams = str;
    }

    public void setCompanionCreativeViewEvents(List<String> list) {
        if (list != null) {
            this.companionCreativeViewEvents.addAll(list);
        }
    }

    public void setCtaExtensionClicks(List<String> list) {
        if (list != null) {
            this.ctaExtensionClicks.addAll(list);
        }
    }

    public void setCtaExtensionHtml(String str) {
        this.ctaExtensionHtml = str;
    }

    public void setDuration(Integer num) {
        this.duration = num;
    }

    public void setEndCardClicks(List<String> list) {
        if (list != null) {
            this.endCardClicks.addAll(list);
        }
    }

    public void setEndCardList(List<EndCardData> list) {
        if (list != null) {
            this.endCardList.addAll(list);
        }
    }

    public void setEndCardRedirectUrl(String str) {
        this.endCardRedirectUrl = str;
    }

    public void setId(String str) {
        this.f102196id = str;
    }

    public void setImpressions(List<String> list) {
        if (list != null) {
            this.impressions.addAll(list);
        }
    }

    public void setPublisherSkipSeconds(int i) {
        this.publisherSkipSeconds = i;
    }

    public void setSkipTime(String str) {
        this.skipTime = str;
    }

    public void setVideoClicks(List<String> list) {
        if (list != null) {
            this.videoClicks.addAll(list);
        }
    }

    public void setVideoFileUrlsList(List<String> list) {
        if (list != null) {
            this.videoFileUrlsList.addAll(list);
        }
    }

    public void setVideoRedirectUrl(String str) {
        this.videoRedirectUrl = str;
    }

    public void setVpaid() {
        this.vpaid = true;
    }

    public void setVpaidJsUrl(String str) {
        this.vpaidJsUrl = str;
    }
}
