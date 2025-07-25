package com.maticoo.sdk.video.view;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.view.ViewCompat;
import com.maticoo.sdk.bean.Bidresp;
import com.maticoo.sdk.bean.TrackEventType;
import com.maticoo.sdk.bean.VideoResp;
import com.maticoo.sdk.core.AdCacheSafeBoolean;
import com.maticoo.sdk.p405ad.utils.ImageUtils;
import com.maticoo.sdk.p405ad.utils.error.ErrorBuilder;
import com.maticoo.sdk.p405ad.utils.webview.JsBridgeConstants;
import com.maticoo.sdk.p405ad.video.RewardedVideoListener;
import com.maticoo.sdk.report.AdReport;
import com.maticoo.sdk.report.VastErrorReport;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.video.util.Const;
import com.maticoo.sdk.video.util.ContextHolder;
import com.maticoo.sdk.video.util.Dips;
import com.maticoo.sdk.video.util.Utils;
import com.maticoo.sdk.videocache.HttpProxyCacheServer;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public abstract class BaseVideoView extends FrameLayout implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnBufferingUpdateListener {
    public static final int MEDIA_ERROR_INIT = -1;
    public static final int MEDIA_ERROR_PAUSE = -3;
    public static final int MEDIA_ERROR_RESOURCE_ACCESS = -4;
    public static final int MEDIA_ERROR_SURFACE = -2;
    protected static final int MSG_UPDATE_PROGRESS = 1;
    protected static final int MSG_UPDATE_PROGRESS_INTERVAL = 100;
    protected static final String TAG = "NativeVideoAdView";
    protected boolean autoplayEnabled;
    protected Bidresp bidresp;
    protected Context context;
    private int currentDiffVal;
    protected FrameLayout functionLayout;
    protected boolean hasProcessCreativeView;
    protected boolean hasProcessImpression;
    protected String imageUrl;
    protected String[] impressions;
    protected boolean isBanner;
    protected boolean isCompletion;
    protected AtomicBoolean isError;
    boolean isFirstVolume;
    protected boolean isMediaPlayerPrepared;
    protected boolean isMute;
    protected boolean isShowCompanion;
    protected boolean isStartPlayer;
    protected ProgressBar loadingProgressBar;
    protected MediaPlayer mMediaPlayer;
    private int mQuartile;
    protected Map<TrackEventType, String[]> mTrackingEventMap;
    protected int mVideoHeight;
    protected int mVideoWidth;
    protected String mediaPath;
    protected ImageView muteImage;
    protected MediaPlayer.OnPreparedListener onPreparedListener;
    protected ImageView playBtnImage;
    protected ProgressBar progressBar;
    protected ProgressListener progressListener;
    protected RewardedVideoListener rewardedVideoListener;
    protected final AdCacheSafeBoolean safeState;
    protected int savedPosition;
    protected final Set<TrackEventType> trackedEvents;
    protected int videoDuration;
    protected FrameLayout videoLayout;
    protected String videoPath;
    protected final Handler videoProgressHandler;
    protected VideoResp videoResp;
    protected boolean wWANPlayEnabled;

    /* loaded from: classes6.dex */
    public interface ProgressListener {
        void onProgress(long j);
    }

    public BaseVideoView(Context context) {
        super(context);
        this.isMute = true;
        this.autoplayEnabled = true;
        this.wWANPlayEnabled = true;
        this.savedPosition = 0;
        this.isCompletion = false;
        this.isShowCompanion = false;
        this.hasProcessCreativeView = false;
        this.hasProcessImpression = false;
        this.isMediaPlayerPrepared = false;
        this.safeState = new AdCacheSafeBoolean();
        this.trackedEvents = new HashSet();
        this.isStartPlayer = false;
        this.currentDiffVal = 0;
        this.mQuartile = 0;
        this.isError = new AtomicBoolean(false);
        this.videoProgressHandler = new Handler(Looper.getMainLooper()) { // from class: com.maticoo.sdk.video.view.BaseVideoView.1
            {
                BaseVideoView.this = this;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                sendEmptyMessageDelayed(1, 100L);
                BaseVideoView.this.updateProgress();
            }
        };
        this.isFirstVolume = true;
        this.context = context;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    private void initVideoLayout(Context context) {
        this.videoLayout.setClipChildren(true);
        this.videoLayout.addView(createSurfaceView());
        this.loadingProgressBar = new ProgressBar(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.videoLayout.addView(this.loadingProgressBar, layoutParams);
        if (!this.isBanner) {
            ProgressBar progressBar = new ProgressBar(context, null, 16842872);
            this.progressBar = progressBar;
            progressBar.setMax(100);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, Dips.dpTopx(2.0f));
            layoutParams2.gravity = 80;
            this.videoLayout.addView(this.progressBar, layoutParams2);
        }
        this.videoLayout.setVisibility(8);
    }

    private void initialDisplay(Context context) {
        if (this.autoplayEnabled) {
            if (Utils.getNetworkType(context) != 1 && !this.wWANPlayEnabled) {
                showStartPage();
                return;
            } else {
                showVideoPage();
                return;
            }
        }
        showStartPage();
    }

    private void initialLayout(Context context) {
        this.videoLayout = new FrameLayout(getContext());
        this.functionLayout = new FrameLayout(context);
        addView(this.videoLayout, new FrameLayout.LayoutParams(-1, -1));
        addView(this.functionLayout, new FrameLayout.LayoutParams(-1, -1));
        initVideoLayout(context);
        initFunctionLayout(context);
    }

    private void showStartPage() {
        this.videoLayout.setVisibility(8);
        this.playBtnImage.setVisibility(0);
        this.functionLayout.setVisibility(0);
    }

    public void updateProgress() {
        ProgressListener progressListener;
        String str;
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (isPlaying() && mediaPlayer != null) {
                this.videoDuration = mediaPlayer.getDuration();
                int currentPosition = mediaPlayer.getCurrentPosition();
                int i = this.currentDiffVal;
                int i2 = this.savedPosition;
                int i3 = i + (currentPosition - i2);
                this.currentDiffVal = i3;
                if (i2 == 0 && this.progressListener != null && i3 > 0) {
                    DeveloperLog.LogD("NativeVideoAdView first call onProgress");
                    this.progressListener.onProgress(this.videoDuration);
                    if (this.rewardedVideoListener != null) {
                        Bidresp bidresp = this.bidresp;
                        if (bidresp != null) {
                            str = bidresp.getPid();
                        } else {
                            str = null;
                        }
                        this.rewardedVideoListener.onRewardedVideoAdStarted(str);
                    }
                }
                if (this.currentDiffVal > 1000 && (progressListener = this.progressListener) != null) {
                    progressListener.onProgress(this.videoDuration - currentPosition);
                    this.currentDiffVal = 0;
                }
                this.savedPosition = currentPosition;
                int i4 = this.videoDuration;
                if (i4 != 0) {
                    int i5 = 100;
                    int i6 = (currentPosition * 100) / i4;
                    if (i6 > 98) {
                        this.videoProgressHandler.removeMessages(1);
                    } else {
                        i5 = i6;
                    }
                    quartilePercent(i5);
                    ProgressBar progressBar = this.progressBar;
                    if (progressBar != null) {
                        progressBar.setProgress(i5);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void changeVideoSize(int i, int i2) {
        int i3;
        int i4;
        FrameLayout.LayoutParams layoutParams;
        boolean z;
        int width = getWidth();
        int height = getHeight();
        if (width != 0 && height != 0 && i != 0 && i2 != 0) {
            if (this.isBanner) {
                if (i > i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    float f = width;
                    float f2 = height;
                    float abs = Math.abs((f / f2) - (i / i2));
                    i3 = (int) (f + (f * abs));
                    i4 = (int) (f2 + (abs * f2));
                } else {
                    i3 = width;
                    i4 = height;
                }
            } else if (i / i2 > width / height) {
                i4 = (width * i2) / i;
                i3 = width;
            } else {
                i3 = (height * i) / i2;
                i4 = height;
            }
            if (getSurfaceView() instanceof SurfaceView) {
                layoutParams = new FrameLayout.LayoutParams(width, height);
            } else {
                layoutParams = new FrameLayout.LayoutParams(i3, i4);
            }
            DeveloperLog.LogD("NativeVideoAdView changeVideoSize: videoCreative >>" + i + "--" + i2);
            DeveloperLog.LogD("NativeVideoAdView changeVideoSize: Container >>" + width + "--" + height);
            DeveloperLog.LogD("NativeVideoAdView changeVideoSize: SurfaceView >>" + i3 + "--" + i4);
            layoutParams.gravity = 17;
            if (getSurfaceView() != null) {
                getSurfaceView().setLayoutParams(layoutParams);
            }
        }
    }

    public void clickCompanionTrack() {
        VideoResp videoResp = this.videoResp;
        if (videoResp != null && videoResp.getCompanion() != null && this.videoResp.getCompanion().getClickTrackers() != null) {
            AdReport.reportTracks(this.videoResp.getCompanion().getClickTrackers(), "companion_click");
        }
    }

    public void clickIconTrack() {
        VideoResp videoResp = this.videoResp;
        if (videoResp != null && videoResp.getIcon() != null && this.videoResp.getIcon().length != 0 && this.videoResp.getIcon()[0] != null) {
            AdReport.reportTracks(this.videoResp.getIcon()[0].getClickTracking(), "icon_click");
        }
    }

    public void clickTrack() {
        VideoResp videoResp = this.videoResp;
        if (videoResp != null && videoResp.getClickTrackers() != null) {
            AdReport.reportTracks(this.videoResp.getClickTrackers(), CampaignEx.JSON_NATIVE_VIDEO_VIDEO_CLICK);
        }
    }

    protected void complete() {
        try {
            this.isCompletion = true;
            if (this.mMediaPlayer != null) {
                this.videoProgressHandler.removeMessages(1);
            }
            ProgressListener progressListener = this.progressListener;
            if (progressListener != null && this.isStartPlayer) {
                progressListener.onProgress(0L);
            }
        } catch (Exception e) {
            DeveloperLog.LogE("NativeVideoAdView releaseMe Exception -> ", e);
        }
    }

    public void createMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        this.mMediaPlayer.setOnBufferingUpdateListener(this);
        this.mMediaPlayer.setOnVideoSizeChangedListener(this);
        this.mMediaPlayer.setOnCompletionListener(this);
        this.mMediaPlayer.setOnErrorListener(this);
        this.mMediaPlayer.setAudioStreamType(3);
    }

    abstract View createSurfaceView();

    public void destroy() {
        DeveloperLog.LogD("NativeVideoAdView destroy hashCode:" + hashCode());
        fireEventClose();
        releaseMe();
    }

    public boolean existsCache() {
        if (TextUtils.isEmpty(this.videoPath)) {
            return false;
        }
        return this.videoPath.startsWith("file");
    }

    public void fireEventClose() {
        if (this.isStartPlayer) {
            processEvent(TrackEventType.closeLinear);
            processEvent(TrackEventType.close);
        }
    }

    public String getMediaPath() {
        return this.mediaPath;
    }

    abstract View getSurfaceView();

    public String getVideoPath() {
        return this.videoPath;
    }

    public void impression() {
        if (!this.hasProcessImpression) {
            AdReport.reportTracks(this.impressions, "impressions");
            this.hasProcessImpression = true;
        }
    }

    public void init(Bidresp bidresp) {
        try {
            this.bidresp = bidresp;
            if (bidresp != null && bidresp.getVideoResp() != null && bidresp.getMediaFiles() != null && bidresp.getMediaFiles().size() != 0) {
                this.videoResp = bidresp.getVideoResp();
                HttpProxyCacheServer httpProxyCacheServer = HttpProxyCacheServer.getInstance(ContextHolder.getGlobalAppContext());
                boolean z = false;
                String str = bidresp.getMediaFiles().get(0);
                this.mediaPath = str;
                this.videoPath = httpProxyCacheServer.getProxyUrl(str);
                if (this.videoResp.getCompanion() != null) {
                    this.imageUrl = this.videoResp.getCompanion().getStaticResource();
                }
                this.isBanner = (bidresp.getAdType().equals(CommonConstants.TYPE_BAV) || bidresp.getAdType().equals("banner")) ? true : true;
                this.mTrackingEventMap = this.videoResp.getTrackEvent();
                this.impressions = this.videoResp.getImpTrackers();
                DeveloperLog.LogD("NativeVideoAdView media file -> " + this.videoPath);
                initialLayout(this.context);
                createMediaPlayer();
                return;
            }
            throw new RuntimeException("adBean is error");
        } catch (Exception e) {
            DeveloperLog.LogE("NativeVideoAdView initialize Exception ->", e);
            processErrorEvent(-1, 1001);
            throw e;
        }
    }

    protected void initFunctionLayout(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.functionLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        this.playBtnImage = new ImageView(context);
        this.playBtnImage.setImageDrawable(ImageUtils.base64ToDrawable(Const.PLAY_BUTTON));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Dips.dpTopx(50.0f), Dips.dpTopx(50.0f));
        layoutParams.gravity = 17;
        this.playBtnImage.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.video.view.BaseVideoView.2
            {
                BaseVideoView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BaseVideoView.this.start();
            }
        });
        this.functionLayout.addView(this.playBtnImage, layoutParams);
        this.functionLayout.setVisibility(8);
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        impression();
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        DeveloperLog.LogD("NativeVideoAdView entered onBufferingUpdate -- (MediaPlayer callback); bufferingProgress -> " + i);
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setSecondaryProgress(i);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        DeveloperLog.LogD("NativeVideoAdView entered onCompletion -- (MediaPlayer callback)");
        this.savedPosition = 0;
        if (this.isCompletion) {
            return;
        }
        RewardedVideoListener rewardedVideoListener = this.rewardedVideoListener;
        if (rewardedVideoListener != null) {
            rewardedVideoListener.onRewardedVideoAdCompleted(this.bidresp.getPid());
        }
        processEvent(TrackEventType.complete);
        complete();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        DeveloperLog.LogE("NativeVideoAdView entered onError -- (MediaPlayer callback): " + i + " -- " + i2 + ", hashCode:" + hashCode());
        processErrorEvent(i, i2);
        complete();
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            changeVideoSize(this.mVideoWidth, this.mVideoHeight);
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        DeveloperLog.LogD("NativeVideoAdView entered onVideoSizeChanged -- (MediaPlayer callback): " + i + " -- " + i2 + ", hashCode:" + hashCode());
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
        if (!this.safeState.isLoadFinish()) {
            this.safeState.setLoadFinish(true);
            prepared();
        }
    }

    abstract void pauseMe();

    public void prepareMediaPlayer() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.setDataSource(this.videoPath);
            this.mMediaPlayer.prepareAsync();
        } catch (Exception e) {
            DeveloperLog.LogE(TAG, e);
            processErrorEvent(-2, 1002);
        }
    }

    public void prepared() {
        if (this.onPreparedListener != null && this.safeState.isWebViewLoaded()) {
            this.onPreparedListener.onPrepared(this.mMediaPlayer);
        }
    }

    public void processErrorEvent(int i, int i2) {
        String[] error;
        if (!this.isError.compareAndSet(false, true)) {
            return;
        }
        DeveloperLog.LogD("NativeVideoAdView entered processErrorEvent");
        if (this.rewardedVideoListener != null) {
            String str = "play error what:" + i + ", extra=" + i2;
            if (this.isStartPlayer) {
                this.rewardedVideoListener.onRewardedVideoAdShowFailed(this.bidresp.getPid(), ErrorBuilder.build(413, str));
            } else {
                this.rewardedVideoListener.onRewardedVideoAdLoadFailed(this.bidresp.getPid(), ErrorBuilder.build(412, str));
            }
        }
        VideoResp videoResp = this.videoResp;
        if (videoResp != null && videoResp.getError() != null) {
            for (String str2 : this.videoResp.getError()) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("[ERRORCODE]", "400");
                    StringBuilder sb2 = new StringBuilder(replace);
                    if (replace.contains("?")) {
                        sb2.append("&what=");
                        sb2.append(i);
                        sb2.append("&extra=");
                        sb2.append(i2);
                    } else {
                        sb2.append("?what=");
                        sb2.append(i);
                        sb2.append("&extra=");
                        sb2.append(i2);
                    }
                    AdReport.reportTrack(sb2.toString(), "error", null);
                }
            }
        }
        VastErrorReport.reportErrorForVideo(this.bidresp, this.mediaPath, this.videoDuration, this.savedPosition, i, i2);
    }

    public void processEvent(TrackEventType trackEventType) {
        Map<TrackEventType, String[]> map;
        String[] strArr;
        if (this.trackedEvents.contains(trackEventType) || (map = this.mTrackingEventMap) == null || (strArr = map.get(trackEventType)) == null) {
            return;
        }
        DeveloperLog.LogD("NativeVideoAdView entered Processing Event: " + trackEventType + "-->" + Arrays.toString(strArr));
        AdReport.reportTracks(strArr, trackEventType.name());
        if (trackEventType != TrackEventType.unmute && trackEventType != TrackEventType.mute && trackEventType != TrackEventType.pause && trackEventType != TrackEventType.resume) {
            this.trackedEvents.add(trackEventType);
        }
    }

    public void processEventForCompanion() {
        VideoResp videoResp = this.videoResp;
        if (videoResp != null && videoResp.getCompanion() != null && this.videoResp.getCompanion().getTrackEvent() != null) {
            Map<TrackEventType, String[]> trackEvent = this.videoResp.getCompanion().getTrackEvent();
            TrackEventType trackEventType = TrackEventType.creativeView;
            String[] strArr = trackEvent.get(trackEventType);
            if (strArr == null) {
                return;
            }
            DeveloperLog.LogD("NativeVideoAdView entered Processing Event-companion: " + trackEventType + "-->" + Arrays.toString(strArr));
            AdReport.reportTracks(strArr, trackEventType.name());
        }
    }

    protected void quartilePercent(int i) {
        if (i >= this.mQuartile * 25) {
            DeveloperLog.LogD("NativeVideoAdView quartilePercent: mQuartile -> " + this.mQuartile);
            int i2 = this.mQuartile;
            if (i2 == 0) {
                DeveloperLog.LogD("NativeVideoAdView Video at start: (" + i + "%), hashCode:" + hashCode());
                processEvent(TrackEventType.start);
            } else if (i2 == 1) {
                DeveloperLog.LogD("NativeVideoAdView Video at first quartile: (" + i + "%), hashCode:" + hashCode());
                processEvent(TrackEventType.firstQuartile);
            } else if (i2 == 2) {
                DeveloperLog.LogD("NativeVideoAdView Video at midpoint: (" + i + "%), hashCode:" + hashCode());
                processEvent(TrackEventType.midpoint);
            } else if (i2 == 3) {
                DeveloperLog.LogD("NativeVideoAdView Video at third quartile: (" + i + "%), hashCode:" + hashCode());
                processEvent(TrackEventType.thirdQuartile);
            }
            this.mQuartile++;
        }
    }

    abstract void releaseMe();

    abstract void resumeMe();

    public void setAutoPlayEnabled(boolean z) {
        this.autoplayEnabled = z;
        initialDisplay(ContextHolder.getGlobalAppContext());
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.onPreparedListener = onPreparedListener;
    }

    public void setProgressListener(ProgressListener progressListener) {
        this.progressListener = progressListener;
    }

    public void setVideoAdListener(RewardedVideoListener rewardedVideoListener) {
        this.rewardedVideoListener = rewardedVideoListener;
    }

    public void setVolume() {
        setVolume(this.isMute);
    }

    public void setWWANPlayEnabled(boolean z) {
        this.wWANPlayEnabled = z;
        initialDisplay(ContextHolder.getGlobalAppContext());
    }

    public void showEndPage() {
        this.isShowCompanion = true;
        this.videoLayout.setVisibility(8);
        removeView(this.videoLayout);
        this.playBtnImage.setVisibility(8);
        this.functionLayout.setVisibility(0);
        processEventForCompanion();
    }

    public void showVideoPage() {
        this.functionLayout.setVisibility(8);
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.videoLayout.setVisibility(0);
    }

    public void start() {
        showVideoPage();
        if (getSurfaceView() != null) {
            getSurfaceView().setVisibility(0);
        }
    }

    public void viewIconTrack() {
        VideoResp videoResp = this.videoResp;
        if (videoResp != null && videoResp.getIcon() != null && this.videoResp.getIcon().length != 0 && this.videoResp.getIcon()[0] != null) {
            AdReport.reportTrack(this.videoResp.getIcon()[0].getViewTracking(), JsBridgeConstants.METHOD_ICON_VIEW, null);
        }
    }

    public void setVolume(boolean z) {
        boolean z2 = z != this.isMute;
        this.isMute = z;
        if (this.muteImage != null) {
            this.muteImage.setImageDrawable(ImageUtils.base64ToDrawable(z ? Const.MUTE : Const.UN_MUTE));
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            float f = z ? 0.0f : 1.0f;
            mediaPlayer.setVolume(f, f);
            if (this.isFirstVolume) {
                processEvent(TrackEventType.mute);
                this.isFirstVolume = false;
            } else if (z2) {
                if (z) {
                    processEvent(TrackEventType.mute);
                } else {
                    processEvent(TrackEventType.unmute);
                }
            }
        }
    }
}
