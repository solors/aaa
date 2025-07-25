package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class ViewableImpression {
    @Attribute

    /* renamed from: id */
    private String f102194id;
    @Tag(com.smaato.sdk.video.vast.model.ViewableImpression.NOT_VIEWABLE)
    private List<NotViewable> notViewableList;
    @Tag(com.smaato.sdk.video.vast.model.ViewableImpression.VIEW_UNDETERMINED)
    private List<ViewUndetermined> viewUndeterminedList;
    @Tag(com.smaato.sdk.video.vast.model.ViewableImpression.VIEWABLE)
    private List<Viewable> viewableList;

    public String getId() {
        return this.f102194id;
    }

    public List<NotViewable> getNotViewableList() {
        return this.notViewableList;
    }

    public List<ViewUndetermined> getViewUndeterminedList() {
        return this.viewUndeterminedList;
    }

    public List<Viewable> getViewableList() {
        return this.viewableList;
    }
}
