package com.maticoo.sdk.video.p407vo;

import com.maticoo.sdk.video.p407vo.AdsVO;

/* renamed from: com.maticoo.sdk.video.vo.VideoAdVO */
/* loaded from: classes6.dex */
public class VideoAdVO extends AdsVO {
    private String button;
    private String channel;
    private String country;
    private String rate;
    private RewardedVideoObj rewardedVideoObj;
    private String slotId;

    /* renamed from: com.maticoo.sdk.video.vo.VideoAdVO$RewardedVideoObj */
    /* loaded from: classes6.dex */
    public static class RewardedVideoObj {
        private String adChoiceLink;
        private String buttonColor;
        private int clickTime;
        private String h5Opt;
        private CreativeVO img;
        private boolean isMute;
        private int orient;
        private int playLocal = 1;
        private String rewardedAmount;
        private String rewardedName;
        private CreativeVO video;

        public String getAdChoiceLink() {
            return this.adChoiceLink;
        }

        public String getButtonColor() {
            return this.buttonColor;
        }

        public int getClickTime() {
            return this.clickTime;
        }

        public String getH5Opt() {
            return this.h5Opt;
        }

        public CreativeVO getImg() {
            return this.img;
        }

        public int getOrient() {
            return this.orient;
        }

        public int getPlayLocal() {
            return this.playLocal;
        }

        public String getRewardedAmount() {
            return this.rewardedAmount;
        }

        public String getRewardedName() {
            return this.rewardedName;
        }

        public CreativeVO getVideo() {
            return this.video;
        }

        public boolean isMute() {
            return this.isMute;
        }

        public void setAdChoiceLink(String str) {
            this.adChoiceLink = str;
        }

        public void setButtonColor(String str) {
            this.buttonColor = str;
        }

        public void setClickTime(int i) {
            this.clickTime = i;
        }

        public void setH5Opt(String str) {
            this.h5Opt = str;
        }

        public void setImg(CreativeVO creativeVO) {
            this.img = creativeVO;
        }

        public void setMute(boolean z) {
            this.isMute = z;
        }

        public void setOrient(int i) {
            this.orient = i;
        }

        public void setPlayLocal(int i) {
            this.playLocal = i;
        }

        public void setRewardedAmount(String str) {
            this.rewardedAmount = str;
        }

        public void setRewardedName(String str) {
            this.rewardedName = str;
        }

        public void setVideo(CreativeVO creativeVO) {
            this.video = creativeVO;
        }

        public String toString() {
            return "RewardedVideoObj{playLocal=" + this.playLocal + ", img=" + this.img + ", video=" + this.video + ", clickTime=" + this.clickTime + ", buttonColor='" + this.buttonColor + "', h5Opt='" + this.h5Opt + "', isMute=" + this.isMute + ", orient=" + this.orient + ", adChoiceLink='" + this.adChoiceLink + "', rewardedAmount='" + this.rewardedAmount + "', rewardedName='" + this.rewardedName + "'}";
        }
    }

    public String getAdid() {
        return this.adid;
    }

    public String getButton() {
        return this.button;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getCountry() {
        return this.country;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public String getFinalUrl() {
        return this.final_url;
    }

    public String getImpid() {
        return this.impid;
    }

    public float getRate() {
        float f;
        try {
            f = Float.parseFloat(this.rate);
        } catch (NumberFormatException unused) {
            f = 4.0f;
        }
        if (f < 4.0f) {
            return 4.0f;
        }
        return f;
    }

    public RewardedVideoObj getRewardedVideoObj() {
        return this.rewardedVideoObj;
    }

    public String getSlotId() {
        return this.slotId;
    }

    public String getVastXmlData() {
        return this.vastXmlData;
    }

    public void setAdid(String str) {
        this.adid = str;
    }

    public void setButton(String str) {
        this.button = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setFinalUrl(String str) {
        this.final_url = str;
    }

    public void setImpid(String str) {
        this.impid = str;
    }

    public void setLandingType(String str) {
        this.landingType = AdsVO.LANDING_TYPE.getLandingType(str);
    }

    public void setRate(String str) {
        this.rate = str;
    }

    public void setRewardedVideoObj(RewardedVideoObj rewardedVideoObj) {
        this.rewardedVideoObj = rewardedVideoObj;
    }

    public void setSlotId(String str) {
        this.slotId = str;
    }

    public void setVastXmlData(String str) {
        this.vastXmlData = str;
    }

    @Override // com.maticoo.sdk.video.p407vo.AdsVO
    public String toString() {
        return "VideoAdVO{channel='" + this.channel + "', country='" + this.country + "', slotId='" + this.slotId + "', rewardedVideoObj=" + this.rewardedVideoObj + ", adid='" + this.adid + "', impid='" + this.impid + "', rate='" + this.rate + "', landingType=" + this.landingType + ", expireTime=" + this.expireTime + ", clickUrl='" + this.clickUrl + "', vastXmlData='" + this.vastXmlData + "', final_url='" + this.final_url + "'}";
    }
}
