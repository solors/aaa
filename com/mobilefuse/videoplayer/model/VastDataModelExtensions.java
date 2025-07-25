package com.mobilefuse.videoplayer.model;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.mobilefuse.videoplayer.VideoPlayerSettings;
import com.mobilefuse.videoplayer.tracking.VastEventTracker;
import com.mobilefuse.videoplayer.utils.MediaUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.videoplayer.model.VastDataModelExtensionsKt */
/* loaded from: classes7.dex */
public final class VastDataModelExtensions {
    @NotNull
    public static final Iterator<VastDataModel> getAdsChainIterator(@NotNull VastModel getAdsChainIterator, boolean z) {
        Intrinsics.checkNotNullParameter(getAdsChainIterator, "$this$getAdsChainIterator");
        return new VastDataModelExtensionsKt$getAdsChainIterator$1(getAdsChainIterator, z);
    }

    @NotNull
    public static final List<VastCreative> getAllCreativesWithCompanionAds(@NotNull VastDataModel allCreativesWithCompanionAds) {
        List<VastCreative> creativeList;
        Intrinsics.checkNotNullParameter(allCreativesWithCompanionAds, "$this$allCreativesWithCompanionAds");
        ArrayList arrayList = new ArrayList();
        VastAdContent content = allCreativesWithCompanionAds.getContent();
        if (content != null && (creativeList = content.getCreativeList()) != null && !creativeList.isEmpty()) {
            for (VastCreative vastCreative : allCreativesWithCompanionAds.getContent().getCreativeList()) {
                if (!vastCreative.getCompanionList().isEmpty()) {
                    arrayList.add(vastCreative);
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static final VastDataModel getFirstAd(@NotNull VastTag firstAd) {
        Object m17529r0;
        Intrinsics.checkNotNullParameter(firstAd, "$this$firstAd");
        m17529r0 = _Collections.m17529r0(firstAd.getAdList());
        return (VastDataModel) m17529r0;
    }

    @Nullable
    public static final VastLinear getFirstAdLinear(@NotNull VastDataModel firstAdLinear) {
        List<VastCreative> creativeList;
        Intrinsics.checkNotNullParameter(firstAdLinear, "$this$firstAdLinear");
        VastAdContent content = firstAdLinear.getContent();
        if (content != null && (creativeList = content.getCreativeList()) != null && !creativeList.isEmpty()) {
            for (VastCreative vastCreative : firstAdLinear.getContent().getCreativeList()) {
                if (vastCreative.getLinear() != null) {
                    return vastCreative.getLinear();
                }
            }
        }
        return null;
    }

    public static final boolean getHasAdContentToPlay(@NotNull VastModel hasAdContentToPlay) {
        VastLinear firstAdLinear;
        Intrinsics.checkNotNullParameter(hasAdContentToPlay, "$this$hasAdContentToPlay");
        for (VastTag vastTag : hasAdContentToPlay.getVastTagChain()) {
            VastDataModel firstAd = getFirstAd(vastTag);
            if (firstAd != null && (firstAdLinear = getFirstAdLinear(firstAd)) != null && getHasAnyMediaFile(firstAdLinear)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean getHasAnyMediaFile(@NotNull VastLinear hasAnyMediaFile) {
        Intrinsics.checkNotNullParameter(hasAnyMediaFile, "$this$hasAnyMediaFile");
        return !hasAnyMediaFile.getMediaFiles().isEmpty();
    }

    @NotNull
    public static final List<VastIcon> getIcons(@NotNull VastLinear getIcons, @NotNull List<String> excludedPrograms) {
        Intrinsics.checkNotNullParameter(getIcons, "$this$getIcons");
        Intrinsics.checkNotNullParameter(excludedPrograms, "excludedPrograms");
        ArrayList arrayList = new ArrayList();
        for (VastIcon vastIcon : getIcons.getIcons()) {
            if (vastIcon.getProgram() != null && !excludedPrograms.isEmpty()) {
                String program = vastIcon.getProgram();
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
                String lowerCase = program.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!excludedPrograms.contains(lowerCase)) {
                    arrayList.add(vastIcon);
                    String program2 = vastIcon.getProgram();
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "Locale.getDefault()");
                    String lowerCase2 = program2.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                    excludedPrograms.add(lowerCase2);
                }
            } else {
                arrayList.add(vastIcon);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final VastTag getMainVastTag(@NotNull VastModel mainVastTag) {
        Object m17531p0;
        Intrinsics.checkNotNullParameter(mainVastTag, "$this$mainVastTag");
        m17531p0 = _Collections.m17531p0(mainVastTag.getVastTagChain());
        return (VastTag) m17531p0;
    }

    @Nullable
    public static final VastTag getParentTag(@NotNull VastModel getParentTag, @NotNull VastTag tag) {
        Intrinsics.checkNotNullParameter(getParentTag, "$this$getParentTag");
        Intrinsics.checkNotNullParameter(tag, "tag");
        int indexOf = getParentTag.getVastTagChain().indexOf(tag) + 1;
        if (indexOf >= getParentTag.getVastTagChain().size()) {
            return null;
        }
        return getParentTag.getVastTagChain().get(indexOf);
    }

    @NotNull
    public static final List<VastMediaFile> getSupportedMediaFiles(@NotNull VastLinear getSupportedMediaFiles, @NotNull Context context, @NotNull int[] containerSize) {
        Intrinsics.checkNotNullParameter(getSupportedMediaFiles, "$this$getSupportedMediaFiles");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerSize, "containerSize");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getSupportedMediaFiles.getVerifiedMediaFiles());
        return MediaUtils.enqueueMediaFilesByCompatibility(context, arrayList, containerSize);
    }

    public static final boolean isValid(@NotNull VastCompanion isValid) {
        Intrinsics.checkNotNullParameter(isValid, "$this$isValid");
        if (isValid.getWidth() == null || isValid.getHeight() == null || isValid.getResource() == null) {
            return false;
        }
        if (isValid.getResource().getResourceType() == VastResourceType.STATIC && isValid.getClickThrough() == null) {
            return false;
        }
        return true;
    }

    public static final void openUrl(@NotNull VastClickThrough openUrl, @NotNull Context context, @NotNull VastEventTracker eventTracker, @Nullable Functions<Unit> functions) {
        Intrinsics.checkNotNullParameter(openUrl, "$this$openUrl");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        String parseMacro = eventTracker.parseMacro(openUrl.getUrl(), null, null);
        if (functions != null) {
            try {
                functions.invoke();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(parseMacro));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    @NotNull
    public static final List<VastMediaFile> verifyMediaFiles(@NotNull List<VastMediaFile> mediaFiles) {
        boolean z;
        boolean m17544g0;
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        ArrayList arrayList = new ArrayList();
        Set<String> supportedVideoContainers = VideoPlayerSettings.Companion.getSupportedVideoContainers();
        for (VastMediaFile vastMediaFile : mediaFiles) {
            String url = vastMediaFile.getUrl();
            if (url != null) {
                if (url.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !(!Intrinsics.m17075f(VastMediaFileDelivery.PROGRESSIVE.getValue(), vastMediaFile.getDelivery()))) {
                    m17544g0 = _Collections.m17544g0(supportedVideoContainers, vastMediaFile.getType());
                    if (m17544g0) {
                        arrayList.add(vastMediaFile);
                    }
                }
            }
        }
        return arrayList;
    }
}
