package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class MediaFiles {
    @Tag
    private ClosedCaptionFiles closedCaptionFiles;
    @Tag("InteractiveCreativeFile")
    private List<InteractiveCreativeFile> interactiveCreativeFiles;
    @Tag(com.smaato.sdk.video.vast.model.MediaFile.NAME)
    private List<MediaFile> mediaFiles;
    @Tag("Mezzanine")
    private List<Mezzanine> mezzanines;

    public ClosedCaptionFiles getClosedCaptionFiles() {
        return this.closedCaptionFiles;
    }

    public List<InteractiveCreativeFile> getInteractiveCreativeFiles() {
        return this.interactiveCreativeFiles;
    }

    public List<MediaFile> getMediaFiles() {
        return this.mediaFiles;
    }

    public List<Mezzanine> getMezzanines() {
        return this.mezzanines;
    }
}
